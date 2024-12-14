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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.OversupplyQuantity;
import com.picoto.jaxb.ubl.common.cbc.QuantityDiscrepancyCode;
import com.picoto.jaxb.ubl.common.cbc.ReceivedDate;
import com.picoto.jaxb.ubl.common.cbc.ReceivedQuantity;
import com.picoto.jaxb.ubl.common.cbc.RejectActionCode;
import com.picoto.jaxb.ubl.common.cbc.RejectReason;
import com.picoto.jaxb.ubl.common.cbc.RejectReasonCode;
import com.picoto.jaxb.ubl.common.cbc.RejectedQuantity;
import com.picoto.jaxb.ubl.common.cbc.ShortQuantity;
import com.picoto.jaxb.ubl.common.cbc.ShortageActionCode;
import com.picoto.jaxb.ubl.common.cbc.TimingComplaint;
import com.picoto.jaxb.ubl.common.cbc.TimingComplaintCode;
import com.picoto.jaxb.ubl.common.cbc.UUID;


/**
 * <p>Clase Java para ReceiptLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReceiptLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortageActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QuantityDiscrepancyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaintCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaint" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptLineType", propOrder = {
    "id",
    "uuid",
    "notes",
    "receivedQuantity",
    "shortQuantity",
    "shortageActionCode",
    "rejectedQuantity",
    "rejectReasonCode",
    "rejectReasons",
    "rejectActionCode",
    "quantityDiscrepancyCode",
    "oversupplyQuantity",
    "receivedDate",
    "timingComplaintCode",
    "timingComplaint",
    "orderLineReference",
    "despatchLineReferences",
    "documentReferences",
    "items",
    "shipments"
})
public class ReceiptLineType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "ReceivedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedQuantity receivedQuantity;
    @XmlElement(name = "ShortQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShortQuantity shortQuantity;
    @XmlElement(name = "ShortageActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShortageActionCode shortageActionCode;
    @XmlElement(name = "RejectedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectedQuantity rejectedQuantity;
    @XmlElement(name = "RejectReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectReasonCode rejectReasonCode;
    @XmlElement(name = "RejectReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RejectReason> rejectReasons;
    @XmlElement(name = "RejectActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectActionCode rejectActionCode;
    @XmlElement(name = "QuantityDiscrepancyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityDiscrepancyCode quantityDiscrepancyCode;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OversupplyQuantity oversupplyQuantity;
    @XmlElement(name = "ReceivedDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedDate receivedDate;
    @XmlElement(name = "TimingComplaintCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimingComplaintCode timingComplaintCode;
    @XmlElement(name = "TimingComplaint", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimingComplaint timingComplaint;
    @XmlElement(name = "OrderLineReference")
    protected OrderLineReference orderLineReference;
    @XmlElement(name = "DespatchLineReference")
    protected List<LineReferenceType> despatchLineReferences;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item")
    protected List<ItemType> items;
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
     * Obtiene el valor de la propiedad receivedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedQuantity }
     *     
     */
    public ReceivedQuantity getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Define el valor de la propiedad receivedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedQuantity }
     *     
     */
    public void setReceivedQuantity(ReceivedQuantity value) {
        this.receivedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad shortQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ShortQuantity }
     *     
     */
    public ShortQuantity getShortQuantity() {
        return shortQuantity;
    }

    /**
     * Define el valor de la propiedad shortQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortQuantity }
     *     
     */
    public void setShortQuantity(ShortQuantity value) {
        this.shortQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad shortageActionCode.
     * 
     * @return
     *     possible object is
     *     {@link ShortageActionCode }
     *     
     */
    public ShortageActionCode getShortageActionCode() {
        return shortageActionCode;
    }

    /**
     * Define el valor de la propiedad shortageActionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortageActionCode }
     *     
     */
    public void setShortageActionCode(ShortageActionCode value) {
        this.shortageActionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link RejectedQuantity }
     *     
     */
    public RejectedQuantity getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Define el valor de la propiedad rejectedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedQuantity }
     *     
     */
    public void setRejectedQuantity(RejectedQuantity value) {
        this.rejectedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link RejectReasonCode }
     *     
     */
    public RejectReasonCode getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Define el valor de la propiedad rejectReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReasonCode }
     *     
     */
    public void setRejectReasonCode(RejectReasonCode value) {
        this.rejectReasonCode = value;
    }

    /**
     * Gets the value of the rejectReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReason }
     * 
     * 
     */
    public List<RejectReason> getRejectReasons() {
        if (rejectReasons == null) {
            rejectReasons = new ArrayList<RejectReason>();
        }
        return this.rejectReasons;
    }

    /**
     * Obtiene el valor de la propiedad rejectActionCode.
     * 
     * @return
     *     possible object is
     *     {@link RejectActionCode }
     *     
     */
    public RejectActionCode getRejectActionCode() {
        return rejectActionCode;
    }

    /**
     * Define el valor de la propiedad rejectActionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectActionCode }
     *     
     */
    public void setRejectActionCode(RejectActionCode value) {
        this.rejectActionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityDiscrepancyCode.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDiscrepancyCode }
     *     
     */
    public QuantityDiscrepancyCode getQuantityDiscrepancyCode() {
        return quantityDiscrepancyCode;
    }

    /**
     * Define el valor de la propiedad quantityDiscrepancyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDiscrepancyCode }
     *     
     */
    public void setQuantityDiscrepancyCode(QuantityDiscrepancyCode value) {
        this.quantityDiscrepancyCode = value;
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
     * Obtiene el valor de la propiedad receivedDate.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedDate }
     *     
     */
    public ReceivedDate getReceivedDate() {
        return receivedDate;
    }

    /**
     * Define el valor de la propiedad receivedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedDate }
     *     
     */
    public void setReceivedDate(ReceivedDate value) {
        this.receivedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad timingComplaintCode.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaintCode }
     *     
     */
    public TimingComplaintCode getTimingComplaintCode() {
        return timingComplaintCode;
    }

    /**
     * Define el valor de la propiedad timingComplaintCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaintCode }
     *     
     */
    public void setTimingComplaintCode(TimingComplaintCode value) {
        this.timingComplaintCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timingComplaint.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaint }
     *     
     */
    public TimingComplaint getTimingComplaint() {
        return timingComplaint;
    }

    /**
     * Define el valor de la propiedad timingComplaint.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaint }
     *     
     */
    public void setTimingComplaint(TimingComplaint value) {
        this.timingComplaint = value;
    }

    /**
     * Obtiene el valor de la propiedad orderLineReference.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineReference }
     *     
     */
    public OrderLineReference getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Define el valor de la propiedad orderLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineReference }
     *     
     */
    public void setOrderLineReference(OrderLineReference value) {
        this.orderLineReference = value;
    }

    /**
     * Gets the value of the despatchLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReferences() {
        if (despatchLineReferences == null) {
            despatchLineReferences = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReferences;
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
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItems() {
        if (items == null) {
            items = new ArrayList<ItemType>();
        }
        return this.items;
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
