package com.picoto.main.ubl;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.picoto.jaxb.fe.BusinessType;
import com.picoto.jaxb.fe.ChargeType;
import com.picoto.jaxb.fe.DiscountType;
import com.picoto.jaxb.fe.Facturae;
import com.picoto.jaxb.fe.InvoiceLineType.TaxesOutputs.Tax;
import com.picoto.jaxb.fe.InvoiceTotalsType;
import com.picoto.jaxb.fe.InvoiceType;
import com.picoto.jaxb.fe.PersonTypeCodeType;
import com.picoto.jaxb.ubl.common.cac.AddressType;
import com.picoto.jaxb.ubl.common.cac.AllowanceChargeType;
import com.picoto.jaxb.ubl.common.cac.BranchType;
import com.picoto.jaxb.ubl.common.cac.CountryType;
import com.picoto.jaxb.ubl.common.cac.CustomerPartyType;
import com.picoto.jaxb.ubl.common.cac.FinancialAccountType;
import com.picoto.jaxb.ubl.common.cac.InvoiceLineType;
import com.picoto.jaxb.ubl.common.cac.ItemType;
import com.picoto.jaxb.ubl.common.cac.MonetaryTotalType;
import com.picoto.jaxb.ubl.common.cac.PartyName;
import com.picoto.jaxb.ubl.common.cac.PartyTaxScheme;
import com.picoto.jaxb.ubl.common.cac.PartyType;
import com.picoto.jaxb.ubl.common.cac.PaymentMeans;
import com.picoto.jaxb.ubl.common.cac.PaymentTermsType;
import com.picoto.jaxb.ubl.common.cac.PriceType;
import com.picoto.jaxb.ubl.common.cac.SupplierPartyType;
import com.picoto.jaxb.ubl.common.cac.TaxCategoryType;
import com.picoto.jaxb.ubl.common.cac.TaxScheme;
import com.picoto.jaxb.ubl.common.cac.TaxTotalType;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReasonCode;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.ChargeIndicator;
import com.picoto.jaxb.ubl.common.cbc.CityName;
import com.picoto.jaxb.ubl.common.cbc.CompanyID;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentity;
import com.picoto.jaxb.ubl.common.cbc.CustomizationID;
import com.picoto.jaxb.ubl.common.cbc.DocumentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.IdentificationCode;
import com.picoto.jaxb.ubl.common.cbc.InvoiceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.InvoicedQuantity;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.LineExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PayableAmount;
import com.picoto.jaxb.ubl.common.cbc.PaymentDueDate;
import com.picoto.jaxb.ubl.common.cbc.PaymentMeansCode;
import com.picoto.jaxb.ubl.common.cbc.Percent;
import com.picoto.jaxb.ubl.common.cbc.PriceAmount;
import com.picoto.jaxb.ubl.common.cbc.ProfileID;
import com.picoto.jaxb.ubl.common.cbc.StreetName;
import com.picoto.jaxb.ubl.common.cbc.TaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExemptionReasonCode;
import com.picoto.jaxb.ubl.common.cbc.TaxInclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxTypeCode;
import com.picoto.jaxb.ubl.maindoc.invoice.Invoice;

public class FacturaeConverter {

	private static final String TRANSFERENCIA_BANCARIA = "31";
	private static final String REGIMEN_GENERAL = "01";
	private static final String IVA = "IVA";
	private static final String EURO = "EUR";
	private static final String ORDINARIA = "380";
	private static final String SIMPLIFICADA = "381";
	private static final String RECTIFICATIVA = "382";

