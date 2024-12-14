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
import com.picoto.jaxb.ubl.common.cbc.AvailabilityDate;
import com.picoto.jaxb.ubl.common.cbc.AvailabilityStatusCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InventoryValueAmount;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.Quantity;


/**
 * <p>Clase Java para InventoryReportLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InventoryReportLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InventoryValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AvailabilityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AvailabilityStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InventoryLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryReportLineType", propOrder = {
    "id",
    "notes",
    "quantity",
    "inventoryValueAmount",
    "availabilityDate",
    "availabilityStatusCode",
    "item",
    "inventoryLocation"
})
@XmlRootElement(name = "InventoryReportLine")
public class InventoryReportLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected Quantity quantity;
    @XmlElement(name = "InventoryValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InventoryValueAmount inventoryValueAmount;
    @XmlElement(name = "AvailabilityDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AvailabilityDate availabilityDate;
    @XmlElement(name = "AvailabilityStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AvailabilityStatusCode availabilityStatusCode;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "InventoryLocation")
    protected LocationType inventoryLocation;

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
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link InventoryValueAmount }
     *     
     */
    public InventoryValueAmount getInventoryValueAmount() {
        return inventoryValueAmount;
    }

    /**
     * Define el valor de la propiedad inventoryValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryValueAmount }
     *     
     */
    public void setInventoryValueAmount(InventoryValueAmount value) {
        this.inventoryValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityDate.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityDate }
     *     
     */
    public AvailabilityDate getAvailabilityDate() {
        return availabilityDate;
    }

    /**
     * Define el valor de la propiedad availabilityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityDate }
     *     
     */
    public void setAvailabilityDate(AvailabilityDate value) {
        this.availabilityDate = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityStatusCode }
     *     
     */
    public AvailabilityStatusCode getAvailabilityStatusCode() {
        return availabilityStatusCode;
    }

    /**
     * Define el valor de la propiedad availabilityStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityStatusCode }
     *     
     */
    public void setAvailabilityStatusCode(AvailabilityStatusCode value) {
        this.availabilityStatusCode = value;
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
     * Obtiene el valor de la propiedad inventoryLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Define el valor de la propiedad inventoryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setInventoryLocation(LocationType value) {
        this.inventoryLocation = value;
    }

}
