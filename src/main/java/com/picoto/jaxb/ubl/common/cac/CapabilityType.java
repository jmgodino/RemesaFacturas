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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CapabilityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ValueAmount;
import com.picoto.jaxb.ubl.common.cbc.ValueQuantity;


/**
 * <p>Clase Java para CapabilityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CapabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CapabilityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityType", propOrder = {
    "capabilityTypeCode",
    "descriptions",
    "valueAmount",
    "valueQuantity",
    "evidenceSupplieds",
    "validityPeriod"
})
public class CapabilityType {

    @XmlElement(name = "CapabilityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CapabilityTypeCode capabilityTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "ValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueAmount valueAmount;
    @XmlElement(name = "ValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueQuantity valueQuantity;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSupplied> evidenceSupplieds;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;

    /**
     * Obtiene el valor de la propiedad capabilityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityTypeCode }
     *     
     */
    public CapabilityTypeCode getCapabilityTypeCode() {
        return capabilityTypeCode;
    }

    /**
     * Define el valor de la propiedad capabilityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityTypeCode }
     *     
     */
    public void setCapabilityTypeCode(CapabilityTypeCode value) {
        this.capabilityTypeCode = value;
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
     * Obtiene el valor de la propiedad valueAmount.
     * 
     * @return
     *     possible object is
     *     {@link ValueAmount }
     *     
     */
    public ValueAmount getValueAmount() {
        return valueAmount;
    }

    /**
     * Define el valor de la propiedad valueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAmount }
     *     
     */
    public void setValueAmount(ValueAmount value) {
        this.valueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad valueQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ValueQuantity }
     *     
     */
    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Define el valor de la propiedad valueQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQuantity }
     *     
     */
    public void setValueQuantity(ValueQuantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the evidenceSupplieds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceSupplieds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceSupplieds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceSupplied }
     * 
     * 
     */
    public List<EvidenceSupplied> getEvidenceSupplieds() {
        if (evidenceSupplieds == null) {
            evidenceSupplieds = new ArrayList<EvidenceSupplied>();
        }
        return this.evidenceSupplieds;
    }

    /**
     * Obtiene el valor de la propiedad validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Define el valor de la propiedad validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

}
