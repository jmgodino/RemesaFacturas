//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.03 a las 10:48:56 PM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxTypeCodeType"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TaxableBase" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "taxTypeCode",
    "taxRate",
    "taxableBase",
    "taxAmount"
})
public class TaxType {

    @XmlElement(name = "TaxTypeCode", required = true)
    protected String taxTypeCode;
    @XmlElement(name = "TaxRate")
    protected double taxRate;
    @XmlElement(name = "TaxableBase", required = true)
    protected AmountType taxableBase;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;

    /**
     * Obtiene el valor de la propiedad taxTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Define el valor de la propiedad taxTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxableBase.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxableBase() {
        return taxableBase;
    }

    /**
     * Define el valor de la propiedad taxableBase.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxableBase(AmountType value) {
        this.taxableBase = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

}
