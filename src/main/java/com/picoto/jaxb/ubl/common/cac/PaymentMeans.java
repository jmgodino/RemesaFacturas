//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InstructionID;
import com.picoto.jaxb.ubl.common.cbc.InstructionNote;
import com.picoto.jaxb.ubl.common.cbc.PaymentChannelCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentDueDate;
import com.picoto.jaxb.ubl.common.cbc.PaymentID;
import com.picoto.jaxb.ubl.common.cbc.PaymentMeansCode;


/**
 * <p>Clase Java para PaymentMeansType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentMeansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentChannelCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CardAccount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeFinancialAccount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditAccount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMandate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TradeFinancing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeansType", propOrder = {
    "id",
    "paymentMeansCode",
    "paymentDueDate",
    "paymentChannelCode",
    "instructionID",
    "instructionNotes",
    "paymentIDs",
    "cardAccount",
    "payerFinancialAccount",
    "payeeFinancialAccount",
    "creditAccount",
    "paymentMandate",
    "tradeFinancing"
})
@XmlRootElement(name = "PaymentMeans")
public class PaymentMeans {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "PaymentMeansCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PaymentMeansCode paymentMeansCode;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentDueDate paymentDueDate;
    @XmlElement(name = "PaymentChannelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentChannelCode paymentChannelCode;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstructionID instructionID;
    @XmlElement(name = "InstructionNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InstructionNote> instructionNotes;
    @XmlElement(name = "PaymentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentID> paymentIDs;
    @XmlElement(name = "CardAccount")
    protected CardAccount cardAccount;
    @XmlElement(name = "PayerFinancialAccount")
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "PayeeFinancialAccount")
    protected FinancialAccountType payeeFinancialAccount;
    @XmlElement(name = "CreditAccount")
    protected CreditAccount creditAccount;
    @XmlElement(name = "PaymentMandate")
    protected PaymentMandate paymentMandate;
    @XmlElement(name = "TradeFinancing")
    protected TradeFinancing tradeFinancing;

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
     * Obtiene el valor de la propiedad paymentMeansCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCode }
     *     
     */
    public PaymentMeansCode getPaymentMeansCode() {
        return paymentMeansCode;
    }

    /**
     * Define el valor de la propiedad paymentMeansCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCode }
     *     
     */
    public void setPaymentMeansCode(PaymentMeansCode value) {
        this.paymentMeansCode = value;
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
     * Obtiene el valor de la propiedad paymentChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentChannelCode }
     *     
     */
    public PaymentChannelCode getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Define el valor de la propiedad paymentChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentChannelCode }
     *     
     */
    public void setPaymentChannelCode(PaymentChannelCode value) {
        this.paymentChannelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad instructionID.
     * 
     * @return
     *     possible object is
     *     {@link InstructionID }
     *     
     */
    public InstructionID getInstructionID() {
        return instructionID;
    }

    /**
     * Define el valor de la propiedad instructionID.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionID }
     *     
     */
    public void setInstructionID(InstructionID value) {
        this.instructionID = value;
    }

    /**
     * Gets the value of the instructionNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructionNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructionNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionNote }
     * 
     * 
     */
    public List<InstructionNote> getInstructionNotes() {
        if (instructionNotes == null) {
            instructionNotes = new ArrayList<InstructionNote>();
        }
        return this.instructionNotes;
    }

    /**
     * Gets the value of the paymentIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentID }
     * 
     * 
     */
    public List<PaymentID> getPaymentIDs() {
        if (paymentIDs == null) {
            paymentIDs = new ArrayList<PaymentID>();
        }
        return this.paymentIDs;
    }

    /**
     * Obtiene el valor de la propiedad cardAccount.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount }
     *     
     */
    public CardAccount getCardAccount() {
        return cardAccount;
    }

    /**
     * Define el valor de la propiedad cardAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount }
     *     
     */
    public void setCardAccount(CardAccount value) {
        this.cardAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad payerFinancialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Define el valor de la propiedad payerFinancialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayerFinancialAccount(FinancialAccountType value) {
        this.payerFinancialAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad payeeFinancialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayeeFinancialAccount() {
        return payeeFinancialAccount;
    }

    /**
     * Define el valor de la propiedad payeeFinancialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayeeFinancialAccount(FinancialAccountType value) {
        this.payeeFinancialAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad creditAccount.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccount }
     *     
     */
    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    /**
     * Define el valor de la propiedad creditAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccount }
     *     
     */
    public void setCreditAccount(CreditAccount value) {
        this.creditAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMandate.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMandate }
     *     
     */
    public PaymentMandate getPaymentMandate() {
        return paymentMandate;
    }

    /**
     * Define el valor de la propiedad paymentMandate.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMandate }
     *     
     */
    public void setPaymentMandate(PaymentMandate value) {
        this.paymentMandate = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeFinancing.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinancing }
     *     
     */
    public TradeFinancing getTradeFinancing() {
        return tradeFinancing;
    }

    /**
     * Define el valor de la propiedad tradeFinancing.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinancing }
     *     
     */
    public void setTradeFinancing(TradeFinancing value) {
        this.tradeFinancing = value;
    }

}
