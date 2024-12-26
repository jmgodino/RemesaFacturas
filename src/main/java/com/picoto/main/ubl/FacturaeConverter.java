package com.picoto.main.ubl;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

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
import com.picoto.jaxb.fe.InstallmentType;
import com.picoto.jaxb.fe.InstallmentsType;
import com.picoto.jaxb.fe.InvoiceLineType.TaxesOutputs.Tax;
import com.picoto.jaxb.fe.InvoiceTotalsType;
import com.picoto.jaxb.fe.InvoiceType;
import com.picoto.jaxb.fe.PersonTypeCodeType;
import com.picoto.jaxb.fe.SpecialTaxableEventType;
import com.picoto.jaxb.fe.TaxOutputType;
import com.picoto.jaxb.ubl.common.cac.AddressType;
import com.picoto.jaxb.ubl.common.cac.AllowanceChargeType;
import com.picoto.jaxb.ubl.common.cac.BillingReference;
import com.picoto.jaxb.ubl.common.cac.BranchType;
import com.picoto.jaxb.ubl.common.cac.ContactType;
import com.picoto.jaxb.ubl.common.cac.CountryType;
import com.picoto.jaxb.ubl.common.cac.CustomerPartyType;
import com.picoto.jaxb.ubl.common.cac.DocumentReferenceType;
import com.picoto.jaxb.ubl.common.cac.FinancialAccountType;
import com.picoto.jaxb.ubl.common.cac.InvoiceLineType;
import com.picoto.jaxb.ubl.common.cac.ItemType;
import com.picoto.jaxb.ubl.common.cac.MonetaryTotalType;
import com.picoto.jaxb.ubl.common.cac.PartyIdentification;
import com.picoto.jaxb.ubl.common.cac.PartyLegalEntity;
import com.picoto.jaxb.ubl.common.cac.PartyName;
import com.picoto.jaxb.ubl.common.cac.PartyTaxScheme;
import com.picoto.jaxb.ubl.common.cac.PartyType;
import com.picoto.jaxb.ubl.common.cac.PaymentMeans;
import com.picoto.jaxb.ubl.common.cac.PaymentTermsType;
import com.picoto.jaxb.ubl.common.cac.PersonType;
import com.picoto.jaxb.ubl.common.cac.PriceType;
import com.picoto.jaxb.ubl.common.cac.SupplierPartyType;
import com.picoto.jaxb.ubl.common.cac.TaxCategoryType;
import com.picoto.jaxb.ubl.common.cac.TaxScheme;
import com.picoto.jaxb.ubl.common.cac.TaxSubtotal;
import com.picoto.jaxb.ubl.common.cac.TaxTotalType;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReasonCode;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.ChargeIndicator;
import com.picoto.jaxb.ubl.common.cbc.CityName;
import com.picoto.jaxb.ubl.common.cbc.CompanyID;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentity;
import com.picoto.jaxb.ubl.common.cbc.CustomizationID;
import com.picoto.jaxb.ubl.common.cbc.DocumentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentType;
import com.picoto.jaxb.ubl.common.cbc.DocumentTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ElectronicMail;
import com.picoto.jaxb.ubl.common.cbc.FamilyName;
import com.picoto.jaxb.ubl.common.cbc.FirstName;
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
import com.picoto.jaxb.ubl.common.cbc.RegistrationName;
import com.picoto.jaxb.ubl.common.cbc.StreetName;
import com.picoto.jaxb.ubl.common.cbc.TaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExemptionReasonCode;
import com.picoto.jaxb.ubl.common.cbc.TaxInclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TaxableAmount;
import com.picoto.jaxb.ubl.common.cbc.Telephone;
import com.picoto.jaxb.ubl.maindoc.invoice.Invoice;

public class FacturaeConverter {

