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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AmountRate;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.GuaranteeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.LiabilityAmount;


/**
 * <p>Clase Java para FinancialGuaranteeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialGuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteeTypeCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LiabilityAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AmountRate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConstitutionPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialGuaranteeType", propOrder = {
    "guaranteeTypeCode",
    "descriptions",
    "liabilityAmount",
    "amountRate",
    "constitutionPeriod"
})
public class FinancialGuaranteeType {

    @XmlElement(name = "GuaranteeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected GuaranteeTypeCode guaranteeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "LiabilityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LiabilityAmount liabilityAmount;
    @XmlElement(name = "AmountRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountRate amountRate;
    @XmlElement(name = "ConstitutionPeriod")
    protected PeriodType constitutionPeriod;

    /**
     * Obtiene el valor de la propiedad guaranteeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeTypeCode }
     *     
     */
    public GuaranteeTypeCode getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * Define el valor de la propiedad guaranteeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeTypeCode }
     *     
     */
    public void setGuaranteeTypeCode(GuaranteeTypeCode value) {
        this.guaranteeTypeCode = value;
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
     * Obtiene el valor de la propiedad liabilityAmount.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityAmount }
     *     
     */
    public LiabilityAmount getLiabilityAmount() {
        return liabilityAmount;
    }

    /**
     * Define el valor de la propiedad liabilityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityAmount }
     *     
     */
    public void setLiabilityAmount(LiabilityAmount value) {
        this.liabilityAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad amountRate.
     * 
     * @return
     *     possible object is
     *     {@link AmountRate }
     *     
     */
    public AmountRate getAmountRate() {
        return amountRate;
    }

    /**
     * Define el valor de la propiedad amountRate.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRate }
     *     
     */
    public void setAmountRate(AmountRate value) {
        this.amountRate = value;
    }

    /**
     * Obtiene el valor de la propiedad constitutionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getConstitutionPeriod() {
        return constitutionPeriod;
    }

    /**
     * Define el valor de la propiedad constitutionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setConstitutionPeriod(PeriodType value) {
        this.constitutionPeriod = value;
    }

}
