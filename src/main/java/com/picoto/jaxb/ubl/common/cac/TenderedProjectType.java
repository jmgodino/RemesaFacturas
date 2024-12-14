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
import com.picoto.jaxb.ubl.common.cbc.FeeAmount;
import com.picoto.jaxb.ubl.common.cbc.FeeDescription;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeID;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.VariantID;


/**
 * <p>Clase Java para TenderedProjectType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TenderedProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingCriterionResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderedProjectType", propOrder = {
    "variantID",
    "feeAmount",
    "feeDescriptions",
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "procurementProjectLot",
    "evidenceDocumentReferences",
    "taxTotals",
    "legalMonetaryTotal",
    "tenderLines",
    "awardingCriterionResponses"
})
public class TenderedProjectType {

    @XmlElement(name = "VariantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VariantID variantID;
    @XmlElement(name = "FeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FeeAmount feeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FeeDescription> feeDescriptions;
    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeID tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeTypeCode tenderEnvelopeTypeCode;
    @XmlElement(name = "ProcurementProjectLot")
    protected ProcurementProjectLotType procurementProjectLot;
    @XmlElement(name = "EvidenceDocumentReference")
    protected List<DocumentReferenceType> evidenceDocumentReferences;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "LegalMonetaryTotal")
    protected MonetaryTotalType legalMonetaryTotal;
    @XmlElement(name = "TenderLine")
    protected List<TenderLineType> tenderLines;
    @XmlElement(name = "AwardingCriterionResponse")
    protected List<AwardingCriterionResponseType> awardingCriterionResponses;

    /**
     * Obtiene el valor de la propiedad variantID.
     * 
     * @return
     *     possible object is
     *     {@link VariantID }
     *     
     */
    public VariantID getVariantID() {
        return variantID;
    }

    /**
     * Define el valor de la propiedad variantID.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantID }
     *     
     */
    public void setVariantID(VariantID value) {
        this.variantID = value;
    }

    /**
     * Obtiene el valor de la propiedad feeAmount.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount }
     *     
     */
    public FeeAmount getFeeAmount() {
        return feeAmount;
    }

    /**
     * Define el valor de la propiedad feeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount }
     *     
     */
    public void setFeeAmount(FeeAmount value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDescription }
     * 
     * 
     */
    public List<FeeDescription> getFeeDescriptions() {
        if (feeDescriptions == null) {
            feeDescriptions = new ArrayList<FeeDescription>();
        }
        return this.feeDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad tenderEnvelopeID.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public TenderEnvelopeID getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Define el valor de la propiedad tenderEnvelopeID.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeID value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Obtiene el valor de la propiedad tenderEnvelopeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public TenderEnvelopeTypeCode getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Define el valor de la propiedad tenderEnvelopeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCode value) {
        this.tenderEnvelopeTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementProjectLot.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public ProcurementProjectLotType getProcurementProjectLot() {
        return procurementProjectLot;
    }

    /**
     * Define el valor de la propiedad procurementProjectLot.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public void setProcurementProjectLot(ProcurementProjectLotType value) {
        this.procurementProjectLot = value;
    }

    /**
     * Gets the value of the evidenceDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getEvidenceDocumentReferences() {
        if (evidenceDocumentReferences == null) {
            evidenceDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.evidenceDocumentReferences;
    }

    /**
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Obtiene el valor de la propiedad legalMonetaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Define el valor de la propiedad legalMonetaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
    }

    /**
     * Gets the value of the tenderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderLineType }
     * 
     * 
     */
    public List<TenderLineType> getTenderLines() {
        if (tenderLines == null) {
            tenderLines = new ArrayList<TenderLineType>();
        }
        return this.tenderLines;
    }

    /**
     * Gets the value of the awardingCriterionResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterionResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterionResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionResponseType }
     * 
     * 
     */
    public List<AwardingCriterionResponseType> getAwardingCriterionResponses() {
        if (awardingCriterionResponses == null) {
            awardingCriterionResponses = new ArrayList<AwardingCriterionResponseType>();
        }
        return this.awardingCriterionResponses;
    }

}
