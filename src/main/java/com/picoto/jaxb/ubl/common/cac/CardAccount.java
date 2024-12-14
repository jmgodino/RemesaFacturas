//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CV2ID;
import com.picoto.jaxb.ubl.common.cbc.CardChipCode;
import com.picoto.jaxb.ubl.common.cbc.CardTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ChipApplicationID;
import com.picoto.jaxb.ubl.common.cbc.ExpiryDate;
import com.picoto.jaxb.ubl.common.cbc.HolderName;
import com.picoto.jaxb.ubl.common.cbc.IssueNumberID;
import com.picoto.jaxb.ubl.common.cbc.IssuerID;
import com.picoto.jaxb.ubl.common.cbc.NetworkID;
import com.picoto.jaxb.ubl.common.cbc.PrimaryAccountNumberID;
import com.picoto.jaxb.ubl.common.cbc.ValidityStartDate;


/**
 * <p>Clase Java para CardAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrimaryAccountNumberID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssuerID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CV2ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardChipCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChipApplicationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HolderName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccountType", propOrder = {
    "primaryAccountNumberID",
    "networkID",
    "cardTypeCode",
    "validityStartDate",
    "expiryDate",
    "issuerID",
    "issueNumberID",
    "cv2ID",
    "cardChipCode",
    "chipApplicationID",
    "holderName"
})
@XmlRootElement(name = "CardAccount")
public class CardAccount {

    @XmlElement(name = "PrimaryAccountNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrimaryAccountNumberID primaryAccountNumberID;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NetworkID networkID;
    @XmlElement(name = "CardTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardTypeCode cardTypeCode;
    @XmlElement(name = "ValidityStartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidityStartDate validityStartDate;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryDate expiryDate;
    @XmlElement(name = "IssuerID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssuerID issuerID;
    @XmlElement(name = "IssueNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueNumberID issueNumberID;
    @XmlElement(name = "CV2ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CV2ID cv2ID;
    @XmlElement(name = "CardChipCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardChipCode cardChipCode;
    @XmlElement(name = "ChipApplicationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChipApplicationID chipApplicationID;
    @XmlElement(name = "HolderName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HolderName holderName;

    /**
     * Obtiene el valor de la propiedad primaryAccountNumberID.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAccountNumberID }
     *     
     */
    public PrimaryAccountNumberID getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Define el valor de la propiedad primaryAccountNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAccountNumberID }
     *     
     */
    public void setPrimaryAccountNumberID(PrimaryAccountNumberID value) {
        this.primaryAccountNumberID = value;
    }

    /**
     * Obtiene el valor de la propiedad networkID.
     * 
     * @return
     *     possible object is
     *     {@link NetworkID }
     *     
     */
    public NetworkID getNetworkID() {
        return networkID;
    }

    /**
     * Define el valor de la propiedad networkID.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkID }
     *     
     */
    public void setNetworkID(NetworkID value) {
        this.networkID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeCode }
     *     
     */
    public CardTypeCode getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Define el valor de la propiedad cardTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeCode }
     *     
     */
    public void setCardTypeCode(CardTypeCode value) {
        this.cardTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad validityStartDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStartDate }
     *     
     */
    public ValidityStartDate getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Define el valor de la propiedad validityStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStartDate }
     *     
     */
    public void setValidityStartDate(ValidityStartDate value) {
        this.validityStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Define el valor de la propiedad expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiryDate(ExpiryDate value) {
        this.expiryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerID.
     * 
     * @return
     *     possible object is
     *     {@link IssuerID }
     *     
     */
    public IssuerID getIssuerID() {
        return issuerID;
    }

    /**
     * Define el valor de la propiedad issuerID.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerID }
     *     
     */
    public void setIssuerID(IssuerID value) {
        this.issuerID = value;
    }

    /**
     * Obtiene el valor de la propiedad issueNumberID.
     * 
     * @return
     *     possible object is
     *     {@link IssueNumberID }
     *     
     */
    public IssueNumberID getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * Define el valor de la propiedad issueNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueNumberID }
     *     
     */
    public void setIssueNumberID(IssueNumberID value) {
        this.issueNumberID = value;
    }

    /**
     * Obtiene el valor de la propiedad cv2ID.
     * 
     * @return
     *     possible object is
     *     {@link CV2ID }
     *     
     */
    public CV2ID getCV2ID() {
        return cv2ID;
    }

    /**
     * Define el valor de la propiedad cv2ID.
     * 
     * @param value
     *     allowed object is
     *     {@link CV2ID }
     *     
     */
    public void setCV2ID(CV2ID value) {
        this.cv2ID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardChipCode.
     * 
     * @return
     *     possible object is
     *     {@link CardChipCode }
     *     
     */
    public CardChipCode getCardChipCode() {
        return cardChipCode;
    }

    /**
     * Define el valor de la propiedad cardChipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChipCode }
     *     
     */
    public void setCardChipCode(CardChipCode value) {
        this.cardChipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad chipApplicationID.
     * 
     * @return
     *     possible object is
     *     {@link ChipApplicationID }
     *     
     */
    public ChipApplicationID getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * Define el valor de la propiedad chipApplicationID.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipApplicationID }
     *     
     */
    public void setChipApplicationID(ChipApplicationID value) {
        this.chipApplicationID = value;
    }

    /**
     * Obtiene el valor de la propiedad holderName.
     * 
     * @return
     *     possible object is
     *     {@link HolderName }
     *     
     */
    public HolderName getHolderName() {
        return holderName;
    }

    /**
     * Define el valor de la propiedad holderName.
     * 
     * @param value
     *     allowed object is
     *     {@link HolderName }
     *     
     */
    public void setHolderName(HolderName value) {
        this.holderName = value;
    }

}
