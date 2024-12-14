package com.picoto.main.ubl;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.picoto.jaxb.fe.Facturae;
import com.picoto.jaxb.ubl.common.cac.InvoiceLineType;
import com.picoto.jaxb.ubl.common.cac.ItemType;
import com.picoto.jaxb.ubl.common.cac.PriceType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InvoicedQuantity;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.LineExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.PriceAmount;
import com.picoto.jaxb.ubl.maindoc.invoice.Invoice;

public class FacturaeConverter {

	public static void main(String[] args) {
		String facturaeInvoiceStr = "examples/invoice-face.xml";
		String ublInvoiceStr = "examples/invoice-ubl.xml";

		Facturae facturae = parseFacturaeInvoice(facturaeInvoiceStr);

		Invoice ublInvoice = mapFacturaeToUBL(facturae);

		writeUBLInvoice(ublInvoice, ublInvoiceStr);
	}

	public static Facturae parseFacturaeInvoice(String facturaePath) {
		try {
			JAXBContext context = JAXBContext.newInstance(Facturae.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (Facturae) unmarshaller.unmarshal(new File(facturaePath));
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void writeUBLInvoice(Invoice ublInvoice, String outputPath) {
		try {
			JAXBContext context = JAXBContext.newInstance(Invoice.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(ublInvoice, new File(outputPath));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static Invoice mapFacturaeToUBL(Facturae facturae) {
		Invoice ublInvoice = new Invoice();

		ID id = new ID();
		id.setValue(facturae.getInvoices().getInvoices().get(0).getInvoiceHeader().getInvoiceNumber());
		ublInvoice.setID(id);

		IssueDate date = new IssueDate();
		date.setValue(facturae.getInvoices().getInvoices().get(0).getInvoiceIssueData().getIssueDate());
		ublInvoice.setIssueDate(date);

		List<com.picoto.jaxb.fe.InvoiceLineType> facturaeLineas = facturae.getInvoices().getInvoices().get(0).getItems()
				.getInvoiceLines();
		for (com.picoto.jaxb.fe.InvoiceLineType facturaeLine : facturaeLineas) {
			InvoiceLineType ublLine = mapInvoiceLine(facturaeLine);
			ublInvoice.getInvoiceLines().add(ublLine);
		}

		return ublInvoice;
	}

	private static InvoiceLineType mapInvoiceLine(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		InvoiceLineType ublLine = new InvoiceLineType();

		ID id = new ID();
		id.setValue(facturaeLinea.getArticleCode());
		ublLine.setID(id);

		InvoicedQuantity ic = new InvoicedQuantity();
		ic.setValue(new BigDecimal(facturaeLinea.getQuantity()));
		ublLine.setInvoicedQuantity(ic);

		LineExtensionAmount lea = new LineExtensionAmount();
		lea.setValue(new BigDecimal(facturaeLinea.getUnitPriceWithoutTax()));
		ublLine.setLineExtensionAmount(lea);

		ItemType item = new ItemType();
		Name name = new Name();
		name.setValue(facturaeLinea.getItemDescription());
		item.setName(name);
		
		PriceType price = new PriceType();
		PriceAmount priceAmount = new PriceAmount();
		priceAmount.setValue(new BigDecimal(facturaeLinea.getTotalCost()));
		priceAmount.setCurrencyID("EUR");
		price.setPriceAmount(priceAmount);
		
		ublLine.setItem(item);
		ublLine.setPrice(price);

		return ublLine;
	}

}
