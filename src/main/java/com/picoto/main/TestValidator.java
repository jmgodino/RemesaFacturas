package com.picoto.main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.xml.security.Init;
import org.apache.xml.security.c14n.Canonicalizer;
import org.jaxen.JaxenException;
import org.jaxen.SimpleNamespaceContext;
import org.jaxen.XPath;
import org.jaxen.dom.DOMXPath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import com.picoto.Facturae;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class TestValidator {

	private JAXBContext ctx;
	private long ini, fin;

	public TestValidator() throws JAXBException {
		super();
		if (ctx == null) {
			ctx = JAXBContext.newInstance("com.picoto");
		}
	}

	private Validator getValidator(Class<?> clazz, String path) throws SAXException, IOException {
		Schema schema = getSchema(clazz, path);
		Validator val = schema.newValidator();
		return val;
	}

	private Schema getSchema(Class<?> clazz, String path) throws SAXException, IOException {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		CustomResourceResolver cr = new CustomResourceResolver(clazz, Charset.forName("ISO-8859-1"));
		factory.setResourceResolver(cr);

		Schema schema = factory.newSchema(getSourceFromPath(clazz, path));
		return schema;
	}

	private Source getSourceFromPath(Class<?> clazz, String path) {
		try {
			debug("     Cargando schema: " + clazz.getCanonicalName() + " " + path);
			String xml = IOUtils.resourceToString(path, Charset.defaultCharset());
			return this.getStaxSource(xml);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Error al cargar los schemas:  ", e);
		}
	}

	private InputStream getFile(String location) throws IOException {
		return new FileInputStream(location);
	}

	public void validarPorBloques() throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = getValidator(Facturae.class, "/schemas/Remesas.xml");

		this.procesarNodos("Facturae", "STR", reader, (r) -> {
			try {
				String nodo = getStringCompleto(reader);
				validator.validate(getStaxSource(nodo));

				Pattern p = Pattern.compile("<InvoiceTotal>(.*)</InvoiceTotal>");
				Matcher m = p.matcher(nodo);
				if (m.find()) {
					debug("     Valor de Regex: " + m.group(1));
				}
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	public void validarPorBloquesConDomAuxiliar(boolean canonical)
			throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = getValidator(Facturae.class, "/schemas/Remesas.xml");

		this.procesarNodos("Facturae", "DOM canonical(" + canonical + ")", reader, (r) -> {
			try {
				Node node = getNodoCompleto(reader, canonical);
				validator.validate(new DOMSource(node));

				debug("     Valor XPath del DOM: " + getXPath(
						"/fe:Facturae/Invoices/Invoice/InvoiceTotals/InvoiceTotal/text()", node.getFirstChild()));
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	public void validarPorBloquesConJaxbAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException, JAXBException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Schema schema = getSchema(Facturae.class, "/schemas/Remesas.xml");

		this.procesarNodos("Facturae", "JAXB", reader, (r) -> {
			try {
				Facturae face = getObjetoCompleto(r, schema);
				debug("     Valor del JAX-B: "
						+ face.getInvoices().getInvoice().get(0).getInvoiceTotals().getInvoiceTotal());
				// Aqui ya se ha validado al montar el JAX-B no hace falta validar
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	public void validarCompleto() throws XMLStreamException, SAXException, IOException {

		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = getValidator(Facturae.class, "/schemas/Remesas.xml");

		initTimeCalculation("COMPLETO");
		validator.validate(new StAXSource(reader));
		endTimeCalculation("COMPLETO");
	}

	private String getXPath(String xpath, Node node) throws JaxenException {
		XPath path = new DOMXPath(xpath);
		SimpleNamespaceContext nsContext = new SimpleNamespaceContext();
		nsContext.addNamespace("fe", "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml");
		path.setNamespaceContext(nsContext);
		String str = (String) path.stringValueOf(node);
		return str;
	}

	private void procesarNodos(String elemento, String modo, XMLStreamReader reader, Consumer<XMLStreamReader> c)
			throws XMLStreamException, TransformerException, SAXException, IOException {
		initTimeCalculation(modo);
		while (reader.hasNext()) {
			if (reader.isStartElement()) {
				if (isElementNamed(elemento, reader)) {
					c.accept(reader);
				}
			}
			reader.next();
		}
		endTimeCalculation(modo);
	}

	private static String getStringCompleto(XMLStreamReader reader) throws XMLStreamException, TransformerException {
		StringWriter sw = new StringWriter();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new StAXSource(reader), new StreamResult(sw));
		return sw.toString();
	}

	private static byte[] getDatosCompleto(Node nodo, boolean format) throws XMLStreamException, TransformerException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		// Formato. Opcional
		if (format) {
			t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			t.setOutputProperty(OutputKeys.METHOD, "xml");
			t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			t.setOutputProperty(OutputKeys.INDENT, "no");
		}
		t.transform(new DOMSource(nodo), new StreamResult(bos));
		return bos.toByteArray();
	}

	private static Node getNodoCompleto(XMLStreamReader reader, boolean canonical) throws Exception {
		DOMResult dr = new DOMResult();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new StAXSource(reader), dr);
		if (canonical) {
			String str = normalizeDocument(dr.getNode());

			Document doc = parseDocument(str);
			// generamos una huella de 64 posiciones 256/8
			String huellaStr = toHex(digest(str.getBytes(), "SHA-256"));
			Node extensions = getNodo("Extensions", doc);
			Element huella = doc.createElement("Huella");
			Text textoHuella = doc.createTextNode(huellaStr);
			huella.appendChild(textoHuella);
			extensions.appendChild(huella);
			debug(new String(getDatosCompleto(doc, true)));
		}
		return dr.getNode();
	}

	private static Node getNodo(String nombre, Document doc) {
		return doc.getElementsByTagName(nombre).item(0);
	}

	private static Document parseDocument(String str) throws Exception {
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		return db.parse(new ByteArrayInputStream(str.getBytes("UTF-8")));
	}

	private static String normalizeDocument(Node node) throws Exception {
		return new String(canonicalize(getDatosCompleto(node, false)));
	}

	public static byte[] canonicalize(byte[] data) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
		try {
			Init.init();
			// String metodo = "http://www.w3.org/2001/10/xml-exc-c14n#WithComments";
			// String metodo = "http://www.w3.org/2001/10/xml-exc-c14n#";
			// String metodo = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
			String metodo = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments";
			Canonicalizer c14n = Canonicalizer.getInstance(metodo);
			c14n.canonicalize(data, bos, false);
		} catch (Exception e) {
			throw new RuntimeException("Error al canonicalizar el documento");
		}
		return bos.toByteArray();
	}

	private Facturae getObjetoCompleto(XMLStreamReader reader, Schema schema)
			throws JAXBException, TransformerException, SAXException, IOException {

		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		unmarshaller.setSchema(schema);
		return unmarshaller.unmarshal(reader, Facturae.class).getValue();
	}

	private XMLStreamReader getStaxReader(InputStream is) throws XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		return xmlInputFactory.createXMLStreamReader(is);
	}

	private StAXSource getStaxSource(String xml) throws XMLStreamException {
		// debug("************************************************************************");
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		return new StAXSource(xmlInputFactory.createXMLStreamReader(new StringReader(xml)));
	}

	private boolean isElementNamed(String name, XMLStreamReader reader) {
		return reader.getName().getLocalPart().equals(name);
	}

	public static byte[] digest(byte[] input, String algorithm) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}
		byte[] result = md.digest(input);
		return result;
	}

	public static String toHex(byte[] bytes) {
		return new Base16(true).encodeAsString(bytes);
	}

	public static String toBase64(byte[] bytes) {
		return new Base64().encodeAsString(bytes);
	}

	public static void debug(String msg) {
		// System.out.println(msg);
	}

	public static void log(String msg) {
		System.out.println(msg);
	}

	public void initTimeCalculation(String tipo) {
		log(String.format("Iniciando validación %s ", tipo));
		ini = System.currentTimeMillis();
	}

	public void endTimeCalculation(String tipo) {
		fin = System.currentTimeMillis();
		log(String.format("Tiempo total validación %s por bloques:%d ms", tipo, fin - ini));
	}

	public static void main(String args[]) throws Exception {
		try {
			TestValidator tv = new TestValidator();
			IntStream.range(0, 1).forEach(x -> {
				try {
					tv.validarCompleto();
					tv.validarPorBloques();
					tv.validarPorBloquesConDomAuxiliar(false);
					tv.validarPorBloquesConDomAuxiliar(true);
					tv.validarPorBloquesConJaxbAuxiliar();
				} catch (Exception e) {
					e.printStackTrace();
					debug("Error en los test");
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
