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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CandidateReductionConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.ContractingSystemCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ExpenseCode;
import com.picoto.jaxb.ubl.common.cbc.GovernmentAgreementConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.NegotiationDescription;
import com.picoto.jaxb.ubl.common.cbc.OriginalContractingSystemID;
import com.picoto.jaxb.ubl.common.cbc.PartPresentationCode;
import com.picoto.jaxb.ubl.common.cbc.ProcedureCode;
import com.picoto.jaxb.ubl.common.cbc.SubmissionMethodCode;
import com.picoto.jaxb.ubl.common.cbc.UrgencyCode;


/**
 * <p>Clase Java para TenderingProcessType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TenderingProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OriginalContractingSystemID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NegotiationDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcedureCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UrgencyCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpenseCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartPresentationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractingSystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CandidateReductionConstraintIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GovernmentAgreementConstraintIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentAvailabilityPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderSubmissionDeadlinePeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvitationSubmissionPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipationRequestReceptionPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NoticeDocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcessJustification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OpenTenderEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AuctionTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FrameworkAgreement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingProcessType", propOrder = {
    "id",
    "originalContractingSystemID",
    "descriptions",
    "negotiationDescriptions",
    "procedureCode",
    "urgencyCode",
    "expenseCode",
    "partPresentationCode",
    "contractingSystemCode",
    "submissionMethodCode",
    "candidateReductionConstraintIndicator",
    "governmentAgreementConstraintIndicator",
    "documentAvailabilityPeriod",
    "tenderSubmissionDeadlinePeriod",
    "invitationSubmissionPeriod",
    "participationRequestReceptionPeriod",
    "noticeDocumentReferences",
    "additionalDocumentReferences",
    "processJustifications",
    "economicOperatorShortList",
    "openTenderEvents",
    "auctionTerms",
    "frameworkAgreement"
})
@XmlRootElement(name = "TenderingProcess")
public class TenderingProcess {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "OriginalContractingSystemID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OriginalContractingSystemID originalContractingSystemID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "NegotiationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NegotiationDescription> negotiationDescriptions;
    @XmlElement(name = "ProcedureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcedureCode procedureCode;
    @XmlElement(name = "UrgencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UrgencyCode urgencyCode;
    @XmlElement(name = "ExpenseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpenseCode expenseCode;
    @XmlElement(name = "PartPresentationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartPresentationCode partPresentationCode;
    @XmlElement(name = "ContractingSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractingSystemCode contractingSystemCode;
    @XmlElement(name = "SubmissionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionMethodCode submissionMethodCode;
    @XmlElement(name = "CandidateReductionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CandidateReductionConstraintIndicator candidateReductionConstraintIndicator;
    @XmlElement(name = "GovernmentAgreementConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GovernmentAgreementConstraintIndicator governmentAgreementConstraintIndicator;
    @XmlElement(name = "DocumentAvailabilityPeriod")
    protected PeriodType documentAvailabilityPeriod;
    @XmlElement(name = "TenderSubmissionDeadlinePeriod")
    protected PeriodType tenderSubmissionDeadlinePeriod;
    @XmlElement(name = "InvitationSubmissionPeriod")
    protected PeriodType invitationSubmissionPeriod;
    @XmlElement(name = "ParticipationRequestReceptionPeriod")
    protected PeriodType participationRequestReceptionPeriod;
    @XmlElement(name = "NoticeDocumentReference")
    protected List<DocumentReferenceType> noticeDocumentReferences;
    @XmlElement(name = "AdditionalDocumentReference")
    protected List<DocumentReferenceType> additionalDocumentReferences;
    @XmlElement(name = "ProcessJustification")
    protected List<ProcessJustification> processJustifications;
    @XmlElement(name = "EconomicOperatorShortList")
    protected EconomicOperatorShortList economicOperatorShortList;
    @XmlElement(name = "OpenTenderEvent")
    protected List<EventType> openTenderEvents;
    @XmlElement(name = "AuctionTerms")
    protected AuctionTerms auctionTerms;
    @XmlElement(name = "FrameworkAgreement")
    protected FrameworkAgreement frameworkAgreement;

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
     * Obtiene el valor de la propiedad originalContractingSystemID.
     * 
     * @return
     *     possible object is
     *     {@link OriginalContractingSystemID }
     *     
     */
    public OriginalContractingSystemID getOriginalContractingSystemID() {
        return originalContractingSystemID;
    }

    /**
     * Define el valor de la propiedad originalContractingSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalContractingSystemID }
     *     
     */
    public void setOriginalContractingSystemID(OriginalContractingSystemID value) {
        this.originalContractingSystemID = value;
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
     * Gets the value of the negotiationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiationDescription }
     * 
     * 
     */
    public List<NegotiationDescription> getNegotiationDescriptions() {
        if (negotiationDescriptions == null) {
            negotiationDescriptions = new ArrayList<NegotiationDescription>();
        }
        return this.negotiationDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad procedureCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCode }
     *     
     */
    public ProcedureCode getProcedureCode() {
        return procedureCode;
    }

    /**
     * Define el valor de la propiedad procedureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCode }
     *     
     */
    public void setProcedureCode(ProcedureCode value) {
        this.procedureCode = value;
    }

    /**
     * Obtiene el valor de la propiedad urgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyCode }
     *     
     */
    public UrgencyCode getUrgencyCode() {
        return urgencyCode;
    }

    /**
     * Define el valor de la propiedad urgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyCode }
     *     
     */
    public void setUrgencyCode(UrgencyCode value) {
        this.urgencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad expenseCode.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCode }
     *     
     */
    public ExpenseCode getExpenseCode() {
        return expenseCode;
    }

    /**
     * Define el valor de la propiedad expenseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCode }
     *     
     */
    public void setExpenseCode(ExpenseCode value) {
        this.expenseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad partPresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link PartPresentationCode }
     *     
     */
    public PartPresentationCode getPartPresentationCode() {
        return partPresentationCode;
    }

    /**
     * Define el valor de la propiedad partPresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPresentationCode }
     *     
     */
    public void setPartPresentationCode(PartPresentationCode value) {
        this.partPresentationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contractingSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link ContractingSystemCode }
     *     
     */
    public ContractingSystemCode getContractingSystemCode() {
        return contractingSystemCode;
    }

    /**
     * Define el valor de la propiedad contractingSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingSystemCode }
     *     
     */
    public void setContractingSystemCode(ContractingSystemCode value) {
        this.contractingSystemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad submissionMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionMethodCode }
     *     
     */
    public SubmissionMethodCode getSubmissionMethodCode() {
        return submissionMethodCode;
    }

    /**
     * Define el valor de la propiedad submissionMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionMethodCode }
     *     
     */
    public void setSubmissionMethodCode(SubmissionMethodCode value) {
        this.submissionMethodCode = value;
    }

    /**
     * Obtiene el valor de la propiedad candidateReductionConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CandidateReductionConstraintIndicator }
     *     
     */
    public CandidateReductionConstraintIndicator getCandidateReductionConstraintIndicator() {
        return candidateReductionConstraintIndicator;
    }

    /**
     * Define el valor de la propiedad candidateReductionConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateReductionConstraintIndicator }
     *     
     */
    public void setCandidateReductionConstraintIndicator(CandidateReductionConstraintIndicator value) {
        this.candidateReductionConstraintIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad governmentAgreementConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentAgreementConstraintIndicator }
     *     
     */
    public GovernmentAgreementConstraintIndicator getGovernmentAgreementConstraintIndicator() {
        return governmentAgreementConstraintIndicator;
    }

    /**
     * Define el valor de la propiedad governmentAgreementConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentAgreementConstraintIndicator }
     *     
     */
    public void setGovernmentAgreementConstraintIndicator(GovernmentAgreementConstraintIndicator value) {
        this.governmentAgreementConstraintIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad documentAvailabilityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDocumentAvailabilityPeriod() {
        return documentAvailabilityPeriod;
    }

    /**
     * Define el valor de la propiedad documentAvailabilityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDocumentAvailabilityPeriod(PeriodType value) {
        this.documentAvailabilityPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad tenderSubmissionDeadlinePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderSubmissionDeadlinePeriod() {
        return tenderSubmissionDeadlinePeriod;
    }

    /**
     * Define el valor de la propiedad tenderSubmissionDeadlinePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderSubmissionDeadlinePeriod(PeriodType value) {
        this.tenderSubmissionDeadlinePeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad invitationSubmissionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getInvitationSubmissionPeriod() {
        return invitationSubmissionPeriod;
    }

    /**
     * Define el valor de la propiedad invitationSubmissionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setInvitationSubmissionPeriod(PeriodType value) {
        this.invitationSubmissionPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad participationRequestReceptionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getParticipationRequestReceptionPeriod() {
        return participationRequestReceptionPeriod;
    }

    /**
     * Define el valor de la propiedad participationRequestReceptionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setParticipationRequestReceptionPeriod(PeriodType value) {
        this.participationRequestReceptionPeriod = value;
    }

    /**
     * Gets the value of the noticeDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getNoticeDocumentReferences() {
        if (noticeDocumentReferences == null) {
            noticeDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.noticeDocumentReferences;
    }

    /**
     * Gets the value of the additionalDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReferences() {
        if (additionalDocumentReferences == null) {
            additionalDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReferences;
    }

    /**
     * Gets the value of the processJustifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processJustifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessJustifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessJustification }
     * 
     * 
     */
    public List<ProcessJustification> getProcessJustifications() {
        if (processJustifications == null) {
            processJustifications = new ArrayList<ProcessJustification>();
        }
        return this.processJustifications;
    }

    /**
     * Obtiene el valor de la propiedad economicOperatorShortList.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorShortList }
     *     
     */
    public EconomicOperatorShortList getEconomicOperatorShortList() {
        return economicOperatorShortList;
    }

    /**
     * Define el valor de la propiedad economicOperatorShortList.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorShortList }
     *     
     */
    public void setEconomicOperatorShortList(EconomicOperatorShortList value) {
        this.economicOperatorShortList = value;
    }

    /**
     * Gets the value of the openTenderEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openTenderEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenTenderEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getOpenTenderEvents() {
        if (openTenderEvents == null) {
            openTenderEvents = new ArrayList<EventType>();
        }
        return this.openTenderEvents;
    }

    /**
     * Obtiene el valor de la propiedad auctionTerms.
     * 
     * @return
     *     possible object is
     *     {@link AuctionTerms }
     *     
     */
    public AuctionTerms getAuctionTerms() {
        return auctionTerms;
    }

    /**
     * Define el valor de la propiedad auctionTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionTerms }
     *     
     */
    public void setAuctionTerms(AuctionTerms value) {
        this.auctionTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad frameworkAgreement.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkAgreement }
     *     
     */
    public FrameworkAgreement getFrameworkAgreement() {
        return frameworkAgreement;
    }

    /**
     * Define el valor de la propiedad frameworkAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkAgreement }
     *     
     */
    public void setFrameworkAgreement(FrameworkAgreement value) {
        this.frameworkAgreement = value;
    }

}
