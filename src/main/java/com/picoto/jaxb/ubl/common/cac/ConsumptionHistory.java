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
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionLevel;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionLevelCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.MeterNumber;
import com.picoto.jaxb.ubl.common.cbc.Quantity;


/**
 * <p>Clase Java para ConsumptionHistoryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionHistoryType", propOrder = {
    "meterNumber",
    "quantity",
    "amount",
    "consumptionLevelCode",
    "consumptionLevel",
    "descriptions",
    "period"
})
@XmlRootElement(name = "ConsumptionHistory")
public class ConsumptionHistory {

    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNumber meterNumber;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected Quantity quantity;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Amount amount;
    @XmlElement(name = "ConsumptionLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionLevelCode consumptionLevelCode;
    @XmlElement(name = "ConsumptionLevel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionLevel consumptionLevel;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "Period", required = true)
    protected PeriodType period;

    /**
     * Obtiene el valor de la propiedad meterNumber.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumber }
     *     
     */
    public MeterNumber getMeterNumber() {
        return meterNumber;
    }

    /**
     * Define el valor de la propiedad meterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumber }
     *     
     */
    public void setMeterNumber(MeterNumber value) {
        this.meterNumber = value;
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
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionLevelCode }
     *     
     */
    public ConsumptionLevelCode getConsumptionLevelCode() {
        return consumptionLevelCode;
    }

    /**
     * Define el valor de la propiedad consumptionLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionLevelCode }
     *     
     */
    public void setConsumptionLevelCode(ConsumptionLevelCode value) {
        this.consumptionLevelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionLevel.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionLevel }
     *     
     */
    public ConsumptionLevel getConsumptionLevel() {
        return consumptionLevel;
    }

    /**
     * Define el valor de la propiedad consumptionLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionLevel }
     *     
     */
    public void setConsumptionLevel(ConsumptionLevel value) {
        this.consumptionLevel = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

}
