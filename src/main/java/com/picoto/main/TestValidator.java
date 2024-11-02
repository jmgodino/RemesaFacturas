package com.picoto.main;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.picoto.jaxb.Facturae;

import jakarta.xml.bind.JAXBException;

public class TestValidator extends Temporizado {

	public TestValidator() throws JAXBException {
		super();
	}

	public void validarPorBloques() throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = Utils.getStaxReader(Utils.getFile("examples/firma.xml"));
		Validator validator = Utils.getValidator(Facturae.class, "/schemas/Remesas.xsd");

		this.procesarNodos("Facturae", "STR", reader, (r) -> {
			try {
				String nodo = Utils.getStringCompleto(reader);
				validator.validate(Utils.getStaxSource(nodo));

				Pattern p = Pattern.compile("<InvoiceTotal>(.*)</InvoiceTotal>");
				Matcher m = p.matcher(nodo);
				if (m.find()) {
					Utils.debug("     Valor de Regex: " + m.group(1));
				}
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	public void validarPorBloquesConDomAuxiliar(boolean canonical)
			throws XMLStreamException, SAXException, IOException, TransformerException {
		XMLStreamReader reader = Utils.getStaxReader(Utils.getFile("examples/firma.xml"));
		Validator validator = Utils.getValidator(Facturae.class, "/schemas/Remesas.xsd");

		this.procesarNodos("Facturae", "DOM canonical(" + canonical + ")", reader, (r) -> {
			try {
				Node node = Utils.getNodoCompleto(reader, canonical);
				validator.validate(new DOMSource(node));

				Utils.debug("     Valor XPath del DOM: " + Utils.getXPath(
						"/fe:Facturae/Invoices/Invoice/InvoiceTotals/InvoiceTotal/text()", "fe",
						"http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", node.getFirstChild()));
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	private Facturae getObjetoCompleto(XMLStreamReader reader, Schema schema)
			throws JAXBException, TransformerException, SAXException, IOException {
		return getJaxbObject(Facturae.class, schema, reader);
		
	}

	public void validarPorBloquesConJaxbAuxiliar()
			throws XMLStreamException, SAXException, IOException, TransformerException, JAXBException {
		XMLStreamReader reader = Utils.getStaxReader(Utils.getFile("examples/firma.xml"));
		Schema schema = Utils.getSchema(Facturae.class, "/schemas/Remesas.xsd");

		this.procesarNodos("Facturae", "JAXB", reader, (r) -> {
			try {
				Facturae face = getObjetoCompleto(r, schema);
				Utils.debug("     Valor del JAX-B: "
						+ face.getInvoices().getInvoice().get(0).getInvoiceTotals().getInvoiceTotal());
				// Aqui ya se ha validado al montar el JAX-B no hace falta validar
			} catch (Exception e) {
				throw new RuntimeException("Error al procesar el elemento", e);
			}
		});
	}

	public void validarCompleto() throws XMLStreamException, SAXException, IOException {

		XMLStreamReader reader = Utils.getStaxReader(Utils.getFile("examples/firma.xml"));
		Validator validator = Utils.getValidator(Facturae.class, "/schemas/Remesas.xsd");

		initTimeCalculation("COMPLETO");
		validator.validate(new StAXSource(reader));
		endTimeCalculation("COMPLETO");
	}

	private void procesarNodos(String elemento, String modo, XMLStreamReader reader, Consumer<XMLStreamReader> c)
			throws XMLStreamException, TransformerException, SAXException, IOException {
		initTimeCalculation(modo);
		while (reader.hasNext()) {
			if (reader.isStartElement()) {
				if (Utils.isElementNamed(elemento, reader)) {
					c.accept(reader);
				}
			}
			reader.next();
		}
		endTimeCalculation(modo);
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
					Utils.debug("Error en los test");
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
