//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CanonicalizationMethod;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.SignatureMethod;
import com.picoto.jaxb.ubl.common.cbc.ValidationDate;
import com.picoto.jaxb.ubl.common.cbc.ValidationTime;
import com.picoto.jaxb.ubl.common.cbc.ValidatorID;


/**
 * <p>Clase Java para SignatureType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CanonicalizationMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SignatureMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalSignatureAttachment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "id",
    "notes",
    "validationDate",
    "validationTime",
    "validatorID",
    "canonicalizationMethod",
    "signatureMethod",
    "signatoryParty",
    "digitalSignatureAttachment",
    "originalDocumentReference"
})
@XmlRootElement(name = "Signature")
public class Signature {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationDate validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationTime validationTime;
    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatorID validatorID;
    @XmlElement(name = "CanonicalizationMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CanonicalizationMethod canonicalizationMethod;
    @XmlElement(name = "SignatureMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SignatureMethod signatureMethod;
    @XmlElement(name = "SignatoryParty")
    protected PartyType signatoryParty;
    @XmlElement(name = "DigitalSignatureAttachment")
    protected AttachmentType digitalSignatureAttachment;
    @XmlElement(name = "OriginalDocumentReference")
    protected DocumentReferenceType originalDocumentReference;

    /**
     * Obtiene el valor de la propiedad id.
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
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Obtiene el valor de la propiedad validationDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDate }
     *     
     */
    public ValidationDate getValidationDate() {
        return validationDate;
    }

    /**
     * Define el valor de la propiedad validationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDate }
     *     
     */
    public void setValidationDate(ValidationDate value) {
        this.validationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad validationTime.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTime }
     *     
     */
    public ValidationTime getValidationTime() {
        return validationTime;
    }

    /**
     * Define el valor de la propiedad validationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTime }
     *     
     */
    public void setValidationTime(ValidationTime value) {
        this.validationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad validatorID.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorID }
     *     
     */
    public ValidatorID getValidatorID() {
        return validatorID;
    }

    /**
     * Define el valor de la propiedad validatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorID }
     *     
     */
    public void setValidatorID(ValidatorID value) {
        this.validatorID = value;
    }

    /**
     * Obtiene el valor de la propiedad canonicalizationMethod.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethod }
     *     
     */
    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Define el valor de la propiedad canonicalizationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethod }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethod value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureMethod.
     * 
     * @return
     *     possible object is
     *     {@link SignatureMethod }
     *     
     */
    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Define el valor de la propiedad signatureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureMethod }
     *     
     */
    public void setSignatureMethod(SignatureMethod value) {
        this.signatureMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad signatoryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Define el valor de la propiedad signatoryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
    }

    /**
     * Obtiene el valor de la propiedad digitalSignatureAttachment.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getDigitalSignatureAttachment() {
        return digitalSignatureAttachment;
    }

    /**
     * Define el valor de la propiedad digitalSignatureAttachment.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setDigitalSignatureAttachment(AttachmentType value) {
        this.digitalSignatureAttachment = value;
    }

    /**
     * Obtiene el valor de la propiedad originalDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getOriginalDocumentReference() {
        return originalDocumentReference;
    }

    /**
     * Define el valor de la propiedad originalDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setOriginalDocumentReference(DocumentReferenceType value) {
        this.originalDocumentReference = value;
    }

}
