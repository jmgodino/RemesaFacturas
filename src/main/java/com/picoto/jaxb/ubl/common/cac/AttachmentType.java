//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.EmbeddedDocumentBinaryObject;


/**
 * <p>Clase Java para AttachmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmbeddedDocumentBinaryObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExternalReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "embeddedDocumentBinaryObject",
    "externalReference"
})
public class AttachmentType {

    @XmlElement(name = "EmbeddedDocumentBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmbeddedDocumentBinaryObject embeddedDocumentBinaryObject;
    @XmlElement(name = "ExternalReference")
    protected ExternalReference externalReference;

    /**
     * Obtiene el valor de la propiedad embeddedDocumentBinaryObject.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedDocumentBinaryObject }
     *     
     */
    public EmbeddedDocumentBinaryObject getEmbeddedDocumentBinaryObject() {
        return embeddedDocumentBinaryObject;
    }

    /**
     * Define el valor de la propiedad embeddedDocumentBinaryObject.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedDocumentBinaryObject }
     *     
     */
    public void setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObject value) {
        this.embeddedDocumentBinaryObject = value;
    }

    /**
     * Obtiene el valor de la propiedad externalReference.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReference }
     *     
     */
    public ExternalReference getExternalReference() {
        return externalReference;
    }

    /**
     * Define el valor de la propiedad externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReference }
     *     
     */
    public void setExternalReference(ExternalReference value) {
        this.externalReference = value;
    }

}
