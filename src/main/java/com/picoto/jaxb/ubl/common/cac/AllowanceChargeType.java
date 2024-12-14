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
import com.picoto.jaxb.ubl.common.cbc.AccountingCost;
import com.picoto.jaxb.ubl.common.cbc.AccountingCostCode;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReason;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReasonCode;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.BaseAmount;
import com.picoto.jaxb.ubl.common.cbc.ChargeIndicator;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.MultiplierFactorNumeric;
import com.picoto.jaxb.ubl.common.cbc.PerUnitAmount;
import com.picoto.jaxb.ubl.common.cbc.PrepaidIndicator;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumeric;


/**
 * <p>Clase Java para AllowanceChargeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeIndicator"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultiplierFactorNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeType", propOrder = {
    "id",
    "chargeIndicator",
    "allowanceChargeReasonCode",
    "allowanceChargeReasons",
    "multiplierFactorNumeric",
    "prepaidIndicator",
    "sequenceNumeric",
    "amount",
    "baseAmount",
    "accountingCostCode",
    "accountingCost",
    "perUnitAmount",
    "taxCategories",
    "taxTotal",
    "paymentMeans"
})
public class AllowanceChargeType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "ChargeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ChargeIndicator chargeIndicator;
    @XmlElement(name = "AllowanceChargeReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AllowanceChargeReasonCode allowanceChargeReasonCode;
    @XmlElement(name = "AllowanceChargeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AllowanceChargeReason> allowanceChargeReasons;
    @XmlElement(name = "MultiplierFactorNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MultiplierFactorNumeric multiplierFactorNumeric;
    @XmlElement(name = "PrepaidIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidIndicator prepaidIndicator;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected Amount amount;
    @XmlElement(name = "BaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseAmount baseAmount;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCost accountingCost;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerUnitAmount perUnitAmount;
    @XmlElement(name = "TaxCategory")
    protected List<TaxCategoryType> taxCategories;
    @XmlElement(name = "TaxTotal")
    protected TaxTotalType taxTotal;
    @XmlElement(name = "PaymentMeans")
    protected List<PaymentMeans> paymentMeans;

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
     * Obtiene el valor de la propiedad chargeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ChargeIndicator }
     *     
     */
    public ChargeIndicator getChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Define el valor de la propiedad chargeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeIndicator }
     *     
     */
    public void setChargeIndicator(ChargeIndicator value) {
        this.chargeIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad allowanceChargeReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeReasonCode }
     *     
     */
    public AllowanceChargeReasonCode getAllowanceChargeReasonCode() {
        return allowanceChargeReasonCode;
    }

    /**
     * Define el valor de la propiedad allowanceChargeReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeReasonCode }
     *     
     */
    public void setAllowanceChargeReasonCode(AllowanceChargeReasonCode value) {
        this.allowanceChargeReasonCode = value;
    }

    /**
     * Gets the value of the allowanceChargeReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceChargeReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceChargeReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeReason }
     * 
     * 
     */
    public List<AllowanceChargeReason> getAllowanceChargeReasons() {
        if (allowanceChargeReasons == null) {
            allowanceChargeReasons = new ArrayList<AllowanceChargeReason>();
        }
        return this.allowanceChargeReasons;
    }

    /**
     * Obtiene el valor de la propiedad multiplierFactorNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierFactorNumeric }
     *     
     */
    public MultiplierFactorNumeric getMultiplierFactorNumeric() {
        return multiplierFactorNumeric;
    }

    /**
     * Define el valor de la propiedad multiplierFactorNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierFactorNumeric }
     *     
     */
    public void setMultiplierFactorNumeric(MultiplierFactorNumeric value) {
        this.multiplierFactorNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidIndicator }
     *     
     */
    public PrepaidIndicator getPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Define el valor de la propiedad prepaidIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidIndicator }
     *     
     */
    public void setPrepaidIndicator(PrepaidIndicator value) {
        this.prepaidIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumeric }
     *     
     */
    public SequenceNumeric getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Define el valor de la propiedad sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumeric }
     *     
     */
    public void setSequenceNumeric(SequenceNumeric value) {
        this.sequenceNumeric = value;
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
     * Obtiene el valor de la propiedad baseAmount.
     * 
     * @return
     *     possible object is
     *     {@link BaseAmount }
     *     
     */
    public BaseAmount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Define el valor de la propiedad baseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAmount }
     *     
     */
    public void setBaseAmount(BaseAmount value) {
        this.baseAmount = value;
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
     * Obtiene el valor de la propiedad perUnitAmount.
     * 
     * @return
     *     possible object is
     *     {@link PerUnitAmount }
     *     
     */
    public PerUnitAmount getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Define el valor de la propiedad perUnitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PerUnitAmount }
     *     
     */
    public void setPerUnitAmount(PerUnitAmount value) {
        this.perUnitAmount = value;
    }

    /**
     * Gets the value of the taxCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getTaxCategories() {
        if (taxCategories == null) {
            taxCategories = new ArrayList<TaxCategoryType>();
        }
        return this.taxCategories;
    }

    /**
     * Obtiene el valor de la propiedad taxTotal.
     * 
     * @return
     *     possible object is
     *     {@link TaxTotalType }
     *     
     */
    public TaxTotalType getTaxTotal() {
        return taxTotal;
    }

    /**
     * Define el valor de la propiedad taxTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTotalType }
     *     
     */
    public void setTaxTotal(TaxTotalType value) {
        this.taxTotal = value;
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

}
