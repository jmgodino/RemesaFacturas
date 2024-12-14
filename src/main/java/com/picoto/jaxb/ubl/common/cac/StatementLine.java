//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BalanceAmount;
import com.picoto.jaxb.ubl.common.cbc.BalanceBroughtForwardIndicator;
import com.picoto.jaxb.ubl.common.cbc.CreditLineAmount;
import com.picoto.jaxb.ubl.common.cbc.DebitLineAmount;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PaymentPurposeCode;
import com.picoto.jaxb.ubl.common.cbc.UUID;


/**
 * <p>Clase Java para StatementLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StatementLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BalanceBroughtForwardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CreditLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BalanceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoicePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CollectedPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementLineType", propOrder = {
    "id",
    "notes",
    "uuid",
    "balanceBroughtForwardIndicator",
    "debitLineAmount",
    "creditLineAmount",
    "balanceAmount",
    "paymentPurposeCode",
    "paymentMeans",
    "paymentTerms",
    "buyerCustomerParty",
    "sellerSupplierParty",
    "originatorCustomerParty",
    "accountingCustomerParty",
    "accountingSupplierParty",
    "payeeParty",
    "invoicePeriods",
    "billingReferences",
    "documentReferences",
    "exchangeRate",
    "allowanceCharges",
    "collectedPayments"
})
@XmlRootElement(name = "StatementLine")
public class StatementLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "BalanceBroughtForwardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BalanceBroughtForwardIndicator balanceBroughtForwardIndicator;
    @XmlElement(name = "DebitLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitLineAmount debitLineAmount;
    @XmlElement(name = "CreditLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CreditLineAmount creditLineAmount;
    @XmlElement(name = "BalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BalanceAmount balanceAmount;
    @XmlElement(name = "PaymentPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPurposeCode paymentPurposeCode;
    @XmlElement(name = "PaymentMeans")
    protected PaymentMeans paymentMeans;
    @XmlElement(name = "PaymentTerms")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "BuyerCustomerParty")
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "OriginatorCustomerParty")
    protected CustomerPartyType originatorCustomerParty;
    @XmlElement(name = "AccountingCustomerParty")
    protected CustomerPartyType accountingCustomerParty;
    @XmlElement(name = "AccountingSupplierParty")
    protected SupplierPartyType accountingSupplierParty;
    @XmlElement(name = "PayeeParty")
    protected PartyType payeeParty;
    @XmlElement(name = "InvoicePeriod")
    protected List<PeriodType> invoicePeriods;
    @XmlElement(name = "BillingReference")
    protected List<BillingReference> billingReferences;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "CollectedPayment")
    protected List<PaymentType> collectedPayments;

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
     * Obtiene el valor de la propiedad balanceBroughtForwardIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BalanceBroughtForwardIndicator }
     *     
     */
    public BalanceBroughtForwardIndicator getBalanceBroughtForwardIndicator() {
        return balanceBroughtForwardIndicator;
    }

    /**
     * Define el valor de la propiedad balanceBroughtForwardIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceBroughtForwardIndicator }
     *     
     */
    public void setBalanceBroughtForwardIndicator(BalanceBroughtForwardIndicator value) {
        this.balanceBroughtForwardIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad debitLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link DebitLineAmount }
     *     
     */
    public DebitLineAmount getDebitLineAmount() {
        return debitLineAmount;
    }

    /**
     * Define el valor de la propiedad debitLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitLineAmount }
     *     
     */
    public void setDebitLineAmount(DebitLineAmount value) {
        this.debitLineAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineAmount }
     *     
     */
    public CreditLineAmount getCreditLineAmount() {
        return creditLineAmount;
    }

    /**
     * Define el valor de la propiedad creditLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineAmount }
     *     
     */
    public void setCreditLineAmount(CreditLineAmount value) {
        this.creditLineAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmount }
     *     
     */
    public BalanceAmount getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Define el valor de la propiedad balanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmount }
     *     
     */
    public void setBalanceAmount(BalanceAmount value) {
        this.balanceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentPurposeCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPurposeCode }
     *     
     */
    public PaymentPurposeCode getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    /**
     * Define el valor de la propiedad paymentPurposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPurposeCode }
     *     
     */
    public void setPaymentPurposeCode(PaymentPurposeCode value) {
        this.paymentPurposeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMeans.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeans }
     *     
     */
    public PaymentMeans getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Define el valor de la propiedad paymentMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeans }
     *     
     */
    public void setPaymentMeans(PaymentMeans value) {
        this.paymentMeans = value;
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
     * Obtiene el valor de la propiedad originatorCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getOriginatorCustomerParty() {
        return originatorCustomerParty;
    }

    /**
     * Define el valor de la propiedad originatorCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setOriginatorCustomerParty(CustomerPartyType value) {
        this.originatorCustomerParty = value;
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
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Define el valor de la propiedad exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
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
     * Gets the value of the collectedPayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectedPayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectedPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getCollectedPayments() {
        if (collectedPayments == null) {
            collectedPayments = new ArrayList<PaymentType>();
        }
        return this.collectedPayments;
    }

}