	public static void main(String[] args) {
		String facturaeInvoiceStr = "examples/invoice-face.xml";
		String ublInvoiceStrDest = "examples/invoice-ubl.xml";
		String ublInvoiceStrSimp = "examples/invoice-ubl-simplificada.xml";

		Facturae facturae = parseFacturaeInvoice(facturaeInvoiceStr);

		Invoice ublInvoice = mapFacturaeToUBL(facturae, false);

		writeUBLInvoice(ublInvoice, ublInvoiceStrDest);

		Invoice ublInvoiceSimpl = mapFacturaeToUBL(facturae, true);

		writeUBLInvoice(ublInvoiceSimpl, ublInvoiceStrSimp);
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

	public static Invoice mapFacturaeToUBL(Facturae facturae, boolean simplificada) {
		Invoice ublInvoice = new Invoice();

		// Solo tratamos la primera factura del fichero
		InvoiceType facturaTratar = facturae.getInvoices().getInvoices().get(0);

		ublInvoice.setID(getId(facturaTratar.getInvoiceHeader().getInvoiceSeriesCode() + "-"
				+ facturaTratar.getInvoiceHeader().getInvoiceNumber()));

		CustomizationID version = new CustomizationID();
		version.setValue("ORIGINAL");
		// version.setValue("COPIA");
		ublInvoice.setCustomizationID(version);

		ProfileID profileId = new ProfileID();
		profileId.setValue("Invoice");
		ublInvoice.setProfileID(profileId);

		DocumentCurrencyCode currency = new DocumentCurrencyCode();
		currency.setValue(EURO);
		ublInvoice.setDocumentCurrencyCode(currency);

		IssueDate date = new IssueDate();
		date.setValue(facturaTratar.getInvoiceIssueData().getIssueDate());
		ublInvoice.setIssueDate(date);

		// Factura ordinaria
		InvoiceTypeCode tipoFactura = new InvoiceTypeCode();
		tipoFactura.setValue(simplificada ? SIMPLIFICADA : ORDINARIA);
		ublInvoice.setInvoiceTypeCode(tipoFactura);

		Note note = new Note();
		note.setValue("ORGINAL");
		// note.setValue("COPIA");
		ublInvoice.getNotes().add(note);

		SupplierPartyType suplParty = new SupplierPartyType();
		PartyType party = new PartyType();
		fillParty(party, facturae.getParties().getSellerParty());
		suplParty.setParty(party);
		ublInvoice.setAccountingSupplierParty(suplParty);

		CustomerPartyType custParty = new CustomerPartyType();
		// Simplificada: No se rellena el Party, pero el nodo es necesario
		if (!simplificada) {
			PartyType party2 = new PartyType();
			custParty.setParty(party2);
			fillParty(party2, facturae.getParties().getBuyerParty());
		}
		ublInvoice.setAccountingCustomerParty(custParty);

		ublInvoice.setLegalMonetaryTotal(getLegalMonetaryTotal(facturaTratar.getInvoiceTotals()));

		List<com.picoto.jaxb.fe.InvoiceLineType> facturaeLineas = facturaTratar.getItems().getInvoiceLines();
		for (com.picoto.jaxb.fe.InvoiceLineType facturaeLine : facturaeLineas) {
			InvoiceLineType ublLine = mapInvoiceLine(facturaeLine);
			ublInvoice.getInvoiceLines().add(ublLine);
		}

		ublInvoice.getTaxTotals().add(getTaxTotal(facturaTratar.getInvoiceTotals()));

		// La forma de pago la añado de momento, no la convierto.
		addFormaPago(ublInvoice);

		return ublInvoice;
	}

	private static void addFormaPago(Invoice ublInvoice) {
		PaymentMeans formaPago = new PaymentMeans();
		ublInvoice.getPaymentMeans().add(formaPago);
		PaymentMeansCode codigoPago = new PaymentMeansCode();
		codigoPago.setValue(TRANSFERENCIA_BANCARIA);
		formaPago.setPaymentMeansCode(codigoPago);
		FinancialAccountType cuentaPago = new FinancialAccountType();
		formaPago.setPayeeFinancialAccount(cuentaPago);
		
		cuentaPago.setID(getIdWithScheme("IBAN", "ES9900001111223333333333"));
		BranchType entidad = new BranchType();
		entidad.setID(getId("BLOCES"));
		entidad.setName(getName("Banco Local"));
		cuentaPago.setFinancialInstitutionBranch(entidad);
		
		
		PaymentTermsType terminosPago = new PaymentTermsType();
		ublInvoice.getPaymentTerms().add(terminosPago);
		PaymentDueDate fechaLimite = new PaymentDueDate();

		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.MONTH, 1);
		fechaLimite.setValue(getCalendar(cal));
		terminosPago.setPaymentDueDate(fechaLimite); 
		
		Note notaFecha = new Note();
		notaFecha.setValue("Pago en 30 días");
		terminosPago.getNotes().add(notaFecha);

	}

