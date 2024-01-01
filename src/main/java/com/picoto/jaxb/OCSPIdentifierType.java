//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.02 a las 12:15:08 AM CET 
//


package com.picoto.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OCSPIdentifierType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OCSPIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponderID" type="{http://uri.etsi.org/01903/v1.3.2#}ResponderIDType"/&gt;
 *         &lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPIdentifierType", propOrder = {
    "responderID",
    "producedAt"
})
public class OCSPIdentifierType {

    @XmlElement(name = "ResponderID", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    protected ResponderIDType responderID;
    @XmlElement(name = "ProducedAt", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar producedAt;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Obtiene el valor de la propiedad responderID.
     * 
     * @return
     *     possible object is
     *     {@link ResponderIDType }
     *     
     */
    public ResponderIDType getResponderID() {
        return responderID;
    }

    /**
     * Define el valor de la propiedad responderID.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderIDType }
     *     
     */
    public void setResponderID(ResponderIDType value) {
        this.responderID = value;
    }

    /**
     * Obtiene el valor de la propiedad producedAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProducedAt() {
        return producedAt;
    }

    /**
     * Define el valor de la propiedad producedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProducedAt(XMLGregorianCalendar value) {
        this.producedAt = value;
    }

    /**
     * Obtiene el valor de la propiedad uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Define el valor de la propiedad uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
