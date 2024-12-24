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
import com.picoto.jaxb.ubl.common.cbc.AverageSubsequentContractAmount;
import com.picoto.jaxb.ubl.common.cbc.EstimatedOverallContractAmount;
import com.picoto.jaxb.ubl.common.cbc.MaximumAmount;
import com.picoto.jaxb.ubl.common.cbc.MinimumAmount;
import com.picoto.jaxb.ubl.common.cbc.MonetaryScope;
import com.picoto.jaxb.ubl.common.cbc.TaxIncludedIndicator;
import com.picoto.jaxb.ubl.common.cbc.TotalAmount;


/**
 * <p>Clase Java para RequestedTenderTotalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestedTenderTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MonetaryScope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AverageSubsequentContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedTenderTotalType", propOrder = {
    "estimatedOverallContractAmount",
    "totalAmount",
    "taxIncludedIndicator",
    "minimumAmount",
    "maximumAmount",
    "monetaryScopes",
    "averageSubsequentContractAmount",
    "applicableTaxCategories"
})
@XmlRootElement(name = "RequestedTenderTotal")
public class RequestedTenderTotal {

    @XmlElement(name = "EstimatedOverallContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedOverallContractAmount estimatedOverallContractAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalAmount totalAmount;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxIncludedIndicator taxIncludedIndicator;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumAmount minimumAmount;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAmount maximumAmount;
    @XmlElement(name = "MonetaryScope", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<MonetaryScope> monetaryScopes;
    @XmlElement(name = "AverageSubsequentContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AverageSubsequentContractAmount averageSubsequentContractAmount;
    @XmlElement(name = "ApplicableTaxCategory")
    protected List<TaxCategoryType> applicableTaxCategories;

    /**
     * Obtiene el valor de la propiedad estimatedOverallContractAmount.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractAmount }
     *     
     */
    public EstimatedOverallContractAmount getEstimatedOverallContractAmount() {
        return estimatedOverallContractAmount;
    }

    /**
     * Define el valor de la propiedad estimatedOverallContractAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractAmount }
     *     
     */
    public void setEstimatedOverallContractAmount(EstimatedOverallContractAmount value) {
        this.estimatedOverallContractAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmount }
     *     
     */
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmount }
     *     
     */
    public void setTotalAmount(TotalAmount value) {
        this.totalAmount = value;
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
     * Obtiene el valor de la propiedad minimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmount }
     *     
     */
    public MinimumAmount getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Define el valor de la propiedad minimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmount }
     *     
     */
    public void setMinimumAmount(MinimumAmount value) {
        this.minimumAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmount }
     *     
     */
    public MaximumAmount getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Define el valor de la propiedad maximumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmount }
     *     
     */
    public void setMaximumAmount(MaximumAmount value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the monetaryScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryScope }
     * 
     * 
     */
    public List<MonetaryScope> getMonetaryScopes() {
        if (monetaryScopes == null) {
            monetaryScopes = new ArrayList<MonetaryScope>();
        }
        return this.monetaryScopes;
    }

    /**
     * Obtiene el valor de la propiedad averageSubsequentContractAmount.
     * 
     * @return
     *     possible object is
     *     {@link AverageSubsequentContractAmount }
     *     
     */
    public AverageSubsequentContractAmount getAverageSubsequentContractAmount() {
        return averageSubsequentContractAmount;
    }

    /**
     * Define el valor de la propiedad averageSubsequentContractAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageSubsequentContractAmount }
     *     
     */
    public void setAverageSubsequentContractAmount(AverageSubsequentContractAmount value) {
        this.averageSubsequentContractAmount = value;
    }

    /**
     * Gets the value of the applicableTaxCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTaxCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTaxCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getApplicableTaxCategories() {
        if (applicableTaxCategories == null) {
            applicableTaxCategories = new ArrayList<TaxCategoryType>();
        }
        return this.applicableTaxCategories;
    }

}
