//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para UnsignedPropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnsignedPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedSignatureProperties" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedDataObjectProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedPropertiesType", propOrder = {
    "unsignedSignatureProperties",
    "unsignedDataObjectProperties"
})
public class UnsignedPropertiesType {

    @XmlElement(name = "UnsignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected UnsignedSignaturePropertiesType unsignedSignatureProperties;
    @XmlElement(name = "UnsignedDataObjectProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected UnsignedDataObjectPropertiesType unsignedDataObjectProperties;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad unsignedSignatureProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public UnsignedSignaturePropertiesType getUnsignedSignatureProperties() {
        return unsignedSignatureProperties;
    }

    /**
     * Define el valor de la propiedad unsignedSignatureProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public void setUnsignedSignatureProperties(UnsignedSignaturePropertiesType value) {
        this.unsignedSignatureProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad unsignedDataObjectProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public UnsignedDataObjectPropertiesType getUnsignedDataObjectProperties() {
        return unsignedDataObjectProperties;
    }

    /**
     * Define el valor de la propiedad unsignedDataObjectProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public void setUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType value) {
        this.unsignedDataObjectProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