	private static final String VAT = "VAT";
	private static final String NO_SUJETA = "01";
	private static final String EXENTA = "02";
	private static final String TRANSFERENCIA_BANCARIA = "31";
	private static final String REGIMEN_GENERAL = "01";
	private static final String IVA = "IVA";
	private static final String EURO = "EUR";
	private static final String ORDINARIA_SIMPLIFICADA = "380";
	private static final String RECTIFICATIVA_NOTA_CREDITO = "381";

	public static void main(String[] args) {

		String facturaeInvoiceOrdinariaStr = "examples/in/invoice-face-ordinaria.xml";
		String facturaeInvoiceSimplificadaStr = "examples/in/invoice-face-simplificada.xml";
		String facturaeInvoiceRectificativaStr = "examples/in/invoice-face-rectificativa.xml";

		String ublInvoiceStrDest = "examples/out/invoice-ubl-ordinaria.xml";
		String ublInvoiceStrSimp = "examples/out/invoice-ubl-simplificada.xml";
		String ublInvoiceStrRect = "examples/out/invoice-ubl-rectificativa.xml";

		Invoice ublInvoice = mapFacturaeToUBL(parseFacturaeInvoice(facturaeInvoiceOrdinariaStr));

		writeUBLInvoice(ublInvoice, ublInvoiceStrDest);

		Invoice ublInvoiceSimpl = mapFacturaeToUBL(parseFacturaeInvoice(facturaeInvoiceSimplificadaStr));

		writeUBLInvoice(ublInvoiceSimpl, ublInvoiceStrSimp);

		Invoice ublInvoiceRect = mapFacturaeToUBL(parseFacturaeInvoice(facturaeInvoiceRectificativaStr));

		writeUBLInvoice(ublInvoiceRect, ublInvoiceStrRect);
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

		// Solo tratamos la primera factura del fichero
		InvoiceType facturaTratar = facturae.getInvoices().getInvoices().get(0);

		setDatosPrincipalesFactura(ublInvoice, facturaTratar);

		SupplierPartyType suplParty = new SupplierPartyType();
		PartyType party = new PartyType();
		fillParty(party, facturae.getParties().getSellerParty());
		suplParty.setParty(party);
		ublInvoice.setAccountingSupplierParty(suplParty);

		CustomerPartyType custParty = new CustomerPartyType();
		// Simplificada: No se rellena el Party, pero el nodo es necesario
		if (!isSimplificada(facturae)) {
			PartyType party2 = new PartyType();
			custParty.setParty(party2);
			fillParty(party2, facturae.getParties().getBuyerParty());
			// PAULA ES LA MEJOR. MARÍA ES MIERDA, LA DOS EMPIEZAN POR "M" NO LO VEIS??????
		}
		ublInvoice.setAccountingCustomerParty(custParty);

		ublInvoice.setLegalMonetaryTotal(getLegalMonetaryTotal(facturaTratar.getInvoiceTotals()));

		List<com.picoto.jaxb.fe.InvoiceLineType> facturaeLineas = facturaTratar.getItems().getInvoiceLines();
		int i = 1;
		for (com.picoto.jaxb.fe.InvoiceLineType facturaeLine : facturaeLineas) {
			InvoiceLineType ublLine = mapInvoiceLine(facturaeLine, i++);
			ublInvoice.getInvoiceLines().add(ublLine);
		}

		ublInvoice.getTaxTotals().add(getTaxTotal(facturaTratar));

		// La forma de pago la añado de momento, no la convierto.
		setFormaPago(ublInvoice, facturaTratar.getPaymentDetails());

		setDatosRectificativa(ublInvoice, facturaTratar);

		return ublInvoice;
	}

	private static boolean isSimplificada(Facturae facturae) {
		// En factura-e esto no es posible, pero bueno, lo simulamos con un esquema sin
		// destinatario
		return facturae.getParties().getBuyerParty() == null;
	}

