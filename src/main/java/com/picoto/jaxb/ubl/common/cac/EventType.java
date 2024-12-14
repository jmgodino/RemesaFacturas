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
import com.picoto.jaxb.ubl.common.cbc.TypeCode;


/**
 * <p>Clase Java para EventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IdentificationID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompletionIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CurrentStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OccurenceLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "identificationID",
    "occurrenceDate",
    "occurrenceTime",
    "typeCode",
    "descriptions",
    "completionIndicator",
    "currentStatuses",
    "contacts",
    "occurenceLocation"
})
public class EventType {

    @XmlElement(name = "IdentificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IdentificationID identificationID;
    @XmlElement(name = "OccurrenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceDate occurrenceDate;
    @XmlElement(name = "OccurrenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceTime occurrenceTime;
    @XmlElement(name = "TypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TypeCode typeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "CompletionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompletionIndicator completionIndicator;
    @XmlElement(name = "CurrentStatus")
    protected List<StatusType> currentStatuses;
    @XmlElement(name = "Contact")
    protected List<ContactType> contacts;
    @XmlElement(name = "OccurenceLocation")
    protected LocationType occurenceLocation;

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
     * Obtiene el valor de la propiedad typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeCode }
     *     
     */
    public TypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Define el valor de la propiedad typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCode }
     *     
     */
    public void setTypeCode(TypeCode value) {
        this.typeCode = value;
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
     * Obtiene el valor de la propiedad occurenceLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOccurenceLocation() {
        return occurenceLocation;
    }

    /**
     * Define el valor de la propiedad occurenceLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOccurenceLocation(LocationType value) {
        this.occurenceLocation = value;
    }

}
