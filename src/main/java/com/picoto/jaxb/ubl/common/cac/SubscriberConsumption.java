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
import com.picoto.jaxb.ubl.common.cbc.ConsumptionID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.SpecificationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TotalMeteredQuantity;


/**
 * <p>Clase Java para SubscriberConsumptionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalMeteredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubscriberParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityConsumptionPoint"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnAccountPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consumption" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierConsumption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberConsumptionType", propOrder = {
    "consumptionID",
    "specificationTypeCode",
    "notes",
    "totalMeteredQuantity",
    "subscriberParty",
    "utilityConsumptionPoint",
    "onAccountPayments",
    "consumption",
    "supplierConsumptions"
})
@XmlRootElement(name = "SubscriberConsumption")
public class SubscriberConsumption {

    @XmlElement(name = "ConsumptionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionID consumptionID;
    @XmlElement(name = "SpecificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecificationTypeCode specificationTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "TotalMeteredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalMeteredQuantity totalMeteredQuantity;
    @XmlElement(name = "SubscriberParty")
    protected PartyType subscriberParty;
    @XmlElement(name = "UtilityConsumptionPoint", required = true)
    protected ConsumptionPointType utilityConsumptionPoint;
    @XmlElement(name = "OnAccountPayment")
    protected List<OnAccountPaymentType> onAccountPayments;
    @XmlElement(name = "Consumption")
    protected Consumption consumption;
    @XmlElement(name = "SupplierConsumption")
    protected List<SupplierConsumption> supplierConsumptions;

    /**
     * Obtiene el valor de la propiedad consumptionID.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionID }
     *     
     */
    public ConsumptionID getConsumptionID() {
        return consumptionID;
    }

    /**
     * Define el valor de la propiedad consumptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionID }
     *     
     */
    public void setConsumptionID(ConsumptionID value) {
        this.consumptionID = value;
    }

    /**
     * Obtiene el valor de la propiedad specificationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationTypeCode }
     *     
     */
    public SpecificationTypeCode getSpecificationTypeCode() {
        return specificationTypeCode;
    }

    /**
     * Define el valor de la propiedad specificationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationTypeCode }
     *     
     */
    public void setSpecificationTypeCode(SpecificationTypeCode value) {
        this.specificationTypeCode = value;
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
     * Obtiene el valor de la propiedad totalMeteredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalMeteredQuantity }
     *     
     */
    public TotalMeteredQuantity getTotalMeteredQuantity() {
        return totalMeteredQuantity;
    }

    /**
     * Define el valor de la propiedad totalMeteredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalMeteredQuantity }
     *     
     */
    public void setTotalMeteredQuantity(TotalMeteredQuantity value) {
        this.totalMeteredQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubscriberParty() {
        return subscriberParty;
    }

    /**
     * Define el valor de la propiedad subscriberParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubscriberParty(PartyType value) {
        this.subscriberParty = value;
    }

    /**
     * Obtiene el valor de la propiedad utilityConsumptionPoint.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionPointType }
     *     
     */
    public ConsumptionPointType getUtilityConsumptionPoint() {
        return utilityConsumptionPoint;
    }

    /**
     * Define el valor de la propiedad utilityConsumptionPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionPointType }
     *     
     */
    public void setUtilityConsumptionPoint(ConsumptionPointType value) {
        this.utilityConsumptionPoint = value;
    }

    /**
     * Gets the value of the onAccountPayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onAccountPayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnAccountPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnAccountPaymentType }
     * 
     * 
     */
    public List<OnAccountPaymentType> getOnAccountPayments() {
        if (onAccountPayments == null) {
            onAccountPayments = new ArrayList<OnAccountPaymentType>();
        }
        return this.onAccountPayments;
    }

    /**
     * Obtiene el valor de la propiedad consumption.
     * 
     * @return
     *     possible object is
     *     {@link Consumption }
     *     
     */
    public Consumption getConsumption() {
        return consumption;
    }

    /**
     * Define el valor de la propiedad consumption.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumption }
     *     
     */
    public void setConsumption(Consumption value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the supplierConsumptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierConsumptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierConsumptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierConsumption }
     * 
     * 
     */
    public List<SupplierConsumption> getSupplierConsumptions() {
        if (supplierConsumptions == null) {
            supplierConsumptions = new ArrayList<SupplierConsumption>();
        }
        return this.supplierConsumptions;
    }

}
