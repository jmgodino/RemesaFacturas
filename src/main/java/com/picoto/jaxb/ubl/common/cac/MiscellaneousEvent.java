//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.MiscellaneousEventTypeCode;


/**
 * <p>Clase Java para MiscellaneousEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MiscellaneousEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventLineItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousEventType", propOrder = {
    "miscellaneousEventTypeCode",
    "eventLineItems"
})
@XmlRootElement(name = "MiscellaneousEvent")
public class MiscellaneousEvent {

    @XmlElement(name = "MiscellaneousEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected MiscellaneousEventTypeCode miscellaneousEventTypeCode;
    @XmlElement(name = "EventLineItem", required = true)
    protected List<EventLineItem> eventLineItems;

    /**
     * Obtiene el valor de la propiedad miscellaneousEventTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousEventTypeCode }
     *     
     */
    public MiscellaneousEventTypeCode getMiscellaneousEventTypeCode() {
        return miscellaneousEventTypeCode;
    }

    /**
     * Define el valor de la propiedad miscellaneousEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousEventTypeCode }
     *     
     */
    public void setMiscellaneousEventTypeCode(MiscellaneousEventTypeCode value) {
        this.miscellaneousEventTypeCode = value;
    }

    /**
     * Gets the value of the eventLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventLineItem }
     * 
     * 
     */
    public List<EventLineItem> getEventLineItems() {
        if (eventLineItems == null) {
            eventLineItems = new ArrayList<EventLineItem>();
        }
        return this.eventLineItems;
    }

}
