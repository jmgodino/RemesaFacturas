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
import com.picoto.jaxb.ubl.common.cbc.AdditionalInformation;
import com.picoto.jaxb.ubl.common.cbc.BrandName;
import com.picoto.jaxb.ubl.common.cbc.CatalogueIndicator;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.HazardousRiskIndicator;
import com.picoto.jaxb.ubl.common.cbc.Keyword;
import com.picoto.jaxb.ubl.common.cbc.ModelName;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.PackQuantity;
import com.picoto.jaxb.ubl.common.cbc.PackSizeNumeric;


/**
 * <p>Clase Java para ItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CatalogueIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Keyword" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrandName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ModelName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturersItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StandardItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemSpecificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransactionConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ClassifiedTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturerParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InformationContentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Dimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "descriptions",
    "packQuantity",
    "packSizeNumeric",
    "catalogueIndicator",
    "name",
    "hazardousRiskIndicator",
    "additionalInformations",
    "keywords",
    "brandNames",
    "modelNames",
    "buyersItemIdentification",
    "sellersItemIdentification",
    "manufacturersItemIdentifications",
    "standardItemIdentification",
    "catalogueItemIdentification",
    "additionalItemIdentifications",
    "catalogueDocumentReference",
    "itemSpecificationDocumentReferences",
    "originCountry",
    "commodityClassifications",
    "transactionConditions",
    "hazardousItems",
    "classifiedTaxCategories",
    "additionalItemProperties",
    "manufacturerParties",
    "informationContentProviderParty",
    "originAddresses",
    "itemInstances",
    "certificates",
    "dimensions"
})
public class ItemType {

    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackQuantity packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackSizeNumeric packSizeNumeric;
    @XmlElement(name = "CatalogueIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CatalogueIndicator catalogueIndicator;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Name name;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalInformation> additionalInformations;
    @XmlElement(name = "Keyword", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Keyword> keywords;
    @XmlElement(name = "BrandName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BrandName> brandNames;
    @XmlElement(name = "ModelName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ModelName> modelNames;
    @XmlElement(name = "BuyersItemIdentification")
    protected ItemIdentificationType buyersItemIdentification;
    @XmlElement(name = "SellersItemIdentification")
    protected ItemIdentificationType sellersItemIdentification;
    @XmlElement(name = "ManufacturersItemIdentification")
    protected List<ItemIdentificationType> manufacturersItemIdentifications;
    @XmlElement(name = "StandardItemIdentification")
    protected ItemIdentificationType standardItemIdentification;
    @XmlElement(name = "CatalogueItemIdentification")
    protected ItemIdentificationType catalogueItemIdentification;
    @XmlElement(name = "AdditionalItemIdentification")
    protected List<ItemIdentificationType> additionalItemIdentifications;
    @XmlElement(name = "CatalogueDocumentReference")
    protected DocumentReferenceType catalogueDocumentReference;
    @XmlElement(name = "ItemSpecificationDocumentReference")
    protected List<DocumentReferenceType> itemSpecificationDocumentReferences;
    @XmlElement(name = "OriginCountry")
    protected CountryType originCountry;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassifications;
    @XmlElement(name = "TransactionConditions")
    protected List<TransactionConditions> transactionConditions;
    @XmlElement(name = "HazardousItem")
    protected List<HazardousItem> hazardousItems;
    @XmlElement(name = "ClassifiedTaxCategory")
    protected List<TaxCategoryType> classifiedTaxCategories;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperties;
    @XmlElement(name = "ManufacturerParty")
    protected List<PartyType> manufacturerParties;
    @XmlElement(name = "InformationContentProviderParty")
    protected PartyType informationContentProviderParty;
    @XmlElement(name = "OriginAddress")
    protected List<AddressType> originAddresses;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstance> itemInstances;
    @XmlElement(name = "Certificate")
    protected List<Certificate> certificates;
    @XmlElement(name = "Dimension")
    protected List<DimensionType> dimensions;

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
     * Obtiene el valor de la propiedad catalogueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueIndicator }
     *     
     */
    public CatalogueIndicator getCatalogueIndicator() {
        return catalogueIndicator;
    }

    /**
     * Define el valor de la propiedad catalogueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueIndicator }
     *     
     */
    public void setCatalogueIndicator(CatalogueIndicator value) {
        this.catalogueIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public HazardousRiskIndicator getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Define el valor de la propiedad hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicator value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Gets the value of the additionalInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation }
     * 
     * 
     */
    public List<AdditionalInformation> getAdditionalInformations() {
        if (additionalInformations == null) {
            additionalInformations = new ArrayList<AdditionalInformation>();
        }
        return this.additionalInformations;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    public List<Keyword> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keyword>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the brandNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandName }
     * 
     * 
     */
    public List<BrandName> getBrandNames() {
        if (brandNames == null) {
            brandNames = new ArrayList<BrandName>();
        }
        return this.brandNames;
    }

    /**
     * Gets the value of the modelNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelName }
     * 
     * 
     */
    public List<ModelName> getModelNames() {
        if (modelNames == null) {
            modelNames = new ArrayList<ModelName>();
        }
        return this.modelNames;
    }

    /**
     * Obtiene el valor de la propiedad buyersItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getBuyersItemIdentification() {
        return buyersItemIdentification;
    }

    /**
     * Define el valor de la propiedad buyersItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setBuyersItemIdentification(ItemIdentificationType value) {
        this.buyersItemIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad sellersItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Define el valor de la propiedad sellersItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setSellersItemIdentification(ItemIdentificationType value) {
        this.sellersItemIdentification = value;
    }

    /**
     * Gets the value of the manufacturersItemIdentifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturersItemIdentifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturersItemIdentifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     * 
     * 
     */
    public List<ItemIdentificationType> getManufacturersItemIdentifications() {
        if (manufacturersItemIdentifications == null) {
            manufacturersItemIdentifications = new ArrayList<ItemIdentificationType>();
        }
        return this.manufacturersItemIdentifications;
    }

    /**
     * Obtiene el valor de la propiedad standardItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Define el valor de la propiedad standardItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setStandardItemIdentification(ItemIdentificationType value) {
        this.standardItemIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogueItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getCatalogueItemIdentification() {
        return catalogueItemIdentification;
    }

    /**
     * Define el valor de la propiedad catalogueItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setCatalogueItemIdentification(ItemIdentificationType value) {
        this.catalogueItemIdentification = value;
    }

    /**
     * Gets the value of the additionalItemIdentifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemIdentifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemIdentifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     * 
     * 
     */
    public List<ItemIdentificationType> getAdditionalItemIdentifications() {
        if (additionalItemIdentifications == null) {
            additionalItemIdentifications = new ArrayList<ItemIdentificationType>();
        }
        return this.additionalItemIdentifications;
    }

    /**
     * Obtiene el valor de la propiedad catalogueDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCatalogueDocumentReference() {
        return catalogueDocumentReference;
    }

    /**
     * Define el valor de la propiedad catalogueDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCatalogueDocumentReference(DocumentReferenceType value) {
        this.catalogueDocumentReference = value;
    }

    /**
     * Gets the value of the itemSpecificationDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecificationDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecificationDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getItemSpecificationDocumentReferences() {
        if (itemSpecificationDocumentReferences == null) {
            itemSpecificationDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.itemSpecificationDocumentReferences;
    }

    /**
     * Obtiene el valor de la propiedad originCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /**
     * Define el valor de la propiedad originCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginCountry(CountryType value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the commodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getCommodityClassifications() {
        if (commodityClassifications == null) {
            commodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassifications;
    }

    /**
     * Gets the value of the transactionConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionConditions }
     * 
     * 
     */
    public List<TransactionConditions> getTransactionConditions() {
        if (transactionConditions == null) {
            transactionConditions = new ArrayList<TransactionConditions>();
        }
        return this.transactionConditions;
    }

    /**
     * Gets the value of the hazardousItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousItem }
     * 
     * 
     */
    public List<HazardousItem> getHazardousItems() {
        if (hazardousItems == null) {
            hazardousItems = new ArrayList<HazardousItem>();
        }
        return this.hazardousItems;
    }

    /**
     * Gets the value of the classifiedTaxCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifiedTaxCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifiedTaxCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getClassifiedTaxCategories() {
        if (classifiedTaxCategories == null) {
            classifiedTaxCategories = new ArrayList<TaxCategoryType>();
        }
        return this.classifiedTaxCategories;
    }

    /**
     * Gets the value of the additionalItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getAdditionalItemProperties() {
        if (additionalItemProperties == null) {
            additionalItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperties;
    }

    /**
     * Gets the value of the manufacturerParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getManufacturerParties() {
        if (manufacturerParties == null) {
            manufacturerParties = new ArrayList<PartyType>();
        }
        return this.manufacturerParties;
    }

    /**
     * Obtiene el valor de la propiedad informationContentProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInformationContentProviderParty() {
        return informationContentProviderParty;
    }

    /**
     * Define el valor de la propiedad informationContentProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInformationContentProviderParty(PartyType value) {
        this.informationContentProviderParty = value;
    }

    /**
     * Gets the value of the originAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getOriginAddresses() {
        if (originAddresses == null) {
            originAddresses = new ArrayList<AddressType>();
        }
        return this.originAddresses;
    }

    /**
     * Gets the value of the itemInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstance }
     * 
     * 
     */
    public List<ItemInstance> getItemInstances() {
        if (itemInstances == null) {
            itemInstances = new ArrayList<ItemInstance>();
        }
        return this.itemInstances;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certificate }
     * 
     * 
     */
    public List<Certificate> getCertificates() {
        if (certificates == null) {
            certificates = new ArrayList<Certificate>();
        }
        return this.certificates;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<DimensionType>();
        }
        return this.dimensions;
    }

}
