//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BirthDate;
import com.picoto.jaxb.ubl.common.cbc.BirthplaceName;
import com.picoto.jaxb.ubl.common.cbc.FamilyName;
import com.picoto.jaxb.ubl.common.cbc.FirstName;
import com.picoto.jaxb.ubl.common.cbc.GenderCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.JobTitle;
import com.picoto.jaxb.ubl.common.cbc.MiddleName;
import com.picoto.jaxb.ubl.common.cbc.NameSuffix;
import com.picoto.jaxb.ubl.common.cbc.NationalityID;
import com.picoto.jaxb.ubl.common.cbc.OrganizationDepartment;
import com.picoto.jaxb.ubl.common.cbc.OtherName;
import com.picoto.jaxb.ubl.common.cbc.Title;


/**
 * <p>Clase Java para PersonType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FamilyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MiddleName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JobTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GenderCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthplaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrganizationDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IdentityDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResidenceAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "id",
    "firstName",
    "familyName",
    "title",
    "middleName",
    "otherName",
    "nameSuffix",
    "jobTitle",
    "nationalityID",
    "genderCode",
    "birthDate",
    "birthplaceName",
    "organizationDepartment",
    "contact",
    "financialAccount",
    "identityDocumentReferences",
    "residenceAddress"
})
public class PersonType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "FirstName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FirstName firstName;
    @XmlElement(name = "FamilyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FamilyName familyName;
    @XmlElement(name = "Title", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Title title;
    @XmlElement(name = "MiddleName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MiddleName middleName;
    @XmlElement(name = "OtherName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OtherName otherName;
    @XmlElement(name = "NameSuffix", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameSuffix nameSuffix;
    @XmlElement(name = "JobTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected JobTitle jobTitle;
    @XmlElement(name = "NationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NationalityID nationalityID;
    @XmlElement(name = "GenderCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GenderCode genderCode;
    @XmlElement(name = "BirthDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BirthDate birthDate;
    @XmlElement(name = "BirthplaceName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BirthplaceName birthplaceName;
    @XmlElement(name = "OrganizationDepartment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrganizationDepartment organizationDepartment;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "FinancialAccount")
    protected FinancialAccountType financialAccount;
    @XmlElement(name = "IdentityDocumentReference")
    protected List<DocumentReferenceType> identityDocumentReferences;
    @XmlElement(name = "ResidenceAddress")
    protected AddressType residenceAddress;

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
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link FirstName }
     *     
     */
    public FirstName getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstName }
     *     
     */
    public void setFirstName(FirstName value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad familyName.
     * 
     * @return
     *     possible object is
     *     {@link FamilyName }
     *     
     */
    public FamilyName getFamilyName() {
        return familyName;
    }

    /**
     * Define el valor de la propiedad familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyName }
     *     
     */
    public void setFamilyName(FamilyName value) {
        this.familyName = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link MiddleName }
     *     
     */
    public MiddleName getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link MiddleName }
     *     
     */
    public void setMiddleName(MiddleName value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad otherName.
     * 
     * @return
     *     possible object is
     *     {@link OtherName }
     *     
     */
    public OtherName getOtherName() {
        return otherName;
    }

    /**
     * Define el valor de la propiedad otherName.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherName }
     *     
     */
    public void setOtherName(OtherName value) {
        this.otherName = value;
    }

    /**
     * Obtiene el valor de la propiedad nameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Define el valor de la propiedad nameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setNameSuffix(NameSuffix value) {
        this.nameSuffix = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link JobTitle }
     *     
     */
    public JobTitle getJobTitle() {
        return jobTitle;
    }

    /**
     * Define el valor de la propiedad jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitle }
     *     
     */
    public void setJobTitle(JobTitle value) {
        this.jobTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityID.
     * 
     * @return
     *     possible object is
     *     {@link NationalityID }
     *     
     */
    public NationalityID getNationalityID() {
        return nationalityID;
    }

    /**
     * Define el valor de la propiedad nationalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityID }
     *     
     */
    public void setNationalityID(NationalityID value) {
        this.nationalityID = value;
    }

    /**
     * Obtiene el valor de la propiedad genderCode.
     * 
     * @return
     *     possible object is
     *     {@link GenderCode }
     *     
     */
    public GenderCode getGenderCode() {
        return genderCode;
    }

    /**
     * Define el valor de la propiedad genderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCode }
     *     
     */
    public void setGenderCode(GenderCode value) {
        this.genderCode = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link BirthDate }
     *     
     */
    public BirthDate getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDate }
     *     
     */
    public void setBirthDate(BirthDate value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad birthplaceName.
     * 
     * @return
     *     possible object is
     *     {@link BirthplaceName }
     *     
     */
    public BirthplaceName getBirthplaceName() {
        return birthplaceName;
    }

    /**
     * Define el valor de la propiedad birthplaceName.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthplaceName }
     *     
     */
    public void setBirthplaceName(BirthplaceName value) {
        this.birthplaceName = value;
    }

    /**
     * Obtiene el valor de la propiedad organizationDepartment.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDepartment }
     *     
     */
    public OrganizationDepartment getOrganizationDepartment() {
        return organizationDepartment;
    }

    /**
     * Define el valor de la propiedad organizationDepartment.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDepartment }
     *     
     */
    public void setOrganizationDepartment(OrganizationDepartment value) {
        this.organizationDepartment = value;
    }

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad financialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getFinancialAccount() {
        return financialAccount;
    }

    /**
     * Define el valor de la propiedad financialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setFinancialAccount(FinancialAccountType value) {
        this.financialAccount = value;
    }

    /**
     * Gets the value of the identityDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getIdentityDocumentReferences() {
        if (identityDocumentReferences == null) {
            identityDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.identityDocumentReferences;
    }

    /**
     * Obtiene el valor de la propiedad residenceAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Define el valor de la propiedad residenceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setResidenceAddress(AddressType value) {
        this.residenceAddress = value;
    }

}
