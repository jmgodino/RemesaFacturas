package com.picoto.main;

import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;

public class TestExtraerDatosFactura {

	private static String[] conceptos = new String[] { 
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalGrossAmount",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalGeneralDiscounts",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalGeneralSurcharges",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalGrossAmountBeforeTaxes",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalTaxOutputs",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalTaxesWithheld",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/InvoiceTotal",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalPaymentsOnAccount",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalOutstandingAmount",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/AmountsWithheld",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/PaymentInKind",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalReimbursableExpenses",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalFinancialExpenses",
			"//fe:Facturae/Invoices/Invoice/InvoiceTotals/TotalExecutableAmount"
	};

	private static String[] conceptosDesc = new String[] { 
			"Total Base imponible", 
			"Total Descuentos", 
			"Total Cargos (Suplidos)",
			"Importe total antes de impuestos", 
			"Total impuestos aplicables", 
			"Retenciones sobre impuestos", 
			"Total factura",
			"Total pagos a cuenta",
			"Importe pendiente",
			"Importe retenido",
			"Total pagos en especie", 
			"Total gastos reembolsables", 
			"Total gastos financieros", 
			"Importe total a ingresar"
	};

	public static void main(String[] args) throws Exception {
		String strDoc = IOUtils.toString(Utils.getFile("./ejemplo.xml"), Charset.defaultCharset());
		Document doc = Utils.parseDocument(strDoc);
		String prefix = "fe";
		String ns = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml";

		
		
		Utils.log("Nº Factura: " + Utils.getXPath("//fe:Facturae/Invoices/Invoice/InvoiceHeader/InvoiceNumber", prefix, ns, doc));
		String tipo = Utils.getXPath("//fe:Facturae/Invoices/Invoice/InvoiceHeader/InvoiceDocumentType", prefix, ns, doc);
		Utils.log("Tipo Factura: " + getTipoFactura(tipo));
		Utils.log("---------------");
		
		for (int i = 0; i < conceptos.length; i++) {
			Utils.log(conceptosDesc[i] + ": " + Utils.getXPath(conceptos[i], prefix, ns, doc));

		}

	}

	private static String getTipoFactura(String tipo) {
		if (tipo.equalsIgnoreCase("FC")) {
			return "Factura Ordinaria";
		} else {
			return "Factura Simplificada";
		}
	}

}
