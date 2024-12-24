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
import com.picoto.jaxb.ubl.common.cbc.BaseQuantity;
import com.picoto.jaxb.ubl.common.cbc.OrderableUnitFactorRate;
import com.picoto.jaxb.ubl.common.cbc.PriceAmount;
import com.picoto.jaxb.ubl.common.cbc.PriceChangeReason;
import com.picoto.jaxb.ubl.common.cbc.PriceTypeCode;


/**
 * <p>Clase Java para PriceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnitFactorRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PriceList" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "priceAmount",
    "baseQuantity",
    "priceChangeReasons",
    "priceTypeCode",
    "priceType",
    "orderableUnitFactorRate",
    "validityPeriods",
    "priceList",
    "allowanceCharges",
    "pricingExchangeRate"
})
public class PriceType {

    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PriceAmount priceAmount;
    @XmlElement(name = "BaseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseQuantity baseQuantity;
    @XmlElement(name = "PriceChangeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PriceChangeReason> priceChangeReasons;
    @XmlElement(name = "PriceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceTypeCode priceTypeCode;
    @XmlElement(name = "PriceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected com.picoto.jaxb.ubl.common.cbc.PriceType priceType;
    @XmlElement(name = "OrderableUnitFactorRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableUnitFactorRate orderableUnitFactorRate;
    @XmlElement(name = "ValidityPeriod")
    protected List<PeriodType> validityPeriods;
    @XmlElement(name = "PriceList")
    protected PriceListType priceList;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "PricingExchangeRate")
    protected ExchangeRateType pricingExchangeRate;

    /**
     * Obtiene el valor de la propiedad priceAmount.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmount }
     *     
     */
    public PriceAmount getPriceAmount() {
        return priceAmount;
    }

    /**
     * Define el valor de la propiedad priceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmount }
     *     
     */
    public void setPriceAmount(PriceAmount value) {
        this.priceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BaseQuantity }
     *     
     */
    public BaseQuantity getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Define el valor de la propiedad baseQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseQuantity }
     *     
     */
    public void setBaseQuantity(BaseQuantity value) {
        this.baseQuantity = value;
    }

    /**
     * Gets the value of the priceChangeReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChangeReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceChangeReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceChangeReason }
     * 
     * 
     */
    public List<PriceChangeReason> getPriceChangeReasons() {
        if (priceChangeReasons == null) {
            priceChangeReasons = new ArrayList<PriceChangeReason>();
        }
        return this.priceChangeReasons;
    }

    /**
     * Obtiene el valor de la propiedad priceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeCode }
     *     
     */
    public PriceTypeCode getPriceTypeCode() {
        return priceTypeCode;
    }

    /**
     * Define el valor de la propiedad priceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeCode }
     *     
     */
    public void setPriceTypeCode(PriceTypeCode value) {
        this.priceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad priceType.
     * 
     * @return
     *     possible object is
     *     {@link com.picoto.jaxb.ubl.common.cbc.PriceType }
     *     
     */
    public com.picoto.jaxb.ubl.common.cbc.PriceType getPriceType() {
        return priceType;
    }

    /**
     * Define el valor de la propiedad priceType.
     * 
     * @param value
     *     allowed object is
     *     {@link com.picoto.jaxb.ubl.common.cbc.PriceType }
     *     
     */
    public void setPriceType(com.picoto.jaxb.ubl.common.cbc.PriceType value) {
        this.priceType = value;
    }

    /**
     * Obtiene el valor de la propiedad orderableUnitFactorRate.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnitFactorRate }
     *     
     */
    public OrderableUnitFactorRate getOrderableUnitFactorRate() {
        return orderableUnitFactorRate;
    }

    /**
     * Define el valor de la propiedad orderableUnitFactorRate.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnitFactorRate }
     *     
     */
    public void setOrderableUnitFactorRate(OrderableUnitFactorRate value) {
        this.orderableUnitFactorRate = value;
    }

    /**
     * Gets the value of the validityPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriods() {
        if (validityPeriods == null) {
            validityPeriods = new ArrayList<PeriodType>();
        }
        return this.validityPeriods;
    }

    /**
     * Obtiene el valor de la propiedad priceList.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPriceList() {
        return priceList;
    }

    /**
     * Define el valor de la propiedad priceList.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPriceList(PriceListType value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the allowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharges() {
        if (allowanceCharges == null) {
            allowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharges;
    }

    /**
     * Obtiene el valor de la propiedad pricingExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Define el valor de la propiedad pricingExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPricingExchangeRate(ExchangeRateType value) {
        this.pricingExchangeRate = value;
    }

}
