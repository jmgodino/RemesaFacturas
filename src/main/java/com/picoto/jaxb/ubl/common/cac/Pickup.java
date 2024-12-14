//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ActualPickupDate;
import com.picoto.jaxb.ubl.common.cbc.ActualPickupTime;
import com.picoto.jaxb.ubl.common.cbc.EarliestPickupDate;
import com.picoto.jaxb.ubl.common.cbc.EarliestPickupTime;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LatestPickupDate;
import com.picoto.jaxb.ubl.common.cbc.LatestPickupTime;


/**
 * <p>Clase Java para PickupType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PickupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupType", propOrder = {
    "id",
    "actualPickupDate",
    "actualPickupTime",
    "earliestPickupDate",
    "earliestPickupTime",
    "latestPickupDate",
    "latestPickupTime",
    "pickupLocation",
    "pickupParty"
})
@XmlRootElement(name = "Pickup")
public class Pickup {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "ActualPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupDate actualPickupDate;
    @XmlElement(name = "ActualPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupTime actualPickupTime;
    @XmlElement(name = "EarliestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupDate earliestPickupDate;
    @XmlElement(name = "EarliestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupTime earliestPickupTime;
    @XmlElement(name = "LatestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupDate latestPickupDate;
    @XmlElement(name = "LatestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupTime latestPickupTime;
    @XmlElement(name = "PickupLocation")
    protected LocationType pickupLocation;
    @XmlElement(name = "PickupParty")
    protected PartyType pickupParty;

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
     * Obtiene el valor de la propiedad actualPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupDate }
     *     
     */
    public ActualPickupDate getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Define el valor de la propiedad actualPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupDate }
     *     
     */
    public void setActualPickupDate(ActualPickupDate value) {
        this.actualPickupDate = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupTime }
     *     
     */
    public ActualPickupTime getActualPickupTime() {
        return actualPickupTime;
    }

    /**
     * Define el valor de la propiedad actualPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupTime }
     *     
     */
    public void setActualPickupTime(ActualPickupTime value) {
        this.actualPickupTime = value;
    }

    /**
     * Obtiene el valor de la propiedad earliestPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupDate }
     *     
     */
    public EarliestPickupDate getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Define el valor de la propiedad earliestPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupDate }
     *     
     */
    public void setEarliestPickupDate(EarliestPickupDate value) {
        this.earliestPickupDate = value;
    }

    /**
     * Obtiene el valor de la propiedad earliestPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupTime }
     *     
     */
    public EarliestPickupTime getEarliestPickupTime() {
        return earliestPickupTime;
    }

    /**
     * Define el valor de la propiedad earliestPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupTime }
     *     
     */
    public void setEarliestPickupTime(EarliestPickupTime value) {
        this.earliestPickupTime = value;
    }

    /**
     * Obtiene el valor de la propiedad latestPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupDate }
     *     
     */
    public LatestPickupDate getLatestPickupDate() {
        return latestPickupDate;
    }

    /**
     * Define el valor de la propiedad latestPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupDate }
     *     
     */
    public void setLatestPickupDate(LatestPickupDate value) {
        this.latestPickupDate = value;
    }

    /**
     * Obtiene el valor de la propiedad latestPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupTime }
     *     
     */
    public LatestPickupTime getLatestPickupTime() {
        return latestPickupTime;
    }

    /**
     * Define el valor de la propiedad latestPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupTime }
     *     
     */
    public void setLatestPickupTime(LatestPickupTime value) {
        this.latestPickupTime = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Define el valor de la propiedad pickupLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPickupLocation(LocationType value) {
        this.pickupLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPickupParty() {
        return pickupParty;
    }

    /**
     * Define el valor de la propiedad pickupParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPickupParty(PartyType value) {
        this.pickupParty = value;
    }

}
