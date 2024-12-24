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
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.MaximumPercent;
import com.picoto.jaxb.ubl.common.cbc.MinimumPercent;
import com.picoto.jaxb.ubl.common.cbc.Rate;
import com.picoto.jaxb.ubl.common.cbc.SubcontractingConditionsCode;
import com.picoto.jaxb.ubl.common.cbc.UnknownPriceIndicator;


/**
 * <p>Clase Java para SubcontractTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubcontractTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UnknownPriceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubcontractingConditionsCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumPercent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcontractTermsType", propOrder = {
    "rate",
    "unknownPriceIndicator",
    "descriptions",
    "amount",
    "subcontractingConditionsCode",
    "maximumPercent",
    "minimumPercent"
})
public class SubcontractTermsType {

    @XmlElement(name = "Rate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Rate rate;
    @XmlElement(name = "UnknownPriceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UnknownPriceIndicator unknownPriceIndicator;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Amount amount;
    @XmlElement(name = "SubcontractingConditionsCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubcontractingConditionsCode subcontractingConditionsCode;
    @XmlElement(name = "MaximumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumPercent maximumPercent;
    @XmlElement(name = "MinimumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumPercent minimumPercent;

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad unknownPriceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link UnknownPriceIndicator }
     *     
     */
    public UnknownPriceIndicator getUnknownPriceIndicator() {
        return unknownPriceIndicator;
    }

    /**
     * Define el valor de la propiedad unknownPriceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownPriceIndicator }
     *     
     */
    public void setUnknownPriceIndicator(UnknownPriceIndicator value) {
        this.unknownPriceIndicator = value;
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
     * Obtiene el valor de la propiedad subcontractingConditionsCode.
     * 
     * @return
     *     possible object is
     *     {@link SubcontractingConditionsCode }
     *     
     */
    public SubcontractingConditionsCode getSubcontractingConditionsCode() {
        return subcontractingConditionsCode;
    }

    /**
     * Define el valor de la propiedad subcontractingConditionsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcontractingConditionsCode }
     *     
     */
    public void setSubcontractingConditionsCode(SubcontractingConditionsCode value) {
        this.subcontractingConditionsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumPercent.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPercent }
     *     
     */
    public MaximumPercent getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * Define el valor de la propiedad maximumPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPercent }
     *     
     */
    public void setMaximumPercent(MaximumPercent value) {
        this.maximumPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumPercent.
     * 
     * @return
     *     possible object is
     *     {@link MinimumPercent }
     *     
     */
    public MinimumPercent getMinimumPercent() {
        return minimumPercent;
    }

    /**
     * Define el valor de la propiedad minimumPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumPercent }
     *     
     */
    public void setMinimumPercent(MinimumPercent value) {
        this.minimumPercent = value;
    }

}
