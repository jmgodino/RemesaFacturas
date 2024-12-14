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
import com.picoto.jaxb.ubl.common.cbc.AirFlowPercent;
import com.picoto.jaxb.ubl.common.cbc.AnimalFoodApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.Characteristics;
import com.picoto.jaxb.ubl.common.cbc.DamageRemarks;
import com.picoto.jaxb.ubl.common.cbc.DangerousGoodsApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.DispositionCode;
import com.picoto.jaxb.ubl.common.cbc.FullnessIndicationCode;
import com.picoto.jaxb.ubl.common.cbc.GrossVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.HumanFoodApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.HumidityPercent;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Information;
import com.picoto.jaxb.ubl.common.cbc.LegalStatusIndicator;
import com.picoto.jaxb.ubl.common.cbc.OwnerTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PowerIndicator;
import com.picoto.jaxb.ubl.common.cbc.ProviderTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ReferencedConsignmentID;
import com.picoto.jaxb.ubl.common.cbc.RefrigeratedIndicator;
import com.picoto.jaxb.ubl.common.cbc.RefrigerationOnIndicator;
import com.picoto.jaxb.ubl.common.cbc.ReturnabilityIndicator;
import com.picoto.jaxb.ubl.common.cbc.SizeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SpecialTransportRequirements;
import com.picoto.jaxb.ubl.common.cbc.TareWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.TraceID;
import com.picoto.jaxb.ubl.common.cbc.TrackingDeviceCode;
import com.picoto.jaxb.ubl.common.cbc.TransportEquipmentTypeCode;


