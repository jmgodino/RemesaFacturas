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
import com.picoto.jaxb.ubl.common.cbc.ActualDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.ActualDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.GuaranteedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.GuaranteedDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Instructions;
import com.picoto.jaxb.ubl.common.cbc.ReleaseID;
import com.picoto.jaxb.ubl.common.cbc.RequestedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.RequestedDespatchTime;


/**
 * <p>Clase Java para DespatchType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DespatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReleaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDespatchPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDespatchPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchType", propOrder = {
    "id",
    "requestedDespatchDate",
    "requestedDespatchTime",
    "estimatedDespatchDate",
    "estimatedDespatchTime",
    "actualDespatchDate",
    "actualDespatchTime",
    "guaranteedDespatchDate",
    "guaranteedDespatchTime",
    "releaseID",
    "instructions",
    "despatchAddress",
    "despatchLocation",
    "despatchParty",
    "carrierParty",
    "notifyParties",
    "contact",
    "estimatedDespatchPeriod",
    "requestedDespatchPeriod"
})
@XmlRootElement(name = "Despatch")
public class Despatch {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "RequestedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDespatchDate requestedDespatchDate;
    @XmlElement(name = "RequestedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDespatchTime requestedDespatchTime;
    @XmlElement(name = "EstimatedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDespatchDate estimatedDespatchDate;
    @XmlElement(name = "EstimatedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDespatchTime estimatedDespatchTime;
    @XmlElement(name = "ActualDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDespatchDate actualDespatchDate;
    @XmlElement(name = "ActualDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDespatchTime actualDespatchTime;
    @XmlElement(name = "GuaranteedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GuaranteedDespatchDate guaranteedDespatchDate;
    @XmlElement(name = "GuaranteedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GuaranteedDespatchTime guaranteedDespatchTime;
    @XmlElement(name = "ReleaseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReleaseID releaseID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Instructions> instructions;
    @XmlElement(name = "DespatchAddress")
    protected AddressType despatchAddress;
    @XmlElement(name = "DespatchLocation")
    protected LocationType despatchLocation;
    @XmlElement(name = "DespatchParty")
    protected PartyType despatchParty;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "NotifyParty")
    protected List<PartyType> notifyParties;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "EstimatedDespatchPeriod")
    protected PeriodType estimatedDespatchPeriod;
    @XmlElement(name = "RequestedDespatchPeriod")
    protected PeriodType requestedDespatchPeriod;

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
     * Obtiene el valor de la propiedad requestedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchDate }
     *     
     */
    public RequestedDespatchDate getRequestedDespatchDate() {
        return requestedDespatchDate;
    }

    /**
     * Define el valor de la propiedad requestedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchDate }
     *     
     */
    public void setRequestedDespatchDate(RequestedDespatchDate value) {
        this.requestedDespatchDate = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchTime }
     *     
     */
    public RequestedDespatchTime getRequestedDespatchTime() {
        return requestedDespatchTime;
    }

    /**
     * Define el valor de la propiedad requestedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchTime }
     *     
     */
    public void setRequestedDespatchTime(RequestedDespatchTime value) {
        this.requestedDespatchTime = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchDate }
     *     
     */
    public EstimatedDespatchDate getEstimatedDespatchDate() {
        return estimatedDespatchDate;
    }

    /**
     * Define el valor de la propiedad estimatedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchDate }
     *     
     */
    public void setEstimatedDespatchDate(EstimatedDespatchDate value) {
        this.estimatedDespatchDate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchTime }
     *     
     */
    public EstimatedDespatchTime getEstimatedDespatchTime() {
        return estimatedDespatchTime;
    }

    /**
     * Define el valor de la propiedad estimatedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchTime }
     *     
     */
    public void setEstimatedDespatchTime(EstimatedDespatchTime value) {
        this.estimatedDespatchTime = value;
    }

    /**
     * Obtiene el valor de la propiedad actualDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchDate }
     *     
     */
    public ActualDespatchDate getActualDespatchDate() {
        return actualDespatchDate;
    }

    /**
     * Define el valor de la propiedad actualDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchDate }
     *     
     */
    public void setActualDespatchDate(ActualDespatchDate value) {
        this.actualDespatchDate = value;
    }

    /**
     * Obtiene el valor de la propiedad actualDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchTime }
     *     
     */
    public ActualDespatchTime getActualDespatchTime() {
        return actualDespatchTime;
    }

    /**
     * Define el valor de la propiedad actualDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchTime }
     *     
     */
    public void setActualDespatchTime(ActualDespatchTime value) {
        this.actualDespatchTime = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchDate }
     *     
     */
    public GuaranteedDespatchDate getGuaranteedDespatchDate() {
        return guaranteedDespatchDate;
    }

    /**
     * Define el valor de la propiedad guaranteedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchDate }
     *     
     */
    public void setGuaranteedDespatchDate(GuaranteedDespatchDate value) {
        this.guaranteedDespatchDate = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchTime }
     *     
     */
    public GuaranteedDespatchTime getGuaranteedDespatchTime() {
        return guaranteedDespatchTime;
    }

    /**
     * Define el valor de la propiedad guaranteedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchTime }
     *     
     */
    public void setGuaranteedDespatchTime(GuaranteedDespatchTime value) {
        this.guaranteedDespatchTime = value;
    }

    /**
     * Obtiene el valor de la propiedad releaseID.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseID }
     *     
     */
    public ReleaseID getReleaseID() {
        return releaseID;
    }

    /**
     * Define el valor de la propiedad releaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseID }
     *     
     */
    public void setReleaseID(ReleaseID value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Obtiene el valor de la propiedad despatchAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDespatchAddress() {
        return despatchAddress;
    }

    /**
     * Define el valor de la propiedad despatchAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDespatchAddress(AddressType value) {
        this.despatchAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad despatchLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDespatchLocation() {
        return despatchLocation;
    }

    /**
     * Define el valor de la propiedad despatchLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDespatchLocation(LocationType value) {
        this.despatchLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad despatchParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDespatchParty() {
        return despatchParty;
    }

    /**
     * Define el valor de la propiedad despatchParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDespatchParty(PartyType value) {
        this.despatchParty = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Define el valor de la propiedad carrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the notifyParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getNotifyParties() {
        if (notifyParties == null) {
            notifyParties = new ArrayList<PartyType>();
        }
        return this.notifyParties;
    }

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDespatchPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDespatchPeriod() {
        return estimatedDespatchPeriod;
    }

    /**
     * Define el valor de la propiedad estimatedDespatchPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDespatchPeriod(PeriodType value) {
        this.estimatedDespatchPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedDespatchPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRequestedDespatchPeriod() {
        return requestedDespatchPeriod;
    }

    /**
     * Define el valor de la propiedad requestedDespatchPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRequestedDespatchPeriod(PeriodType value) {
        this.requestedDespatchPeriod = value;
    }

}
