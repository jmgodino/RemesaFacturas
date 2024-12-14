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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionType;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CurrentChargeType;
import com.picoto.jaxb.ubl.common.cbc.CurrentChargeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.OneTimeChargeType;
import com.picoto.jaxb.ubl.common.cbc.OneTimeChargeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PackQuantity;
import com.picoto.jaxb.ubl.common.cbc.PackSizeNumeric;
import com.picoto.jaxb.ubl.common.cbc.SubscriberID;
import com.picoto.jaxb.ubl.common.cbc.SubscriberType;
import com.picoto.jaxb.ubl.common.cbc.SubscriberTypeCode;


/**
 * <p>Clase Java para UtilityItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UtilityItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityItemType", propOrder = {
    "id",
    "subscriberID",
    "subscriberType",
    "subscriberTypeCode",
    "descriptions",
    "packQuantity",
    "packSizeNumeric",
    "consumptionType",
    "consumptionTypeCode",
    "currentChargeType",
    "currentChargeTypeCode",
    "oneTimeChargeType",
    "oneTimeChargeTypeCode",
    "taxCategory",
    "contract"
})
@XmlRootElement(name = "UtilityItem")
public class UtilityItem {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "SubscriberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberID subscriberID;
    @XmlElement(name = "SubscriberType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberType subscriberType;
    @XmlElement(name = "SubscriberTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeCode subscriberTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackQuantity packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackSizeNumeric packSizeNumeric;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "CurrentChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CurrentChargeType currentChargeType;
    @XmlElement(name = "CurrentChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CurrentChargeTypeCode currentChargeTypeCode;
    @XmlElement(name = "OneTimeChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OneTimeChargeType oneTimeChargeType;
    @XmlElement(name = "OneTimeChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OneTimeChargeTypeCode oneTimeChargeTypeCode;
    @XmlElement(name = "TaxCategory")
    protected TaxCategoryType taxCategory;
    @XmlElement(name = "Contract")
    protected ContractType contract;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberID.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberID }
     *     
     */
    public SubscriberID getSubscriberID() {
        return subscriberID;
    }

    /**
     * Define el valor de la propiedad subscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberID }
     *     
     */
    public void setSubscriberID(SubscriberID value) {
        this.subscriberID = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberType.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberType }
     *     
     */
    public SubscriberType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Define el valor de la propiedad subscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberType }
     *     
     */
    public void setSubscriberType(SubscriberType value) {
        this.subscriberType = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public SubscriberTypeCode getSubscriberTypeCode() {
        return subscriberTypeCode;
    }

    /**
     * Define el valor de la propiedad subscriberTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public void setSubscriberTypeCode(SubscriberTypeCode value) {
        this.subscriberTypeCode = value;
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
     * Obtiene el valor de la propiedad packQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PackQuantity }
     *     
     */
    public PackQuantity getPackQuantity() {
        return packQuantity;
    }

    /**
     * Define el valor de la propiedad packQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PackQuantity }
     *     
     */
    public void setPackQuantity(PackQuantity value) {
        this.packQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad packSizeNumeric.
     * 
     * @return
     *     possible object is
     *     {@link PackSizeNumeric }
     *     
     */
    public PackSizeNumeric getPackSizeNumeric() {
        return packSizeNumeric;
    }

    /**
     * Define el valor de la propiedad packSizeNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link PackSizeNumeric }
     *     
     */
    public void setPackSizeNumeric(PackSizeNumeric value) {
        this.packSizeNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionType.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Define el valor de la propiedad consumptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumptionType(ConsumptionType value) {
        this.consumptionType = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public ConsumptionTypeCode getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Define el valor de la propiedad consumptionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCode value) {
        this.consumptionTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad currentChargeType.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeType }
     *     
     */
    public CurrentChargeType getCurrentChargeType() {
        return currentChargeType;
    }

    /**
     * Define el valor de la propiedad currentChargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeType }
     *     
     */
    public void setCurrentChargeType(CurrentChargeType value) {
        this.currentChargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad currentChargeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeTypeCode }
     *     
     */
    public CurrentChargeTypeCode getCurrentChargeTypeCode() {
        return currentChargeTypeCode;
    }

    /**
     * Define el valor de la propiedad currentChargeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeTypeCode }
     *     
     */
    public void setCurrentChargeTypeCode(CurrentChargeTypeCode value) {
        this.currentChargeTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad oneTimeChargeType.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeType }
     *     
     */
    public OneTimeChargeType getOneTimeChargeType() {
        return oneTimeChargeType;
    }

    /**
     * Define el valor de la propiedad oneTimeChargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeType }
     *     
     */
    public void setOneTimeChargeType(OneTimeChargeType value) {
        this.oneTimeChargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad oneTimeChargeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeTypeCode }
     *     
     */
    public OneTimeChargeTypeCode getOneTimeChargeTypeCode() {
        return oneTimeChargeTypeCode;
    }

    /**
     * Define el valor de la propiedad oneTimeChargeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeTypeCode }
     *     
     */
    public void setOneTimeChargeTypeCode(OneTimeChargeTypeCode value) {
        this.oneTimeChargeTypeCode = value;
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

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

}