/**
 * <p>Clase Java para TransportEquipmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferencedConsignmentID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEquipmentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProviderTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OwnerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SizeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DispositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigerationOnIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LegalStatusIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AirFlowPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumidityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DangerousGoodsApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigeratedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Characteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DamageRemarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTransportRequirements" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TareWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrackingDeviceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PowerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipmentSeal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingProofParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OperatingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PositioningTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QuarantineTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HandlingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HaulageTradingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PackagedTransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AttachedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedInTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentType", propOrder = {
    "id",
    "referencedConsignmentIDs",
    "transportEquipmentTypeCode",
    "providerTypeCode",
    "ownerTypeCode",
    "sizeTypeCode",
    "dispositionCode",
    "fullnessIndicationCode",
    "refrigerationOnIndicator",
    "informations",
    "returnabilityIndicator",
    "legalStatusIndicator",
    "airFlowPercent",
    "humidityPercent",
    "animalFoodApprovedIndicator",
    "humanFoodApprovedIndicator",
    "dangerousGoodsApprovedIndicator",
    "refrigeratedIndicator",
    "characteristics",
    "damageRemarks",
    "descriptions",
    "specialTransportRequirements",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "tareWeightMeasure",
    "trackingDeviceCode",
    "powerIndicator",
    "traceID",
    "measurementDimensions",
    "transportEquipmentSeals",
    "minimumTemperature",
    "maximumTemperature",
    "providerParty",
    "loadingProofParty",
    "supplierParty",
    "ownerParty",
    "operatingParty",
    "loadingLocation",
    "unloadingLocation",
    "storageLocation",
    "positioningTransportEvents",
    "quarantineTransportEvents",
    "deliveryTransportEvents",
    "pickupTransportEvents",
    "handlingTransportEvents",
    "loadingTransportEvents",
    "transportEvents",
    "applicableTransportMeans",
    "haulageTradingTerms",
    "hazardousGoodsTransits",
    "packagedTransportHandlingUnits",
    "serviceAllowanceCharges",
    "freightAllowanceCharges",
    "attachedTransportEquipments",
    "delivery",
    "pickup",
    "despatch",
    "shipmentDocumentReferences",
    "containedInTransportEquipments",
    "packages",
    "goodsItems"
})
public class TransportEquipmentType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "ReferencedConsignmentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ReferencedConsignmentID> referencedConsignmentIDs;
    @XmlElement(name = "TransportEquipmentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportEquipmentTypeCode transportEquipmentTypeCode;
    @XmlElement(name = "ProviderTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProviderTypeCode providerTypeCode;
    @XmlElement(name = "OwnerTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OwnerTypeCode ownerTypeCode;
    @XmlElement(name = "SizeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SizeTypeCode sizeTypeCode;
    @XmlElement(name = "DispositionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DispositionCode dispositionCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullnessIndicationCode fullnessIndicationCode;
    @XmlElement(name = "RefrigerationOnIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RefrigerationOnIndicator refrigerationOnIndicator;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Information> informations;
    @XmlElement(name = "ReturnabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReturnabilityIndicator returnabilityIndicator;
    @XmlElement(name = "LegalStatusIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LegalStatusIndicator legalStatusIndicator;
    @XmlElement(name = "AirFlowPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AirFlowPercent airFlowPercent;
    @XmlElement(name = "HumidityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumidityPercent humidityPercent;
    @XmlElement(name = "AnimalFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnimalFoodApprovedIndicator animalFoodApprovedIndicator;
    @XmlElement(name = "HumanFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumanFoodApprovedIndicator humanFoodApprovedIndicator;
    @XmlElement(name = "DangerousGoodsApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DangerousGoodsApprovedIndicator dangerousGoodsApprovedIndicator;
    @XmlElement(name = "RefrigeratedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RefrigeratedIndicator refrigeratedIndicator;
    @XmlElement(name = "Characteristics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Characteristics characteristics;
    @XmlElement(name = "DamageRemarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DamageRemarks> damageRemarks;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "SpecialTransportRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialTransportRequirements> specialTransportRequirements;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossWeightMeasure grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossVolumeMeasure grossVolumeMeasure;
    @XmlElement(name = "TareWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TareWeightMeasure tareWeightMeasure;
    @XmlElement(name = "TrackingDeviceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TrackingDeviceCode trackingDeviceCode;
    @XmlElement(name = "PowerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PowerIndicator powerIndicator;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceID traceID;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "TransportEquipmentSeal")
    protected List<TransportEquipmentSeal> transportEquipmentSeals;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "ProviderParty")
    protected PartyType providerParty;
    @XmlElement(name = "LoadingProofParty")
    protected PartyType loadingProofParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "OwnerParty")
    protected PartyType ownerParty;
    @XmlElement(name = "OperatingParty")
    protected PartyType operatingParty;
    @XmlElement(name = "LoadingLocation")
    protected LocationType loadingLocation;
    @XmlElement(name = "UnloadingLocation")
    protected LocationType unloadingLocation;
    @XmlElement(name = "StorageLocation")
    protected LocationType storageLocation;
    @XmlElement(name = "PositioningTransportEvent")
    protected List<TransportEventType> positioningTransportEvents;
    @XmlElement(name = "QuarantineTransportEvent")
    protected List<TransportEventType> quarantineTransportEvents;
    @XmlElement(name = "DeliveryTransportEvent")
    protected List<TransportEventType> deliveryTransportEvents;
    @XmlElement(name = "PickupTransportEvent")
    protected List<TransportEventType> pickupTransportEvents;
    @XmlElement(name = "HandlingTransportEvent")
    protected List<TransportEventType> handlingTransportEvents;
    @XmlElement(name = "LoadingTransportEvent")
    protected List<TransportEventType> loadingTransportEvents;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "ApplicableTransportMeans")
    protected TransportMeansType applicableTransportMeans;
    @XmlElement(name = "HaulageTradingTerms")
    protected List<TradingTermsType> haulageTradingTerms;
    @XmlElement(name = "HazardousGoodsTransit")
    protected List<HazardousGoodsTransit> hazardousGoodsTransits;
    @XmlElement(name = "PackagedTransportHandlingUnit")
    protected List<TransportHandlingUnitType> packagedTransportHandlingUnits;
    @XmlElement(name = "ServiceAllowanceCharge")
    protected List<AllowanceChargeType> serviceAllowanceCharges;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "AttachedTransportEquipment")
    protected List<TransportEquipmentType> attachedTransportEquipments;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup")
    protected Pickup pickup;
    @XmlElement(name = "Despatch")
    protected Despatch despatch;
    @XmlElement(name = "ShipmentDocumentReference")
    protected List<DocumentReferenceType> shipmentDocumentReferences;
    @XmlElement(name = "ContainedInTransportEquipment")
    protected List<TransportEquipmentType> containedInTransportEquipments;
    @XmlElement(name = "Package")
    protected List<PackageType> packages;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItems;

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
     * Gets the value of the referencedConsignmentIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedConsignmentIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedConsignmentIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedConsignmentID }
     * 
     * 
     */
    public List<ReferencedConsignmentID> getReferencedConsignmentIDs() {
        if (referencedConsignmentIDs == null) {
            referencedConsignmentIDs = new ArrayList<ReferencedConsignmentID>();
        }
        return this.referencedConsignmentIDs;
    }

    /**
     * Obtiene el valor de la propiedad transportEquipmentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentTypeCode }
     *     
     */
    public TransportEquipmentTypeCode getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * Define el valor de la propiedad transportEquipmentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentTypeCode }
     *     
     */
    public void setTransportEquipmentTypeCode(TransportEquipmentTypeCode value) {
        this.transportEquipmentTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad providerTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTypeCode }
     *     
     */
    public ProviderTypeCode getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Define el valor de la propiedad providerTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTypeCode }
     *     
     */
    public void setProviderTypeCode(ProviderTypeCode value) {
        this.providerTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCode }
     *     
     */
    public OwnerTypeCode getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Define el valor de la propiedad ownerTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCode }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCode value) {
        this.ownerTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sizeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SizeTypeCode }
     *     
     */
    public SizeTypeCode getSizeTypeCode() {
        return sizeTypeCode;
    }

    /**
     * Define el valor de la propiedad sizeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeTypeCode }
     *     
     */
    public void setSizeTypeCode(SizeTypeCode value) {
        this.sizeTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad dispositionCode.
     * 
     * @return
     *     possible object is
     *     {@link DispositionCode }
     *     
     */
    public DispositionCode getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Define el valor de la propiedad dispositionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositionCode }
     *     
     */
    public void setDispositionCode(DispositionCode value) {
        this.dispositionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fullnessIndicationCode.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public FullnessIndicationCode getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Define el valor de la propiedad fullnessIndicationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCode value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad refrigerationOnIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RefrigerationOnIndicator }
     *     
     */
    public RefrigerationOnIndicator getRefrigerationOnIndicator() {
        return refrigerationOnIndicator;
    }

    /**
     * Define el valor de la propiedad refrigerationOnIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigerationOnIndicator }
     *     
     */
    public void setRefrigerationOnIndicator(RefrigerationOnIndicator value) {
        this.refrigerationOnIndicator = value;
    }

    /**
     * Gets the value of the informations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Information }
     * 
     * 
     */
    public List<Information> getInformations() {
        if (informations == null) {
            informations = new ArrayList<Information>();
        }
        return this.informations;
    }

    /**
     * Obtiene el valor de la propiedad returnabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ReturnabilityIndicator }
     *     
     */
    public ReturnabilityIndicator getReturnabilityIndicator() {
        return returnabilityIndicator;
    }

    /**
     * Define el valor de la propiedad returnabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnabilityIndicator }
     *     
     */
    public void setReturnabilityIndicator(ReturnabilityIndicator value) {
        this.returnabilityIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad legalStatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link LegalStatusIndicator }
     *     
     */
    public LegalStatusIndicator getLegalStatusIndicator() {
        return legalStatusIndicator;
    }

    /**
     * Define el valor de la propiedad legalStatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStatusIndicator }
     *     
     */
    public void setLegalStatusIndicator(LegalStatusIndicator value) {
        this.legalStatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad airFlowPercent.
     * 
     * @return
     *     possible object is
     *     {@link AirFlowPercent }
     *     
     */
    public AirFlowPercent getAirFlowPercent() {
        return airFlowPercent;
    }

    /**
     * Define el valor de la propiedad airFlowPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFlowPercent }
     *     
     */
    public void setAirFlowPercent(AirFlowPercent value) {
        this.airFlowPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad humidityPercent.
     * 
     * @return
     *     possible object is
     *     {@link HumidityPercent }
     *     
     */
    public HumidityPercent getHumidityPercent() {
        return humidityPercent;
    }

    /**
     * Define el valor de la propiedad humidityPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link HumidityPercent }
     *     
     */
    public void setHumidityPercent(HumidityPercent value) {
        this.humidityPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad animalFoodApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodApprovedIndicator }
     *     
     */
    public AnimalFoodApprovedIndicator getAnimalFoodApprovedIndicator() {
        return animalFoodApprovedIndicator;
    }

    /**
     * Define el valor de la propiedad animalFoodApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodApprovedIndicator }
     *     
     */
    public void setAnimalFoodApprovedIndicator(AnimalFoodApprovedIndicator value) {
        this.animalFoodApprovedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad humanFoodApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodApprovedIndicator }
     *     
     */
    public HumanFoodApprovedIndicator getHumanFoodApprovedIndicator() {
        return humanFoodApprovedIndicator;
    }

    /**
     * Define el valor de la propiedad humanFoodApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodApprovedIndicator }
     *     
     */
    public void setHumanFoodApprovedIndicator(HumanFoodApprovedIndicator value) {
        this.humanFoodApprovedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad dangerousGoodsApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsApprovedIndicator }
     *     
     */
    public DangerousGoodsApprovedIndicator getDangerousGoodsApprovedIndicator() {
        return dangerousGoodsApprovedIndicator;
    }

    /**
     * Define el valor de la propiedad dangerousGoodsApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsApprovedIndicator }
     *     
     */
    public void setDangerousGoodsApprovedIndicator(DangerousGoodsApprovedIndicator value) {
        this.dangerousGoodsApprovedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad refrigeratedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RefrigeratedIndicator }
     *     
     */
    public RefrigeratedIndicator getRefrigeratedIndicator() {
        return refrigeratedIndicator;
    }

    /**
     * Define el valor de la propiedad refrigeratedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigeratedIndicator }
     *     
     */
    public void setRefrigeratedIndicator(RefrigeratedIndicator value) {
        this.refrigeratedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad characteristics.
     * 
     * @return
     *     possible object is
     *     {@link Characteristics }
     *     
     */
    public Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Define el valor de la propiedad characteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristics }
     *     
     */
    public void setCharacteristics(Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the damageRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamageRemarks }
     * 
     * 
     */
    public List<DamageRemarks> getDamageRemarks() {
        if (damageRemarks == null) {
            damageRemarks = new ArrayList<DamageRemarks>();
        }
        return this.damageRemarks;
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
     * Gets the value of the specialTransportRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialTransportRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialTransportRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialTransportRequirements }
     * 
     * 
     */
    public List<SpecialTransportRequirements> getSpecialTransportRequirements() {
        if (specialTransportRequirements == null) {
            specialTransportRequirements = new ArrayList<SpecialTransportRequirements>();
        }
        return this.specialTransportRequirements;
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
     * Obtiene el valor de la propiedad tareWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TareWeightMeasure }
     *     
     */
    public TareWeightMeasure getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Define el valor de la propiedad tareWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TareWeightMeasure }
     *     
     */
    public void setTareWeightMeasure(TareWeightMeasure value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingDeviceCode.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDeviceCode }
     *     
     */
    public TrackingDeviceCode getTrackingDeviceCode() {
        return trackingDeviceCode;
    }

    /**
     * Define el valor de la propiedad trackingDeviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDeviceCode }
     *     
     */
    public void setTrackingDeviceCode(TrackingDeviceCode value) {
        this.trackingDeviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad powerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PowerIndicator }
     *     
     */
    public PowerIndicator getPowerIndicator() {
        return powerIndicator;
    }

    /**
     * Define el valor de la propiedad powerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerIndicator }
     *     
     */
    public void setPowerIndicator(PowerIndicator value) {
        this.powerIndicator = value;
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
     * Gets the value of the transportEquipmentSeals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipmentSeals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipmentSeals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentSeal }
     * 
     * 
     */
    public List<TransportEquipmentSeal> getTransportEquipmentSeals() {
        if (transportEquipmentSeals == null) {
            transportEquipmentSeals = new ArrayList<TransportEquipmentSeal>();
        }
        return this.transportEquipmentSeals;
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

    /**
     * Obtiene el valor de la propiedad providerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getProviderParty() {
        return providerParty;
    }

    /**
     * Define el valor de la propiedad providerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setProviderParty(PartyType value) {
        this.providerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad loadingProofParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLoadingProofParty() {
        return loadingProofParty;
    }

    /**
     * Define el valor de la propiedad loadingProofParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLoadingProofParty(PartyType value) {
        this.loadingProofParty = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Define el valor de la propiedad supplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOwnerParty() {
        return ownerParty;
    }

    /**
     * Define el valor de la propiedad ownerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOwnerParty(PartyType value) {
        this.ownerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad operatingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOperatingParty() {
        return operatingParty;
    }

    /**
     * Define el valor de la propiedad operatingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOperatingParty(PartyType value) {
        this.operatingParty = value;
    }

    /**
     * Obtiene el valor de la propiedad loadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Define el valor de la propiedad loadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingLocation(LocationType value) {
        this.loadingLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad unloadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingLocation() {
        return unloadingLocation;
    }

    /**
     * Define el valor de la propiedad unloadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingLocation(LocationType value) {
        this.unloadingLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad storageLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getStorageLocation() {
        return storageLocation;
    }

    /**
     * Define el valor de la propiedad storageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setStorageLocation(LocationType value) {
        this.storageLocation = value;
    }

    /**
     * Gets the value of the positioningTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positioningTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositioningTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPositioningTransportEvents() {
        if (positioningTransportEvents == null) {
            positioningTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.positioningTransportEvents;
    }

    /**
     * Gets the value of the quarantineTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarantineTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarantineTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getQuarantineTransportEvents() {
        if (quarantineTransportEvents == null) {
            quarantineTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.quarantineTransportEvents;
    }

    /**
     * Gets the value of the deliveryTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDeliveryTransportEvents() {
        if (deliveryTransportEvents == null) {
            deliveryTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.deliveryTransportEvents;
    }

    /**
     * Gets the value of the pickupTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPickupTransportEvents() {
        if (pickupTransportEvents == null) {
            pickupTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.pickupTransportEvents;
    }

    /**
     * Gets the value of the handlingTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getHandlingTransportEvents() {
        if (handlingTransportEvents == null) {
            handlingTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.handlingTransportEvents;
    }

    /**
     * Gets the value of the loadingTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadingTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadingTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getLoadingTransportEvents() {
        if (loadingTransportEvents == null) {
            loadingTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.loadingTransportEvents;
    }

    /**
     * Gets the value of the transportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getTransportEvents() {
        if (transportEvents == null) {
            transportEvents = new ArrayList<TransportEventType>();
        }
        return this.transportEvents;
    }

    /**
     * Obtiene el valor de la propiedad applicableTransportMeans.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getApplicableTransportMeans() {
        return applicableTransportMeans;
    }

    /**
     * Define el valor de la propiedad applicableTransportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setApplicableTransportMeans(TransportMeansType value) {
        this.applicableTransportMeans = value;
    }

    /**
     * Gets the value of the haulageTradingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageTradingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageTradingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingTermsType }
     * 
     * 
     */
    public List<TradingTermsType> getHaulageTradingTerms() {
        if (haulageTradingTerms == null) {
            haulageTradingTerms = new ArrayList<TradingTermsType>();
        }
        return this.haulageTradingTerms;
    }

    /**
     * Gets the value of the hazardousGoodsTransits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsTransits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsTransits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsTransit }
     * 
     * 
     */
    public List<HazardousGoodsTransit> getHazardousGoodsTransits() {
        if (hazardousGoodsTransits == null) {
            hazardousGoodsTransits = new ArrayList<HazardousGoodsTransit>();
        }
        return this.hazardousGoodsTransits;
    }

    /**
     * Gets the value of the packagedTransportHandlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagedTransportHandlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagedTransportHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getPackagedTransportHandlingUnits() {
        if (packagedTransportHandlingUnits == null) {
            packagedTransportHandlingUnits = new ArrayList<TransportHandlingUnitType>();
        }
        return this.packagedTransportHandlingUnits;
    }

    /**
     * Gets the value of the serviceAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getServiceAllowanceCharges() {
        if (serviceAllowanceCharges == null) {
            serviceAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.serviceAllowanceCharges;
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
     * Gets the value of the attachedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getAttachedTransportEquipments() {
        if (attachedTransportEquipments == null) {
            attachedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.attachedTransportEquipments;
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
     * Gets the value of the shipmentDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getShipmentDocumentReferences() {
        if (shipmentDocumentReferences == null) {
            shipmentDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.shipmentDocumentReferences;
    }

    /**
     * Gets the value of the containedInTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedInTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedInTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getContainedInTransportEquipments() {
        if (containedInTransportEquipments == null) {
            containedInTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.containedInTransportEquipments;
    }

    /**
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackages() {
        if (packages == null) {
            packages = new ArrayList<PackageType>();
        }
        return this.packages;
    }

    /**
     * Gets the value of the goodsItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getGoodsItems() {
        if (goodsItems == null) {
            goodsItems = new ArrayList<GoodsItemType>();
        }
        return this.goodsItems;
    }

}
