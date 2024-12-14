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
import com.picoto.jaxb.ubl.common.cbc.ConditionCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.IndicationIndicator;
import com.picoto.jaxb.ubl.common.cbc.Percent;
import com.picoto.jaxb.ubl.common.cbc.ReferenceDate;
import com.picoto.jaxb.ubl.common.cbc.ReferenceTime;
import com.picoto.jaxb.ubl.common.cbc.ReliabilityPercent;
import com.picoto.jaxb.ubl.common.cbc.SequenceID;
import com.picoto.jaxb.ubl.common.cbc.StatusReason;
import com.picoto.jaxb.ubl.common.cbc.StatusReasonCode;
import com.picoto.jaxb.ubl.common.cbc.Text;


/**
 * <p>Clase Java para StatusType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndicationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReliabilityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
    "conditionCode",
    "referenceDate",
    "referenceTime",
    "descriptions",
    "statusReasonCode",
    "statusReasons",
    "sequenceID",
    "texts",
    "indicationIndicator",
    "percent",
    "reliabilityPercent",
    "conditions"
})
public class StatusType {

    @XmlElement(name = "ConditionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConditionCode conditionCode;
    @XmlElement(name = "ReferenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceDate referenceDate;
    @XmlElement(name = "ReferenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceTime referenceTime;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "StatusReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StatusReasonCode statusReasonCode;
    @XmlElement(name = "StatusReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<StatusReason> statusReasons;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceID sequenceID;
    @XmlElement(name = "Text", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Text> texts;
    @XmlElement(name = "IndicationIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IndicationIndicator indicationIndicator;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Percent percent;
    @XmlElement(name = "ReliabilityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReliabilityPercent reliabilityPercent;
    @XmlElement(name = "Condition")
    protected List<Condition> conditions;

    /**
     * Obtiene el valor de la propiedad conditionCode.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCode }
     *     
     */
    public ConditionCode getConditionCode() {
        return conditionCode;
    }

    /**
     * Define el valor de la propiedad conditionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCode }
     *     
     */
    public void setConditionCode(ConditionCode value) {
        this.conditionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceDate.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDate }
     *     
     */
    public ReferenceDate getReferenceDate() {
        return referenceDate;
    }

    /**
     * Define el valor de la propiedad referenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDate }
     *     
     */
    public void setReferenceDate(ReferenceDate value) {
        this.referenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceTime.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTime }
     *     
     */
    public ReferenceTime getReferenceTime() {
        return referenceTime;
    }

    /**
     * Define el valor de la propiedad referenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTime }
     *     
     */
    public void setReferenceTime(ReferenceTime value) {
        this.referenceTime = value;
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
     * Obtiene el valor de la propiedad statusReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonCode }
     *     
     */
    public StatusReasonCode getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Define el valor de la propiedad statusReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonCode }
     *     
     */
    public void setStatusReasonCode(StatusReasonCode value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the statusReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReason }
     * 
     * 
     */
    public List<StatusReason> getStatusReasons() {
        if (statusReasons == null) {
            statusReasons = new ArrayList<StatusReason>();
        }
        return this.statusReasons;
    }

    /**
     * Obtiene el valor de la propiedad sequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceID }
     *     
     */
    public SequenceID getSequenceID() {
        return sequenceID;
    }

    /**
     * Define el valor de la propiedad sequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceID }
     *     
     */
    public void setSequenceID(SequenceID value) {
        this.sequenceID = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getTexts() {
        if (texts == null) {
            texts = new ArrayList<Text>();
        }
        return this.texts;
    }

    /**
     * Obtiene el valor de la propiedad indicationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link IndicationIndicator }
     *     
     */
    public IndicationIndicator getIndicationIndicator() {
        return indicationIndicator;
    }

    /**
     * Define el valor de la propiedad indicationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationIndicator }
     *     
     */
    public void setIndicationIndicator(IndicationIndicator value) {
        this.indicationIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     * @return
     *     possible object is
     *     {@link Percent }
     *     
     */
    public Percent getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     * @param value
     *     allowed object is
     *     {@link Percent }
     *     
     */
    public void setPercent(Percent value) {
        this.percent = value;
    }

    /**
     * Obtiene el valor de la propiedad reliabilityPercent.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityPercent }
     *     
     */
    public ReliabilityPercent getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Define el valor de la propiedad reliabilityPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityPercent }
     *     
     */
    public void setReliabilityPercent(ReliabilityPercent value) {
        this.reliabilityPercent = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Condition }
     * 
     * 
     */
    public List<Condition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<Condition>();
        }
        return this.conditions;
    }

}
