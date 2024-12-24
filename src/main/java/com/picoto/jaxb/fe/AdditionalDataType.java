//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdditionalDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatedInvoice" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="RelatedDocuments" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AttachedDocumentsType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAdditionalInformation" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataType", propOrder = {
    "relatedInvoice",
    "relatedDocuments",
    "invoiceAdditionalInformation",
    "extensions"
})
public class AdditionalDataType {

    @XmlElement(name = "RelatedInvoice")
    protected String relatedInvoice;
    @XmlElement(name = "RelatedDocuments")
    protected AttachedDocumentsType relatedDocuments;
    @XmlElement(name = "InvoiceAdditionalInformation")
    protected String invoiceAdditionalInformation;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;

    /**
     * Obtiene el valor de la propiedad relatedInvoice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedInvoice() {
        return relatedInvoice;
    }

    /**
     * Define el valor de la propiedad relatedInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedInvoice(String value) {
        this.relatedInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedDocuments.
     * 
     * @return
     *     possible object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public AttachedDocumentsType getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Define el valor de la propiedad relatedDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public void setRelatedDocuments(AttachedDocumentsType value) {
        this.relatedDocuments = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceAdditionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAdditionalInformation() {
        return invoiceAdditionalInformation;
    }

    /**
     * Define el valor de la propiedad invoiceAdditionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAdditionalInformation(String value) {
        this.invoiceAdditionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Define el valor de la propiedad extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

}