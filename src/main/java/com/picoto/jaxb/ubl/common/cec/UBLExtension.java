//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Name;


/**
 * 
 *         A single extension for private use.
 *       
 * 
 * <p>Clase Java para UBLExtensionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UBLExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionVersionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyURI" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionURI" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReasonCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReason" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionType", propOrder = {
    "id",
    "name",
    "extensionAgencyID",
    "extensionAgencyName",
    "extensionVersionID",
    "extensionAgencyURI",
    "extensionURI",
    "extensionReasonCode",
    "extensionReason",
    "extensionContent"
})
@XmlRootElement(name = "UBLExtension")
public class UBLExtension {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Name name;
    @XmlElement(name = "ExtensionAgencyID")
    protected ExtensionAgencyID extensionAgencyID;
    @XmlElement(name = "ExtensionAgencyName")
    protected ExtensionAgencyName extensionAgencyName;
    @XmlElement(name = "ExtensionVersionID")
    protected ExtensionVersionID extensionVersionID;
    @XmlElement(name = "ExtensionAgencyURI")
    protected ExtensionAgencyURI extensionAgencyURI;
    @XmlElement(name = "ExtensionURI")
    protected ExtensionURI extensionURI;
    @XmlElement(name = "ExtensionReasonCode")
    protected ExtensionReasonCode extensionReasonCode;
    @XmlElement(name = "ExtensionReason")
    protected ExtensionReason extensionReason;
    @XmlElement(name = "ExtensionContent", required = true)
    protected ExtensionContent extensionContent;

    /**
     * 
     *             An identifier for the Extension assigned by the creator of the extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * 
     *             A name for the Extension assigned by the creator of the extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * 
     *             An agency that maintains one or more Extensions.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyID }
     *     
     */
    public ExtensionAgencyID getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * Define el valor de la propiedad extensionAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyID }
     *     
     */
    public void setExtensionAgencyID(ExtensionAgencyID value) {
        this.extensionAgencyID = value;
    }

    /**
     * 
     *             The name of the agency that maintains the Extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyName }
     *     
     */
    public ExtensionAgencyName getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * Define el valor de la propiedad extensionAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyName }
     *     
     */
    public void setExtensionAgencyName(ExtensionAgencyName value) {
        this.extensionAgencyName = value;
    }

    /**
     * 
     *             The version of the Extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionVersionID }
     *     
     */
    public ExtensionVersionID getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * Define el valor de la propiedad extensionVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionVersionID }
     *     
     */
    public void setExtensionVersionID(ExtensionVersionID value) {
        this.extensionVersionID = value;
    }

    /**
     * 
     *             A URI for the Agency that maintains the Extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyURI }
     *     
     */
    public ExtensionAgencyURI getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * Define el valor de la propiedad extensionAgencyURI.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyURI }
     *     
     */
    public void setExtensionAgencyURI(ExtensionAgencyURI value) {
        this.extensionAgencyURI = value;
    }

    /**
     * 
     *             A URI for the Extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionURI }
     *     
     */
    public ExtensionURI getExtensionURI() {
        return extensionURI;
    }

    /**
     * Define el valor de la propiedad extensionURI.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionURI }
     *     
     */
    public void setExtensionURI(ExtensionURI value) {
        this.extensionURI = value;
    }

    /**
     * 
     *             A code for reason the Extension is being included.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonCode }
     *     
     */
    public ExtensionReasonCode getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * Define el valor de la propiedad extensionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonCode }
     *     
     */
    public void setExtensionReasonCode(ExtensionReasonCode value) {
        this.extensionReasonCode = value;
    }

    /**
     * 
     *             A description of the reason for the Extension.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReason }
     *     
     */
    public ExtensionReason getExtensionReason() {
        return extensionReason;
    }

    /**
     * Define el valor de la propiedad extensionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReason }
     *     
     */
    public void setExtensionReason(ExtensionReason value) {
        this.extensionReason = value;
    }

    /**
     * 
     *             The definition of the extension content.
     *           
     * 
     * @return
     *     possible object is
     *     {@link ExtensionContent }
     *     
     */
    public ExtensionContent getExtensionContent() {
        return extensionContent;
    }

    /**
     * Define el valor de la propiedad extensionContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionContent }
     *     
     */
    public void setExtensionContent(ExtensionContent value) {
        this.extensionContent = value;
    }

}
