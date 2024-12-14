//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.PriceAmount;
import com.picoto.jaxb.ubl.common.cbc.TimeAmount;


/**
 * <p>Clase Java para UnstructuredPriceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredPriceType", propOrder = {
    "priceAmount",
    "timeAmount"
})
@XmlRootElement(name = "UnstructuredPrice")
public class UnstructuredPrice {

    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceAmount priceAmount;
    @XmlElement(name = "TimeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeAmount timeAmount;

    /**
     * Obtiene el valor de la propiedad priceAmount.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmount }
     *     
     */
    public PriceAmount getPriceAmount() {
        return priceAmount;
    }

    /**
     * Define el valor de la propiedad priceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmount }
     *     
     */
    public void setPriceAmount(PriceAmount value) {
        this.priceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad timeAmount.
     * 
     * @return
     *     possible object is
     *     {@link TimeAmount }
     *     
     */
    public TimeAmount getTimeAmount() {
        return timeAmount;
    }

    /**
     * Define el valor de la propiedad timeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAmount }
     *     
     */
    public void setTimeAmount(TimeAmount value) {
        this.timeAmount = value;
    }

}
