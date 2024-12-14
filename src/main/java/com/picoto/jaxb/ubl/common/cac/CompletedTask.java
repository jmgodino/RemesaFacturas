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
import com.picoto.jaxb.ubl.common.cbc.AnnualAverageAmount;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.PartyCapacityAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalTaskAmount;


/**
 * <p>Clase Java para CompletedTaskType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompletedTaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnnualAverageAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaskAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyCapacityAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RecipientCustomerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTaskType", propOrder = {
    "annualAverageAmount",
    "totalTaskAmount",
    "partyCapacityAmount",
    "descriptions",
    "evidenceSupplieds",
    "period",
    "recipientCustomerParty"
})
@XmlRootElement(name = "CompletedTask")
public class CompletedTask {

    @XmlElement(name = "AnnualAverageAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnnualAverageAmount annualAverageAmount;
    @XmlElement(name = "TotalTaskAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTaskAmount totalTaskAmount;
    @XmlElement(name = "PartyCapacityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyCapacityAmount partyCapacityAmount;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSupplied> evidenceSupplieds;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "RecipientCustomerParty")
    protected CustomerPartyType recipientCustomerParty;

    /**
     * Obtiene el valor de la propiedad annualAverageAmount.
     * 
     * @return
     *     possible object is
     *     {@link AnnualAverageAmount }
     *     
     */
    public AnnualAverageAmount getAnnualAverageAmount() {
        return annualAverageAmount;
    }

    /**
     * Define el valor de la propiedad annualAverageAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualAverageAmount }
     *     
     */
    public void setAnnualAverageAmount(AnnualAverageAmount value) {
        this.annualAverageAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaskAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaskAmount }
     *     
     */
    public TotalTaskAmount getTotalTaskAmount() {
        return totalTaskAmount;
    }

    /**
     * Define el valor de la propiedad totalTaskAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaskAmount }
     *     
     */
    public void setTotalTaskAmount(TotalTaskAmount value) {
        this.totalTaskAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad partyCapacityAmount.
     * 
     * @return
     *     possible object is
     *     {@link PartyCapacityAmount }
     *     
     */
    public PartyCapacityAmount getPartyCapacityAmount() {
        return partyCapacityAmount;
    }

    /**
     * Define el valor de la propiedad partyCapacityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCapacityAmount }
     *     
     */
    public void setPartyCapacityAmount(PartyCapacityAmount value) {
        this.partyCapacityAmount = value;
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

    /**
     * Obtiene el valor de la propiedad recipientCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getRecipientCustomerParty() {
        return recipientCustomerParty;
    }

    /**
     * Define el valor de la propiedad recipientCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setRecipientCustomerParty(CustomerPartyType value) {
        this.recipientCustomerParty = value;
    }

}
