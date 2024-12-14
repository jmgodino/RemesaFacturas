//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.xadesv132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="UnsignedSignatureProperties" type="{http://uri.etsi.org/01903/v1.3.2#}UnsignedSignaturePropertiesType" minOccurs="0"/>
 *         &lt;element name="UnsignedDataObjectProperties" type="{http://uri.etsi.org/01903/v1.3.2#}UnsignedDataObjectPropertiesType" minOccurs="0"/>
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
@XmlRootElement(name = "UnsignedProperties")
public class UnsignedProperties {

    @XmlElement(name = "UnsignedSignatureProperties")
    protected UnsignedSignatureProperties unsignedSignatureProperties;
    @XmlElement(name = "UnsignedDataObjectProperties")
    protected UnsignedDataObjectProperties unsignedDataObjectProperties;
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
     *     {@link UnsignedSignatureProperties }
     *     
     */
    public UnsignedSignatureProperties getUnsignedSignatureProperties() {
        return unsignedSignatureProperties;
    }

    /**
     * Define el valor de la propiedad unsignedSignatureProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedSignatureProperties }
     *     
     */
    public void setUnsignedSignatureProperties(UnsignedSignatureProperties value) {
        this.unsignedSignatureProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad unsignedDataObjectProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedDataObjectProperties }
     *     
     */
    public UnsignedDataObjectProperties getUnsignedDataObjectProperties() {
        return unsignedDataObjectProperties;
    }

    /**
     * Define el valor de la propiedad unsignedDataObjectProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedDataObjectProperties }
     *     
     */
    public void setUnsignedDataObjectProperties(UnsignedDataObjectProperties value) {
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
