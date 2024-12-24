//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.Duty;
import com.picoto.jaxb.ubl.common.cbc.DutyCode;


/**
 * <p>Clase Java para DutyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DutyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Duty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DutyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyType", propOrder = {
    "amount",
    "duty",
    "dutyCode",
    "taxCategory"
})
public class DutyType {

    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected Amount amount;
    @XmlElement(name = "Duty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Duty duty;
    @XmlElement(name = "DutyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DutyCode dutyCode;
    @XmlElement(name = "TaxCategory")
    protected TaxCategoryType taxCategory;

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
     * Obtiene el valor de la propiedad duty.
     * 
     * @return
     *     possible object is
     *     {@link Duty }
     *     
     */
    public Duty getDuty() {
        return duty;
    }

    /**
     * Define el valor de la propiedad duty.
     * 
     * @param value
     *     allowed object is
     *     {@link Duty }
     *     
     */
    public void setDuty(Duty value) {
        this.duty = value;
    }

    /**
     * Obtiene el valor de la propiedad dutyCode.
     * 
     * @return
     *     possible object is
     *     {@link DutyCode }
     *     
     */
    public DutyCode getDutyCode() {
        return dutyCode;
    }

    /**
     * Define el valor de la propiedad dutyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyCode }
     *     
     */
    public void setDutyCode(DutyCode value) {
        this.dutyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Define el valor de la propiedad taxCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
    }

}
