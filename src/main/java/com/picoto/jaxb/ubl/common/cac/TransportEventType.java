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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CompletionIndicator;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.IdentificationID;
import com.picoto.jaxb.ubl.common.cbc.OccurrenceDate;
import com.picoto.jaxb.ubl.common.cbc.OccurrenceTime;
import com.picoto.jaxb.ubl.common.cbc.TransportEventTypeCode;


/**
 * <p>Clase Java para TransportEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IdentificationID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEventTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompletionIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReportedShipment" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CurrentStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Location" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEventType", propOrder = {
    "identificationID",
    "occurrenceDate",
    "occurrenceTime",
    "transportEventTypeCode",
    "descriptions",
    "completionIndicator",
    "reportedShipment",
    "currentStatuses",
    "contacts",
    "location",
    "signature",
    "periods"
})
public class TransportEventType {

    @XmlElement(name = "IdentificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IdentificationID identificationID;
    @XmlElement(name = "OccurrenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceDate occurrenceDate;
    @XmlElement(name = "OccurrenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceTime occurrenceTime;
    @XmlElement(name = "TransportEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportEventTypeCode transportEventTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "CompletionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompletionIndicator completionIndicator;
    @XmlElement(name = "ReportedShipment")
    protected ShipmentType reportedShipment;
    @XmlElement(name = "CurrentStatus")
    protected List<StatusType> currentStatuses;
    @XmlElement(name = "Contact")
    protected List<ContactType> contacts;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "Signature")
    protected Signature signature;
    @XmlElement(name = "Period")
    protected List<PeriodType> periods;

    /**
     * Obtiene el valor de la propiedad identificationID.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationID }
     *     
     */
    public IdentificationID getIdentificationID() {
        return identificationID;
    }

    /**
     * Define el valor de la propiedad identificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationID }
     *     
     */
    public void setIdentificationID(IdentificationID value) {
        this.identificationID = value;
    }

    /**
     * Obtiene el valor de la propiedad occurrenceDate.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceDate }
     *     
     */
    public OccurrenceDate getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Define el valor de la propiedad occurrenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceDate }
     *     
     */
    public void setOccurrenceDate(OccurrenceDate value) {
        this.occurrenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad occurrenceTime.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceTime }
     *     
     */
    public OccurrenceTime getOccurrenceTime() {
        return occurrenceTime;
    }

    /**
     * Define el valor de la propiedad occurrenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceTime }
     *     
     */
    public void setOccurrenceTime(OccurrenceTime value) {
        this.occurrenceTime = value;
    }

    /**
     * Obtiene el valor de la propiedad transportEventTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventTypeCode }
     *     
     */
    public TransportEventTypeCode getTransportEventTypeCode() {
        return transportEventTypeCode;
    }

    /**
     * Define el valor de la propiedad transportEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventTypeCode }
     *     
     */
    public void setTransportEventTypeCode(TransportEventTypeCode value) {
        this.transportEventTypeCode = value;
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
     * Obtiene el valor de la propiedad completionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CompletionIndicator }
     *     
     */
    public CompletionIndicator getCompletionIndicator() {
        return completionIndicator;
    }

    /**
     * Define el valor de la propiedad completionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionIndicator }
     *     
     */
    public void setCompletionIndicator(CompletionIndicator value) {
        this.completionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad reportedShipment.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getReportedShipment() {
        return reportedShipment;
    }

    /**
     * Define el valor de la propiedad reportedShipment.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setReportedShipment(ShipmentType value) {
        this.reportedShipment = value;
    }

    /**
     * Gets the value of the currentStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getCurrentStatuses() {
        if (currentStatuses == null) {
            currentStatuses = new ArrayList<StatusType>();
        }
        return this.currentStatuses;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactType>();
        }
        return this.contacts;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<PeriodType>();
        }
        return this.periods;
    }

}
