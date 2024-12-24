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
import com.picoto.jaxb.ubl.common.cbc.ExpectedOperatorQuantity;
import com.picoto.jaxb.ubl.common.cbc.Frequency;
import com.picoto.jaxb.ubl.common.cbc.Justification;
import com.picoto.jaxb.ubl.common.cbc.MaximumOperatorQuantity;


/**
 * <p>Clase Java para FrameworkAgreementType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FrameworkAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Justification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Frequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsequentProcessTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkAgreementType", propOrder = {
    "expectedOperatorQuantity",
    "maximumOperatorQuantity",
    "justifications",
    "frequencies",
    "durationPeriod",
    "subsequentProcessTenderRequirements"
})
@XmlRootElement(name = "FrameworkAgreement")
public class FrameworkAgreement {

    @XmlElement(name = "ExpectedOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedOperatorQuantity expectedOperatorQuantity;
    @XmlElement(name = "MaximumOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumOperatorQuantity maximumOperatorQuantity;
    @XmlElement(name = "Justification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Justification> justifications;
    @XmlElement(name = "Frequency", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Frequency> frequencies;
    @XmlElement(name = "DurationPeriod")
    protected PeriodType durationPeriod;
    @XmlElement(name = "SubsequentProcessTenderRequirement")
    protected List<TenderRequirementType> subsequentProcessTenderRequirements;

    /**
     * Obtiene el valor de la propiedad expectedOperatorQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedOperatorQuantity }
     *     
     */
    public ExpectedOperatorQuantity getExpectedOperatorQuantity() {
        return expectedOperatorQuantity;
    }

    /**
     * Define el valor de la propiedad expectedOperatorQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedOperatorQuantity }
     *     
     */
    public void setExpectedOperatorQuantity(ExpectedOperatorQuantity value) {
        this.expectedOperatorQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumOperatorQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOperatorQuantity }
     *     
     */
    public MaximumOperatorQuantity getMaximumOperatorQuantity() {
        return maximumOperatorQuantity;
    }

    /**
     * Define el valor de la propiedad maximumOperatorQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOperatorQuantity }
     *     
     */
    public void setMaximumOperatorQuantity(MaximumOperatorQuantity value) {
        this.maximumOperatorQuantity = value;
    }

    /**
     * Gets the value of the justifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Justification }
     * 
     * 
     */
    public List<Justification> getJustifications() {
        if (justifications == null) {
            justifications = new ArrayList<Justification>();
        }
        return this.justifications;
    }

    /**
     * Gets the value of the frequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frequency }
     * 
     * 
     */
    public List<Frequency> getFrequencies() {
        if (frequencies == null) {
            frequencies = new ArrayList<Frequency>();
        }
        return this.frequencies;
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
     * Gets the value of the subsequentProcessTenderRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsequentProcessTenderRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsequentProcessTenderRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getSubsequentProcessTenderRequirements() {
        if (subsequentProcessTenderRequirements == null) {
            subsequentProcessTenderRequirements = new ArrayList<TenderRequirementType>();
        }
        return this.subsequentProcessTenderRequirements;
    }

}
