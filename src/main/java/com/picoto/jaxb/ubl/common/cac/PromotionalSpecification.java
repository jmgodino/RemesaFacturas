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
import com.picoto.jaxb.ubl.common.cbc.SpecificationID;


/**
 * <p>Clase Java para PromotionalSpecificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalEventLineItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventTactic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSpecificationType", propOrder = {
    "specificationID",
    "promotionalEventLineItems",
    "eventTactics"
})
@XmlRootElement(name = "PromotionalSpecification")
public class PromotionalSpecification {

    @XmlElement(name = "SpecificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecificationID specificationID;
    @XmlElement(name = "PromotionalEventLineItem", required = true)
    protected List<PromotionalEventLineItem> promotionalEventLineItems;
    @XmlElement(name = "EventTactic")
    protected List<EventTactic> eventTactics;

    /**
     * Obtiene el valor de la propiedad specificationID.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationID }
     *     
     */
    public SpecificationID getSpecificationID() {
        return specificationID;
    }

    /**
     * Define el valor de la propiedad specificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationID }
     *     
     */
    public void setSpecificationID(SpecificationID value) {
        this.specificationID = value;
    }

    /**
     * Gets the value of the promotionalEventLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalEventLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalEventLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalEventLineItem }
     * 
     * 
     */
    public List<PromotionalEventLineItem> getPromotionalEventLineItems() {
        if (promotionalEventLineItems == null) {
            promotionalEventLineItems = new ArrayList<PromotionalEventLineItem>();
        }
        return this.promotionalEventLineItems;
    }

    /**
     * Gets the value of the eventTactics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTactics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTactics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTactic }
     * 
     * 
     */
    public List<EventTactic> getEventTactics() {
        if (eventTactics == null) {
            eventTactics = new ArrayList<EventTactic>();
        }
        return this.eventTactics;
    }

}
