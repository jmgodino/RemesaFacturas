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
 * <p>Clase Java para PaymentInKindType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentInKindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInKindReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/>
 *         &lt;element name="PaymentInKindAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInKindType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "paymentInKindReason",
    "paymentInKindAmount"
})
public class PaymentInKindType {

    @XmlElement(name = "PaymentInKindReason", required = true)
    protected String paymentInKindReason;
    @XmlElement(name = "PaymentInKindAmount")
    protected double paymentInKindAmount;

    /**
     * Obtiene el valor de la propiedad paymentInKindReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInKindReason() {
        return paymentInKindReason;
    }

    /**
     * Define el valor de la propiedad paymentInKindReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInKindReason(String value) {
        this.paymentInKindReason = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInKindAmount.
     * 
     */
    public double getPaymentInKindAmount() {
        return paymentInKindAmount;
    }

    /**
     * Define el valor de la propiedad paymentInKindAmount.
     * 
     */
    public void setPaymentInKindAmount(double value) {
        this.paymentInKindAmount = value;
    }

}
