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
import com.picoto.jaxb.ubl.common.cbc.NotificationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PostEventNotificationDurationMeasure;
import com.picoto.jaxb.ubl.common.cbc.PreEventNotificationDurationMeasure;


/**
 * <p>Clase Java para NotificationRequirementType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificationRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NotificationTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationRequirementType", propOrder = {
    "notificationTypeCode",
    "postEventNotificationDurationMeasure",
    "preEventNotificationDurationMeasure",
    "notifyParties",
    "notificationPeriods",
    "notificationLocations"
})
@XmlRootElement(name = "NotificationRequirement")
public class NotificationRequirement {

    @XmlElement(name = "NotificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NotificationTypeCode notificationTypeCode;
    @XmlElement(name = "PostEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostEventNotificationDurationMeasure postEventNotificationDurationMeasure;
    @XmlElement(name = "PreEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreEventNotificationDurationMeasure preEventNotificationDurationMeasure;
    @XmlElement(name = "NotifyParty")
    protected List<PartyType> notifyParties;
    @XmlElement(name = "NotificationPeriod")
    protected List<PeriodType> notificationPeriods;
    @XmlElement(name = "NotificationLocation")
    protected List<LocationType> notificationLocations;

    /**
     * Obtiene el valor de la propiedad notificationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeCode }
     *     
     */
    public NotificationTypeCode getNotificationTypeCode() {
        return notificationTypeCode;
    }

    /**
     * Define el valor de la propiedad notificationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeCode }
     *     
     */
    public void setNotificationTypeCode(NotificationTypeCode value) {
        this.notificationTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad postEventNotificationDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link PostEventNotificationDurationMeasure }
     *     
     */
    public PostEventNotificationDurationMeasure getPostEventNotificationDurationMeasure() {
        return postEventNotificationDurationMeasure;
    }

    /**
     * Define el valor de la propiedad postEventNotificationDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link PostEventNotificationDurationMeasure }
     *     
     */
    public void setPostEventNotificationDurationMeasure(PostEventNotificationDurationMeasure value) {
        this.postEventNotificationDurationMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad preEventNotificationDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link PreEventNotificationDurationMeasure }
     *     
     */
    public PreEventNotificationDurationMeasure getPreEventNotificationDurationMeasure() {
        return preEventNotificationDurationMeasure;
    }

    /**
     * Define el valor de la propiedad preEventNotificationDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link PreEventNotificationDurationMeasure }
     *     
     */
    public void setPreEventNotificationDurationMeasure(PreEventNotificationDurationMeasure value) {
        this.preEventNotificationDurationMeasure = value;
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
     * Gets the value of the notificationPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getNotificationPeriods() {
        if (notificationPeriods == null) {
            notificationPeriods = new ArrayList<PeriodType>();
        }
        return this.notificationPeriods;
    }

    /**
     * Gets the value of the notificationLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getNotificationLocations() {
        if (notificationLocations == null) {
            notificationLocations = new ArrayList<LocationType>();
        }
        return this.notificationLocations;
    }

}
