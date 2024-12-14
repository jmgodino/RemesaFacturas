//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.maindoc.invoice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cac.AllowanceChargeType;
import com.picoto.jaxb.ubl.common.cac.BillingReference;
import com.picoto.jaxb.ubl.common.cac.CustomerPartyType;
import com.picoto.jaxb.ubl.common.cac.DeliveryTerms;
import com.picoto.jaxb.ubl.common.cac.DeliveryType;
import com.picoto.jaxb.ubl.common.cac.DocumentReferenceType;
import com.picoto.jaxb.ubl.common.cac.ExchangeRateType;
import com.picoto.jaxb.ubl.common.cac.InvoiceLineType;
import com.picoto.jaxb.ubl.common.cac.MonetaryTotalType;
import com.picoto.jaxb.ubl.common.cac.OrderReference;
import com.picoto.jaxb.ubl.common.cac.PartyType;
import com.picoto.jaxb.ubl.common.cac.PaymentMeans;
import com.picoto.jaxb.ubl.common.cac.PaymentTermsType;
import com.picoto.jaxb.ubl.common.cac.PaymentType;
import com.picoto.jaxb.ubl.common.cac.PeriodType;
import com.picoto.jaxb.ubl.common.cac.ProjectReference;
import com.picoto.jaxb.ubl.common.cac.Signature;
import com.picoto.jaxb.ubl.common.cac.SupplierPartyType;
import com.picoto.jaxb.ubl.common.cac.TaxTotalType;
import com.picoto.jaxb.ubl.common.cbc.AccountingCost;
import com.picoto.jaxb.ubl.common.cbc.AccountingCostCode;
import com.picoto.jaxb.ubl.common.cbc.BuyerReference;
import com.picoto.jaxb.ubl.common.cbc.CopyIndicator;
import com.picoto.jaxb.ubl.common.cbc.CustomizationID;
import com.picoto.jaxb.ubl.common.cbc.DocumentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.DueDate;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InvoiceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.IssueTime;
import com.picoto.jaxb.ubl.common.cbc.LineCountNumeric;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PaymentAlternativeCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.PricingCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.ProfileExecutionID;
import com.picoto.jaxb.ubl.common.cbc.ProfileID;
import com.picoto.jaxb.ubl.common.cbc.TaxCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.TaxPointDate;
import com.picoto.jaxb.ubl.common.cbc.UBLVersionID;
import com.picoto.jaxb.ubl.common.cbc.UUID;
import com.picoto.jaxb.ubl.common.cec.UBLExtensions;