	private static void fillParty(PartyType party, BusinessType faceParty) {
		PartyName pName = new PartyName();
		if (faceParty.getTaxIdentification().getPersonTypeCode().compareTo(PersonTypeCodeType.F) == 0) {
			pName.setName(
					getName(faceParty.getIndividual().getName() + " " + faceParty.getIndividual().getFirstSurname()
							+ " " + faceParty.getIndividual().getSecondSurname()));
			party.getPartyNames().add(pName);

			AddressType pAddress = new AddressType();
			party.setPostalAddress(pAddress);

			StreetName streetName = new StreetName();
			streetName.setValue(faceParty.getIndividual().getAddressInSpain().getAddress());
			pAddress.setStreetName(streetName);

			CityName cityName = new CityName();
			cityName.setValue(faceParty.getIndividual().getAddressInSpain().getTown());
			pAddress.setCityName(cityName);

			CountrySubentity countrySubentity = new CountrySubentity();
			countrySubentity.setValue(faceParty.getIndividual().getAddressInSpain().getProvince());
			pAddress.setCountrySubentity(countrySubentity);

			CountryType country = new CountryType();
			IdentificationCode idCode = new IdentificationCode();
			idCode.setValue(faceParty.getIndividual().getAddressInSpain().getCountryCode().value());
			country.setIdentificationCode(idCode);
			country.setName(getName(faceParty.getIndividual().getAddressInSpain().getCountryCode().toString()));
			pAddress.setCountry(country);

			PartyTaxScheme partyTaxScheme = new PartyTaxScheme();
			CompanyID companyId = new CompanyID();
			companyId.setValue(faceParty.getTaxIdentification().getTaxIdentificationNumber());
			partyTaxScheme.setCompanyID(companyId);
			TaxScheme taxScheme = new TaxScheme();
			TaxTypeCode taxTypeCode = new TaxTypeCode();
			taxTypeCode.setValue(IVA);
			taxScheme.setTaxTypeCode(taxTypeCode);
			partyTaxScheme.setTaxScheme(taxScheme);
			party.getPartyTaxSchemes().add(partyTaxScheme);

		} else {
			pName.setName(getName(faceParty.getLegalEntity().getTradeName()));
			party.getPartyNames().add(pName);

			AddressType pAddress = new AddressType();
			party.setPostalAddress(pAddress);

			StreetName streetName = new StreetName();
			streetName.setValue(faceParty.getLegalEntity().getAddressInSpain().getAddress());
			pAddress.setStreetName(streetName);

			CityName cityName = new CityName();
			cityName.setValue(faceParty.getLegalEntity().getAddressInSpain().getTown());
			pAddress.setCityName(cityName);

			CountrySubentity countrySubentity = new CountrySubentity();
			countrySubentity.setValue(faceParty.getLegalEntity().getAddressInSpain().getProvince());
			pAddress.setCountrySubentity(countrySubentity);

			CountryType country = new CountryType();
			IdentificationCode idCode = new IdentificationCode();
			idCode.setValue(faceParty.getLegalEntity().getAddressInSpain().getCountryCode().value());
			country.setIdentificationCode(idCode);
			country.setName(getName(faceParty.getLegalEntity().getAddressInSpain().getCountryCode().toString()));
			pAddress.setCountry(country);

			PartyTaxScheme partyTaxScheme = new PartyTaxScheme();
			CompanyID companyId = new CompanyID();
			companyId.setValue(faceParty.getTaxIdentification().getTaxIdentificationNumber());
			partyTaxScheme.setCompanyID(companyId);
			TaxScheme taxScheme = new TaxScheme();
			TaxTypeCode taxTypeCode = new TaxTypeCode();
			taxTypeCode.setValue(IVA);
			taxScheme.setTaxTypeCode(taxTypeCode);
			partyTaxScheme.setTaxScheme(taxScheme);
			party.getPartyTaxSchemes().add(partyTaxScheme);

		}

	}

