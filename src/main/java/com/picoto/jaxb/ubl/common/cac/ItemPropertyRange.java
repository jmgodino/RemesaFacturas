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
import com.picoto.jaxb.ubl.common.cbc.MaximumValue;
import com.picoto.jaxb.ubl.common.cbc.MinimumValue;


/**
 * <p>Clase Java para ItemPropertyRangeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemPropertyRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumValue" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPropertyRangeType", propOrder = {
    "minimumValue",
    "maximumValue"
})
@XmlRootElement(name = "ItemPropertyRange")
public class ItemPropertyRange {

    @XmlElement(name = "MinimumValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumValue minimumValue;
    @XmlElement(name = "MaximumValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumValue maximumValue;

    /**
     * Obtiene el valor de la propiedad minimumValue.
     * 
     * @return
     *     possible object is
     *     {@link MinimumValue }
     *     
     */
    public MinimumValue getMinimumValue() {
        return minimumValue;
    }

    /**
     * Define el valor de la propiedad minimumValue.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumValue }
     *     
     */
    public void setMinimumValue(MinimumValue value) {
        this.minimumValue = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumValue.
     * 
     * @return
     *     possible object is
     *     {@link MaximumValue }
     *     
     */
    public MaximumValue getMaximumValue() {
        return maximumValue;
    }

    /**
     * Define el valor de la propiedad maximumValue.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumValue }
     *     
     */
    public void setMaximumValue(MaximumValue value) {
        this.maximumValue = value;
    }

}
