//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InstallmentDueDate;
import com.picoto.jaxb.ubl.common.cbc.InvoicingPartyReference;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PaymentDueDate;
import com.picoto.jaxb.ubl.common.cbc.PaymentMeansID;
import com.picoto.jaxb.ubl.common.cbc.PaymentPercent;
import com.picoto.jaxb.ubl.common.cbc.PaymentTermsDetailsURI;
import com.picoto.jaxb.ubl.common.cbc.PenaltyAmount;
import com.picoto.jaxb.ubl.common.cbc.PenaltySurchargePercent;
import com.picoto.jaxb.ubl.common.cbc.PrepaidPaymentReferenceID;
import com.picoto.jaxb.ubl.common.cbc.ReferenceEventCode;
import com.picoto.jaxb.ubl.common.cbc.SettlementDiscountAmount;
import com.picoto.jaxb.ubl.common.cbc.SettlementDiscountPercent;


/**
 * <p>Clase Java para PaymentTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidPaymentReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceEventCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltySurchargePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentTermsDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstallmentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoicingPartyReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SettlementPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsType", propOrder = {
    "id",
    "paymentMeansIDs",
    "prepaidPaymentReferenceID",
    "notes",
    "referenceEventCode",
    "settlementDiscountPercent",
    "penaltySurchargePercent",
    "paymentPercent",
    "amount",
    "settlementDiscountAmount",
    "penaltyAmount",
    "paymentTermsDetailsURI",
    "paymentDueDate",
    "installmentDueDate",
    "invoicingPartyReference",
    "settlementPeriod",
    "penaltyPeriod",
    "exchangeRate",
    "validityPeriod"
})
public class PaymentTermsType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "PaymentMeansID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentMeansID> paymentMeansIDs;
    @XmlElement(name = "PrepaidPaymentReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidPaymentReferenceID prepaidPaymentReferenceID;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "ReferenceEventCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceEventCode referenceEventCode;
    @XmlElement(name = "SettlementDiscountPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SettlementDiscountPercent settlementDiscountPercent;
    @XmlElement(name = "PenaltySurchargePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PenaltySurchargePercent penaltySurchargePercent;
    @XmlElement(name = "PaymentPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPercent paymentPercent;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Amount amount;
    @XmlElement(name = "SettlementDiscountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SettlementDiscountAmount settlementDiscountAmount;
    @XmlElement(name = "PenaltyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PenaltyAmount penaltyAmount;
    @XmlElement(name = "PaymentTermsDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentTermsDetailsURI paymentTermsDetailsURI;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentDueDate paymentDueDate;
    @XmlElement(name = "InstallmentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstallmentDueDate installmentDueDate;
    @XmlElement(name = "InvoicingPartyReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InvoicingPartyReference invoicingPartyReference;
    @XmlElement(name = "SettlementPeriod")
    protected PeriodType settlementPeriod;
    @XmlElement(name = "PenaltyPeriod")
    protected PeriodType penaltyPeriod;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;

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
     * Gets the value of the paymentMeansIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeansIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeansIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeansID }
     * 
     * 
     */
    public List<PaymentMeansID> getPaymentMeansIDs() {
        if (paymentMeansIDs == null) {
            paymentMeansIDs = new ArrayList<PaymentMeansID>();
        }
        return this.paymentMeansIDs;
    }

    /**
     * Obtiene el valor de la propiedad prepaidPaymentReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentReferenceID }
     *     
     */
    public PrepaidPaymentReferenceID getPrepaidPaymentReferenceID() {
        return prepaidPaymentReferenceID;
    }

    /**
     * Define el valor de la propiedad prepaidPaymentReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentReferenceID }
     *     
     */
    public void setPrepaidPaymentReferenceID(PrepaidPaymentReferenceID value) {
        this.prepaidPaymentReferenceID = value;
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
     * Obtiene el valor de la propiedad referenceEventCode.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceEventCode }
     *     
     */
    public ReferenceEventCode getReferenceEventCode() {
        return referenceEventCode;
    }

    /**
     * Define el valor de la propiedad referenceEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceEventCode }
     *     
     */
    public void setReferenceEventCode(ReferenceEventCode value) {
        this.referenceEventCode = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementDiscountPercent.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountPercent }
     *     
     */
    public SettlementDiscountPercent getSettlementDiscountPercent() {
        return settlementDiscountPercent;
    }

    /**
     * Define el valor de la propiedad settlementDiscountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountPercent }
     *     
     */
    public void setSettlementDiscountPercent(SettlementDiscountPercent value) {
        this.settlementDiscountPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltySurchargePercent.
     * 
     * @return
     *     possible object is
     *     {@link PenaltySurchargePercent }
     *     
     */
    public PenaltySurchargePercent getPenaltySurchargePercent() {
        return penaltySurchargePercent;
    }

    /**
     * Define el valor de la propiedad penaltySurchargePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltySurchargePercent }
     *     
     */
    public void setPenaltySurchargePercent(PenaltySurchargePercent value) {
        this.penaltySurchargePercent = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentPercent.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPercent }
     *     
     */
    public PaymentPercent getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Define el valor de la propiedad paymentPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPercent }
     *     
     */
    public void setPaymentPercent(PaymentPercent value) {
        this.paymentPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountAmount }
     *     
     */
    public SettlementDiscountAmount getSettlementDiscountAmount() {
        return settlementDiscountAmount;
    }

    /**
     * Define el valor de la propiedad settlementDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountAmount }
     *     
     */
    public void setSettlementDiscountAmount(SettlementDiscountAmount value) {
        this.settlementDiscountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyAmount.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyAmount }
     *     
     */
    public PenaltyAmount getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Define el valor de la propiedad penaltyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyAmount }
     *     
     */
    public void setPenaltyAmount(PenaltyAmount value) {
        this.penaltyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTermsDetailsURI.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsDetailsURI }
     *     
     */
    public PaymentTermsDetailsURI getPaymentTermsDetailsURI() {
        return paymentTermsDetailsURI;
    }

    /**
     * Define el valor de la propiedad paymentTermsDetailsURI.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsDetailsURI }
     *     
     */
    public void setPaymentTermsDetailsURI(PaymentTermsDetailsURI value) {
        this.paymentTermsDetailsURI = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDate }
     *     
     */
    public PaymentDueDate getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Define el valor de la propiedad paymentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDate }
     *     
     */
    public void setPaymentDueDate(PaymentDueDate value) {
        this.paymentDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentDueDate }
     *     
     */
    public InstallmentDueDate getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Define el valor de la propiedad installmentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentDueDate }
     *     
     */
    public void setInstallmentDueDate(InstallmentDueDate value) {
        this.installmentDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicingPartyReference.
     * 
     * @return
     *     possible object is
     *     {@link InvoicingPartyReference }
     *     
     */
    public InvoicingPartyReference getInvoicingPartyReference() {
        return invoicingPartyReference;
    }

    /**
     * Define el valor de la propiedad invoicingPartyReference.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicingPartyReference }
     *     
     */
    public void setInvoicingPartyReference(InvoicingPartyReference value) {
        this.invoicingPartyReference = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getSettlementPeriod() {
        return settlementPeriod;
    }

    /**
     * Define el valor de la propiedad settlementPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setSettlementPeriod(PeriodType value) {
        this.settlementPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Define el valor de la propiedad penaltyPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPenaltyPeriod(PeriodType value) {
        this.penaltyPeriod = value;
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
     * Obtiene el valor de la propiedad validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Define el valor de la propiedad validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

}