	private static MonetaryTotalType getLegalMonetaryTotal(InvoiceTotalsType impuestosTotales) {
		MonetaryTotalType legalMonetaryTotal = new MonetaryTotalType();

		LineExtensionAmount leAmount = new LineExtensionAmount();
		legalMonetaryTotal.setLineExtensionAmount(leAmount);
		leAmount.setCurrencyID(EURO);
		leAmount.setValue(getBigDecimalRedondeado(impuestosTotales.getTotalGrossAmount()));

		TaxExclusiveAmount teAmount = new TaxExclusiveAmount();
		teAmount.setCurrencyID(EURO);
		teAmount.setValue(getBigDecimalRedondeado(impuestosTotales.getTotalGrossAmountBeforeTaxes()));
		legalMonetaryTotal.setTaxExclusiveAmount(teAmount);

		TaxInclusiveAmount tiAmount = new TaxInclusiveAmount();
		tiAmount.setCurrencyID(EURO);
		tiAmount.setValue(getBigDecimalRedondeado(impuestosTotales.getTotalOutstandingAmount()));
		legalMonetaryTotal.setTaxInclusiveAmount(tiAmount);

		PayableAmount pAmount = new PayableAmount();
		pAmount.setCurrencyID(EURO);
		pAmount.setValue(getBigDecimalRedondeado(impuestosTotales.getTotalExecutableAmount()));
		legalMonetaryTotal.setPayableAmount(pAmount);

		return legalMonetaryTotal;

	}

	private static TaxTotalType getTaxTotal(InvoiceTotalsType taxTotals) {
		TaxTotalType taxTotal = new TaxTotalType();
		TaxAmount taxAmount = new TaxAmount();
		taxAmount.setValue(getBigDecimalRedondeado(taxTotals.getTotalTaxOutputs()));
		taxTotal.setTaxAmount(taxAmount);
		taxAmount.setCurrencyID(EURO);
		return taxTotal;
	}

	private static InvoiceLineType mapInvoiceLine(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		InvoiceLineType ublLine = new InvoiceLineType();

		Tax impuestoTratar = facturaeLinea.getTaxesOutputs().getTaxes().get(0);

		ublLine.setID(getId(facturaeLinea.getArticleCode()));

		InvoicedQuantity ic = new InvoicedQuantity();
		ic.setValue(getBigDecimalRedondeado(facturaeLinea.getQuantity()));
		ublLine.setInvoicedQuantity(ic);

		LineExtensionAmount lea = new LineExtensionAmount();
		lea.setValue(getBigDecimalRedondeado(facturaeLinea.getTotalCost()));
		lea.setCurrencyID(EURO);
		ublLine.setLineExtensionAmount(lea);

		PriceType unitPrice = new PriceType();
		PriceAmount unitPriceAmount = new PriceAmount();
		unitPriceAmount.setValue(getBigDecimalRedondeado(facturaeLinea.getUnitPriceWithoutTax()));
		unitPriceAmount.setCurrencyID(EURO);
		unitPrice.setPriceAmount(unitPriceAmount);
		ublLine.setPrice(unitPrice);

		ItemType item = new ItemType();
		item.setName(getName(facturaeLinea.getItemDescription()));

		ublLine.setItem(item);

		TaxTotalType taxTotal = new TaxTotalType();
		TaxAmount taxAmount = new TaxAmount();
		taxAmount.setCurrencyID(EURO);
		taxAmount.setValue(getBigDecimalRedondeado(impuestoTratar.getTaxAmount().getTotalAmount()));
		taxTotal.setTaxAmount(taxAmount);
		ublLine.getTaxTotals().add(taxTotal);

		TaxCategoryType tasaItem = new TaxCategoryType();
		// Regimen de la operacion
		tasaItem.setID(getId(REGIMEN_GENERAL));
		TaxScheme taxScheme = new TaxScheme();
		taxScheme.setID(getId("IVA"));
		taxScheme.setName(getName(IVA));

		tasaItem.setTaxScheme(taxScheme);

		// En operaciones no sujetas, el porcentaje será 0. No tenemos el dato en
		// Factura-e a nivel del item.
		Percent percent = new Percent();
		percent.setValue(getBigDecimalRedondeado(impuestoTratar.getTaxRate()));
		tasaItem.setPercent(percent);
		item.getClassifiedTaxCategories().add(tasaItem);

		// En operaciones exentas, se indica el motivo de exencion
		TaxExemptionReasonCode motivoExencion = new TaxExemptionReasonCode();
		motivoExencion.setValue("E1");
		tasaItem.setTaxExemptionReasonCode(motivoExencion);

		// Descuentos

		DiscountType descuentoTratar = facturaeLinea.getDiscountsAndRebates().getDiscounts().get(0);
		ChargeType cargoTratar = facturaeLinea.getCharges().getCharges().get(0);

		ublLine.getAllowanceCharges().add(crearDescuento(descuentoTratar));
		ublLine.getAllowanceCharges().add(crearCargo(cargoTratar));

		return ublLine;
	}

