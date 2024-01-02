package com.picoto.main.xades4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import xades4j.providers.impl.HttpTsaConfiguration;
import xades4j.utils.DOMHelper;

public class SignatureServicesTestBase {
	static protected HttpTsaConfiguration DEFAULT_TEST_TSA = new HttpTsaConfiguration("http://tss.accv.es:8318/tsa");

	static private final DocumentBuilder db;

	static {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException ex) {
			throw new NullPointerException("SignatureServicesTestBase init failed:" + ex.getMessage());
		}
	}

	/**
	 * Gets a XML document from the src/test/xml folder. If the root element of the
	 * document has an "Id" attribute it is set to be its XML ID.
	 */
	public static Document getDocument(String fileName) throws Exception {
		String path = fileName;
		try (FileInputStream fis = new FileInputStream(path)) {
			return parseDocument(fis);
		}
	}

	public static Document parseDocument(InputStream is) throws Exception {
		Document doc = db.parse(is);
		// Apache Santuario now uses Document.getElementById; use this convention for
		// tests.
		Element elem = doc.getDocumentElement();
		DOMHelper.useIdAsXmlId(elem);
		return doc;
	}


	protected static void outputDocument(Document doc, String fileName) throws Exception {
		try (FileOutputStream out = new FileOutputStream(new File(fileName))) {
			outputDOM(doc, out);
		}

	}

	protected static void outputDOM(Node dom, OutputStream os) throws Exception {
		TransformerFactory tf = TransformerFactory.newInstance();
		tf.newTransformer().transform(new DOMSource(dom), new StreamResult(os));
	}
}