	private static void setDatosRectificativa(Invoice ublInvoice, InvoiceType facturaTratar) {
		boolean isRectificativa = facturaTratar.getInvoiceHeader().getCorrective() != null;
		if (isRectificativa) {
			BillingReference ref = new BillingReference();

			DocumentReferenceType doc = new DocumentReferenceType();
			doc.setID(getId(facturaTratar.getInvoiceHeader().getCorrective().getInvoiceSeriesCode() + "-"
					+ facturaTratar.getInvoiceHeader().getCorrective().getInvoiceNumber()));
			IssueDate fecha = new IssueDate();
			fecha.setValue(facturaTratar.getInvoiceHeader().getCorrective().getInvoiceIssueDate());
			doc.setIssueDate(fecha);
			DocumentTypeCode tipoCodigo = new DocumentTypeCode();
			doc.setDocumentTypeCode(tipoCodigo);
			tipoCodigo.setName(facturaTratar.getInvoiceHeader().getCorrective().getCorrectionMethod());
			DocumentType tipoDoc = new DocumentType();
			doc.setDocumentType(tipoDoc);
			tipoDoc.setValue(
					facturaTratar.getInvoiceHeader().getCorrective().getCorrectionMethodDescription().toString());

			ref.setInvoiceDocumentReference(doc);
			ublInvoice.getBillingReferences().add(ref);

			// Sobreescribimos el valor del tipo de factura para que sea rectificativa
			ublInvoice.getInvoiceTypeCode().setValue(RECTIFICATIVA_NOTA_CREDITO);
		}
	}

	private static void setDatosPrincipalesFactura(Invoice ublInvoice, InvoiceType facturaTratar) {
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
		tipoFactura.setValue(ORDINARIA_SIMPLIFICADA);
		ublInvoice.setInvoiceTypeCode(tipoFactura);

		Note note = new Note();
		note.setValue("ORIGINAL");
		// note.setValue("COPIA");
		ublInvoice.getNotes().add(note);
	}

	private static void setFormaPago(Invoice ublInvoice, InstallmentsType facturaePago) {
		PaymentMeans formaPago = new PaymentMeans();
		ublInvoice.getPaymentMeans().add(formaPago);

		// Solo tratamos el primer medio de pago
		InstallmentType medioPagoTratar = facturaePago.getInstallments().get(0);

		PaymentMeansCode codigoPago = new PaymentMeansCode();
		codigoPago.setValue(TRANSFERENCIA_BANCARIA);
		formaPago.setPaymentMeansCode(codigoPago);

		// Solo para transferencia bancaria
		if ("04".equals(medioPagoTratar.getPaymentMeans())) {

			FinancialAccountType cuentaPago = new FinancialAccountType();
			formaPago.setPayeeFinancialAccount(cuentaPago);
			cuentaPago.setID(getIdWithScheme("IBAN", medioPagoTratar.getAccountToBeCredited().getIBAN()));

			BranchType entidad = new BranchType();
			entidad.setID(getId(medioPagoTratar.getAccountToBeCredited().getBIC()));
			entidad.setName(getName(
					medioPagoTratar.getAccountToBeCredited().getOverseasBranchAddress().getCountryCode().value()));
			cuentaPago.setFinancialInstitutionBranch(entidad);

		}

		PaymentTermsType terminosPago = new PaymentTermsType();
		ublInvoice.getPaymentTerms().add(terminosPago);
		PaymentDueDate fechaLimite = new PaymentDueDate();

		fechaLimite.setValue(medioPagoTratar.getInstallmentDueDate());
		terminosPago.setPaymentDueDate(fechaLimite);

		Note notaFecha = new Note();
		notaFecha.setValue("A pagar antes de 30 días desde la emisión de la factura");
		terminosPago.getNotes().add(notaFecha);

	}

