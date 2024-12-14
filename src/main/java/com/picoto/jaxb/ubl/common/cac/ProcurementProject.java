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
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.EstimatedOverallContractQuantity;
import com.picoto.jaxb.ubl.common.cbc.FeeDescription;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.ProcurementSubTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ProcurementTypeCode;
import com.picoto.jaxb.ubl.common.cbc.QualityControlCode;
import com.picoto.jaxb.ubl.common.cbc.RequestedDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.RequiredFeeAmount;


/**
 * <p>Clase Java para ProcurementProjectType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcurementProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementSubTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QualityControlCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedTenderTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCommodityClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RealizedLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestForTenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectType", propOrder = {
    "id",
    "names",
    "descriptions",
    "procurementTypeCode",
    "procurementSubTypeCode",
    "qualityControlCode",
    "requiredFeeAmount",
    "feeDescriptions",
    "requestedDeliveryDate",
    "estimatedOverallContractQuantity",
    "notes",
    "requestedTenderTotal",
    "mainCommodityClassification",
    "additionalCommodityClassifications",
    "realizedLocations",
    "plannedPeriod",
    "contractExtension",
    "requestForTenderLines"
})
@XmlRootElement(name = "ProcurementProject")
public class ProcurementProject {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected List<Name> names;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "ProcurementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcurementTypeCode procurementTypeCode;
    @XmlElement(name = "ProcurementSubTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcurementSubTypeCode procurementSubTypeCode;
    @XmlElement(name = "QualityControlCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QualityControlCode qualityControlCode;
    @XmlElement(name = "RequiredFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredFeeAmount requiredFeeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FeeDescription> feeDescriptions;
    @XmlElement(name = "RequestedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDeliveryDate requestedDeliveryDate;
    @XmlElement(name = "EstimatedOverallContractQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedOverallContractQuantity estimatedOverallContractQuantity;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "RequestedTenderTotal")
    protected RequestedTenderTotal requestedTenderTotal;
    @XmlElement(name = "MainCommodityClassification")
    protected CommodityClassificationType mainCommodityClassification;
    @XmlElement(name = "AdditionalCommodityClassification")
    protected List<CommodityClassificationType> additionalCommodityClassifications;
    @XmlElement(name = "RealizedLocation")
    protected List<LocationType> realizedLocations;
    @XmlElement(name = "PlannedPeriod")
    protected PeriodType plannedPeriod;
    @XmlElement(name = "ContractExtension")
    protected ContractExtension contractExtension;
    @XmlElement(name = "RequestForTenderLine")
    protected List<RequestForTenderLineType> requestForTenderLines;

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
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
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
     * Obtiene el valor de la propiedad procurementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementTypeCode }
     *     
     */
    public ProcurementTypeCode getProcurementTypeCode() {
        return procurementTypeCode;
    }

    /**
     * Define el valor de la propiedad procurementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementTypeCode }
     *     
     */
    public void setProcurementTypeCode(ProcurementTypeCode value) {
        this.procurementTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementSubTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementSubTypeCode }
     *     
     */
    public ProcurementSubTypeCode getProcurementSubTypeCode() {
        return procurementSubTypeCode;
    }

    /**
     * Define el valor de la propiedad procurementSubTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementSubTypeCode }
     *     
     */
    public void setProcurementSubTypeCode(ProcurementSubTypeCode value) {
        this.procurementSubTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad qualityControlCode.
     * 
     * @return
     *     possible object is
     *     {@link QualityControlCode }
     *     
     */
    public QualityControlCode getQualityControlCode() {
        return qualityControlCode;
    }

    /**
     * Define el valor de la propiedad qualityControlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityControlCode }
     *     
     */
    public void setQualityControlCode(QualityControlCode value) {
        this.qualityControlCode = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link RequiredFeeAmount }
     *     
     */
    public RequiredFeeAmount getRequiredFeeAmount() {
        return requiredFeeAmount;
    }

    /**
     * Define el valor de la propiedad requiredFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredFeeAmount }
     *     
     */
    public void setRequiredFeeAmount(RequiredFeeAmount value) {
        this.requiredFeeAmount = value;
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
     * Obtiene el valor de la propiedad requestedDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDeliveryDate }
     *     
     */
    public RequestedDeliveryDate getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Define el valor de la propiedad requestedDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDeliveryDate }
     *     
     */
    public void setRequestedDeliveryDate(RequestedDeliveryDate value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedOverallContractQuantity.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractQuantity }
     *     
     */
    public EstimatedOverallContractQuantity getEstimatedOverallContractQuantity() {
        return estimatedOverallContractQuantity;
    }

    /**
     * Define el valor de la propiedad estimatedOverallContractQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractQuantity }
     *     
     */
    public void setEstimatedOverallContractQuantity(EstimatedOverallContractQuantity value) {
        this.estimatedOverallContractQuantity = value;
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
     * Obtiene el valor de la propiedad requestedTenderTotal.
     * 
     * @return
     *     possible object is
     *     {@link RequestedTenderTotal }
     *     
     */
    public RequestedTenderTotal getRequestedTenderTotal() {
        return requestedTenderTotal;
    }

    /**
     * Define el valor de la propiedad requestedTenderTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedTenderTotal }
     *     
     */
    public void setRequestedTenderTotal(RequestedTenderTotal value) {
        this.requestedTenderTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad mainCommodityClassification.
     * 
     * @return
     *     possible object is
     *     {@link CommodityClassificationType }
     *     
     */
    public CommodityClassificationType getMainCommodityClassification() {
        return mainCommodityClassification;
    }

    /**
     * Define el valor de la propiedad mainCommodityClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityClassificationType }
     *     
     */
    public void setMainCommodityClassification(CommodityClassificationType value) {
        this.mainCommodityClassification = value;
    }

    /**
     * Gets the value of the additionalCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getAdditionalCommodityClassifications() {
        if (additionalCommodityClassifications == null) {
            additionalCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.additionalCommodityClassifications;
    }

    /**
     * Gets the value of the realizedLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizedLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizedLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRealizedLocations() {
        if (realizedLocations == null) {
            realizedLocations = new ArrayList<LocationType>();
        }
        return this.realizedLocations;
    }

    /**
     * Obtiene el valor de la propiedad plannedPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPlannedPeriod() {
        return plannedPeriod;
    }

    /**
     * Define el valor de la propiedad plannedPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPlannedPeriod(PeriodType value) {
        this.plannedPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad contractExtension.
     * 
     * @return
     *     possible object is
     *     {@link ContractExtension }
     *     
     */
    public ContractExtension getContractExtension() {
        return contractExtension;
    }

    /**
     * Define el valor de la propiedad contractExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExtension }
     *     
     */
    public void setContractExtension(ContractExtension value) {
        this.contractExtension = value;
    }

    /**
     * Gets the value of the requestForTenderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestForTenderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestForTenderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestForTenderLineType }
     * 
     * 
     */
    public List<RequestForTenderLineType> getRequestForTenderLines() {
        if (requestForTenderLines == null) {
            requestForTenderLines = new ArrayList<RequestForTenderLineType>();
        }
        return this.requestForTenderLines;
    }

}
