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
import com.picoto.jaxb.ubl.common.cbc.EndDate;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.ProgressPercent;
import com.picoto.jaxb.ubl.common.cbc.StartDate;
import com.picoto.jaxb.ubl.common.cbc.WorkPhase;
import com.picoto.jaxb.ubl.common.cbc.WorkPhaseCode;


/**
 * <p>Clase Java para WorkPhaseReferenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WorkPhaseReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WorkPhaseCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WorkPhase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProgressPercent" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StartDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WorkOrderDocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkPhaseReferenceType", propOrder = {
    "id",
    "workPhaseCode",
    "workPhases",
    "progressPercent",
    "startDate",
    "endDate",
    "workOrderDocumentReferences"
})
@XmlRootElement(name = "WorkPhaseReference")
public class WorkPhaseReference {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "WorkPhaseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WorkPhaseCode workPhaseCode;
    @XmlElement(name = "WorkPhase", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WorkPhase> workPhases;
    @XmlElement(name = "ProgressPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProgressPercent progressPercent;
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StartDate startDate;
    @XmlElement(name = "EndDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EndDate endDate;
    @XmlElement(name = "WorkOrderDocumentReference")
    protected List<DocumentReferenceType> workOrderDocumentReferences;

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
     * Obtiene el valor de la propiedad workPhaseCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkPhaseCode }
     *     
     */
    public WorkPhaseCode getWorkPhaseCode() {
        return workPhaseCode;
    }

    /**
     * Define el valor de la propiedad workPhaseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPhaseCode }
     *     
     */
    public void setWorkPhaseCode(WorkPhaseCode value) {
        this.workPhaseCode = value;
    }

    /**
     * Gets the value of the workPhases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workPhases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkPhases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkPhase }
     * 
     * 
     */
    public List<WorkPhase> getWorkPhases() {
        if (workPhases == null) {
            workPhases = new ArrayList<WorkPhase>();
        }
        return this.workPhases;
    }

    /**
     * Obtiene el valor de la propiedad progressPercent.
     * 
     * @return
     *     possible object is
     *     {@link ProgressPercent }
     *     
     */
    public ProgressPercent getProgressPercent() {
        return progressPercent;
    }

    /**
     * Define el valor de la propiedad progressPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressPercent }
     *     
     */
    public void setProgressPercent(ProgressPercent value) {
        this.progressPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link EndDate }
     *     
     */
    public EndDate getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDate }
     *     
     */
    public void setEndDate(EndDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the workOrderDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrderDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrderDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getWorkOrderDocumentReferences() {
        if (workOrderDocumentReferences == null) {
            workOrderDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.workOrderDocumentReferences;
    }

}
