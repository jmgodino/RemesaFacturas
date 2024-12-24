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
import com.picoto.jaxb.ubl.common.cbc.CompanyID;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalForm;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalFormCode;
import com.picoto.jaxb.ubl.common.cbc.CompanyLiquidationStatusCode;
import com.picoto.jaxb.ubl.common.cbc.CorporateStockAmount;
import com.picoto.jaxb.ubl.common.cbc.FullyPaidSharesIndicator;
import com.picoto.jaxb.ubl.common.cbc.RegistrationDate;
import com.picoto.jaxb.ubl.common.cbc.RegistrationExpirationDate;
import com.picoto.jaxb.ubl.common.cbc.RegistrationName;
import com.picoto.jaxb.ubl.common.cbc.SoleProprietorshipIndicator;


/**
 * <p>Clase Java para PartyLegalEntityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyLegalEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationExpirationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SoleProprietorshipIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLiquidationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorporateStockAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullyPaidSharesIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CorporateRegistrationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HeadOfficeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShareholderParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLegalEntityType", propOrder = {
    "registrationName",
    "companyID",
    "registrationDate",
    "registrationExpirationDate",
    "companyLegalFormCode",
    "companyLegalForm",
    "soleProprietorshipIndicator",
    "companyLiquidationStatusCode",
    "corporateStockAmount",
    "fullyPaidSharesIndicator",
    "registrationAddress",
    "corporateRegistrationScheme",
    "headOfficeParty",
    "shareholderParties"
})
@XmlRootElement(name = "PartyLegalEntity")
public class PartyLegalEntity {

    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationName registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyID companyID;
    @XmlElement(name = "RegistrationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationDate registrationDate;
    @XmlElement(name = "RegistrationExpirationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationExpirationDate registrationExpirationDate;
    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalForm companyLegalForm;
    @XmlElement(name = "SoleProprietorshipIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SoleProprietorshipIndicator soleProprietorshipIndicator;
    @XmlElement(name = "CompanyLiquidationStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLiquidationStatusCode companyLiquidationStatusCode;
    @XmlElement(name = "CorporateStockAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorporateStockAmount corporateStockAmount;
    @XmlElement(name = "FullyPaidSharesIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullyPaidSharesIndicator fullyPaidSharesIndicator;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "CorporateRegistrationScheme")
    protected CorporateRegistrationScheme corporateRegistrationScheme;
    @XmlElement(name = "HeadOfficeParty")
    protected PartyType headOfficeParty;
    @XmlElement(name = "ShareholderParty")
    protected List<ShareholderParty> shareholderParties;

    /**
     * Obtiene el valor de la propiedad registrationName.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationName }
     *     
     */
    public RegistrationName getRegistrationName() {
        return registrationName;
    }

    /**
     * Define el valor de la propiedad registrationName.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationName }
     *     
     */
    public void setRegistrationName(RegistrationName value) {
        this.registrationName = value;
    }

    /**
     * Obtiene el valor de la propiedad companyID.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getCompanyID() {
        return companyID;
    }

    /**
     * Define el valor de la propiedad companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setCompanyID(CompanyID value) {
        this.companyID = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationDate.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDate }
     *     
     */
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Define el valor de la propiedad registrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDate }
     *     
     */
    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationExpirationDate }
     *     
     */
    public RegistrationExpirationDate getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    /**
     * Define el valor de la propiedad registrationExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationExpirationDate }
     *     
     */
    public void setRegistrationExpirationDate(RegistrationExpirationDate value) {
        this.registrationExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad companyLegalFormCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Define el valor de la propiedad companyLegalFormCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Obtiene el valor de la propiedad companyLegalForm.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalForm }
     *     
     */
    public CompanyLegalForm getCompanyLegalForm() {
        return companyLegalForm;
    }

    /**
     * Define el valor de la propiedad companyLegalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalForm }
     *     
     */
    public void setCompanyLegalForm(CompanyLegalForm value) {
        this.companyLegalForm = value;
    }

    /**
     * Obtiene el valor de la propiedad soleProprietorshipIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SoleProprietorshipIndicator }
     *     
     */
    public SoleProprietorshipIndicator getSoleProprietorshipIndicator() {
        return soleProprietorshipIndicator;
    }

    /**
     * Define el valor de la propiedad soleProprietorshipIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SoleProprietorshipIndicator }
     *     
     */
    public void setSoleProprietorshipIndicator(SoleProprietorshipIndicator value) {
        this.soleProprietorshipIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad companyLiquidationStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLiquidationStatusCode }
     *     
     */
    public CompanyLiquidationStatusCode getCompanyLiquidationStatusCode() {
        return companyLiquidationStatusCode;
    }

    /**
     * Define el valor de la propiedad companyLiquidationStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLiquidationStatusCode }
     *     
     */
    public void setCompanyLiquidationStatusCode(CompanyLiquidationStatusCode value) {
        this.companyLiquidationStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateStockAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorporateStockAmount }
     *     
     */
    public CorporateStockAmount getCorporateStockAmount() {
        return corporateStockAmount;
    }

    /**
     * Define el valor de la propiedad corporateStockAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateStockAmount }
     *     
     */
    public void setCorporateStockAmount(CorporateStockAmount value) {
        this.corporateStockAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad fullyPaidSharesIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FullyPaidSharesIndicator }
     *     
     */
    public FullyPaidSharesIndicator getFullyPaidSharesIndicator() {
        return fullyPaidSharesIndicator;
    }

    /**
     * Define el valor de la propiedad fullyPaidSharesIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyPaidSharesIndicator }
     *     
     */
    public void setFullyPaidSharesIndicator(FullyPaidSharesIndicator value) {
        this.fullyPaidSharesIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Define el valor de la propiedad registrationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateRegistrationScheme.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationScheme }
     *     
     */
    public CorporateRegistrationScheme getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Define el valor de la propiedad corporateRegistrationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationScheme }
     *     
     */
    public void setCorporateRegistrationScheme(CorporateRegistrationScheme value) {
        this.corporateRegistrationScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad headOfficeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHeadOfficeParty() {
        return headOfficeParty;
    }

    /**
     * Define el valor de la propiedad headOfficeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHeadOfficeParty(PartyType value) {
        this.headOfficeParty = value;
    }

    /**
     * Gets the value of the shareholderParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholderParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholderParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholderParty }
     * 
     * 
     */
    public List<ShareholderParty> getShareholderParties() {
        if (shareholderParties == null) {
            shareholderParties = new ArrayList<ShareholderParty>();
        }
        return this.shareholderParties;
    }

}
