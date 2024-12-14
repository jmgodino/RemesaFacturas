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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.FrozenPeriodDaysNumeric;
import com.picoto.jaxb.ubl.common.cbc.MinimumInventoryQuantity;
import com.picoto.jaxb.ubl.common.cbc.MultipleOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.OrderIntervalDaysNumeric;
import com.picoto.jaxb.ubl.common.cbc.ReplenishmentOwnerDescription;
import com.picoto.jaxb.ubl.common.cbc.TargetInventoryQuantity;
import com.picoto.jaxb.ubl.common.cbc.TargetServicePercent;


/**
 * <p>Clase Java para ItemManagementProfileType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemManagementProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FrozenPeriodDaysNumeric" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumInventoryQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultipleOrderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderIntervalDaysNumeric" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReplenishmentOwnerDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetServicePercent" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetInventoryQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemLocationQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemManagementProfileType", propOrder = {
    "frozenPeriodDaysNumeric",
    "minimumInventoryQuantity",
    "multipleOrderQuantity",
    "orderIntervalDaysNumeric",
    "replenishmentOwnerDescriptions",
    "targetServicePercent",
    "targetInventoryQuantity",
    "effectivePeriod",
    "item",
    "itemLocationQuantity"
})
@XmlRootElement(name = "ItemManagementProfile")
public class ItemManagementProfile {

    @XmlElement(name = "FrozenPeriodDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FrozenPeriodDaysNumeric frozenPeriodDaysNumeric;
    @XmlElement(name = "MinimumInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumInventoryQuantity minimumInventoryQuantity;
    @XmlElement(name = "MultipleOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MultipleOrderQuantity multipleOrderQuantity;
    @XmlElement(name = "OrderIntervalDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderIntervalDaysNumeric orderIntervalDaysNumeric;
    @XmlElement(name = "ReplenishmentOwnerDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ReplenishmentOwnerDescription> replenishmentOwnerDescriptions;
    @XmlElement(name = "TargetServicePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetServicePercent targetServicePercent;
    @XmlElement(name = "TargetInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetInventoryQuantity targetInventoryQuantity;
    @XmlElement(name = "EffectivePeriod", required = true)
    protected PeriodType effectivePeriod;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "ItemLocationQuantity")
    protected ItemLocationQuantityType itemLocationQuantity;

    /**
     * Obtiene el valor de la propiedad frozenPeriodDaysNumeric.
     * 
     * @return
     *     possible object is
     *     {@link FrozenPeriodDaysNumeric }
     *     
     */
    public FrozenPeriodDaysNumeric getFrozenPeriodDaysNumeric() {
        return frozenPeriodDaysNumeric;
    }

    /**
     * Define el valor de la propiedad frozenPeriodDaysNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link FrozenPeriodDaysNumeric }
     *     
     */
    public void setFrozenPeriodDaysNumeric(FrozenPeriodDaysNumeric value) {
        this.frozenPeriodDaysNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumInventoryQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumInventoryQuantity }
     *     
     */
    public MinimumInventoryQuantity getMinimumInventoryQuantity() {
        return minimumInventoryQuantity;
    }

    /**
     * Define el valor de la propiedad minimumInventoryQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumInventoryQuantity }
     *     
     */
    public void setMinimumInventoryQuantity(MinimumInventoryQuantity value) {
        this.minimumInventoryQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad multipleOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOrderQuantity }
     *     
     */
    public MultipleOrderQuantity getMultipleOrderQuantity() {
        return multipleOrderQuantity;
    }

    /**
     * Define el valor de la propiedad multipleOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOrderQuantity }
     *     
     */
    public void setMultipleOrderQuantity(MultipleOrderQuantity value) {
        this.multipleOrderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad orderIntervalDaysNumeric.
     * 
     * @return
     *     possible object is
     *     {@link OrderIntervalDaysNumeric }
     *     
     */
    public OrderIntervalDaysNumeric getOrderIntervalDaysNumeric() {
        return orderIntervalDaysNumeric;
    }

    /**
     * Define el valor de la propiedad orderIntervalDaysNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIntervalDaysNumeric }
     *     
     */
    public void setOrderIntervalDaysNumeric(OrderIntervalDaysNumeric value) {
        this.orderIntervalDaysNumeric = value;
    }

    /**
     * Gets the value of the replenishmentOwnerDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replenishmentOwnerDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplenishmentOwnerDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplenishmentOwnerDescription }
     * 
     * 
     */
    public List<ReplenishmentOwnerDescription> getReplenishmentOwnerDescriptions() {
        if (replenishmentOwnerDescriptions == null) {
            replenishmentOwnerDescriptions = new ArrayList<ReplenishmentOwnerDescription>();
        }
        return this.replenishmentOwnerDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad targetServicePercent.
     * 
     * @return
     *     possible object is
     *     {@link TargetServicePercent }
     *     
     */
    public TargetServicePercent getTargetServicePercent() {
        return targetServicePercent;
    }

    /**
     * Define el valor de la propiedad targetServicePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetServicePercent }
     *     
     */
    public void setTargetServicePercent(TargetServicePercent value) {
        this.targetServicePercent = value;
    }

    /**
     * Obtiene el valor de la propiedad targetInventoryQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TargetInventoryQuantity }
     *     
     */
    public TargetInventoryQuantity getTargetInventoryQuantity() {
        return targetInventoryQuantity;
    }

    /**
     * Define el valor de la propiedad targetInventoryQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetInventoryQuantity }
     *     
     */
    public void setTargetInventoryQuantity(TargetInventoryQuantity value) {
        this.targetInventoryQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad effectivePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Define el valor de la propiedad effectivePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
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
     * Obtiene el valor de la propiedad itemLocationQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public ItemLocationQuantityType getItemLocationQuantity() {
        return itemLocationQuantity;
    }

    /**
     * Define el valor de la propiedad itemLocationQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setItemLocationQuantity(ItemLocationQuantityType value) {
        this.itemLocationQuantity = value;
    }

}
