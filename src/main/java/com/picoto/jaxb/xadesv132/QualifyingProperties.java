//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.xadesv132;

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
 * <p>Clase Java para QualifyingPropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignedProperties" type="{http://uri.etsi.org/01903/v1.3.2#}SignedPropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="UnsignedProperties" type="{http://uri.etsi.org/01903/v1.3.2#}UnsignedPropertiesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPropertiesType", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
@XmlRootElement(name = "QualifyingProperties")
public class QualifyingProperties {

    @XmlElement(name = "SignedProperties")
    protected SignedProperties signedProperties;
    @XmlElement(name = "UnsignedProperties")
    protected UnsignedProperties unsignedProperties;
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
     *     {@link SignedProperties }
     *     
     */
    public SignedProperties getSignedProperties() {
        return signedProperties;
    }

    /**
     * Define el valor de la propiedad signedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedProperties }
     *     
     */
    public void setSignedProperties(SignedProperties value) {
        this.signedProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad unsignedProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedProperties }
     *     
     */
    public UnsignedProperties getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Define el valor de la propiedad unsignedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedProperties }
     *     
     */
    public void setUnsignedProperties(UnsignedProperties value) {
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
