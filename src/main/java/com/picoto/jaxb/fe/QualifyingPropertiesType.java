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
 * <p>Clase Java para QualifyingPropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedProperties" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPropertiesType", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
public class QualifyingPropertiesType {

    @XmlElement(name = "SignedProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignedPropertiesType signedProperties;
    @XmlElement(name = "UnsignedProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected UnsignedPropertiesType unsignedProperties;
    @XmlAttribute(name = "Target", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad signedProperties.
     * 
     * @return
     *     possible object is
     *     {@link SignedPropertiesType }
     *     
     */
    public SignedPropertiesType getSignedProperties() {
        return signedProperties;
    }

    /**
     * Define el valor de la propiedad signedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedPropertiesType }
     *     
     */
    public void setSignedProperties(SignedPropertiesType value) {
        this.signedProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad unsignedProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedPropertiesType }
     *     
     */
    public UnsignedPropertiesType getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Define el valor de la propiedad unsignedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedPropertiesType }
     *     
     */
    public void setUnsignedProperties(UnsignedPropertiesType value) {
        this.unsignedProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad target.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Define el valor de la propiedad target.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
