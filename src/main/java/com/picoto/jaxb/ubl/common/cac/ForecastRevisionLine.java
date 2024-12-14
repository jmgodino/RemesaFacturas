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
import com.picoto.jaxb.ubl.common.cbc.AdjustmentReasonCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.RevisedForecastLineID;
import com.picoto.jaxb.ubl.common.cbc.SourceForecastIssueDate;
import com.picoto.jaxb.ubl.common.cbc.SourceForecastIssueTime;


/**
 * <p>Clase Java para ForecastRevisionLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ForecastRevisionLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RevisedForecastLineID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueDate"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueTime"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdjustmentReasonCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastRevisionLineType", propOrder = {
    "id",
    "notes",
    "descriptions",
    "revisedForecastLineID",
    "sourceForecastIssueDate",
    "sourceForecastIssueTime",
    "adjustmentReasonCode",
    "forecastPeriod",
    "salesItem"
})
@XmlRootElement(name = "ForecastRevisionLine")
public class ForecastRevisionLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "RevisedForecastLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected RevisedForecastLineID revisedForecastLineID;
    @XmlElement(name = "SourceForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceForecastIssueDate sourceForecastIssueDate;
    @XmlElement(name = "SourceForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceForecastIssueTime sourceForecastIssueTime;
    @XmlElement(name = "AdjustmentReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdjustmentReasonCode adjustmentReasonCode;
    @XmlElement(name = "ForecastPeriod")
    protected PeriodType forecastPeriod;
    @XmlElement(name = "SalesItem")
    protected SalesItem salesItem;

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
     * Obtiene el valor de la propiedad revisedForecastLineID.
     * 
     * @return
     *     possible object is
     *     {@link RevisedForecastLineID }
     *     
     */
    public RevisedForecastLineID getRevisedForecastLineID() {
        return revisedForecastLineID;
    }

    /**
     * Define el valor de la propiedad revisedForecastLineID.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisedForecastLineID }
     *     
     */
    public void setRevisedForecastLineID(RevisedForecastLineID value) {
        this.revisedForecastLineID = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceForecastIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueDate }
     *     
     */
    public SourceForecastIssueDate getSourceForecastIssueDate() {
        return sourceForecastIssueDate;
    }

    /**
     * Define el valor de la propiedad sourceForecastIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueDate }
     *     
     */
    public void setSourceForecastIssueDate(SourceForecastIssueDate value) {
        this.sourceForecastIssueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceForecastIssueTime.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueTime }
     *     
     */
    public SourceForecastIssueTime getSourceForecastIssueTime() {
        return sourceForecastIssueTime;
    }

    /**
     * Define el valor de la propiedad sourceForecastIssueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueTime }
     *     
     */
    public void setSourceForecastIssueTime(SourceForecastIssueTime value) {
        this.sourceForecastIssueTime = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentReasonCode }
     *     
     */
    public AdjustmentReasonCode getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Define el valor de la propiedad adjustmentReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentReasonCode }
     *     
     */
    public void setAdjustmentReasonCode(AdjustmentReasonCode value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad forecastPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Define el valor de la propiedad forecastPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setForecastPeriod(PeriodType value) {
        this.forecastPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad salesItem.
     * 
     * @return
     *     possible object is
     *     {@link SalesItem }
     *     
     */
    public SalesItem getSalesItem() {
        return salesItem;
    }

    /**
     * Define el valor de la propiedad salesItem.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesItem }
     *     
     */
    public void setSalesItem(SalesItem value) {
        this.salesItem = value;
    }

}
