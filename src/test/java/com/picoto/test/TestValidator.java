package com.picoto.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

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
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

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
		ctx = JAXBContext.newInstance("com.picoto");
	}

	private Validator initValidator(String xsdPath) throws SAXException, IOException {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Source schemaFile = new StreamSource(getFile(xsdPath));
		Schema schema = factory.newSchema(schemaFile);
		return schema.newValidator();
	}

	private InputStream getFile(String location) throws IOException {
		return new FileInputStream(location);
	}

	public void validarPorBloques() throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = initValidator("./src/main/xsd/Remesas.xml");

		initTimeCalculation();
		while (reader.hasNext()) {
			if (reader.isStartElement()) {
				if (isNodoFactura(reader)) {
					String nodo = getStringCompleto(reader);
					// Procesar el String al gusto
					validator.validate(getStaxSource(nodo));
				}
			}
			reader.next();
		}
		endTimeCalculation("String");
	}

	private boolean isNodoFactura(XMLStreamReader reader) {
		return reader.getName().getLocalPart().equals("Facturae");
	}

	public void validarPorBloquesConDomAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = initValidator("./src/main/xsd/Remesas.xml");

		initTimeCalculation();
		while (reader.hasNext()) {
			if (reader.isStartElement()) {
				if (isNodoFactura(reader)) {
					Node node = getNodoCompleto(reader);
					// Procesar al gusto
					validator.validate(new DOMSource(node));
				}
			}
			reader.next();
		}
		endTimeCalculation("DOM");
	}

	public void validarPorBloquesConJaxbAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException, JAXBException {
		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));

		initTimeCalculation();
		while (reader.hasNext()) {
			if (reader.isStartElement()) {
				if (isNodoFactura(reader)) {
					Facturae face = getObjetoCompleto(reader);
					// Aqui ya se ha valida al montar el JAX-B no hace falta validar
				}
			}
			reader.next();
		}
		endTimeCalculation("JAXB");
	}

	public void validarCompleto() throws XMLStreamException, SAXException, IOException {

		XMLStreamReader reader = getStaxReader(getFile("./ejemplo.xml"));
		Validator validator = initValidator("./src/main/xsd/Remesas.xml");

		long ini = System.currentTimeMillis();
		validator.validate(new StAXSource(reader));

		long fin = System.currentTimeMillis();
		debug("Tiempo total validación única: " + (fin - ini) + "ms");

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
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		return new StAXSource(xmlInputFactory.createXMLStreamReader(new StringReader(xml)));
	}

	public void debug(String msg) {
		System.out.println(msg);
	}

	public void initTimeCalculation() {
		ini = System.currentTimeMillis();
	}

	public void endTimeCalculation(String tipo) {
		fin = System.currentTimeMillis();
		debug(String.format("Tiempo total validación %s por bloques:%d ms", tipo, fin-ini));
	}

	public static void main(String args[]) throws Exception {
		TestValidator tv = new TestValidator();
		tv.validarCompleto();
		tv.validarPorBloques();
		tv.validarPorBloquesConDomAuxiliar();
		tv.validarPorBloquesConJaxbAuxiliar();
	}

}
