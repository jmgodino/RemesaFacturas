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
import com.picoto.jaxb.ubl.common.cbc.BackorderQuantity;
import com.picoto.jaxb.ubl.common.cbc.BackorderReason;
import com.picoto.jaxb.ubl.common.cbc.DeliveredQuantity;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LineStatusCode;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.OutstandingQuantity;
import com.picoto.jaxb.ubl.common.cbc.OutstandingReason;
import com.picoto.jaxb.ubl.common.cbc.OversupplyQuantity;
import com.picoto.jaxb.ubl.common.cbc.UUID;


/**
 * <p>Clase Java para DespatchLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DespatchLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchLineType", propOrder = {
    "id",
    "uuid",
    "notes",
    "lineStatusCode",
    "deliveredQuantity",
    "backorderQuantity",
    "backorderReasons",
    "outstandingQuantity",
    "outstandingReasons",
    "oversupplyQuantity",
    "orderLineReferences",
    "documentReferences",
    "item",
    "shipments"
})
public class DespatchLineType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineStatusCode lineStatusCode;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeliveredQuantity deliveredQuantity;
    @XmlElement(name = "BackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BackorderQuantity backorderQuantity;
    @XmlElement(name = "BackorderReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BackorderReason> backorderReasons;
    @XmlElement(name = "OutstandingQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OutstandingQuantity outstandingQuantity;
    @XmlElement(name = "OutstandingReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<OutstandingReason> outstandingReasons;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OversupplyQuantity oversupplyQuantity;
    @XmlElement(name = "OrderLineReference", required = true)
    protected List<OrderLineReference> orderLineReferences;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "Shipment")
    protected List<ShipmentType> shipments;

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
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
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
     * Obtiene el valor de la propiedad lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCode }
     *     
     */
    public LineStatusCode getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Define el valor de la propiedad lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCode }
     *     
     */
    public void setLineStatusCode(LineStatusCode value) {
        this.lineStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantity }
     *     
     */
    public DeliveredQuantity getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Define el valor de la propiedad deliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantity }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantity value) {
        this.deliveredQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad backorderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BackorderQuantity }
     *     
     */
    public BackorderQuantity getBackorderQuantity() {
        return backorderQuantity;
    }

    /**
     * Define el valor de la propiedad backorderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BackorderQuantity }
     *     
     */
    public void setBackorderQuantity(BackorderQuantity value) {
        this.backorderQuantity = value;
    }

    /**
     * Gets the value of the backorderReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backorderReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackorderReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackorderReason }
     * 
     * 
     */
    public List<BackorderReason> getBackorderReasons() {
        if (backorderReasons == null) {
            backorderReasons = new ArrayList<BackorderReason>();
        }
        return this.backorderReasons;
    }

    /**
     * Obtiene el valor de la propiedad outstandingQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OutstandingQuantity }
     *     
     */
    public OutstandingQuantity getOutstandingQuantity() {
        return outstandingQuantity;
    }

    /**
     * Define el valor de la propiedad outstandingQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OutstandingQuantity }
     *     
     */
    public void setOutstandingQuantity(OutstandingQuantity value) {
        this.outstandingQuantity = value;
    }

    /**
     * Gets the value of the outstandingReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutstandingReason }
     * 
     * 
     */
    public List<OutstandingReason> getOutstandingReasons() {
        if (outstandingReasons == null) {
            outstandingReasons = new ArrayList<OutstandingReason>();
        }
        return this.outstandingReasons;
    }

    /**
     * Obtiene el valor de la propiedad oversupplyQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OversupplyQuantity }
     *     
     */
    public OversupplyQuantity getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    /**
     * Define el valor de la propiedad oversupplyQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OversupplyQuantity }
     *     
     */
    public void setOversupplyQuantity(OversupplyQuantity value) {
        this.oversupplyQuantity = value;
    }

    /**
     * Gets the value of the orderLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineReference }
     * 
     * 
     */
    public List<OrderLineReference> getOrderLineReferences() {
        if (orderLineReferences == null) {
            orderLineReferences = new ArrayList<OrderLineReference>();
        }
        return this.orderLineReferences;
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
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getShipments() {
        if (shipments == null) {
            shipments = new ArrayList<ShipmentType>();
        }
        return this.shipments;
    }

}
