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
 * <p>Clase Java para ChargeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/>
 *         &lt;element name="ChargeRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "chargeReason",
    "chargeRate",
    "chargeAmount"
})
public class ChargeType {

    @XmlElement(name = "ChargeReason", required = true)
    protected String chargeReason;
    @XmlElement(name = "ChargeRate")
    protected Double chargeRate;
    @XmlElement(name = "ChargeAmount")
    protected double chargeAmount;

    /**
     * Obtiene el valor de la propiedad chargeReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeReason() {
        return chargeReason;
    }

    /**
     * Define el valor de la propiedad chargeReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeReason(String value) {
        this.chargeReason = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChargeRate() {
        return chargeRate;
    }

    /**
     * Define el valor de la propiedad chargeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChargeRate(Double value) {
        this.chargeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeAmount.
     * 
     */
    public double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define el valor de la propiedad chargeAmount.
     * 
     */
    public void setChargeAmount(double value) {
        this.chargeAmount = value;
    }

}
