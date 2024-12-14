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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AcceptedVariantsDescription;
import com.picoto.jaxb.ubl.common.cbc.AdditionalConditions;
import com.picoto.jaxb.ubl.common.cbc.AwardingMethodTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentationFeeAmount;
import com.picoto.jaxb.ubl.common.cbc.EconomicOperatorRegistryURI;
import com.picoto.jaxb.ubl.common.cbc.FundingProgram;
import com.picoto.jaxb.ubl.common.cbc.FundingProgramCode;
import com.picoto.jaxb.ubl.common.cbc.LatestSecurityClearanceDate;
import com.picoto.jaxb.ubl.common.cbc.MaximumAdvertisementAmount;
import com.picoto.jaxb.ubl.common.cbc.MaximumVariantQuantity;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.OtherConditionsIndicator;
import com.picoto.jaxb.ubl.common.cbc.PaymentFrequencyCode;
import com.picoto.jaxb.ubl.common.cbc.PriceEvaluationCode;
import com.picoto.jaxb.ubl.common.cbc.PriceRevisionFormulaDescription;
import com.picoto.jaxb.ubl.common.cbc.RequiredCurriculaIndicator;
import com.picoto.jaxb.ubl.common.cbc.VariantConstraintIndicator;


/**
 * <p>Clase Java para TenderingTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TenderingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingMethodTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceEvaluationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumVariantQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AcceptedVariantsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceRevisionFormulaDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgramCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgram" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentFrequencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EconomicOperatorRegistryURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCurriculaIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherConditionsIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestSecurityClearanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentationFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredFinancialGuarantee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FiscalLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmploymentLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractualDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TendererQualificationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowedSubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderPreparation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExecutionRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalInformationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderRecipientParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderEvaluationParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractAcceptancePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AppealTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BudgetAccountLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedNoticeDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingTermsType", propOrder = {
    "awardingMethodTypeCode",
    "priceEvaluationCode",
    "maximumVariantQuantity",
    "variantConstraintIndicator",
    "acceptedVariantsDescriptions",
    "priceRevisionFormulaDescriptions",
    "fundingProgramCode",
    "fundingPrograms",
    "maximumAdvertisementAmount",
    "notes",
    "paymentFrequencyCode",
    "economicOperatorRegistryURI",
    "requiredCurriculaIndicator",
    "otherConditionsIndicator",
    "additionalConditions",
    "latestSecurityClearanceDate",
    "documentationFeeAmount",
    "penaltyClauses",
    "requiredFinancialGuarantees",
    "procurementLegislationDocumentReference",
    "fiscalLegislationDocumentReference",
    "environmentalLegislationDocumentReference",
    "employmentLegislationDocumentReference",
    "contractualDocumentReferences",
    "callForTendersDocumentReference",
    "warrantyValidityPeriod",
    "paymentTerms",
    "tendererQualificationRequests",
    "allowedSubcontractTerms",
    "tenderPreparations",
    "contractExecutionRequirements",
    "awardingTerms",
    "additionalInformationParty",
    "documentProviderParty",
    "tenderRecipientParty",
    "contractResponsibleParty",
    "tenderEvaluationParties",
    "tenderValidityPeriod",
    "contractAcceptancePeriod",
    "appealTerms",
    "languages",
    "budgetAccountLines",
    "replacedNoticeDocumentReference"
})
@XmlRootElement(name = "TenderingTerms")
public class TenderingTerms {

    @XmlElement(name = "AwardingMethodTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardingMethodTypeCode awardingMethodTypeCode;
    @XmlElement(name = "PriceEvaluationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceEvaluationCode priceEvaluationCode;
    @XmlElement(name = "MaximumVariantQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumVariantQuantity maximumVariantQuantity;
    @XmlElement(name = "VariantConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VariantConstraintIndicator variantConstraintIndicator;
    @XmlElement(name = "AcceptedVariantsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AcceptedVariantsDescription> acceptedVariantsDescriptions;
    @XmlElement(name = "PriceRevisionFormulaDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PriceRevisionFormulaDescription> priceRevisionFormulaDescriptions;
    @XmlElement(name = "FundingProgramCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FundingProgramCode fundingProgramCode;
    @XmlElement(name = "FundingProgram", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FundingProgram> fundingPrograms;
    @XmlElement(name = "MaximumAdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAdvertisementAmount maximumAdvertisementAmount;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "PaymentFrequencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentFrequencyCode paymentFrequencyCode;
    @XmlElement(name = "EconomicOperatorRegistryURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EconomicOperatorRegistryURI economicOperatorRegistryURI;
    @XmlElement(name = "RequiredCurriculaIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredCurriculaIndicator requiredCurriculaIndicator;
    @XmlElement(name = "OtherConditionsIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OtherConditionsIndicator otherConditionsIndicator;
    @XmlElement(name = "AdditionalConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalConditions> additionalConditions;
    @XmlElement(name = "LatestSecurityClearanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestSecurityClearanceDate latestSecurityClearanceDate;
    @XmlElement(name = "DocumentationFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentationFeeAmount documentationFeeAmount;
    @XmlElement(name = "PenaltyClause")
    protected List<ClauseType> penaltyClauses;
    @XmlElement(name = "RequiredFinancialGuarantee")
    protected List<FinancialGuaranteeType> requiredFinancialGuarantees;
    @XmlElement(name = "ProcurementLegislationDocumentReference")
    protected DocumentReferenceType procurementLegislationDocumentReference;
    @XmlElement(name = "FiscalLegislationDocumentReference")
    protected DocumentReferenceType fiscalLegislationDocumentReference;
    @XmlElement(name = "EnvironmentalLegislationDocumentReference")
    protected DocumentReferenceType environmentalLegislationDocumentReference;
    @XmlElement(name = "EmploymentLegislationDocumentReference")
    protected DocumentReferenceType employmentLegislationDocumentReference;
    @XmlElement(name = "ContractualDocumentReference")
    protected List<DocumentReferenceType> contractualDocumentReferences;
    @XmlElement(name = "CallForTendersDocumentReference")
    protected DocumentReferenceType callForTendersDocumentReference;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "PaymentTerms")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "TendererQualificationRequest")
    protected List<TendererQualificationRequest> tendererQualificationRequests;
    @XmlElement(name = "AllowedSubcontractTerms")
    protected List<SubcontractTermsType> allowedSubcontractTerms;
    @XmlElement(name = "TenderPreparation")
    protected List<TenderPreparation> tenderPreparations;
    @XmlElement(name = "ContractExecutionRequirement")
    protected List<ContractExecutionRequirement> contractExecutionRequirements;
    @XmlElement(name = "AwardingTerms")
    protected AwardingTerms awardingTerms;
    @XmlElement(name = "AdditionalInformationParty")
    protected PartyType additionalInformationParty;
    @XmlElement(name = "DocumentProviderParty")
    protected PartyType documentProviderParty;
    @XmlElement(name = "TenderRecipientParty")
    protected PartyType tenderRecipientParty;
    @XmlElement(name = "ContractResponsibleParty")
    protected PartyType contractResponsibleParty;
    @XmlElement(name = "TenderEvaluationParty")
    protected List<PartyType> tenderEvaluationParties;
    @XmlElement(name = "TenderValidityPeriod")
    protected PeriodType tenderValidityPeriod;
    @XmlElement(name = "ContractAcceptancePeriod")
    protected PeriodType contractAcceptancePeriod;
    @XmlElement(name = "AppealTerms")
    protected AppealTerms appealTerms;
    @XmlElement(name = "Language")
    protected List<LanguageType> languages;
    @XmlElement(name = "BudgetAccountLine")
    protected List<BudgetAccountLine> budgetAccountLines;
    @XmlElement(name = "ReplacedNoticeDocumentReference")
    protected DocumentReferenceType replacedNoticeDocumentReference;

    /**
     * Obtiene el valor de la propiedad awardingMethodTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AwardingMethodTypeCode }
     *     
     */
    public AwardingMethodTypeCode getAwardingMethodTypeCode() {
        return awardingMethodTypeCode;
    }

    /**
     * Define el valor de la propiedad awardingMethodTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingMethodTypeCode }
     *     
     */
    public void setAwardingMethodTypeCode(AwardingMethodTypeCode value) {
        this.awardingMethodTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad priceEvaluationCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceEvaluationCode }
     *     
     */
    public PriceEvaluationCode getPriceEvaluationCode() {
        return priceEvaluationCode;
    }

    /**
     * Define el valor de la propiedad priceEvaluationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceEvaluationCode }
     *     
     */
    public void setPriceEvaluationCode(PriceEvaluationCode value) {
        this.priceEvaluationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumVariantQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumVariantQuantity }
     *     
     */
    public MaximumVariantQuantity getMaximumVariantQuantity() {
        return maximumVariantQuantity;
    }

    /**
     * Define el valor de la propiedad maximumVariantQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumVariantQuantity }
     *     
     */
    public void setMaximumVariantQuantity(MaximumVariantQuantity value) {
        this.maximumVariantQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad variantConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link VariantConstraintIndicator }
     *     
     */
    public VariantConstraintIndicator getVariantConstraintIndicator() {
        return variantConstraintIndicator;
    }

    /**
     * Define el valor de la propiedad variantConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantConstraintIndicator }
     *     
     */
    public void setVariantConstraintIndicator(VariantConstraintIndicator value) {
        this.variantConstraintIndicator = value;
    }

    /**
     * Gets the value of the acceptedVariantsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedVariantsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedVariantsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedVariantsDescription }
     * 
     * 
     */
    public List<AcceptedVariantsDescription> getAcceptedVariantsDescriptions() {
        if (acceptedVariantsDescriptions == null) {
            acceptedVariantsDescriptions = new ArrayList<AcceptedVariantsDescription>();
        }
        return this.acceptedVariantsDescriptions;
    }

    /**
     * Gets the value of the priceRevisionFormulaDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRevisionFormulaDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRevisionFormulaDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRevisionFormulaDescription }
     * 
     * 
     */
    public List<PriceRevisionFormulaDescription> getPriceRevisionFormulaDescriptions() {
        if (priceRevisionFormulaDescriptions == null) {
            priceRevisionFormulaDescriptions = new ArrayList<PriceRevisionFormulaDescription>();
        }
        return this.priceRevisionFormulaDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad fundingProgramCode.
     * 
     * @return
     *     possible object is
     *     {@link FundingProgramCode }
     *     
     */
    public FundingProgramCode getFundingProgramCode() {
        return fundingProgramCode;
    }

    /**
     * Define el valor de la propiedad fundingProgramCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingProgramCode }
     *     
     */
    public void setFundingProgramCode(FundingProgramCode value) {
        this.fundingProgramCode = value;
    }

    /**
     * Gets the value of the fundingPrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingPrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingProgram }
     * 
     * 
     */
    public List<FundingProgram> getFundingPrograms() {
        if (fundingPrograms == null) {
            fundingPrograms = new ArrayList<FundingProgram>();
        }
        return this.fundingPrograms;
    }

    /**
     * Obtiene el valor de la propiedad maximumAdvertisementAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAdvertisementAmount }
     *     
     */
    public MaximumAdvertisementAmount getMaximumAdvertisementAmount() {
        return maximumAdvertisementAmount;
    }

    /**
     * Define el valor de la propiedad maximumAdvertisementAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAdvertisementAmount }
     *     
     */
    public void setMaximumAdvertisementAmount(MaximumAdvertisementAmount value) {
        this.maximumAdvertisementAmount = value;
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
     * Obtiene el valor de la propiedad paymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequencyCode }
     *     
     */
    public PaymentFrequencyCode getPaymentFrequencyCode() {
        return paymentFrequencyCode;
    }

    /**
     * Define el valor de la propiedad paymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequencyCode }
     *     
     */
    public void setPaymentFrequencyCode(PaymentFrequencyCode value) {
        this.paymentFrequencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad economicOperatorRegistryURI.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRegistryURI }
     *     
     */
    public EconomicOperatorRegistryURI getEconomicOperatorRegistryURI() {
        return economicOperatorRegistryURI;
    }

    /**
     * Define el valor de la propiedad economicOperatorRegistryURI.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRegistryURI }
     *     
     */
    public void setEconomicOperatorRegistryURI(EconomicOperatorRegistryURI value) {
        this.economicOperatorRegistryURI = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredCurriculaIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCurriculaIndicator }
     *     
     */
    public RequiredCurriculaIndicator getRequiredCurriculaIndicator() {
        return requiredCurriculaIndicator;
    }

    /**
     * Define el valor de la propiedad requiredCurriculaIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCurriculaIndicator }
     *     
     */
    public void setRequiredCurriculaIndicator(RequiredCurriculaIndicator value) {
        this.requiredCurriculaIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherConditionsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OtherConditionsIndicator }
     *     
     */
    public OtherConditionsIndicator getOtherConditionsIndicator() {
        return otherConditionsIndicator;
    }

    /**
     * Define el valor de la propiedad otherConditionsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherConditionsIndicator }
     *     
     */
    public void setOtherConditionsIndicator(OtherConditionsIndicator value) {
        this.otherConditionsIndicator = value;
    }

    /**
     * Gets the value of the additionalConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConditions }
     * 
     * 
     */
    public List<AdditionalConditions> getAdditionalConditions() {
        if (additionalConditions == null) {
            additionalConditions = new ArrayList<AdditionalConditions>();
        }
        return this.additionalConditions;
    }

    /**
     * Obtiene el valor de la propiedad latestSecurityClearanceDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestSecurityClearanceDate }
     *     
     */
    public LatestSecurityClearanceDate getLatestSecurityClearanceDate() {
        return latestSecurityClearanceDate;
    }

    /**
     * Define el valor de la propiedad latestSecurityClearanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestSecurityClearanceDate }
     *     
     */
    public void setLatestSecurityClearanceDate(LatestSecurityClearanceDate value) {
        this.latestSecurityClearanceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad documentationFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationFeeAmount }
     *     
     */
    public DocumentationFeeAmount getDocumentationFeeAmount() {
        return documentationFeeAmount;
    }

    /**
     * Define el valor de la propiedad documentationFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationFeeAmount }
     *     
     */
    public void setDocumentationFeeAmount(DocumentationFeeAmount value) {
        this.documentationFeeAmount = value;
    }

    /**
     * Gets the value of the penaltyClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getPenaltyClauses() {
        if (penaltyClauses == null) {
            penaltyClauses = new ArrayList<ClauseType>();
        }
        return this.penaltyClauses;
    }

    /**
     * Gets the value of the requiredFinancialGuarantees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredFinancialGuarantees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredFinancialGuarantees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialGuaranteeType }
     * 
     * 
     */
    public List<FinancialGuaranteeType> getRequiredFinancialGuarantees() {
        if (requiredFinancialGuarantees == null) {
            requiredFinancialGuarantees = new ArrayList<FinancialGuaranteeType>();
        }
        return this.requiredFinancialGuarantees;
    }

    /**
     * Obtiene el valor de la propiedad procurementLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getProcurementLegislationDocumentReference() {
        return procurementLegislationDocumentReference;
    }

    /**
     * Define el valor de la propiedad procurementLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setProcurementLegislationDocumentReference(DocumentReferenceType value) {
        this.procurementLegislationDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getFiscalLegislationDocumentReference() {
        return fiscalLegislationDocumentReference;
    }

    /**
     * Define el valor de la propiedad fiscalLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setFiscalLegislationDocumentReference(DocumentReferenceType value) {
        this.fiscalLegislationDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad environmentalLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getEnvironmentalLegislationDocumentReference() {
        return environmentalLegislationDocumentReference;
    }

    /**
     * Define el valor de la propiedad environmentalLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setEnvironmentalLegislationDocumentReference(DocumentReferenceType value) {
        this.environmentalLegislationDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad employmentLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getEmploymentLegislationDocumentReference() {
        return employmentLegislationDocumentReference;
    }

    /**
     * Define el valor de la propiedad employmentLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setEmploymentLegislationDocumentReference(DocumentReferenceType value) {
        this.employmentLegislationDocumentReference = value;
    }

    /**
     * Gets the value of the contractualDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getContractualDocumentReferences() {
        if (contractualDocumentReferences == null) {
            contractualDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.contractualDocumentReferences;
    }

    /**
     * Obtiene el valor de la propiedad callForTendersDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCallForTendersDocumentReference() {
        return callForTendersDocumentReference;
    }

    /**
     * Define el valor de la propiedad callForTendersDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCallForTendersDocumentReference(DocumentReferenceType value) {
        this.callForTendersDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad warrantyValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Define el valor de la propiedad warrantyValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the tendererQualificationRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tendererQualificationRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTendererQualificationRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererQualificationRequest }
     * 
     * 
     */
    public List<TendererQualificationRequest> getTendererQualificationRequests() {
        if (tendererQualificationRequests == null) {
            tendererQualificationRequests = new ArrayList<TendererQualificationRequest>();
        }
        return this.tendererQualificationRequests;
    }

    /**
     * Gets the value of the allowedSubcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSubcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getAllowedSubcontractTerms() {
        if (allowedSubcontractTerms == null) {
            allowedSubcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.allowedSubcontractTerms;
    }

    /**
     * Gets the value of the tenderPreparations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderPreparations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderPreparations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderPreparation }
     * 
     * 
     */
    public List<TenderPreparation> getTenderPreparations() {
        if (tenderPreparations == null) {
            tenderPreparations = new ArrayList<TenderPreparation>();
        }
        return this.tenderPreparations;
    }

    /**
     * Gets the value of the contractExecutionRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractExecutionRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractExecutionRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractExecutionRequirement }
     * 
     * 
     */
    public List<ContractExecutionRequirement> getContractExecutionRequirements() {
        if (contractExecutionRequirements == null) {
            contractExecutionRequirements = new ArrayList<ContractExecutionRequirement>();
        }
        return this.contractExecutionRequirements;
    }

    /**
     * Obtiene el valor de la propiedad awardingTerms.
     * 
     * @return
     *     possible object is
     *     {@link AwardingTerms }
     *     
     */
    public AwardingTerms getAwardingTerms() {
        return awardingTerms;
    }

    /**
     * Define el valor de la propiedad awardingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingTerms }
     *     
     */
    public void setAwardingTerms(AwardingTerms value) {
        this.awardingTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInformationParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAdditionalInformationParty() {
        return additionalInformationParty;
    }

    /**
     * Define el valor de la propiedad additionalInformationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAdditionalInformationParty(PartyType value) {
        this.additionalInformationParty = value;
    }

    /**
     * Obtiene el valor de la propiedad documentProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDocumentProviderParty() {
        return documentProviderParty;
    }

    /**
     * Define el valor de la propiedad documentProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDocumentProviderParty(PartyType value) {
        this.documentProviderParty = value;
    }

    /**
     * Obtiene el valor de la propiedad tenderRecipientParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTenderRecipientParty() {
        return tenderRecipientParty;
    }

    /**
     * Define el valor de la propiedad tenderRecipientParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTenderRecipientParty(PartyType value) {
        this.tenderRecipientParty = value;
    }

    /**
     * Obtiene el valor de la propiedad contractResponsibleParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContractResponsibleParty() {
        return contractResponsibleParty;
    }

    /**
     * Define el valor de la propiedad contractResponsibleParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContractResponsibleParty(PartyType value) {
        this.contractResponsibleParty = value;
    }

    /**
     * Gets the value of the tenderEvaluationParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderEvaluationParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderEvaluationParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getTenderEvaluationParties() {
        if (tenderEvaluationParties == null) {
            tenderEvaluationParties = new ArrayList<PartyType>();
        }
        return this.tenderEvaluationParties;
    }

    /**
     * Obtiene el valor de la propiedad tenderValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderValidityPeriod() {
        return tenderValidityPeriod;
    }

    /**
     * Define el valor de la propiedad tenderValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderValidityPeriod(PeriodType value) {
        this.tenderValidityPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad contractAcceptancePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractAcceptancePeriod() {
        return contractAcceptancePeriod;
    }

    /**
     * Define el valor de la propiedad contractAcceptancePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractAcceptancePeriod(PeriodType value) {
        this.contractAcceptancePeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad appealTerms.
     * 
     * @return
     *     possible object is
     *     {@link AppealTerms }
     *     
     */
    public AppealTerms getAppealTerms() {
        return appealTerms;
    }

    /**
     * Define el valor de la propiedad appealTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealTerms }
     *     
     */
    public void setAppealTerms(AppealTerms value) {
        this.appealTerms = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageType>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the budgetAccountLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetAccountLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetAccountLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetAccountLine }
     * 
     * 
     */
    public List<BudgetAccountLine> getBudgetAccountLines() {
        if (budgetAccountLines == null) {
            budgetAccountLines = new ArrayList<BudgetAccountLine>();
        }
        return this.budgetAccountLines;
    }

    /**
     * Obtiene el valor de la propiedad replacedNoticeDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReplacedNoticeDocumentReference() {
        return replacedNoticeDocumentReference;
    }

    /**
     * Define el valor de la propiedad replacedNoticeDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReplacedNoticeDocumentReference(DocumentReferenceType value) {
        this.replacedNoticeDocumentReference = value;
    }

}
