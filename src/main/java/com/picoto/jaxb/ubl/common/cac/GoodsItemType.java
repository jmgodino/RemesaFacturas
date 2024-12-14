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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ChargeableQuantity;
import com.picoto.jaxb.ubl.common.cbc.ChargeableWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.CustomsImportClassifiedIndicator;
import com.picoto.jaxb.ubl.common.cbc.CustomsStatusCode;
import com.picoto.jaxb.ubl.common.cbc.CustomsTariffQuantity;
import com.picoto.jaxb.ubl.common.cbc.DeclaredCustomsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredForCarriageValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredStatisticsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.FreeOnBoardValueAmount;
import com.picoto.jaxb.ubl.common.cbc.GrossVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.HazardousRiskIndicator;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InsuranceValueAmount;
import com.picoto.jaxb.ubl.common.cbc.NetNetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.PreferenceCriterionCode;
import com.picoto.jaxb.ubl.common.cbc.Quantity;
import com.picoto.jaxb.ubl.common.cbc.RequiredCustomsID;
import com.picoto.jaxb.ubl.common.cbc.ReturnableQuantity;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumberID;
import com.picoto.jaxb.ubl.common.cbc.TraceID;
import com.picoto.jaxb.ubl.common.cbc.ValueAmount;


/**
 * <p>Clase Java para GoodsItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GoodsItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreferenceCriterionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCustomsID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsTariffQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsImportClassifiedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnableQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItemContainer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoiceLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Temperature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedGoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainingPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsItemType", propOrder = {
    "id",
    "sequenceNumberID",
    "descriptions",
    "hazardousRiskIndicator",
    "declaredCustomsValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "insuranceValueAmount",
    "valueAmount",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "chargeableWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "quantity",
    "preferenceCriterionCode",
    "requiredCustomsID",
    "customsStatusCode",
    "customsTariffQuantity",
    "customsImportClassifiedIndicator",
    "chargeableQuantity",
    "returnableQuantity",
    "traceID",
    "items",
    "goodsItemContainers",
    "freightAllowanceCharges",
    "invoiceLines",
    "temperatures",
    "containedGoodsItems",
    "originAddress",
    "delivery",
    "pickup",
    "despatch",
    "measurementDimensions",
    "containingPackages",
    "shipmentDocumentReference",
    "minimumTemperature",
    "maximumTemperature"
})
public class GoodsItemType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "SequenceNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumberID sequenceNumberID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredCustomsValueAmount declaredCustomsValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredForCarriageValueAmount declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredStatisticsValueAmount declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreeOnBoardValueAmount freeOnBoardValueAmount;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsuranceValueAmount insuranceValueAmount;
    @XmlElement(name = "ValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueAmount valueAmount;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossWeightMeasure grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetWeightMeasure netWeightMeasure;
    @XmlElement(name = "NetNetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetNetWeightMeasure netNetWeightMeasure;
    @XmlElement(name = "ChargeableWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeableWeightMeasure chargeableWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossVolumeMeasure grossVolumeMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetVolumeMeasure netVolumeMeasure;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Quantity quantity;
    @XmlElement(name = "PreferenceCriterionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreferenceCriterionCode preferenceCriterionCode;
    @XmlElement(name = "RequiredCustomsID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredCustomsID requiredCustomsID;
    @XmlElement(name = "CustomsStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsStatusCode customsStatusCode;
    @XmlElement(name = "CustomsTariffQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsTariffQuantity customsTariffQuantity;
    @XmlElement(name = "CustomsImportClassifiedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsImportClassifiedIndicator customsImportClassifiedIndicator;
    @XmlElement(name = "ChargeableQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeableQuantity chargeableQuantity;
    @XmlElement(name = "ReturnableQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReturnableQuantity returnableQuantity;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceID traceID;
    @XmlElement(name = "Item")
    protected List<ItemType> items;
    @XmlElement(name = "GoodsItemContainer")
    protected List<GoodsItemContainer> goodsItemContainers;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "InvoiceLine")
    protected List<InvoiceLineType> invoiceLines;
    @XmlElement(name = "Temperature")
    protected List<TemperatureType> temperatures;
    @XmlElement(name = "ContainedGoodsItem")
    protected List<GoodsItemType> containedGoodsItems;
    @XmlElement(name = "OriginAddress")
    protected AddressType originAddress;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup")
    protected Pickup pickup;
    @XmlElement(name = "Despatch")
    protected Despatch despatch;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "ContainingPackage")
    protected List<PackageType> containingPackages;
    @XmlElement(name = "ShipmentDocumentReference")
    protected DocumentReferenceType shipmentDocumentReference;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;

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
     * Obtiene el valor de la propiedad sequenceNumberID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumberID }
     *     
     */
    public SequenceNumberID getSequenceNumberID() {
        return sequenceNumberID;
    }

    /**
     * Define el valor de la propiedad sequenceNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumberID }
     *     
     */
    public void setSequenceNumberID(SequenceNumberID value) {
        this.sequenceNumberID = value;
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
     * Obtiene el valor de la propiedad declaredCustomsValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public DeclaredCustomsValueAmount getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Define el valor de la propiedad declaredCustomsValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmount value) {
        this.declaredCustomsValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad declaredForCarriageValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public DeclaredForCarriageValueAmount getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Define el valor de la propiedad declaredForCarriageValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public void setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmount value) {
        this.declaredForCarriageValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad declaredStatisticsValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public DeclaredStatisticsValueAmount getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Define el valor de la propiedad declaredStatisticsValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public void setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmount value) {
        this.declaredStatisticsValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad freeOnBoardValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public FreeOnBoardValueAmount getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Define el valor de la propiedad freeOnBoardValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public void setFreeOnBoardValueAmount(FreeOnBoardValueAmount value) {
        this.freeOnBoardValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public InsuranceValueAmount getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Define el valor de la propiedad insuranceValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public void setInsuranceValueAmount(InsuranceValueAmount value) {
        this.insuranceValueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad valueAmount.
     * 
     * @return
     *     possible object is
     *     {@link ValueAmount }
     *     
     */
    public ValueAmount getValueAmount() {
        return valueAmount;
    }

    /**
     * Define el valor de la propiedad valueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAmount }
     *     
     */
    public void setValueAmount(ValueAmount value) {
        this.valueAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad grossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public GrossWeightMeasure getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Define el valor de la propiedad grossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public void setGrossWeightMeasure(GrossWeightMeasure value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad netWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightMeasure }
     *     
     */
    public NetWeightMeasure getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Define el valor de la propiedad netWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightMeasure }
     *     
     */
    public void setNetWeightMeasure(NetWeightMeasure value) {
        this.netWeightMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad netNetWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public NetNetWeightMeasure getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Define el valor de la propiedad netNetWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public void setNetNetWeightMeasure(NetNetWeightMeasure value) {
        this.netNetWeightMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeableWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableWeightMeasure }
     *     
     */
    public ChargeableWeightMeasure getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Define el valor de la propiedad chargeableWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableWeightMeasure }
     *     
     */
    public void setChargeableWeightMeasure(ChargeableWeightMeasure value) {
        this.chargeableWeightMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad grossVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public GrossVolumeMeasure getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Define el valor de la propiedad grossVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public void setGrossVolumeMeasure(GrossVolumeMeasure value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad netVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public NetVolumeMeasure getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Define el valor de la propiedad netVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public void setNetVolumeMeasure(NetVolumeMeasure value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad preferenceCriterionCode.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceCriterionCode }
     *     
     */
    public PreferenceCriterionCode getPreferenceCriterionCode() {
        return preferenceCriterionCode;
    }

    /**
     * Define el valor de la propiedad preferenceCriterionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceCriterionCode }
     *     
     */
    public void setPreferenceCriterionCode(PreferenceCriterionCode value) {
        this.preferenceCriterionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredCustomsID.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCustomsID }
     *     
     */
    public RequiredCustomsID getRequiredCustomsID() {
        return requiredCustomsID;
    }

    /**
     * Define el valor de la propiedad requiredCustomsID.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCustomsID }
     *     
     */
    public void setRequiredCustomsID(RequiredCustomsID value) {
        this.requiredCustomsID = value;
    }

    /**
     * Obtiene el valor de la propiedad customsStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomsStatusCode }
     *     
     */
    public CustomsStatusCode getCustomsStatusCode() {
        return customsStatusCode;
    }

    /**
     * Define el valor de la propiedad customsStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsStatusCode }
     *     
     */
    public void setCustomsStatusCode(CustomsStatusCode value) {
        this.customsStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customsTariffQuantity.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTariffQuantity }
     *     
     */
    public CustomsTariffQuantity getCustomsTariffQuantity() {
        return customsTariffQuantity;
    }

    /**
     * Define el valor de la propiedad customsTariffQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTariffQuantity }
     *     
     */
    public void setCustomsTariffQuantity(CustomsTariffQuantity value) {
        this.customsTariffQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad customsImportClassifiedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CustomsImportClassifiedIndicator }
     *     
     */
    public CustomsImportClassifiedIndicator getCustomsImportClassifiedIndicator() {
        return customsImportClassifiedIndicator;
    }

    /**
     * Define el valor de la propiedad customsImportClassifiedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsImportClassifiedIndicator }
     *     
     */
    public void setCustomsImportClassifiedIndicator(CustomsImportClassifiedIndicator value) {
        this.customsImportClassifiedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableQuantity }
     *     
     */
    public ChargeableQuantity getChargeableQuantity() {
        return chargeableQuantity;
    }

    /**
     * Define el valor de la propiedad chargeableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableQuantity }
     *     
     */
    public void setChargeableQuantity(ChargeableQuantity value) {
        this.chargeableQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad returnableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReturnableQuantity }
     *     
     */
    public ReturnableQuantity getReturnableQuantity() {
        return returnableQuantity;
    }

    /**
     * Define el valor de la propiedad returnableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnableQuantity }
     *     
     */
    public void setReturnableQuantity(ReturnableQuantity value) {
        this.returnableQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad traceID.
     * 
     * @return
     *     possible object is
     *     {@link TraceID }
     *     
     */
    public TraceID getTraceID() {
        return traceID;
    }

    /**
     * Define el valor de la propiedad traceID.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceID }
     *     
     */
    public void setTraceID(TraceID value) {
        this.traceID = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItems() {
        if (items == null) {
            items = new ArrayList<ItemType>();
        }
        return this.items;
    }

    /**
     * Gets the value of the goodsItemContainers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItemContainers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItemContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemContainer }
     * 
     * 
     */
    public List<GoodsItemContainer> getGoodsItemContainers() {
        if (goodsItemContainers == null) {
            goodsItemContainers = new ArrayList<GoodsItemContainer>();
        }
        return this.goodsItemContainers;
    }

    /**
     * Gets the value of the freightAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getFreightAllowanceCharges() {
        if (freightAllowanceCharges == null) {
            freightAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.freightAllowanceCharges;
    }

    /**
     * Gets the value of the invoiceLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineType }
     * 
     * 
     */
    public List<InvoiceLineType> getInvoiceLines() {
        if (invoiceLines == null) {
            invoiceLines = new ArrayList<InvoiceLineType>();
        }
        return this.invoiceLines;
    }

    /**
     * Gets the value of the temperatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getTemperatures() {
        if (temperatures == null) {
            temperatures = new ArrayList<TemperatureType>();
        }
        return this.temperatures;
    }

    /**
     * Gets the value of the containedGoodsItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedGoodsItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedGoodsItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getContainedGoodsItems() {
        if (containedGoodsItems == null) {
            containedGoodsItems = new ArrayList<GoodsItemType>();
        }
        return this.containedGoodsItems;
    }

    /**
     * Obtiene el valor de la propiedad originAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getOriginAddress() {
        return originAddress;
    }

    /**
     * Define el valor de la propiedad originAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOriginAddress(AddressType value) {
        this.originAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad delivery.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Define el valor de la propiedad delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Obtiene el valor de la propiedad pickup.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickup() {
        return pickup;
    }

    /**
     * Define el valor de la propiedad pickup.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickup(Pickup value) {
        this.pickup = value;
    }

    /**
     * Obtiene el valor de la propiedad despatch.
     * 
     * @return
     *     possible object is
     *     {@link Despatch }
     *     
     */
    public Despatch getDespatch() {
        return despatch;
    }

    /**
     * Define el valor de la propiedad despatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Despatch }
     *     
     */
    public void setDespatch(Despatch value) {
        this.despatch = value;
    }

    /**
     * Gets the value of the measurementDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimensions() {
        if (measurementDimensions == null) {
            measurementDimensions = new ArrayList<DimensionType>();
        }
        return this.measurementDimensions;
    }

    /**
     * Gets the value of the containingPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containingPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainingPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getContainingPackages() {
        if (containingPackages == null) {
            containingPackages = new ArrayList<PackageType>();
        }
        return this.containingPackages;
    }

    /**
     * Obtiene el valor de la propiedad shipmentDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getShipmentDocumentReference() {
        return shipmentDocumentReference;
    }

    /**
     * Define el valor de la propiedad shipmentDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setShipmentDocumentReference(DocumentReferenceType value) {
        this.shipmentDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Define el valor de la propiedad minimumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Define el valor de la propiedad maximumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
    }

}
