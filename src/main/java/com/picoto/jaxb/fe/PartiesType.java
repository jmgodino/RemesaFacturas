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
 * <p>Clase Java para PartiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerParty" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}BusinessType"/>
 *         &lt;element name="BuyerParty" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}BusinessType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartiesType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "sellerParty",
    "buyerParty"
})
public class PartiesType {

    @XmlElement(name = "SellerParty", required = true)
    protected BusinessType sellerParty;
    @XmlElement(name = "BuyerParty", required = true)
    protected BusinessType buyerParty;

    /**
     * Obtiene el valor de la propiedad sellerParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getSellerParty() {
        return sellerParty;
    }

    /**
     * Define el valor de la propiedad sellerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setSellerParty(BusinessType value) {
        this.sellerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getBuyerParty() {
        return buyerParty;
    }

    /**
     * Define el valor de la propiedad buyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setBuyerParty(BusinessType value) {
        this.buyerParty = value;
    }

}
