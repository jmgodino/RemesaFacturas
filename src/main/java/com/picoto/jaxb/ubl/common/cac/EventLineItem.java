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
import com.picoto.jaxb.ubl.common.cbc.LineNumberNumeric;


/**
 * <p>Clase Java para EventLineItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipatingLocationsLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RetailPlannedImpact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLineItemType", propOrder = {
    "lineNumberNumeric",
    "participatingLocationsLocation",
    "retailPlannedImpacts",
    "supplyItem"
})
@XmlRootElement(name = "EventLineItem")
public class EventLineItem {

    @XmlElement(name = "LineNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineNumberNumeric lineNumberNumeric;
    @XmlElement(name = "ParticipatingLocationsLocation")
    protected LocationType participatingLocationsLocation;
    @XmlElement(name = "RetailPlannedImpact")
    protected List<RetailPlannedImpact> retailPlannedImpacts;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

    /**
     * Obtiene el valor de la propiedad lineNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link LineNumberNumeric }
     *     
     */
    public LineNumberNumeric getLineNumberNumeric() {
        return lineNumberNumeric;
    }

    /**
     * Define el valor de la propiedad lineNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNumberNumeric }
     *     
     */
    public void setLineNumberNumeric(LineNumberNumeric value) {
        this.lineNumberNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad participatingLocationsLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getParticipatingLocationsLocation() {
        return participatingLocationsLocation;
    }

    /**
     * Define el valor de la propiedad participatingLocationsLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setParticipatingLocationsLocation(LocationType value) {
        this.participatingLocationsLocation = value;
    }

    /**
     * Gets the value of the retailPlannedImpacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPlannedImpacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPlannedImpacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPlannedImpact }
     * 
     * 
     */
    public List<RetailPlannedImpact> getRetailPlannedImpacts() {
        if (retailPlannedImpacts == null) {
            retailPlannedImpacts = new ArrayList<RetailPlannedImpact>();
        }
        return this.retailPlannedImpacts;
    }

    /**
     * Obtiene el valor de la propiedad supplyItem.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Define el valor de la propiedad supplyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

}
