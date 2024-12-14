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
import com.picoto.jaxb.ubl.common.cbc.ActionCode;
import com.picoto.jaxb.ubl.common.cbc.ContentUnitQuantity;
import com.picoto.jaxb.ubl.common.cbc.ContractSubdivision;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LifeCycleStatusCode;
import com.picoto.jaxb.ubl.common.cbc.MaximumOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.MinimumOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.OrderQuantityIncrementNumeric;
import com.picoto.jaxb.ubl.common.cbc.OrderableIndicator;
import com.picoto.jaxb.ubl.common.cbc.OrderableUnit;
import com.picoto.jaxb.ubl.common.cbc.PackLevelCode;
import com.picoto.jaxb.ubl.common.cbc.WarrantyInformation;


/**
 * <p>Clase Java para CatalogueLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CatalogueLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractSubdivision" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContentUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderQuantityIncrementNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemComparison" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComponentRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccessoryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacementRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComplementaryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredItemLocationQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}KeywordItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueLineType", propOrder = {
    "id",
    "actionCode",
    "lifeCycleStatusCode",
    "contractSubdivision",
    "notes",
    "orderableIndicator",
    "orderableUnit",
    "contentUnitQuantity",
    "orderQuantityIncrementNumeric",
    "minimumOrderQuantity",
    "maximumOrderQuantity",
    "warrantyInformations",
    "packLevelCode",
    "contractorCustomerParty",
    "sellerSupplierParty",
    "warrantyParty",
    "warrantyValidityPeriod",
    "lineValidityPeriod",
    "itemComparisons",
    "componentRelatedItems",
    "accessoryRelatedItems",
    "requiredRelatedItems",
    "replacementRelatedItems",
    "complementaryRelatedItems",
    "replacedRelatedItems",
    "requiredItemLocationQuantities",
    "documentReferences",
    "item",
    "keywordItemProperties",
    "callForTendersLineReference",
    "callForTendersDocumentReference"
})
@XmlRootElement(name = "CatalogueLine")
public class CatalogueLine {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "ActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActionCode actionCode;
    @XmlElement(name = "LifeCycleStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LifeCycleStatusCode lifeCycleStatusCode;
    @XmlElement(name = "ContractSubdivision", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractSubdivision contractSubdivision;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "OrderableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableIndicator orderableIndicator;
    @XmlElement(name = "OrderableUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableUnit orderableUnit;
    @XmlElement(name = "ContentUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContentUnitQuantity contentUnitQuantity;
    @XmlElement(name = "OrderQuantityIncrementNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderQuantityIncrementNumeric orderQuantityIncrementNumeric;
    @XmlElement(name = "MinimumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumOrderQuantity minimumOrderQuantity;
    @XmlElement(name = "MaximumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumOrderQuantity maximumOrderQuantity;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WarrantyInformation> warrantyInformations;
    @XmlElement(name = "PackLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackLevelCode packLevelCode;
    @XmlElement(name = "ContractorCustomerParty")
    protected CustomerPartyType contractorCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "WarrantyParty")
    protected PartyType warrantyParty;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "LineValidityPeriod")
    protected PeriodType lineValidityPeriod;
    @XmlElement(name = "ItemComparison")
    protected List<ItemComparison> itemComparisons;
    @XmlElement(name = "ComponentRelatedItem")
    protected List<RelatedItemType> componentRelatedItems;
    @XmlElement(name = "AccessoryRelatedItem")
    protected List<RelatedItemType> accessoryRelatedItems;
    @XmlElement(name = "RequiredRelatedItem")
    protected List<RelatedItemType> requiredRelatedItems;
    @XmlElement(name = "ReplacementRelatedItem")
    protected List<RelatedItemType> replacementRelatedItems;
    @XmlElement(name = "ComplementaryRelatedItem")
    protected List<RelatedItemType> complementaryRelatedItems;
    @XmlElement(name = "ReplacedRelatedItem")
    protected List<RelatedItemType> replacedRelatedItems;
    @XmlElement(name = "RequiredItemLocationQuantity")
    protected List<ItemLocationQuantityType> requiredItemLocationQuantities;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "KeywordItemProperty")
    protected List<ItemPropertyType> keywordItemProperties;
    @XmlElement(name = "CallForTendersLineReference")
    protected LineReferenceType callForTendersLineReference;
    @XmlElement(name = "CallForTendersDocumentReference")
    protected DocumentReferenceType callForTendersDocumentReference;

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
     * Obtiene el valor de la propiedad actionCode.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Define el valor de la propiedad actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleStatusCode }
     *     
     */
    public LifeCycleStatusCode getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Define el valor de la propiedad lifeCycleStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleStatusCode }
     *     
     */
    public void setLifeCycleStatusCode(LifeCycleStatusCode value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contractSubdivision.
     * 
     * @return
     *     possible object is
     *     {@link ContractSubdivision }
     *     
     */
    public ContractSubdivision getContractSubdivision() {
        return contractSubdivision;
    }

    /**
     * Define el valor de la propiedad contractSubdivision.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubdivision }
     *     
     */
    public void setContractSubdivision(ContractSubdivision value) {
        this.contractSubdivision = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Obtiene el valor de la propiedad orderableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OrderableIndicator }
     *     
     */
    public OrderableIndicator getOrderableIndicator() {
        return orderableIndicator;
    }

    /**
     * Define el valor de la propiedad orderableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableIndicator }
     *     
     */
    public void setOrderableIndicator(OrderableIndicator value) {
        this.orderableIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad orderableUnit.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnit }
     *     
     */
    public OrderableUnit getOrderableUnit() {
        return orderableUnit;
    }

    /**
     * Define el valor de la propiedad orderableUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnit }
     *     
     */
    public void setOrderableUnit(OrderableUnit value) {
        this.orderableUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad contentUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ContentUnitQuantity }
     *     
     */
    public ContentUnitQuantity getContentUnitQuantity() {
        return contentUnitQuantity;
    }

    /**
     * Define el valor de la propiedad contentUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentUnitQuantity }
     *     
     */
    public void setContentUnitQuantity(ContentUnitQuantity value) {
        this.contentUnitQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad orderQuantityIncrementNumeric.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityIncrementNumeric }
     *     
     */
    public OrderQuantityIncrementNumeric getOrderQuantityIncrementNumeric() {
        return orderQuantityIncrementNumeric;
    }

    /**
     * Define el valor de la propiedad orderQuantityIncrementNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityIncrementNumeric }
     *     
     */
    public void setOrderQuantityIncrementNumeric(OrderQuantityIncrementNumeric value) {
        this.orderQuantityIncrementNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumOrderQuantity }
     *     
     */
    public MinimumOrderQuantity getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Define el valor de la propiedad minimumOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumOrderQuantity }
     *     
     */
    public void setMinimumOrderQuantity(MinimumOrderQuantity value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOrderQuantity }
     *     
     */
    public MaximumOrderQuantity getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    /**
     * Define el valor de la propiedad maximumOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOrderQuantity }
     *     
     */
    public void setMaximumOrderQuantity(MaximumOrderQuantity value) {
        this.maximumOrderQuantity = value;
    }

    /**
     * Gets the value of the warrantyInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformation }
     * 
     * 
     */
    public List<WarrantyInformation> getWarrantyInformations() {
        if (warrantyInformations == null) {
            warrantyInformations = new ArrayList<WarrantyInformation>();
        }
        return this.warrantyInformations;
    }

    /**
     * Obtiene el valor de la propiedad packLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link PackLevelCode }
     *     
     */
    public PackLevelCode getPackLevelCode() {
        return packLevelCode;
    }

    /**
     * Define el valor de la propiedad packLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackLevelCode }
     *     
     */
    public void setPackLevelCode(PackLevelCode value) {
        this.packLevelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contractorCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    /**
     * Define el valor de la propiedad contractorCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Define el valor de la propiedad sellerSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad warrantyParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWarrantyParty() {
        return warrantyParty;
    }

    /**
     * Define el valor de la propiedad warrantyParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWarrantyParty(PartyType value) {
        this.warrantyParty = value;
    }

    /**
     * Obtiene el valor de la propiedad warrantyValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Define el valor de la propiedad warrantyValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad lineValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getLineValidityPeriod() {
        return lineValidityPeriod;
    }

    /**
     * Define el valor de la propiedad lineValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setLineValidityPeriod(PeriodType value) {
        this.lineValidityPeriod = value;
    }

    /**
     * Gets the value of the itemComparisons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemComparisons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemComparisons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComparison }
     * 
     * 
     */
    public List<ItemComparison> getItemComparisons() {
        if (itemComparisons == null) {
            itemComparisons = new ArrayList<ItemComparison>();
        }
        return this.itemComparisons;
    }

    /**
     * Gets the value of the componentRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComponentRelatedItems() {
        if (componentRelatedItems == null) {
            componentRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.componentRelatedItems;
    }

    /**
     * Gets the value of the accessoryRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessoryRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessoryRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getAccessoryRelatedItems() {
        if (accessoryRelatedItems == null) {
            accessoryRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.accessoryRelatedItems;
    }

    /**
     * Gets the value of the requiredRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getRequiredRelatedItems() {
        if (requiredRelatedItems == null) {
            requiredRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.requiredRelatedItems;
    }

    /**
     * Gets the value of the replacementRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacementRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacementRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacementRelatedItems() {
        if (replacementRelatedItems == null) {
            replacementRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.replacementRelatedItems;
    }

    /**
     * Gets the value of the complementaryRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementaryRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementaryRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComplementaryRelatedItems() {
        if (complementaryRelatedItems == null) {
            complementaryRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.complementaryRelatedItems;
    }

    /**
     * Gets the value of the replacedRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacedRelatedItems() {
        if (replacedRelatedItems == null) {
            replacedRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.replacedRelatedItems;
    }

    /**
     * Gets the value of the requiredItemLocationQuantities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredItemLocationQuantities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredItemLocationQuantities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationQuantityType }
     * 
     * 
     */
    public List<ItemLocationQuantityType> getRequiredItemLocationQuantities() {
        if (requiredItemLocationQuantities == null) {
            requiredItemLocationQuantities = new ArrayList<ItemLocationQuantityType>();
        }
        return this.requiredItemLocationQuantities;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the keywordItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getKeywordItemProperties() {
        if (keywordItemProperties == null) {
            keywordItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.keywordItemProperties;
    }

    /**
     * Obtiene el valor de la propiedad callForTendersLineReference.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getCallForTendersLineReference() {
        return callForTendersLineReference;
    }

    /**
     * Define el valor de la propiedad callForTendersLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setCallForTendersLineReference(LineReferenceType value) {
        this.callForTendersLineReference = value;
    }

    /**
     * Obtiene el valor de la propiedad callForTendersDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCallForTendersDocumentReference() {
        return callForTendersDocumentReference;
    }

    /**
     * Define el valor de la propiedad callForTendersDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCallForTendersDocumentReference(DocumentReferenceType value) {
        this.callForTendersDocumentReference = value;
    }

}