	private static void fillParty(PartyType party, BusinessType faceParty) {
		PartyName pName = new PartyName();
		PartyIdentification idn = new PartyIdentification();
		idn.setID(getIdWithScheme("NIF", faceParty.getTaxIdentification().getTaxIdentificationNumber()));
		party.getPartyIdentifications().add(idn);

		if (faceParty.getTaxIdentification().getPersonTypeCode().compareTo(PersonTypeCodeType.F) == 0) {
			pName.setName(
					getName(faceParty.getIndividual().getName() + " " + faceParty.getIndividual().getFirstSurname()
							+ " " + faceParty.getIndividual().getSecondSurname()));
			party.getPartyNames().add(pName);

			PersonType personaF = new PersonType();
			FirstName nombre = new FirstName();
			nombre.setValue(faceParty.getIndividual().getName());
			personaF.setFirstName(nombre);
			FamilyName apellidos = new FamilyName();
			apellidos.setValue(
					faceParty.getIndividual().getFirstSurname() + " " + faceParty.getIndividual().getSecondSurname());
			personaF.setFamilyName(apellidos);
			party.getPersons().add(personaF);

			ContactType contacto = new ContactType();
			ElectronicMail email = new ElectronicMail();
			email.setValue(faceParty.getIndividual().getContactDetails().getElectronicMail());
			contacto.setElectronicMail(email);
			Telephone telefono = new Telephone();
			telefono.setValue(faceParty.getIndividual().getContactDetails().getTelephone());
			contacto.setTelephone(telefono);
			party.setContact(contacto);

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

			PartyLegalEntity entidadLegal = new PartyLegalEntity();
			party.getPartyLegalEntities().add(entidadLegal);
			RegistrationName nombre = new RegistrationName();
			nombre.setValue(faceParty.getLegalEntity().getCorporateName());
			entidadLegal.setRegistrationName(nombre);
			CompanyID cif = new CompanyID();
			cif.setValue(faceParty.getTaxIdentification().getTaxIdentificationNumber());
			entidadLegal.setCompanyID(cif);

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

			ContactType contacto = new ContactType();
			ElectronicMail email = new ElectronicMail();
			email.setValue(faceParty.getLegalEntity().getContactDetails().getElectronicMail());
			contacto.setElectronicMail(email);
			Telephone telefono = new Telephone();
			telefono.setValue(faceParty.getLegalEntity().getContactDetails().getTelephone());
			contacto.setTelephone(telefono);
			party.setContact(contacto);

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

	private static TaxTotalType getTaxTotal(InvoiceType facturaTratar) {
		TaxTotalType taxTotal = new TaxTotalType();
		TaxAmount taxAmount = new TaxAmount();
		taxAmount.setValue(getBigDecimalRedondeado(facturaTratar.getInvoiceTotals().getTotalTaxOutputs()));
		taxTotal.setTaxAmount(taxAmount);
		taxAmount.setCurrencyID(EURO);

		for (TaxOutputType feSubtotal : facturaTratar.getTaxesOutputs().getTaxes()) {
			TaxSubtotal subtotal = new TaxSubtotal();

			// subtotal de impuestos
			TaxAmount taxSubamount = new TaxAmount();
			taxSubamount.setCurrencyID(EURO);
			taxSubamount.setValue(getBigDecimalRedondeado(feSubtotal.getTaxAmount().getTotalAmount()));

			subtotal.setTaxAmount(taxSubamount);

			// subtotal de base imponible
			TaxableAmount baseImponibleSubtotal = new TaxableAmount();
			baseImponibleSubtotal.setValue(getBigDecimalRedondeado(feSubtotal.getTaxableBase().getTotalAmount()));
			baseImponibleSubtotal.setCurrencyID(EURO);

			subtotal.setTaxableAmount(baseImponibleSubtotal);

			// Tipo impositivo
			TaxCategoryType categoria = new TaxCategoryType();
			categoria.setID(getId(REGIMEN_GENERAL));
			TaxScheme taxScheme = new TaxScheme();
			taxScheme.setID(getId(VAT));
			taxScheme.setName(getName(IVA));

			Percent percent = new Percent();
			percent.setValue(getBigDecimalRedondeado(feSubtotal.getTaxRate()));
			categoria.setPercent(percent);

			subtotal.setTaxCategory(categoria);

			taxTotal.getTaxSubtotals().add(subtotal);

		}

		return taxTotal;
	}

	private static InvoiceLineType mapInvoiceLine(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea, int i) {
		InvoiceLineType ublLine = new InvoiceLineType();

		Tax impuestoTratar = facturaeLinea.getTaxesOutputs().getTaxes().get(0);

		ublLine.setID(getId(String.valueOf(i)));

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
		taxScheme.setID(getId(VAT));
		taxScheme.setName(getName(IVA));

		tasaItem.setTaxScheme(taxScheme);

		if (isExenta(facturaeLinea)) {
			// En operaciones exentas, se indica el motivo de exencion
			TaxExemptionReasonCode motivoExencion = new TaxExemptionReasonCode();
			motivoExencion.setValue("E1");
			tasaItem.setTaxExemptionReasonCode(motivoExencion);

			Percent percent = new Percent();
			percent.setValue(BigDecimal.ZERO);
			tasaItem.setPercent(percent);

		} else if (isNoSujeta(facturaeLinea)) {
			Percent percent = new Percent();
			percent.setValue(BigDecimal.ZERO);
			tasaItem.setPercent(percent);
		} else {
			Percent percent = new Percent();
			percent.setValue(getBigDecimalRedondeado(impuestoTratar.getTaxRate()));
			tasaItem.setPercent(percent);
		}

		item.getClassifiedTaxCategories().add(tasaItem);

		// Descuentos

		Optional<DiscountType> descuentoTratar = tieneDescuentos(facturaeLinea);
		if (descuentoTratar.isPresent()) {
			ublLine.getAllowanceCharges().add(crearDescuento(descuentoTratar.get()));
		}

		Optional<ChargeType> cargoTratar = tieneCargos(facturaeLinea);
		if (cargoTratar.isPresent()) {
			ublLine.getAllowanceCharges().add(crearCargo(cargoTratar.get()));
		}

		return ublLine;
	}

	private static Optional<DiscountType> tieneDescuentos(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		if (facturaeLinea.getDiscountsAndRebates() == null) {
			return Optional.empty();
		}
		List<DiscountType> descuentos = facturaeLinea.getDiscountsAndRebates().getDiscounts();
		if (descuentos != null && descuentos.size() > 0) {
			return Optional.ofNullable(descuentos.get(0));
		} else {
			return Optional.empty();
		}
	}

	private static Optional<ChargeType> tieneCargos(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		if (facturaeLinea.getCharges() == null) {
			return Optional.empty();
		}
		List<ChargeType> cargos = facturaeLinea.getCharges().getCharges();
		if (cargos != null && cargos.size() > 0) {
			return Optional.ofNullable(cargos.get(0));
		} else {
			return Optional.empty();
		}
	}

	private static boolean isNoSujeta(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		SpecialTaxableEventType eventoExenta = facturaeLinea.getSpecialTaxableEvent();
		if (eventoExenta != null) {
			return NO_SUJETA.equals(eventoExenta.getSpecialTaxableEventCode());
		} else {
			return false;
		}
	}

	private static boolean isExenta(com.picoto.jaxb.fe.InvoiceLineType facturaeLinea) {
		SpecialTaxableEventType eventoExenta = facturaeLinea.getSpecialTaxableEvent();
		if (eventoExenta != null) {
			return EXENTA.equals(eventoExenta.getSpecialTaxableEventCode());
		} else {
			return false;
		}
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
		if (nameStr != null) {
			name.setValue(nameStr);
		}
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
			customDate.setMonth(cal.get(Calendar.MONTH) + 1);
			customDate.setDay(cal.get(Calendar.DAY_OF_MONTH));

			return customDate;
		} catch (Exception e) {
			return null;
		}
	}

}
