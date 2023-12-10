package com.picoto.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.function.Consumer;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
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

import org.apache.commons.io.IOUtils;
import org.jaxen.JaxenException;
import org.jaxen.XPath;
import org.jaxen.dom.DOMXPath;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.picoto.Facturae;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.util.JAXBResult;

public class TestValidator {

	private JAXBContext ctx;
	private long ini, fin;

	public TestValidator() throws JAXBException {
		super();
		if (ctx == null) {
			ctx = JAXBContext.newInstance("com.picoto");
		}
	}

	private Validator initValidator(Class<?> clazz, String path) throws SAXException, IOException {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		CustomResourceResolver cr = new CustomResourceResolver(clazz);
		factory.setResourceResolver(cr);

		Schema schema = factory.newSchema(getSourceFromPath(clazz, path));
		Validator val = schema.newValidator();
		return val;
	}

	private Source getSourceFromPath(Class<?> clazz, String path) {
		try {
			debug("     Cargando schema: "+clazz.getCanonicalName()+" "+path);
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
		Validator validator = initValidator(Facturae.class, "/schemas/Remesas.xml");

		this.procesarNodos("Facturae", "STR", reader, (r) -> {
			try {
				String nodo = getStringCompleto(reader);
				int pos = nodo.indexOf("<InvoiceTotal>");
				debug(nodo.substring(pos+14,pos+21));
				// Procesar el String al gusto
				validator.validate(getStaxSource(nodo));
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento");
			}
		});
	}

	public void validarPorBloquesConDomAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = initValidator(Facturae.class, "/schemas/Remesas.xml");

		this.procesarNodos("Facturae", "DOM", reader, (r) -> {
			try {
				Node node = getNodoCompleto(reader);
				debug("Nodo: "+node.getFirstChild().getNodeName());
				// Procesar al gusto
				debug("Nodo: "+getNodo("//Facturae/Invoices/Invoice[0]/InvoiceTotals/InvoiceTotal/text()", node.getFirstChild()));
				validator.validate(new DOMSource(node));
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento");
			}
		});
	}

	private String getNodo(String xpath, Node node) throws JaxenException {
		XPath path = new DOMXPath(xpath);
	    String str = (String)path.selectSingleNode(node);
	    return str;
	}

	public void validarPorBloquesConJaxbAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException, JAXBException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));

		this.procesarNodos("Facturae", "JAXB", reader, (r) -> {
			try {
				Facturae face = getObjetoCompleto(r);
				debug("     " + face.getInvoices().getInvoice().get(0).getInvoiceTotals().getInvoiceTotal());
				// Aqui ya se ha validaDO al montar el JAX-B no hace falta validar
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento");
			}
		});
	}

	public void validarCompleto() throws XMLStreamException, SAXException, IOException {

		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = initValidator(Facturae.class, "/schemas/Remesas.xml");

		initTimeCalculation();
		validator.validate(new StAXSource(reader));
		endTimeCalculation("COMPLETO");
	}

	private void procesarNodos(String elemento, String modo, XMLStreamReader reader, Consumer<XMLStreamReader> c)
			throws XMLStreamException, TransformerException, SAXException, IOException {
		initTimeCalculation();
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

	private static Node getNodoCompleto(XMLStreamReader reader) throws XMLStreamException, TransformerException {
		DOMResult dr = new DOMResult();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new StAXSource(reader), dr);
		return dr.getNode();
	}

	private Facturae getObjetoCompleto(XMLStreamReader reader) throws JAXBException, TransformerException {
		JAXBResult jaxbr = new JAXBResult(ctx);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new StAXSource(reader), jaxbr);
		return (Facturae) jaxbr.getResult();
	}

	private XMLStreamReader getStaxReader(InputStream is) throws XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		return xmlInputFactory.createXMLStreamReader(is);
	}

	private StAXSource getStaxSource(String xml) throws XMLStreamException {
		//debug("************************************************************************");
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		return new StAXSource(xmlInputFactory.createXMLStreamReader(new StringReader(xml)));
	}

	private boolean isElementNamed(String name, XMLStreamReader reader) {
		return reader.getName().getLocalPart().equals(name);
	}

	public void debug(String msg) {
		System.out.println(msg);
	}

	public void initTimeCalculation() {
		ini = System.currentTimeMillis();
	}

	public void endTimeCalculation(String tipo) {
		fin = System.currentTimeMillis();
		debug(String.format("Tiempo total validación %s por bloques:%d ms", tipo, fin - ini));
	}

	public static void main(String args[]) throws Exception {
		try {
			TestValidator tv = new TestValidator();
			tv.validarCompleto();
			tv.validarPorBloques();
			tv.validarPorBloquesConDomAuxiliar();
			tv.validarPorBloquesConJaxbAuxiliar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
