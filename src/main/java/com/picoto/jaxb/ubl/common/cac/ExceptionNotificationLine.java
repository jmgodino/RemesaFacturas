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
import com.picoto.jaxb.ubl.common.cbc.CollaborationPriorityCode;
import com.picoto.jaxb.ubl.common.cbc.ComparedValueMeasure;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ExceptionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.PerformanceMetricTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ResolutionCode;
import com.picoto.jaxb.ubl.common.cbc.SourceValueMeasure;
import com.picoto.jaxb.ubl.common.cbc.SupplyChainActivityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.VarianceQuantity;


/**
 * <p>Clase Java para ExceptionNotificationLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExceptionNotificationLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparedValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VarianceQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExceptionObservationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastException" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionNotificationLineType", propOrder = {
    "id",
    "notes",
    "descriptions",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "resolutionCode",
    "comparedValueMeasure",
    "sourceValueMeasure",
    "varianceQuantity",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "exceptionObservationPeriod",
    "documentReferences",
    "forecastException",
    "supplyItem"
})
@XmlRootElement(name = "ExceptionNotificationLine")
public class ExceptionNotificationLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionStatusCode exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CollaborationPriorityCode collaborationPriorityCode;
    @XmlElement(name = "ResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResolutionCode resolutionCode;
    @XmlElement(name = "ComparedValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ComparedValueMeasure comparedValueMeasure;
    @XmlElement(name = "SourceValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceValueMeasure sourceValueMeasure;
    @XmlElement(name = "VarianceQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VarianceQuantity varianceQuantity;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCode supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCode performanceMetricTypeCode;
    @XmlElement(name = "ExceptionObservationPeriod")
    protected PeriodType exceptionObservationPeriod;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "ForecastException")
    protected ForecastException forecastException;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

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
     * Obtiene el valor de la propiedad resolutionCode.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionCode }
     *     
     */
    public ResolutionCode getResolutionCode() {
        return resolutionCode;
    }

    /**
     * Define el valor de la propiedad resolutionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionCode }
     *     
     */
    public void setResolutionCode(ResolutionCode value) {
        this.resolutionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad comparedValueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ComparedValueMeasure }
     *     
     */
    public ComparedValueMeasure getComparedValueMeasure() {
        return comparedValueMeasure;
    }

    /**
     * Define el valor de la propiedad comparedValueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparedValueMeasure }
     *     
     */
    public void setComparedValueMeasure(ComparedValueMeasure value) {
        this.comparedValueMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceValueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link SourceValueMeasure }
     *     
     */
    public SourceValueMeasure getSourceValueMeasure() {
        return sourceValueMeasure;
    }

    /**
     * Define el valor de la propiedad sourceValueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceValueMeasure }
     *     
     */
    public void setSourceValueMeasure(SourceValueMeasure value) {
        this.sourceValueMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad varianceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link VarianceQuantity }
     *     
     */
    public VarianceQuantity getVarianceQuantity() {
        return varianceQuantity;
    }

    /**
     * Define el valor de la propiedad varianceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceQuantity }
     *     
     */
    public void setVarianceQuantity(VarianceQuantity value) {
        this.varianceQuantity = value;
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
     * Obtiene el valor de la propiedad exceptionObservationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getExceptionObservationPeriod() {
        return exceptionObservationPeriod;
    }

    /**
     * Define el valor de la propiedad exceptionObservationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setExceptionObservationPeriod(PeriodType value) {
        this.exceptionObservationPeriod = value;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Obtiene el valor de la propiedad forecastException.
     * 
     * @return
     *     possible object is
     *     {@link ForecastException }
     *     
     */
    public ForecastException getForecastException() {
        return forecastException;
    }

    /**
     * Define el valor de la propiedad forecastException.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastException }
     *     
     */
    public void setForecastException(ForecastException value) {
        this.forecastException = value;
    }

    /**
     * Obtiene el valor de la propiedad supplyItem.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Define el valor de la propiedad supplyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

}
