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
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class TestValidator {

	private Validator initValidator(String xsdPath) throws SAXException, IOException {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Source schemaFile = new StreamSource(getFile(xsdPath));
		Schema schema = factory.newSchema(schemaFile);
		return schema.newValidator();
	}

	private InputStream getFile(String location) throws IOException {

		return new FileInputStream(location);

	}

	public static void main(String args[]) throws Exception {
		TestValidator tv = new TestValidator();

		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLStreamReader reader1 = xmlInputFactory.createXMLStreamReader(new FileInputStream("./ejemplo.xml"));

		Validator validator1 = tv.initValidator("./src/main/xsd/Facturaev322.xml");
		long ini = System.currentTimeMillis();
		while (reader1.hasNext()) {
			if (reader1.isStartElement()) {
				if (reader1.getName().getLocalPart().equals("Facturae")) {
					String nodo = imprimirNodoCompleto(reader1);
					System.out.println(nodo);
					XMLStreamReader readerAux = xmlInputFactory.createXMLStreamReader(new StringReader(nodo));
					validator1.validate(new StAXSource(readerAux));
					//validator1.validate(new StAXSource(reader1));
					//System.out.println("validado correctamente");
				}
			}
			reader1.next();
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo total validación por bloques: " + (fin - ini) + "ms");

		Validator validator2 = tv.initValidator("./src/main/xsd/Remesas.xml");
		XMLStreamReader reader2 = xmlInputFactory.createXMLStreamReader(new FileInputStream("./ejemplo.xml"));

		ini = System.currentTimeMillis();
		validator2.validate(new StAXSource(reader2));

		fin = System.currentTimeMillis();
		System.out.println("Tiempo total validación única: " + (fin - ini) + "ms");

	}

	private static String imprimirNodoCompleto(XMLStreamReader reader) throws XMLStreamException, TransformerException {
		 StringWriter sw = new StringWriter();
		 TransformerFactory tf = TransformerFactory.newInstance();
         Transformer t = tf.newTransformer();
         t.transform(new StAXSource(reader), new StreamResult(sw));
		 return sw.toString();
	}

}
