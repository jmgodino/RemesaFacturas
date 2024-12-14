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
import com.picoto.jaxb.ubl.common.cbc.CollaborationPriorityCode;
import com.picoto.jaxb.ubl.common.cbc.ExceptionResolutionCode;
import com.picoto.jaxb.ubl.common.cbc.ExceptionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PerformanceMetricTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SupplyChainActivityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ThresholdQuantity;
import com.picoto.jaxb.ubl.common.cbc.ThresholdValueComparisonCode;


/**
 * <p>Clase Java para ExceptionCriteriaLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExceptionCriteriaLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdValueComparisonCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastExceptionCriterionLine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionCriteriaLineType", propOrder = {
    "id",
    "notes",
    "thresholdValueComparisonCode",
    "thresholdQuantity",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "exceptionResolutionCode",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "effectivePeriod",
    "supplyItems",
    "forecastExceptionCriterionLine"
})
@XmlRootElement(name = "ExceptionCriteriaLine")
public class ExceptionCriteriaLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "ThresholdValueComparisonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdValueComparisonCode thresholdValueComparisonCode;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdQuantity thresholdQuantity;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionStatusCode exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CollaborationPriorityCode collaborationPriorityCode;
    @XmlElement(name = "ExceptionResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionResolutionCode exceptionResolutionCode;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCode supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCode performanceMetricTypeCode;
    @XmlElement(name = "EffectivePeriod")
    protected PeriodType effectivePeriod;
    @XmlElement(name = "SupplyItem", required = true)
    protected List<ItemType> supplyItems;
    @XmlElement(name = "ForecastExceptionCriterionLine")
    protected ForecastExceptionCriterionLine forecastExceptionCriterionLine;

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
     * Obtiene el valor de la propiedad thresholdValueComparisonCode.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdValueComparisonCode }
     *     
     */
    public ThresholdValueComparisonCode getThresholdValueComparisonCode() {
        return thresholdValueComparisonCode;
    }

    /**
     * Define el valor de la propiedad thresholdValueComparisonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdValueComparisonCode }
     *     
     */
    public void setThresholdValueComparisonCode(ThresholdValueComparisonCode value) {
        this.thresholdValueComparisonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad thresholdQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantity }
     *     
     */
    public ThresholdQuantity getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Define el valor de la propiedad thresholdQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantity }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantity value) {
        this.thresholdQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionStatusCode }
     *     
     */
    public ExceptionStatusCode getExceptionStatusCode() {
        return exceptionStatusCode;
    }

    /**
     * Define el valor de la propiedad exceptionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionStatusCode }
     *     
     */
    public void setExceptionStatusCode(ExceptionStatusCode value) {
        this.exceptionStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad collaborationPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationPriorityCode }
     *     
     */
    public CollaborationPriorityCode getCollaborationPriorityCode() {
        return collaborationPriorityCode;
    }

    /**
     * Define el valor de la propiedad collaborationPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationPriorityCode }
     *     
     */
    public void setCollaborationPriorityCode(CollaborationPriorityCode value) {
        this.collaborationPriorityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionResolutionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionResolutionCode }
     *     
     */
    public ExceptionResolutionCode getExceptionResolutionCode() {
        return exceptionResolutionCode;
    }

    /**
     * Define el valor de la propiedad exceptionResolutionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionResolutionCode }
     *     
     */
    public void setExceptionResolutionCode(ExceptionResolutionCode value) {
        this.exceptionResolutionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad supplyChainActivityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public SupplyChainActivityTypeCode getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Define el valor de la propiedad supplyChainActivityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCode value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad performanceMetricTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public PerformanceMetricTypeCode getPerformanceMetricTypeCode() {
        return performanceMetricTypeCode;
    }

    /**
     * Define el valor de la propiedad performanceMetricTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public void setPerformanceMetricTypeCode(PerformanceMetricTypeCode value) {
        this.performanceMetricTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad effectivePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Define el valor de la propiedad effectivePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the supplyItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getSupplyItems() {
        if (supplyItems == null) {
            supplyItems = new ArrayList<ItemType>();
        }
        return this.supplyItems;
    }

    /**
     * Obtiene el valor de la propiedad forecastExceptionCriterionLine.
     * 
     * @return
     *     possible object is
     *     {@link ForecastExceptionCriterionLine }
     *     
     */
    public ForecastExceptionCriterionLine getForecastExceptionCriterionLine() {
        return forecastExceptionCriterionLine;
    }

    /**
     * Define el valor de la propiedad forecastExceptionCriterionLine.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastExceptionCriterionLine }
     *     
     */
    public void setForecastExceptionCriterionLine(ForecastExceptionCriterionLine value) {
        this.forecastExceptionCriterionLine = value;
    }

}
