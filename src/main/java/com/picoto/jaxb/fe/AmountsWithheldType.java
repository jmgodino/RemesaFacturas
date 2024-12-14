//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmountsWithheldType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountsWithheldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WithholdingReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/>
 *         &lt;element name="WithholdingRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/>
 *         &lt;element name="WithholdingAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsWithheldType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "withholdingReason",
    "withholdingRate",
    "withholdingAmount"
})
public class AmountsWithheldType {

    @XmlElement(name = "WithholdingReason", required = true)
    protected String withholdingReason;
    @XmlElement(name = "WithholdingRate")
    protected Double withholdingRate;
    @XmlElement(name = "WithholdingAmount")
    protected double withholdingAmount;

    /**
     * Obtiene el valor de la propiedad withholdingReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingReason() {
        return withholdingReason;
    }

    /**
     * Define el valor de la propiedad withholdingReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingReason(String value) {
        this.withholdingReason = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWithholdingRate() {
        return withholdingRate;
    }

    /**
     * Define el valor de la propiedad withholdingRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWithholdingRate(Double value) {
        this.withholdingRate = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingAmount.
     * 
     */
    public double getWithholdingAmount() {
        return withholdingAmount;
    }

    /**
     * Define el valor de la propiedad withholdingAmount.
     * 
     */
    public void setWithholdingAmount(double value) {
        this.withholdingAmount = value;
    }

}