/**
 * <p>Clase Java para InvoiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UBLVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileExecutionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoiceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxPointDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PricingCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentAlternativeCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineCountNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuyerReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoicePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StatementDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingSupplierParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingCustomerParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxRepresentativeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PrepaidPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentAlternativeExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WithholdingTaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoiceLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", propOrder = {
    "ublExtensions",
    "ublVersionID",
    "customizationID",
    "profileID",
    "profileExecutionID",
    "id",
    "copyIndicator",
    "uuid",
    "issueDate",
    "issueTime",
    "dueDate",
    "invoiceTypeCode",
    "notes",
    "taxPointDate",
    "documentCurrencyCode",
    "taxCurrencyCode",
    "pricingCurrencyCode",
    "paymentCurrencyCode",
    "paymentAlternativeCurrencyCode",
    "accountingCostCode",
    "accountingCost",
    "lineCountNumeric",
    "buyerReference",
    "invoicePeriods",
    "orderReference",
    "billingReferences",
    "despatchDocumentReferences",
    "receiptDocumentReferences",
    "statementDocumentReferences",
    "originatorDocumentReferences",
    "contractDocumentReferences",
    "additionalDocumentReferences",
    "projectReferences",
    "signatures",
    "accountingSupplierParty",
    "accountingCustomerParty",
    "payeeParty",
    "buyerCustomerParty",
    "sellerSupplierParty",
    "taxRepresentativeParty",
    "deliveries",
    "deliveryTerms",
    "paymentMeans",
    "paymentTerms",
    "prepaidPayments",
    "allowanceCharges",
    "taxExchangeRate",
    "pricingExchangeRate",
    "paymentExchangeRate",
    "paymentAlternativeExchangeRate",
    "taxTotals",
    "withholdingTaxTotals",
    "legalMonetaryTotal",
    "invoiceLines"
})
@XmlRootElement(name = "Invoice")
public class Invoice {

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UBLVersionID ublVersionID;
    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomizationID customizationID;
    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileID profileID;
    @XmlElement(name = "ProfileExecutionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileExecutionID profileExecutionID;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CopyIndicator copyIndicator;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDate issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTime issueTime;
    @XmlElement(name = "DueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DueDate dueDate;
    @XmlElement(name = "InvoiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InvoiceTypeCode invoiceTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxPointDate taxPointDate;
    @XmlElement(name = "DocumentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentCurrencyCode documentCurrencyCode;
    @XmlElement(name = "TaxCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxCurrencyCode taxCurrencyCode;
    @XmlElement(name = "PricingCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PricingCurrencyCode pricingCurrencyCode;
    @XmlElement(name = "PaymentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentCurrencyCode paymentCurrencyCode;
    @XmlElement(name = "PaymentAlternativeCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentAlternativeCurrencyCode paymentAlternativeCurrencyCode;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCost accountingCost;
    @XmlElement(name = "LineCountNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineCountNumeric lineCountNumeric;
    @XmlElement(name = "BuyerReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuyerReference buyerReference;
    @XmlElement(name = "InvoicePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<PeriodType> invoicePeriods;
    @XmlElement(name = "OrderReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected OrderReference orderReference;
    @XmlElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<BillingReference> billingReferences;
    @XmlElement(name = "DespatchDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> despatchDocumentReferences;
    @XmlElement(name = "ReceiptDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> receiptDocumentReferences;
    @XmlElement(name = "StatementDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> statementDocumentReferences;
    @XmlElement(name = "OriginatorDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> originatorDocumentReferences;
    @XmlElement(name = "ContractDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> contractDocumentReferences;
    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> additionalDocumentReferences;
    @XmlElement(name = "ProjectReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<ProjectReference> projectReferences;
    @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<Signature> signatures;
    @XmlElement(name = "AccountingSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected SupplierPartyType accountingSupplierParty;
    @XmlElement(name = "AccountingCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected CustomerPartyType accountingCustomerParty;
    @XmlElement(name = "PayeeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected PartyType payeeParty;
    @XmlElement(name = "BuyerCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "TaxRepresentativeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected PartyType taxRepresentativeParty;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DeliveryType> deliveries;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected DeliveryTerms deliveryTerms;
    @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<PaymentMeans> paymentMeans;
    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "PrepaidPayment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<PaymentType> prepaidPayments;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "TaxExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected ExchangeRateType taxExchangeRate;
    @XmlElement(name = "PricingExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected ExchangeRateType pricingExchangeRate;
    @XmlElement(name = "PaymentExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected ExchangeRateType paymentExchangeRate;
    @XmlElement(name = "PaymentAlternativeExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected ExchangeRateType paymentAlternativeExchangeRate;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "WithholdingTaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<TaxTotalType> withholdingTaxTotals;
    @XmlElement(name = "LegalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected MonetaryTotalType legalMonetaryTotal;
    @XmlElement(name = "InvoiceLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<InvoiceLineType> invoiceLines;

    /**
     * Obtiene el valor de la propiedad ublExtensions.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensions }
     *     
     */
    public UBLExtensions getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Define el valor de la propiedad ublExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensions }
     *     
     */
    public void setUBLExtensions(UBLExtensions value) {
        this.ublExtensions = value;
    }

    /**
     * Obtiene el valor de la propiedad ublVersionID.
     * 
     * @return
     *     possible object is
     *     {@link UBLVersionID }
     *     
     */
    public UBLVersionID getUBLVersionID() {
        return ublVersionID;
    }

    /**
     * Define el valor de la propiedad ublVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLVersionID }
     *     
     */
    public void setUBLVersionID(UBLVersionID value) {
        this.ublVersionID = value;
    }

    /**
     * Obtiene el valor de la propiedad customizationID.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationID }
     *     
     */
    public CustomizationID getCustomizationID() {
        return customizationID;
    }

    /**
     * Define el valor de la propiedad customizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationID }
     *     
     */
    public void setCustomizationID(CustomizationID value) {
        this.customizationID = value;
    }

    /**
     * Obtiene el valor de la propiedad profileID.
     * 
     * @return
     *     possible object is
     *     {@link ProfileID }
     *     
     */
    public ProfileID getProfileID() {
        return profileID;
    }

    /**
     * Define el valor de la propiedad profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileID }
     *     
     */
    public void setProfileID(ProfileID value) {
        this.profileID = value;
    }

    /**
     * Obtiene el valor de la propiedad profileExecutionID.
     * 
     * @return
     *     possible object is
     *     {@link ProfileExecutionID }
     *     
     */
    public ProfileExecutionID getProfileExecutionID() {
        return profileExecutionID;
    }

    /**
     * Define el valor de la propiedad profileExecutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExecutionID }
     *     
     */
    public void setProfileExecutionID(ProfileExecutionID value) {
        this.profileExecutionID = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad copyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CopyIndicator }
     *     
     */
    public CopyIndicator getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Define el valor de la propiedad copyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyIndicator }
     *     
     */
    public void setCopyIndicator(CopyIndicator value) {
        this.copyIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link IssueDate }
     *     
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDate }
     *     
     */
    public void setIssueDate(IssueDate value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad issueTime.
     * 
     * @return
     *     possible object is
     *     {@link IssueTime }
     *     
     */
    public IssueTime getIssueTime() {
        return issueTime;
    }

    /**
     * Define el valor de la propiedad issueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTime }
     *     
     */
    public void setIssueTime(IssueTime value) {
        this.issueTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link DueDate }
     *     
     */
    public DueDate getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDate }
     *     
     */
    public void setDueDate(DueDate value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTypeCode }
     *     
     */
    public InvoiceTypeCode getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    /**
     * Define el valor de la propiedad invoiceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTypeCode }
     *     
     */
    public void setInvoiceTypeCode(InvoiceTypeCode value) {
        this.invoiceTypeCode = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Obtiene el valor de la propiedad taxPointDate.
     * 
     * @return
     *     possible object is
     *     {@link TaxPointDate }
     *     
     */
    public TaxPointDate getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Define el valor de la propiedad taxPointDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPointDate }
     *     
     */
    public void setTaxPointDate(TaxPointDate value) {
        this.taxPointDate = value;
    }

    /**
     * Obtiene el valor de la propiedad documentCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCurrencyCode }
     *     
     */
    public DocumentCurrencyCode getDocumentCurrencyCode() {
        return documentCurrencyCode;
    }

    /**
     * Define el valor de la propiedad documentCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCurrencyCode }
     *     
     */
    public void setDocumentCurrencyCode(DocumentCurrencyCode value) {
        this.documentCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxCurrencyCode }
     *     
     */
    public TaxCurrencyCode getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Define el valor de la propiedad taxCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCurrencyCode }
     *     
     */
    public void setTaxCurrencyCode(TaxCurrencyCode value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link PricingCurrencyCode }
     *     
     */
    public PricingCurrencyCode getPricingCurrencyCode() {
        return pricingCurrencyCode;
    }

    /**
     * Define el valor de la propiedad pricingCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingCurrencyCode }
     *     
     */
    public void setPricingCurrencyCode(PricingCurrencyCode value) {
        this.pricingCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCurrencyCode }
     *     
     */
    public PaymentCurrencyCode getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Define el valor de la propiedad paymentCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCurrencyCode }
     *     
     */
    public void setPaymentCurrencyCode(PaymentCurrencyCode value) {
        this.paymentCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAlternativeCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAlternativeCurrencyCode }
     *     
     */
    public PaymentAlternativeCurrencyCode getPaymentAlternativeCurrencyCode() {
        return paymentAlternativeCurrencyCode;
    }

    /**
     * Define el valor de la propiedad paymentAlternativeCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAlternativeCurrencyCode }
     *     
     */
    public void setPaymentAlternativeCurrencyCode(PaymentAlternativeCurrencyCode value) {
        this.paymentAlternativeCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingCostCode.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostCode }
     *     
     */
    public AccountingCostCode getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Define el valor de la propiedad accountingCostCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostCode }
     *     
     */
    public void setAccountingCostCode(AccountingCostCode value) {
        this.accountingCostCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingCost.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCost }
     *     
     */
    public AccountingCost getAccountingCost() {
        return accountingCost;
    }

    /**
     * Define el valor de la propiedad accountingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCost }
     *     
     */
    public void setAccountingCost(AccountingCost value) {
        this.accountingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad lineCountNumeric.
     * 
     * @return
     *     possible object is
     *     {@link LineCountNumeric }
     *     
     */
    public LineCountNumeric getLineCountNumeric() {
        return lineCountNumeric;
    }

    /**
     * Define el valor de la propiedad lineCountNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link LineCountNumeric }
     *     
     */
    public void setLineCountNumeric(LineCountNumeric value) {
        this.lineCountNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerReference.
     * 
     * @return
     *     possible object is
     *     {@link BuyerReference }
     *     
     */
    public BuyerReference getBuyerReference() {
        return buyerReference;
    }

    /**
     * Define el valor de la propiedad buyerReference.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerReference }
     *     
     */
    public void setBuyerReference(BuyerReference value) {
        this.buyerReference = value;
    }

    /**
     * Gets the value of the invoicePeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoicePeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoicePeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getInvoicePeriods() {
        if (invoicePeriods == null) {
            invoicePeriods = new ArrayList<PeriodType>();
        }
        return this.invoicePeriods;
    }

    /**
     * Obtiene el valor de la propiedad orderReference.
     * 
     * @return
     *     possible object is
     *     {@link OrderReference }
     *     
     */
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Define el valor de la propiedad orderReference.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReference }
     *     
     */
    public void setOrderReference(OrderReference value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the billingReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReference }
     * 
     * 
     */
    public List<BillingReference> getBillingReferences() {
        if (billingReferences == null) {
            billingReferences = new ArrayList<BillingReference>();
        }
        return this.billingReferences;
    }

    /**
     * Gets the value of the despatchDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDespatchDocumentReferences() {
        if (despatchDocumentReferences == null) {
            despatchDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.despatchDocumentReferences;
    }

    /**
     * Gets the value of the receiptDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getReceiptDocumentReferences() {
        if (receiptDocumentReferences == null) {
            receiptDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.receiptDocumentReferences;
    }

    /**
     * Gets the value of the statementDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getStatementDocumentReferences() {
        if (statementDocumentReferences == null) {
            statementDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.statementDocumentReferences;
    }

    /**
     * Gets the value of the originatorDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatorDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatorDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getOriginatorDocumentReferences() {
        if (originatorDocumentReferences == null) {
            originatorDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.originatorDocumentReferences;
    }

    /**
     * Gets the value of the contractDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getContractDocumentReferences() {
        if (contractDocumentReferences == null) {
            contractDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.contractDocumentReferences;
    }

    /**
     * Gets the value of the additionalDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReferences() {
        if (additionalDocumentReferences == null) {
            additionalDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReferences;
    }

    /**
     * Gets the value of the projectReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectReference }
     * 
     * 
     */
    public List<ProjectReference> getProjectReferences() {
        if (projectReferences == null) {
            projectReferences = new ArrayList<ProjectReference>();
        }
        return this.projectReferences;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signature }
     * 
     * 
     */
    public List<Signature> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<Signature>();
        }
        return this.signatures;
    }

    /**
     * Obtiene el valor de la propiedad accountingSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getAccountingSupplierParty() {
        return accountingSupplierParty;
    }

    /**
     * Define el valor de la propiedad accountingSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setAccountingSupplierParty(SupplierPartyType value) {
        this.accountingSupplierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getAccountingCustomerParty() {
        return accountingCustomerParty;
    }

    /**
     * Define el valor de la propiedad accountingCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setAccountingCustomerParty(CustomerPartyType value) {
        this.accountingCustomerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad payeeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayeeParty() {
        return payeeParty;
    }

    /**
     * Define el valor de la propiedad payeeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayeeParty(PartyType value) {
        this.payeeParty = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getBuyerCustomerParty() {
        return buyerCustomerParty;
    }

    /**
     * Define el valor de la propiedad buyerCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBuyerCustomerParty(CustomerPartyType value) {
        this.buyerCustomerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Define el valor de la propiedad sellerSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRepresentativeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTaxRepresentativeParty() {
        return taxRepresentativeParty;
    }

    /**
     * Define el valor de la propiedad taxRepresentativeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTaxRepresentativeParty(PartyType value) {
        this.taxRepresentativeParty = value;
    }

    /**
     * Gets the value of the deliveries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryType }
     * 
     * 
     */
    public List<DeliveryType> getDeliveries() {
        if (deliveries == null) {
            deliveries = new ArrayList<DeliveryType>();
        }
        return this.deliveries;
    }

    /**
     * Obtiene el valor de la propiedad deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTerms }
     *     
     */
    public DeliveryTerms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Define el valor de la propiedad deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTerms }
     *     
     */
    public void setDeliveryTerms(DeliveryTerms value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the paymentMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeans }
     * 
     * 
     */
    public List<PaymentMeans> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<PaymentMeans>();
        }
        return this.paymentMeans;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the prepaidPayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaidPayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaidPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getPrepaidPayments() {
        if (prepaidPayments == null) {
            prepaidPayments = new ArrayList<PaymentType>();
        }
        return this.prepaidPayments;
    }

    /**
     * Gets the value of the allowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharges() {
        if (allowanceCharges == null) {
            allowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharges;
    }

    /**
     * Obtiene el valor de la propiedad taxExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getTaxExchangeRate() {
        return taxExchangeRate;
    }

    /**
     * Define el valor de la propiedad taxExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setTaxExchangeRate(ExchangeRateType value) {
        this.taxExchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Define el valor de la propiedad pricingExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPricingExchangeRate(ExchangeRateType value) {
        this.pricingExchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPaymentExchangeRate() {
        return paymentExchangeRate;
    }

    /**
     * Define el valor de la propiedad paymentExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPaymentExchangeRate(ExchangeRateType value) {
        this.paymentExchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAlternativeExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPaymentAlternativeExchangeRate() {
        return paymentAlternativeExchangeRate;
    }

    /**
     * Define el valor de la propiedad paymentAlternativeExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPaymentAlternativeExchangeRate(ExchangeRateType value) {
        this.paymentAlternativeExchangeRate = value;
    }

    /**
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Gets the value of the withholdingTaxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getWithholdingTaxTotals() {
        if (withholdingTaxTotals == null) {
            withholdingTaxTotals = new ArrayList<TaxTotalType>();
        }
        return this.withholdingTaxTotals;
    }

    /**
     * Obtiene el valor de la propiedad legalMonetaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Define el valor de la propiedad legalMonetaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
    }

    /**
     * Gets the value of the invoiceLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineType }
     * 
     * 
     */
    public List<InvoiceLineType> getInvoiceLines() {
        if (invoiceLines == null) {
            invoiceLines = new ArrayList<InvoiceLineType>();
        }
        return this.invoiceLines;
    }

}
