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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.EvaluationCriterionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.Expression;
import com.picoto.jaxb.ubl.common.cbc.ExpressionCode;
import com.picoto.jaxb.ubl.common.cbc.ThresholdAmount;
import com.picoto.jaxb.ubl.common.cbc.ThresholdQuantity;


/**
 * <p>Clase Java para EvaluationCriterionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EvaluationCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationCriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpressionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Expression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SuggestedEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationCriterionType", propOrder = {
    "evaluationCriterionTypeCode",
    "descriptions",
    "thresholdAmount",
    "thresholdQuantity",
    "expressionCode",
    "expressions",
    "durationPeriod",
    "suggestedEvidences"
})
public class EvaluationCriterionType {

    @XmlElement(name = "EvaluationCriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EvaluationCriterionTypeCode evaluationCriterionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "ThresholdAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdAmount thresholdAmount;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdQuantity thresholdQuantity;
    @XmlElement(name = "ExpressionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpressionCode expressionCode;
    @XmlElement(name = "Expression", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Expression> expressions;
    @XmlElement(name = "DurationPeriod")
    protected PeriodType durationPeriod;
    @XmlElement(name = "SuggestedEvidence")
    protected List<EvidenceType> suggestedEvidences;

    /**
     * Obtiene el valor de la propiedad evaluationCriterionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationCriterionTypeCode }
     *     
     */
    public EvaluationCriterionTypeCode getEvaluationCriterionTypeCode() {
        return evaluationCriterionTypeCode;
    }

    /**
     * Define el valor de la propiedad evaluationCriterionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationCriterionTypeCode }
     *     
     */
    public void setEvaluationCriterionTypeCode(EvaluationCriterionTypeCode value) {
        this.evaluationCriterionTypeCode = value;
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
     * Obtiene el valor de la propiedad thresholdAmount.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdAmount }
     *     
     */
    public ThresholdAmount getThresholdAmount() {
        return thresholdAmount;
    }

    /**
     * Define el valor de la propiedad thresholdAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdAmount }
     *     
     */
    public void setThresholdAmount(ThresholdAmount value) {
        this.thresholdAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad thresholdQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantity }
     *     
     */
    public ThresholdQuantity getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Define el valor de la propiedad thresholdQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantity }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantity value) {
        this.thresholdQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad expressionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionCode }
     *     
     */
    public ExpressionCode getExpressionCode() {
        return expressionCode;
    }

    /**
     * Define el valor de la propiedad expressionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionCode }
     *     
     */
    public void setExpressionCode(ExpressionCode value) {
        this.expressionCode = value;
    }

    /**
     * Gets the value of the expressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new ArrayList<Expression>();
        }
        return this.expressions;
    }

    /**
     * Obtiene el valor de la propiedad durationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Define el valor de la propiedad durationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDurationPeriod(PeriodType value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the suggestedEvidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedEvidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedEvidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getSuggestedEvidences() {
        if (suggestedEvidences == null) {
            suggestedEvidences = new ArrayList<EvidenceType>();
        }
        return this.suggestedEvidences;
    }

}
