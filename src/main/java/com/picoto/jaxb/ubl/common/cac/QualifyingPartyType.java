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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BusinessClassificationEvidenceID;
import com.picoto.jaxb.ubl.common.cbc.BusinessIdentityEvidenceID;
import com.picoto.jaxb.ubl.common.cbc.EmployeeQuantity;
import com.picoto.jaxb.ubl.common.cbc.OperatingYearsQuantity;
import com.picoto.jaxb.ubl.common.cbc.ParticipationPercent;
import com.picoto.jaxb.ubl.common.cbc.PersonalSituation;
import com.picoto.jaxb.ubl.common.cbc.TendererRoleCode;


/**
 * <p>Clase Java para QualifyingPartyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParticipationPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessClassificationEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessIdentityEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TendererRoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BusinessClassificationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CompletedTask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Declaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPartyType", propOrder = {
    "participationPercent",
    "personalSituations",
    "operatingYearsQuantity",
    "employeeQuantity",
    "businessClassificationEvidenceID",
    "businessIdentityEvidenceID",
    "tendererRoleCode",
    "businessClassificationScheme",
    "technicalCapabilities",
    "financialCapabilities",
    "completedTasks",
    "declarations",
    "party",
    "economicOperatorRole"
})
public class QualifyingPartyType {

    @XmlElement(name = "ParticipationPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ParticipationPercent participationPercent;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PersonalSituation> personalSituations;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OperatingYearsQuantity operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmployeeQuantity employeeQuantity;
    @XmlElement(name = "BusinessClassificationEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BusinessClassificationEvidenceID businessClassificationEvidenceID;
    @XmlElement(name = "BusinessIdentityEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BusinessIdentityEvidenceID businessIdentityEvidenceID;
    @XmlElement(name = "TendererRoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TendererRoleCode tendererRoleCode;
    @XmlElement(name = "BusinessClassificationScheme")
    protected ClassificationSchemeType businessClassificationScheme;
    @XmlElement(name = "TechnicalCapability")
    protected List<CapabilityType> technicalCapabilities;
    @XmlElement(name = "FinancialCapability")
    protected List<CapabilityType> financialCapabilities;
    @XmlElement(name = "CompletedTask")
    protected List<CompletedTask> completedTasks;
    @XmlElement(name = "Declaration")
    protected List<Declaration> declarations;
    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "EconomicOperatorRole")
    protected EconomicOperatorRole economicOperatorRole;

    /**
     * Obtiene el valor de la propiedad participationPercent.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationPercent }
     *     
     */
    public ParticipationPercent getParticipationPercent() {
        return participationPercent;
    }

    /**
     * Define el valor de la propiedad participationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationPercent }
     *     
     */
    public void setParticipationPercent(ParticipationPercent value) {
        this.participationPercent = value;
    }

    /**
     * Gets the value of the personalSituations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSituations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSituations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSituation }
     * 
     * 
     */
    public List<PersonalSituation> getPersonalSituations() {
        if (personalSituations == null) {
            personalSituations = new ArrayList<PersonalSituation>();
        }
        return this.personalSituations;
    }

    /**
     * Obtiene el valor de la propiedad operatingYearsQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OperatingYearsQuantity }
     *     
     */
    public OperatingYearsQuantity getOperatingYearsQuantity() {
        return operatingYearsQuantity;
    }

    /**
     * Define el valor de la propiedad operatingYearsQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingYearsQuantity }
     *     
     */
    public void setOperatingYearsQuantity(OperatingYearsQuantity value) {
        this.operatingYearsQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeQuantity.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeQuantity }
     *     
     */
    public EmployeeQuantity getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Define el valor de la propiedad employeeQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeQuantity }
     *     
     */
    public void setEmployeeQuantity(EmployeeQuantity value) {
        this.employeeQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad businessClassificationEvidenceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessClassificationEvidenceID }
     *     
     */
    public BusinessClassificationEvidenceID getBusinessClassificationEvidenceID() {
        return businessClassificationEvidenceID;
    }

    /**
     * Define el valor de la propiedad businessClassificationEvidenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessClassificationEvidenceID }
     *     
     */
    public void setBusinessClassificationEvidenceID(BusinessClassificationEvidenceID value) {
        this.businessClassificationEvidenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad businessIdentityEvidenceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessIdentityEvidenceID }
     *     
     */
    public BusinessIdentityEvidenceID getBusinessIdentityEvidenceID() {
        return businessIdentityEvidenceID;
    }

    /**
     * Define el valor de la propiedad businessIdentityEvidenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessIdentityEvidenceID }
     *     
     */
    public void setBusinessIdentityEvidenceID(BusinessIdentityEvidenceID value) {
        this.businessIdentityEvidenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad tendererRoleCode.
     * 
     * @return
     *     possible object is
     *     {@link TendererRoleCode }
     *     
     */
    public TendererRoleCode getTendererRoleCode() {
        return tendererRoleCode;
    }

    /**
     * Define el valor de la propiedad tendererRoleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TendererRoleCode }
     *     
     */
    public void setTendererRoleCode(TendererRoleCode value) {
        this.tendererRoleCode = value;
    }

    /**
     * Obtiene el valor de la propiedad businessClassificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public ClassificationSchemeType getBusinessClassificationScheme() {
        return businessClassificationScheme;
    }

    /**
     * Define el valor de la propiedad businessClassificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public void setBusinessClassificationScheme(ClassificationSchemeType value) {
        this.businessClassificationScheme = value;
    }

    /**
     * Gets the value of the technicalCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getTechnicalCapabilities() {
        if (technicalCapabilities == null) {
            technicalCapabilities = new ArrayList<CapabilityType>();
        }
        return this.technicalCapabilities;
    }

    /**
     * Gets the value of the financialCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getFinancialCapabilities() {
        if (financialCapabilities == null) {
            financialCapabilities = new ArrayList<CapabilityType>();
        }
        return this.financialCapabilities;
    }

    /**
     * Gets the value of the completedTasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedTasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedTask }
     * 
     * 
     */
    public List<CompletedTask> getCompletedTasks() {
        if (completedTasks == null) {
            completedTasks = new ArrayList<CompletedTask>();
        }
        return this.completedTasks;
    }

    /**
     * Gets the value of the declarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration }
     * 
     * 
     */
    public List<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new ArrayList<Declaration>();
        }
        return this.declarations;
    }

    /**
     * Obtiene el valor de la propiedad party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Define el valor de la propiedad party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Obtiene el valor de la propiedad economicOperatorRole.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public EconomicOperatorRole getEconomicOperatorRole() {
        return economicOperatorRole;
    }

    /**
     * Define el valor de la propiedad economicOperatorRole.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public void setEconomicOperatorRole(EconomicOperatorRole value) {
        this.economicOperatorRole = value;
    }

}
