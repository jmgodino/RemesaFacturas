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
import com.picoto.jaxb.ubl.common.cbc.RoundingAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEvidenceIndicator;
import com.picoto.jaxb.ubl.common.cbc.TaxIncludedIndicator;


/**
 * <p>Clase Java para TaxTotalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxTotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoundingAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEvidenceIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxSubtotal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTotalType", propOrder = {
    "taxAmount",
    "roundingAmount",
    "taxEvidenceIndicator",
    "taxIncludedIndicator",
    "taxSubtotals"
})
public class TaxTotalType {

    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TaxAmount taxAmount;
    @XmlElement(name = "RoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoundingAmount roundingAmount;
    @XmlElement(name = "TaxEvidenceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEvidenceIndicator taxEvidenceIndicator;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxIncludedIndicator taxIncludedIndicator;
    @XmlElement(name = "TaxSubtotal")
    protected List<TaxSubtotal> taxSubtotals;

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount }
     *     
     */
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount }
     *     
     */
    public void setTaxAmount(TaxAmount value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingAmount.
     * 
     * @return
     *     possible object is
     *     {@link RoundingAmount }
     *     
     */
    public RoundingAmount getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Define el valor de la propiedad roundingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingAmount }
     *     
     */
    public void setRoundingAmount(RoundingAmount value) {
        this.roundingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxEvidenceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TaxEvidenceIndicator }
     *     
     */
    public TaxEvidenceIndicator getTaxEvidenceIndicator() {
        return taxEvidenceIndicator;
    }

    /**
     * Define el valor de la propiedad taxEvidenceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEvidenceIndicator }
     *     
     */
    public void setTaxEvidenceIndicator(TaxEvidenceIndicator value) {
        this.taxEvidenceIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIncludedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public TaxIncludedIndicator getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Define el valor de la propiedad taxIncludedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public void setTaxIncludedIndicator(TaxIncludedIndicator value) {
        this.taxIncludedIndicator = value;
    }

    /**
     * Gets the value of the taxSubtotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSubtotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSubtotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSubtotal }
     * 
     * 
     */
    public List<TaxSubtotal> getTaxSubtotals() {
        if (taxSubtotals == null) {
            taxSubtotals = new ArrayList<TaxSubtotal>();
        }
        return this.taxSubtotals;
    }

}
