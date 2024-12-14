//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalForm;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalFormCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.EmployeeQuantity;
import com.picoto.jaxb.ubl.common.cbc.OperatingYearsQuantity;
import com.picoto.jaxb.ubl.common.cbc.PersonalSituation;


/**
 * <p>Clase Java para TendererQualificationRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TendererQualificationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredBusinessClassificationScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SpecificTendererRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererQualificationRequestType", propOrder = {
    "companyLegalFormCode",
    "companyLegalForm",
    "personalSituations",
    "operatingYearsQuantity",
    "employeeQuantity",
    "descriptions",
    "requiredBusinessClassificationSchemes",
    "technicalEvaluationCriterions",
    "financialEvaluationCriterions",
    "specificTendererRequirements",
    "economicOperatorRoles"
})
@XmlRootElement(name = "TendererQualificationRequest")
public class TendererQualificationRequest {

    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalForm companyLegalForm;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PersonalSituation> personalSituations;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OperatingYearsQuantity operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmployeeQuantity employeeQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "RequiredBusinessClassificationScheme")
    protected List<ClassificationSchemeType> requiredBusinessClassificationSchemes;
    @XmlElement(name = "TechnicalEvaluationCriterion")
    protected List<EvaluationCriterionType> technicalEvaluationCriterions;
    @XmlElement(name = "FinancialEvaluationCriterion")
    protected List<EvaluationCriterionType> financialEvaluationCriterions;
    @XmlElement(name = "SpecificTendererRequirement")
    protected List<TendererRequirementType> specificTendererRequirements;
    @XmlElement(name = "EconomicOperatorRole")
    protected List<EconomicOperatorRole> economicOperatorRoles;

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
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the requiredBusinessClassificationSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredBusinessClassificationSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredBusinessClassificationSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSchemeType }
     * 
     * 
     */
    public List<ClassificationSchemeType> getRequiredBusinessClassificationSchemes() {
        if (requiredBusinessClassificationSchemes == null) {
            requiredBusinessClassificationSchemes = new ArrayList<ClassificationSchemeType>();
        }
        return this.requiredBusinessClassificationSchemes;
    }

    /**
     * Gets the value of the technicalEvaluationCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalEvaluationCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalEvaluationCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getTechnicalEvaluationCriterions() {
        if (technicalEvaluationCriterions == null) {
            technicalEvaluationCriterions = new ArrayList<EvaluationCriterionType>();
        }
        return this.technicalEvaluationCriterions;
    }

    /**
     * Gets the value of the financialEvaluationCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialEvaluationCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialEvaluationCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getFinancialEvaluationCriterions() {
        if (financialEvaluationCriterions == null) {
            financialEvaluationCriterions = new ArrayList<EvaluationCriterionType>();
        }
        return this.financialEvaluationCriterions;
    }

    /**
     * Gets the value of the specificTendererRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificTendererRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificTendererRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererRequirementType }
     * 
     * 
     */
    public List<TendererRequirementType> getSpecificTendererRequirements() {
        if (specificTendererRequirements == null) {
            specificTendererRequirements = new ArrayList<TendererRequirementType>();
        }
        return this.specificTendererRequirements;
    }

    /**
     * Gets the value of the economicOperatorRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorRole }
     * 
     * 
     */
    public List<EconomicOperatorRole> getEconomicOperatorRoles() {
        if (economicOperatorRoles == null) {
            economicOperatorRoles = new ArrayList<EconomicOperatorRole>();
        }
        return this.economicOperatorRoles;
    }

}
