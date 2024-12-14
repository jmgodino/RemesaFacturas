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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type"/>
 *         &lt;element name="InvoiceSeriesCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="InvoiceDocumentType" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceDocumentTypeType"/>
 *         &lt;element name="InvoiceClass" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceClassType"/>
 *         &lt;element name="Corrective" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CorrectiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeaderType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "invoiceNumber",
    "invoiceSeriesCode",
    "invoiceDocumentType",
    "invoiceClass",
    "corrective"
})
public class InvoiceHeaderType {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceSeriesCode")
    protected String invoiceSeriesCode;
    @XmlElement(name = "InvoiceDocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceDocumentTypeType invoiceDocumentType;
    @XmlElement(name = "InvoiceClass", required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceClassType invoiceClass;
    @XmlElement(name = "Corrective")
    protected CorrectiveType corrective;

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceSeriesCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSeriesCode() {
        return invoiceSeriesCode;
    }

    /**
     * Define el valor de la propiedad invoiceSeriesCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSeriesCode(String value) {
        this.invoiceSeriesCode = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDocumentType.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDocumentTypeType }
     *     
     */
    public InvoiceDocumentTypeType getInvoiceDocumentType() {
        return invoiceDocumentType;
    }

    /**
     * Define el valor de la propiedad invoiceDocumentType.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDocumentTypeType }
     *     
     */
    public void setInvoiceDocumentType(InvoiceDocumentTypeType value) {
        this.invoiceDocumentType = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceClass.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceClassType }
     *     
     */
    public InvoiceClassType getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Define el valor de la propiedad invoiceClass.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceClassType }
     *     
     */
    public void setInvoiceClass(InvoiceClassType value) {
        this.invoiceClass = value;
    }

    /**
     * Obtiene el valor de la propiedad corrective.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveType }
     *     
     */
    public CorrectiveType getCorrective() {
        return corrective;
    }

    /**
     * Define el valor de la propiedad corrective.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveType }
     *     
     */
    public void setCorrective(CorrectiveType value) {
        this.corrective = value;
    }

}