	private static AllowanceChargeType crearCargo(ChargeType cargoTratar) {
		AllowanceChargeType suplido = new AllowanceChargeType();

		ChargeIndicator indicator = new ChargeIndicator();
		indicator.setValue(true);
		suplido.setChargeIndicator(indicator);
		Amount desAmount = new Amount();
		desAmount.setValue(getBigDecimalRedondeado(cargoTratar.getChargeAmount()));
		suplido.setAmount(desAmount);
		desAmount.setCurrencyID(EURO);
		AllowanceChargeReasonCode motivoDescuento = new AllowanceChargeReasonCode();
		motivoDescuento.setValue(null);
		suplido.setAllowanceChargeReasonCode(motivoDescuento);

		return suplido;
	}

	private static AllowanceChargeType crearDescuento(DiscountType faceCharge) {

		AllowanceChargeType descuento = new AllowanceChargeType();

		ChargeIndicator indicator = new ChargeIndicator();
		indicator.setValue(false);
		descuento.setChargeIndicator(indicator);
		Amount desAmount = new Amount();
		desAmount.setValue(getBigDecimalRedondeado(faceCharge.getDiscountAmount()));
		descuento.setAmount(desAmount);
		desAmount.setCurrencyID(EURO);
		AllowanceChargeReasonCode motivoDescuento = new AllowanceChargeReasonCode();
		motivoDescuento.setValue(null);
		descuento.setAllowanceChargeReasonCode(motivoDescuento);

		return descuento;
	}

	private static BigDecimal getBigDecimalRedondeado(double importe) {
		return BigDecimal.valueOf(importe).setScale(2, RoundingMode.HALF_UP);
	}

	private static Name getName(String nameStr) {
		Name name = new Name();
		name.setValue(nameStr);
		return name;
	}

	private static ID getId(String nameStr) {
		ID id = new ID();
		id.setValue(nameStr);
		return id;
	}
	
	private static ID getIdWithScheme(String scheme, String nameStr) {
		ID id = new ID();
		id.setSchemeID(scheme);
		id.setValue(nameStr);
		return id;
	}

	private static XMLGregorianCalendar getCalendar(Calendar cal) {
		try {
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			XMLGregorianCalendar customDate = datatypeFactory.newXMLGregorianCalendar();
			customDate.setYear(cal.get(Calendar.YEAR));
			customDate.setMonth(cal.get(Calendar.MONTH)+1);
			customDate.setDay(cal.get(Calendar.DAY_OF_MONTH));

			return customDate;
		} catch (Exception e) {
			return null;
		}
	}

}
