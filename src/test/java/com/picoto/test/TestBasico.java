package com.picoto.test;

import com.picoto.jaxb.fe.BusinessType;
import com.picoto.jaxb.fe.Facturae;
import com.picoto.jaxb.fe.FileHeaderType;
import com.picoto.jaxb.fe.InvoiceIssuerTypeType;
import com.picoto.jaxb.fe.InvoiceType;
import com.picoto.jaxb.fe.InvoicesType;
import com.picoto.jaxb.fe.ModalityType;
import com.picoto.jaxb.fe.PartiesType;
import com.picoto.jaxb.fe.Remesa;

public class TestBasico {

	public static void main(String args[]) {
		Remesa rem = new Remesa();
		rem.getFacturaes().add(newFactura());
		System.out.println(rem);
	}

	private static Facturae newFactura() {
		Facturae fact = new Facturae();
		fact.setFileHeader(newHeader());
		fact.setParties(newParties());
		fact.setInvoices(newInvoices());
		fact.setExtensions(null);
		fact.setSignature(null);
		return fact;
	}

	private static InvoicesType newInvoices() {
		InvoicesType invoice = new InvoicesType();
		invoice.getInvoices().add(newInvoice());
		return invoice;
	}

	private static InvoiceType newInvoice() {
		InvoiceType invoice = new InvoiceType();
		invoice.setInvoiceHeader(null);
		invoice.setInvoiceIssueData(null);
		invoice.setInvoiceTotals(null);
		invoice.setItems(null);
		invoice.setLegalLiterals(null);
		invoice.setPaymentDetails(null);
		invoice.setTaxesOutputs(null);
		invoice.setTaxesWithheld(null);
		return invoice;
	}

	private static PartiesType newParties() {
		PartiesType parties = new PartiesType();
		parties.setBuyerParty(newBuyer());
		parties.setSellerParty(newSeller());
		return parties;
	}

	private static BusinessType newSeller() {
		BusinessType bus = new BusinessType();
		bus.setIndividual(null);
		bus.setLegalEntity(null);
		bus.setPartyIdentification(null);
		bus.setTaxIdentification(null);
		return bus;
	}

	private static BusinessType newBuyer() {
		// TODO Auto-generated method stub
		return null;
	}

	private static FileHeaderType newHeader() {
		FileHeaderType header = new FileHeaderType();
		header.setBatch(null);
		header.setInvoiceIssuerType(InvoiceIssuerTypeType.EM);
		header.setModality(ModalityType.I);
		header.setSchemaVersion("3.2.2");
		header.setThirdParty(null);
		return header;
	}
	
}
