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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.FaceValueAmount;
import com.picoto.jaxb.ubl.common.cbc.ImmobilizationCertificateID;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.MarketValueAmount;
import com.picoto.jaxb.ubl.common.cbc.SecurityID;
import com.picoto.jaxb.ubl.common.cbc.SharesNumberQuantity;


/**
 * <p>Clase Java para ImmobilizedSecurityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImmobilizedSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImmobilizationCertificateID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SecurityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FaceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarketValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SharesNumberQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilizedSecurityType", propOrder = {
    "immobilizationCertificateID",
    "securityID",
    "issueDate",
    "faceValueAmount",
    "marketValueAmount",
    "sharesNumberQuantity",
    "issuerParty"
})
@XmlRootElement(name = "ImmobilizedSecurity")
public class ImmobilizedSecurity {

    @XmlElement(name = "ImmobilizationCertificateID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ImmobilizationCertificateID immobilizationCertificateID;
    @XmlElement(name = "SecurityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SecurityID securityID;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueDate issueDate;
    @XmlElement(name = "FaceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FaceValueAmount faceValueAmount;
    @XmlElement(name = "MarketValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarketValueAmount marketValueAmount;
    @XmlElement(name = "SharesNumberQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SharesNumberQuantity sharesNumberQuantity;
    @XmlElement(name = "IssuerParty")
    protected PartyType issuerParty;

    /**
     * Obtiene el valor de la propiedad immobilizationCertificateID.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilizationCertificateID }
     *     
     */
    public ImmobilizationCertificateID getImmobilizationCertificateID() {
        return immobilizationCertificateID;
    }

    /**
     * Define el valor de la propiedad immobilizationCertificateID.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilizationCertificateID }
     *     
     */
    public void setImmobilizationCertificateID(ImmobilizationCertificateID value) {
        this.immobilizationCertificateID = value;
    }

    /**
     * Obtiene el valor de la propiedad securityID.
     * 
     * @return
     *     possible object is
     *     {@link SecurityID }
     *     
     */
    public SecurityID getSecurityID() {
        return securityID;
    }

    /**
     * Define el valor de la propiedad securityID.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityID }
     *     
     */
    public void setSecurityID(SecurityID value) {
        this.securityID = value;
    }

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link IssueDate }
     *     
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDate }
     *     
     */
    public void setIssueDate(IssueDate value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad faceValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link FaceValueAmount }
     *     
     */
    public FaceValueAmount getFaceValueAmount() {
        return faceValueAmount;
    }

    /**
     * Define el valor de la propiedad faceValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceValueAmount }
     *     
     */
    public void setFaceValueAmount(FaceValueAmount value) {
        this.faceValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad marketValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link MarketValueAmount }
     *     
     */
    public MarketValueAmount getMarketValueAmount() {
        return marketValueAmount;
    }

    /**
     * Define el valor de la propiedad marketValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketValueAmount }
     *     
     */
    public void setMarketValueAmount(MarketValueAmount value) {
        this.marketValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad sharesNumberQuantity.
     * 
     * @return
     *     possible object is
     *     {@link SharesNumberQuantity }
     *     
     */
    public SharesNumberQuantity getSharesNumberQuantity() {
        return sharesNumberQuantity;
    }

    /**
     * Define el valor de la propiedad sharesNumberQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesNumberQuantity }
     *     
     */
    public void setSharesNumberQuantity(SharesNumberQuantity value) {
        this.sharesNumberQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Define el valor de la propiedad issuerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

}
