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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileHeader" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}FileHeaderType"/>
 *         &lt;element name="Parties" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PartiesType"/>
 *         &lt;element name="Invoices" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoicesType"/>
 *         &lt;element name="Extensions" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ExtensionsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileHeader",
    "parties",
    "invoices",
    "extensions",
    "signature"
})
@XmlRootElement(name = "Facturae", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
public class Facturae {

    @XmlElement(name = "FileHeader", required = true)
    protected FileHeaderType fileHeader;
    @XmlElement(name = "Parties", required = true)
    protected PartiesType parties;
    @XmlElement(name = "Invoices", required = true)
    protected InvoicesType invoices;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Obtiene el valor de la propiedad fileHeader.
     * 
     * @return
     *     possible object is
     *     {@link FileHeaderType }
     *     
     */
    public FileHeaderType getFileHeader() {
        return fileHeader;
    }

    /**
     * Define el valor de la propiedad fileHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link FileHeaderType }
     *     
     */
    public void setFileHeader(FileHeaderType value) {
        this.fileHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad parties.
     * 
     * @return
     *     possible object is
     *     {@link PartiesType }
     *     
     */
    public PartiesType getParties() {
        return parties;
    }

    /**
     * Define el valor de la propiedad parties.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiesType }
     *     
     */
    public void setParties(PartiesType value) {
        this.parties = value;
    }

    /**
     * Obtiene el valor de la propiedad invoices.
     * 
     * @return
     *     possible object is
     *     {@link InvoicesType }
     *     
     */
    public InvoicesType getInvoices() {
        return invoices;
    }

    /**
     * Define el valor de la propiedad invoices.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicesType }
     *     
     */
    public void setInvoices(InvoicesType value) {
        this.invoices = value;
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

    /**
     *  Conjunto de datos
     * 							asociados a la factura que garantizarán la autoría y la
     * 							integridad del mensaje. Se define como opcional para facilitar la
     * 							verificación y el tránsito del fichero. No obstante, debe
     * 							cumplimentarse este bloque de firma electrónica para que se
     * 							considere una factura electrónica válida legalmente frente a
     * 							terceros.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
