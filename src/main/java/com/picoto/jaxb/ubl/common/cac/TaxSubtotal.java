//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BaseUnitMeasure;
import com.picoto.jaxb.ubl.common.cbc.CalculationSequenceNumeric;
import com.picoto.jaxb.ubl.common.cbc.PerUnitAmount;
import com.picoto.jaxb.ubl.common.cbc.Percent;
import com.picoto.jaxb.ubl.common.cbc.TaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxableAmount;
import com.picoto.jaxb.ubl.common.cbc.TierRange;
import com.picoto.jaxb.ubl.common.cbc.TierRatePercent;
import com.picoto.jaxb.ubl.common.cbc.TransactionCurrencyTaxAmount;


/**
 * <p>Clase Java para TaxSubtotalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxSubtotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxableAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationSequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransactionCurrencyTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseUnitMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRatePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSubtotalType", propOrder = {
    "taxableAmount",
    "taxAmount",
    "calculationSequenceNumeric",
    "transactionCurrencyTaxAmount",
    "percent",
    "baseUnitMeasure",
    "perUnitAmount",
    "tierRange",
    "tierRatePercent",
    "taxCategory"
})
@XmlRootElement(name = "TaxSubtotal")
public class TaxSubtotal {

    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxableAmount taxableAmount;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TaxAmount taxAmount;
    @XmlElement(name = "CalculationSequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationSequenceNumeric calculationSequenceNumeric;
    @XmlElement(name = "TransactionCurrencyTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransactionCurrencyTaxAmount transactionCurrencyTaxAmount;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Percent percent;
    @XmlElement(name = "BaseUnitMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseUnitMeasure baseUnitMeasure;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerUnitAmount perUnitAmount;
    @XmlElement(name = "TierRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRange tierRange;
    @XmlElement(name = "TierRatePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRatePercent tierRatePercent;
    @XmlElement(name = "TaxCategory", required = true)
    protected TaxCategoryType taxCategory;

    /**
     * Obtiene el valor de la propiedad taxableAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmount }
     *     
     */
    public TaxableAmount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Define el valor de la propiedad taxableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmount }
     *     
     */
    public void setTaxableAmount(TaxableAmount value) {
        this.taxableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount }
     *     
     */
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount }
     *     
     */
    public void setTaxAmount(TaxAmount value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad calculationSequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSequenceNumeric }
     *     
     */
    public CalculationSequenceNumeric getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * Define el valor de la propiedad calculationSequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSequenceNumeric }
     *     
     */
    public void setCalculationSequenceNumeric(CalculationSequenceNumeric value) {
        this.calculationSequenceNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCurrencyTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCurrencyTaxAmount }
     *     
     */
    public TransactionCurrencyTaxAmount getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    /**
     * Define el valor de la propiedad transactionCurrencyTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCurrencyTaxAmount }
     *     
     */
    public void setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmount value) {
        this.transactionCurrencyTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     * @return
     *     possible object is
     *     {@link Percent }
     *     
     */
    public Percent getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     * @param value
     *     allowed object is
     *     {@link Percent }
     *     
     */
    public void setPercent(Percent value) {
        this.percent = value;
    }

    /**
     * Obtiene el valor de la propiedad baseUnitMeasure.
     * 
     * @return
     *     possible object is
     *     {@link BaseUnitMeasure }
     *     
     */
    public BaseUnitMeasure getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Define el valor de la propiedad baseUnitMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUnitMeasure }
     *     
     */
    public void setBaseUnitMeasure(BaseUnitMeasure value) {
        this.baseUnitMeasure = value;
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
     * Obtiene el valor de la propiedad tierRange.
     * 
     * @return
     *     possible object is
     *     {@link TierRange }
     *     
     */
    public TierRange getTierRange() {
        return tierRange;
    }

    /**
     * Define el valor de la propiedad tierRange.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRange }
     *     
     */
    public void setTierRange(TierRange value) {
        this.tierRange = value;
    }

    /**
     * Obtiene el valor de la propiedad tierRatePercent.
     * 
     * @return
     *     possible object is
     *     {@link TierRatePercent }
     *     
     */
    public TierRatePercent getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Define el valor de la propiedad tierRatePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRatePercent }
     *     
     */
    public void setTierRatePercent(TierRatePercent value) {
        this.tierRatePercent = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Define el valor de la propiedad taxCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
    }

}
