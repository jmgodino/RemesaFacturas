//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.xadesv132;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjectIdentifierType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjectIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://uri.etsi.org/01903/v1.3.2#}IdentifierType"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentationReferences" type="{http://uri.etsi.org/01903/v1.3.2#}DocumentationReferencesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIdentifierType", propOrder = {
    "identifier",
    "description",
    "documentationReferences"
})
@XmlRootElement(name = "ObjectIdentifier")
public class ObjectIdentifier {

    @XmlElement(name = "Identifier", required = true)
    protected IdentifierType identifier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DocumentationReferences")
    protected DocumentationReferencesType documentationReferences;

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad documentationReferences.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationReferencesType }
     *     
     */
    public DocumentationReferencesType getDocumentationReferences() {
        return documentationReferences;
    }

    /**
     * Define el valor de la propiedad documentationReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationReferencesType }
     *     
     */
    public void setDocumentationReferences(DocumentationReferencesType value) {
        this.documentationReferences = value;
    }

}
