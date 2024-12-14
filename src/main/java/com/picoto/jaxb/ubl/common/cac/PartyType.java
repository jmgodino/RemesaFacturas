//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.EndpointID;
import com.picoto.jaxb.ubl.common.cbc.IndustryClassificationCode;
import com.picoto.jaxb.ubl.common.cbc.LogoReferenceID;
import com.picoto.jaxb.ubl.common.cbc.MarkAttentionIndicator;
import com.picoto.jaxb.ubl.common.cbc.MarkCareIndicator;
import com.picoto.jaxb.ubl.common.cbc.WebsiteURI;


/**
 * <p>Clase Java para PartyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCareIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttentionIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WebsiteURI" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LogoReferenceID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndpointID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndustryClassificationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PostalAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyTaxScheme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyLegalEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Person" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AgentParty" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceProviderParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PowerOfAttorney" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "markCareIndicator",
    "markAttentionIndicator",
    "websiteURI",
    "logoReferenceID",
    "endpointID",
    "industryClassificationCode",
    "partyIdentifications",
    "partyNames",
    "language",
    "postalAddress",
    "physicalLocation",
    "partyTaxSchemes",
    "partyLegalEntities",
    "contact",
    "persons",
    "agentParty",
    "serviceProviderParties",
    "powerOfAttorneies",
    "financialAccount"
})
public class PartyType {

    @XmlElement(name = "MarkCareIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkCareIndicator markCareIndicator;
    @XmlElement(name = "MarkAttentionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkAttentionIndicator markAttentionIndicator;
    @XmlElement(name = "WebsiteURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WebsiteURI websiteURI;
    @XmlElement(name = "LogoReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LogoReferenceID logoReferenceID;
    @XmlElement(name = "EndpointID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EndpointID endpointID;
    @XmlElement(name = "IndustryClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IndustryClassificationCode industryClassificationCode;
    @XmlElement(name = "PartyIdentification")
    protected List<PartyIdentification> partyIdentifications;
    @XmlElement(name = "PartyName")
    protected List<PartyName> partyNames;
    @XmlElement(name = "Language")
    protected LanguageType language;
    @XmlElement(name = "PostalAddress")
    protected AddressType postalAddress;
    @XmlElement(name = "PhysicalLocation")
    protected LocationType physicalLocation;
    @XmlElement(name = "PartyTaxScheme")
    protected List<PartyTaxScheme> partyTaxSchemes;
    @XmlElement(name = "PartyLegalEntity")
    protected List<PartyLegalEntity> partyLegalEntities;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "Person")
    protected List<PersonType> persons;
    @XmlElement(name = "AgentParty")
    protected PartyType agentParty;
    @XmlElement(name = "ServiceProviderParty")
    protected List<ServiceProviderParty> serviceProviderParties;
    @XmlElement(name = "PowerOfAttorney")
    protected List<PowerOfAttorney> powerOfAttorneies;
    @XmlElement(name = "FinancialAccount")
    protected FinancialAccountType financialAccount;

    /**
     * Obtiene el valor de la propiedad markCareIndicator.
     * 
     * @return
     *     possible object is
     *     {@link MarkCareIndicator }
     *     
     */
    public MarkCareIndicator getMarkCareIndicator() {
        return markCareIndicator;
    }

    /**
     * Define el valor de la propiedad markCareIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCareIndicator }
     *     
     */
    public void setMarkCareIndicator(MarkCareIndicator value) {
        this.markCareIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad markAttentionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttentionIndicator }
     *     
     */
    public MarkAttentionIndicator getMarkAttentionIndicator() {
        return markAttentionIndicator;
    }

    /**
     * Define el valor de la propiedad markAttentionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttentionIndicator }
     *     
     */
    public void setMarkAttentionIndicator(MarkAttentionIndicator value) {
        this.markAttentionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad websiteURI.
     * 
     * @return
     *     possible object is
     *     {@link WebsiteURI }
     *     
     */
    public WebsiteURI getWebsiteURI() {
        return websiteURI;
    }

    /**
     * Define el valor de la propiedad websiteURI.
     * 
     * @param value
     *     allowed object is
     *     {@link WebsiteURI }
     *     
     */
    public void setWebsiteURI(WebsiteURI value) {
        this.websiteURI = value;
    }

    /**
     * Obtiene el valor de la propiedad logoReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link LogoReferenceID }
     *     
     */
    public LogoReferenceID getLogoReferenceID() {
        return logoReferenceID;
    }

    /**
     * Define el valor de la propiedad logoReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoReferenceID }
     *     
     */
    public void setLogoReferenceID(LogoReferenceID value) {
        this.logoReferenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad endpointID.
     * 
     * @return
     *     possible object is
     *     {@link EndpointID }
     *     
     */
    public EndpointID getEndpointID() {
        return endpointID;
    }

    /**
     * Define el valor de la propiedad endpointID.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointID }
     *     
     */
    public void setEndpointID(EndpointID value) {
        this.endpointID = value;
    }

    /**
     * Obtiene el valor de la propiedad industryClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustryClassificationCode }
     *     
     */
    public IndustryClassificationCode getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    /**
     * Define el valor de la propiedad industryClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryClassificationCode }
     *     
     */
    public void setIndustryClassificationCode(IndustryClassificationCode value) {
        this.industryClassificationCode = value;
    }

    /**
     * Gets the value of the partyIdentifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdentifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdentifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification }
     * 
     * 
     */
    public List<PartyIdentification> getPartyIdentifications() {
        if (partyIdentifications == null) {
            partyIdentifications = new ArrayList<PartyIdentification>();
        }
        return this.partyIdentifications;
    }

    /**
     * Gets the value of the partyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyName }
     * 
     * 
     */
    public List<PartyName> getPartyNames() {
        if (partyNames == null) {
            partyNames = new ArrayList<PartyName>();
        }
        return this.partyNames;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Define el valor de la propiedad postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPostalAddress(AddressType value) {
        this.postalAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad physicalLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Define el valor de la propiedad physicalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPhysicalLocation(LocationType value) {
        this.physicalLocation = value;
    }

    /**
     * Gets the value of the partyTaxSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTaxSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTaxSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTaxScheme }
     * 
     * 
     */
    public List<PartyTaxScheme> getPartyTaxSchemes() {
        if (partyTaxSchemes == null) {
            partyTaxSchemes = new ArrayList<PartyTaxScheme>();
        }
        return this.partyTaxSchemes;
    }

    /**
     * Gets the value of the partyLegalEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyLegalEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyLegalEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyLegalEntity }
     * 
     * 
     */
    public List<PartyLegalEntity> getPartyLegalEntities() {
        if (partyLegalEntities == null) {
            partyLegalEntities = new ArrayList<PartyLegalEntity>();
        }
        return this.partyLegalEntities;
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
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPersons() {
        if (persons == null) {
            persons = new ArrayList<PersonType>();
        }
        return this.persons;
    }

    /**
     * Obtiene el valor de la propiedad agentParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAgentParty() {
        return agentParty;
    }

    /**
     * Define el valor de la propiedad agentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAgentParty(PartyType value) {
        this.agentParty = value;
    }

    /**
     * Gets the value of the serviceProviderParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProviderParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProviderParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderParty }
     * 
     * 
     */
    public List<ServiceProviderParty> getServiceProviderParties() {
        if (serviceProviderParties == null) {
            serviceProviderParties = new ArrayList<ServiceProviderParty>();
        }
        return this.serviceProviderParties;
    }

    /**
     * Gets the value of the powerOfAttorneies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerOfAttorneies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerOfAttorneies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerOfAttorney }
     * 
     * 
     */
    public List<PowerOfAttorney> getPowerOfAttorneies() {
        if (powerOfAttorneies == null) {
            powerOfAttorneies = new ArrayList<PowerOfAttorney>();
        }
        return this.powerOfAttorneies;
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

}
