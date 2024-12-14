//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AnimalFoodIndicator;
import com.picoto.jaxb.ubl.common.cbc.BrokerAssignedID;
import com.picoto.jaxb.ubl.common.cbc.BulkCargoIndicator;
import com.picoto.jaxb.ubl.common.cbc.CarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.CarrierServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.ChargeableWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.ChildConsignmentQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsigneeAssignedID;
import com.picoto.jaxb.ubl.common.cbc.ConsignmentQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsignorAssignedID;
import com.picoto.jaxb.ubl.common.cbc.ConsolidatableIndicator;
import com.picoto.jaxb.ubl.common.cbc.ContainerizedIndicator;
import com.picoto.jaxb.ubl.common.cbc.ContractedCarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.CustomsClearanceServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.DeclaredCustomsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredForCarriageValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredStatisticsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeliveryInstructions;
import com.picoto.jaxb.ubl.common.cbc.ForwarderServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.FreeOnBoardValueAmount;
import com.picoto.jaxb.ubl.common.cbc.FreightForwarderAssignedID;
import com.picoto.jaxb.ubl.common.cbc.GeneralCargoIndicator;
import com.picoto.jaxb.ubl.common.cbc.GrossVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.HandlingCode;
import com.picoto.jaxb.ubl.common.cbc.HandlingInstructions;
import com.picoto.jaxb.ubl.common.cbc.HaulageInstructions;
import com.picoto.jaxb.ubl.common.cbc.HazardousRiskIndicator;
import com.picoto.jaxb.ubl.common.cbc.HumanFoodIndicator;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Information;
import com.picoto.jaxb.ubl.common.cbc.InsurancePremiumAmount;
import com.picoto.jaxb.ubl.common.cbc.InsuranceValueAmount;
import com.picoto.jaxb.ubl.common.cbc.LivestockIndicator;
import com.picoto.jaxb.ubl.common.cbc.LoadingLengthMeasure;
import com.picoto.jaxb.ubl.common.cbc.LoadingSequenceID;
import com.picoto.jaxb.ubl.common.cbc.NetNetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.PerformingCarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.Remarks;
import com.picoto.jaxb.ubl.common.cbc.SequenceID;
import com.picoto.jaxb.ubl.common.cbc.ShippingPriorityLevelCode;
import com.picoto.jaxb.ubl.common.cbc.SpecialInstructions;
import com.picoto.jaxb.ubl.common.cbc.SpecialSecurityIndicator;
import com.picoto.jaxb.ubl.common.cbc.SpecialServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.SplitConsignmentIndicator;
import com.picoto.jaxb.ubl.common.cbc.SummaryDescription;
import com.picoto.jaxb.ubl.common.cbc.TariffCode;
import com.picoto.jaxb.ubl.common.cbc.TariffDescription;
import com.picoto.jaxb.ubl.common.cbc.ThirdPartyPayerIndicator;
import com.picoto.jaxb.ubl.common.cbc.TotalGoodsItemQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalInvoiceAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalPackagesQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalTransportHandlingUnitQuantity;


/**
 * <p>Clase Java para ConsignmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsigneeAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignorAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightForwarderAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrokerAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractedCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformingCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SummaryDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalInvoiceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsurancePremiumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LivestockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BulkCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContainerizedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GeneralCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialSecurityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThirdPartyPayerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsClearanceServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForwarderServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingPriorityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SplitConsignmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveryInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsolidatableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HaulageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChildConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPackagesQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsolidatedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ChildConsignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsigneeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsignorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ImporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightForwarderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PerformingCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubstituteCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LogisticsOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportAdvisorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItemNotificationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InsuranceParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MortgageHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillOfLadingHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDepartureCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDestinationCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitCountry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportContract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CollectPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DisbursementPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PrepaidPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExtraAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FirstArrivalPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LastExitPortLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentType", propOrder = {
    "id",
    "carrierAssignedID",
    "consigneeAssignedID",
    "consignorAssignedID",
    "freightForwarderAssignedID",
    "brokerAssignedID",
    "contractedCarrierAssignedID",
    "performingCarrierAssignedID",
    "summaryDescriptions",
    "totalInvoiceAmount",
    "declaredCustomsValueAmount",
    "tariffDescriptions",
    "tariffCode",
    "insurancePremiumAmount",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "chargeableWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "loadingLengthMeasure",
    "remarks",
    "hazardousRiskIndicator",
    "animalFoodIndicator",
    "humanFoodIndicator",
    "livestockIndicator",
    "bulkCargoIndicator",
    "containerizedIndicator",
    "generalCargoIndicator",
    "specialSecurityIndicator",
    "thirdPartyPayerIndicator",
    "carrierServiceInstructions",
    "customsClearanceServiceInstructions",
    "forwarderServiceInstructions",
    "specialServiceInstructions",
    "sequenceID",
    "shippingPriorityLevelCode",
    "handlingCode",
    "handlingInstructions",
    "informations",
    "totalGoodsItemQuantity",
    "totalTransportHandlingUnitQuantity",
    "insuranceValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "specialInstructions",
    "splitConsignmentIndicator",
    "deliveryInstructions",
    "consignmentQuantity",
    "consolidatableIndicator",
    "haulageInstructions",
    "loadingSequenceID",
    "childConsignmentQuantity",
    "totalPackagesQuantity",
    "consolidatedShipments",
    "customsDeclarations",
    "requestedPickupTransportEvent",
    "requestedDeliveryTransportEvent",
    "plannedPickupTransportEvent",
    "plannedDeliveryTransportEvent",
    "statuses",
    "childConsignments",
    "consigneeParty",
    "exporterParty",
    "consignorParty",
    "importerParty",
    "carrierParty",
    "freightForwarderParty",
    "notifyParty",
    "originalDespatchParty",
    "finalDeliveryParty",
    "performingCarrierParty",
    "substituteCarrierParty",
    "logisticsOperatorParty",
    "transportAdvisorParty",
    "hazardousItemNotificationParty",
    "insuranceParty",
    "mortgageHolderParty",
    "billOfLadingHolderParty",
    "originalDepartureCountry",
    "finalDestinationCountry",
    "transitCountries",
    "transportContract",
    "transportEvents",
    "originalDespatchTransportationService",
    "finalDeliveryTransportationService",
    "deliveryTerms",
    "paymentTerms",
    "collectPaymentTerms",
    "disbursementPaymentTerms",
    "prepaidPaymentTerms",
    "freightAllowanceCharges",
    "extraAllowanceCharges",
    "mainCarriageShipmentStages",
    "preCarriageShipmentStages",
    "onCarriageShipmentStages",
    "transportHandlingUnits",
    "firstArrivalPortLocation",
    "lastExitPortLocation"
})
public class ConsignmentType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "CarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CarrierAssignedID carrierAssignedID;
    @XmlElement(name = "ConsigneeAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsigneeAssignedID consigneeAssignedID;
    @XmlElement(name = "ConsignorAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsignorAssignedID consignorAssignedID;
    @XmlElement(name = "FreightForwarderAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreightForwarderAssignedID freightForwarderAssignedID;
    @XmlElement(name = "BrokerAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BrokerAssignedID brokerAssignedID;
    @XmlElement(name = "ContractedCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractedCarrierAssignedID contractedCarrierAssignedID;
    @XmlElement(name = "PerformingCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformingCarrierAssignedID performingCarrierAssignedID;
    @XmlElement(name = "SummaryDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SummaryDescription> summaryDescriptions;
    @XmlElement(name = "TotalInvoiceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalInvoiceAmount totalInvoiceAmount;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredCustomsValueAmount declaredCustomsValueAmount;
    @XmlElement(name = "TariffDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TariffDescription> tariffDescriptions;
    @XmlElement(name = "TariffCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TariffCode tariffCode;
    @XmlElement(name = "InsurancePremiumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsurancePremiumAmount insurancePremiumAmount;
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
    @XmlElement(name = "LoadingLengthMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingLengthMeasure loadingLengthMeasure;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Remarks> remarks;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "AnimalFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnimalFoodIndicator animalFoodIndicator;
    @XmlElement(name = "HumanFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumanFoodIndicator humanFoodIndicator;
    @XmlElement(name = "LivestockIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LivestockIndicator livestockIndicator;
    @XmlElement(name = "BulkCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BulkCargoIndicator bulkCargoIndicator;
    @XmlElement(name = "ContainerizedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContainerizedIndicator containerizedIndicator;
    @XmlElement(name = "GeneralCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GeneralCargoIndicator generalCargoIndicator;
    @XmlElement(name = "SpecialSecurityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecialSecurityIndicator specialSecurityIndicator;
    @XmlElement(name = "ThirdPartyPayerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThirdPartyPayerIndicator thirdPartyPayerIndicator;
    @XmlElement(name = "CarrierServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CarrierServiceInstructions> carrierServiceInstructions;
    @XmlElement(name = "CustomsClearanceServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CustomsClearanceServiceInstructions> customsClearanceServiceInstructions;
    @XmlElement(name = "ForwarderServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ForwarderServiceInstructions> forwarderServiceInstructions;
    @XmlElement(name = "SpecialServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialServiceInstructions> specialServiceInstructions;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceID sequenceID;
    @XmlElement(name = "ShippingPriorityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShippingPriorityLevelCode shippingPriorityLevelCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HandlingCode handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HandlingInstructions> handlingInstructions;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Information> informations;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalGoodsItemQuantity totalGoodsItemQuantity;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTransportHandlingUnitQuantity totalTransportHandlingUnitQuantity;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsuranceValueAmount insuranceValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredForCarriageValueAmount declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredStatisticsValueAmount declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreeOnBoardValueAmount freeOnBoardValueAmount;
    @XmlElement(name = "SpecialInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialInstructions> specialInstructions;
    @XmlElement(name = "SplitConsignmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SplitConsignmentIndicator splitConsignmentIndicator;
    @XmlElement(name = "DeliveryInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DeliveryInstructions> deliveryInstructions;
    @XmlElement(name = "ConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsignmentQuantity consignmentQuantity;
    @XmlElement(name = "ConsolidatableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsolidatableIndicator consolidatableIndicator;
    @XmlElement(name = "HaulageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HaulageInstructions> haulageInstructions;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingSequenceID loadingSequenceID;
    @XmlElement(name = "ChildConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChildConsignmentQuantity childConsignmentQuantity;
    @XmlElement(name = "TotalPackagesQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalPackagesQuantity totalPackagesQuantity;
    @XmlElement(name = "ConsolidatedShipment")
    protected List<ShipmentType> consolidatedShipments;
    @XmlElement(name = "CustomsDeclaration")
    protected List<CustomsDeclaration> customsDeclarations;
    @XmlElement(name = "RequestedPickupTransportEvent")
    protected TransportEventType requestedPickupTransportEvent;
    @XmlElement(name = "RequestedDeliveryTransportEvent")
    protected TransportEventType requestedDeliveryTransportEvent;
    @XmlElement(name = "PlannedPickupTransportEvent")
    protected TransportEventType plannedPickupTransportEvent;
    @XmlElement(name = "PlannedDeliveryTransportEvent")
    protected TransportEventType plannedDeliveryTransportEvent;
    @XmlElement(name = "Status")
    protected List<StatusType> statuses;
    @XmlElement(name = "ChildConsignment")
    protected List<ConsignmentType> childConsignments;
    @XmlElement(name = "ConsigneeParty")
    protected PartyType consigneeParty;
    @XmlElement(name = "ExporterParty")
    protected PartyType exporterParty;
    @XmlElement(name = "ConsignorParty")
    protected PartyType consignorParty;
    @XmlElement(name = "ImporterParty")
    protected PartyType importerParty;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "FreightForwarderParty")
    protected PartyType freightForwarderParty;
    @XmlElement(name = "NotifyParty")
    protected PartyType notifyParty;
    @XmlElement(name = "OriginalDespatchParty")
    protected PartyType originalDespatchParty;
    @XmlElement(name = "FinalDeliveryParty")
    protected PartyType finalDeliveryParty;
    @XmlElement(name = "PerformingCarrierParty")
    protected PartyType performingCarrierParty;
    @XmlElement(name = "SubstituteCarrierParty")
    protected PartyType substituteCarrierParty;
    @XmlElement(name = "LogisticsOperatorParty")
    protected PartyType logisticsOperatorParty;
    @XmlElement(name = "TransportAdvisorParty")
    protected PartyType transportAdvisorParty;
    @XmlElement(name = "HazardousItemNotificationParty")
    protected PartyType hazardousItemNotificationParty;
    @XmlElement(name = "InsuranceParty")
    protected PartyType insuranceParty;
    @XmlElement(name = "MortgageHolderParty")
    protected PartyType mortgageHolderParty;
    @XmlElement(name = "BillOfLadingHolderParty")
    protected PartyType billOfLadingHolderParty;
    @XmlElement(name = "OriginalDepartureCountry")
    protected CountryType originalDepartureCountry;
    @XmlElement(name = "FinalDestinationCountry")
    protected CountryType finalDestinationCountry;
    @XmlElement(name = "TransitCountry")
    protected List<CountryType> transitCountries;
    @XmlElement(name = "TransportContract")
    protected ContractType transportContract;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "OriginalDespatchTransportationService")
    protected TransportationServiceType originalDespatchTransportationService;
    @XmlElement(name = "FinalDeliveryTransportationService")
    protected TransportationServiceType finalDeliveryTransportationService;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTerms deliveryTerms;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "CollectPaymentTerms")
    protected PaymentTermsType collectPaymentTerms;
    @XmlElement(name = "DisbursementPaymentTerms")
    protected PaymentTermsType disbursementPaymentTerms;
    @XmlElement(name = "PrepaidPaymentTerms")
    protected PaymentTermsType prepaidPaymentTerms;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "ExtraAllowanceCharge")
    protected List<AllowanceChargeType> extraAllowanceCharges;
    @XmlElement(name = "MainCarriageShipmentStage")
    protected List<ShipmentStageType> mainCarriageShipmentStages;
    @XmlElement(name = "PreCarriageShipmentStage")
    protected List<ShipmentStageType> preCarriageShipmentStages;
    @XmlElement(name = "OnCarriageShipmentStage")
    protected List<ShipmentStageType> onCarriageShipmentStages;
    @XmlElement(name = "TransportHandlingUnit")
    protected List<TransportHandlingUnitType> transportHandlingUnits;
    @XmlElement(name = "FirstArrivalPortLocation")
    protected LocationType firstArrivalPortLocation;
    @XmlElement(name = "LastExitPortLocation")
    protected LocationType lastExitPortLocation;

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
     * Obtiene el valor de la propiedad carrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAssignedID }
     *     
     */
    public CarrierAssignedID getCarrierAssignedID() {
        return carrierAssignedID;
    }

    /**
     * Define el valor de la propiedad carrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAssignedID }
     *     
     */
    public void setCarrierAssignedID(CarrierAssignedID value) {
        this.carrierAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad consigneeAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ConsigneeAssignedID }
     *     
     */
    public ConsigneeAssignedID getConsigneeAssignedID() {
        return consigneeAssignedID;
    }

    /**
     * Define el valor de la propiedad consigneeAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneeAssignedID }
     *     
     */
    public void setConsigneeAssignedID(ConsigneeAssignedID value) {
        this.consigneeAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad consignorAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorAssignedID }
     *     
     */
    public ConsignorAssignedID getConsignorAssignedID() {
        return consignorAssignedID;
    }

    /**
     * Define el valor de la propiedad consignorAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorAssignedID }
     *     
     */
    public void setConsignorAssignedID(ConsignorAssignedID value) {
        this.consignorAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad freightForwarderAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link FreightForwarderAssignedID }
     *     
     */
    public FreightForwarderAssignedID getFreightForwarderAssignedID() {
        return freightForwarderAssignedID;
    }

    /**
     * Define el valor de la propiedad freightForwarderAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightForwarderAssignedID }
     *     
     */
    public void setFreightForwarderAssignedID(FreightForwarderAssignedID value) {
        this.freightForwarderAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad brokerAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link BrokerAssignedID }
     *     
     */
    public BrokerAssignedID getBrokerAssignedID() {
        return brokerAssignedID;
    }

    /**
     * Define el valor de la propiedad brokerAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerAssignedID }
     *     
     */
    public void setBrokerAssignedID(BrokerAssignedID value) {
        this.brokerAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad contractedCarrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ContractedCarrierAssignedID }
     *     
     */
    public ContractedCarrierAssignedID getContractedCarrierAssignedID() {
        return contractedCarrierAssignedID;
    }

    /**
     * Define el valor de la propiedad contractedCarrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractedCarrierAssignedID }
     *     
     */
    public void setContractedCarrierAssignedID(ContractedCarrierAssignedID value) {
        this.contractedCarrierAssignedID = value;
    }

    /**
     * Obtiene el valor de la propiedad performingCarrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link PerformingCarrierAssignedID }
     *     
     */
    public PerformingCarrierAssignedID getPerformingCarrierAssignedID() {
        return performingCarrierAssignedID;
    }

    /**
     * Define el valor de la propiedad performingCarrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformingCarrierAssignedID }
     *     
     */
    public void setPerformingCarrierAssignedID(PerformingCarrierAssignedID value) {
        this.performingCarrierAssignedID = value;
    }

    /**
     * Gets the value of the summaryDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryDescription }
     * 
     * 
     */
    public List<SummaryDescription> getSummaryDescriptions() {
        if (summaryDescriptions == null) {
            summaryDescriptions = new ArrayList<SummaryDescription>();
        }
        return this.summaryDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad totalInvoiceAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalInvoiceAmount }
     *     
     */
    public TotalInvoiceAmount getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Define el valor de la propiedad totalInvoiceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalInvoiceAmount }
     *     
     */
    public void setTotalInvoiceAmount(TotalInvoiceAmount value) {
        this.totalInvoiceAmount = value;
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
     * Gets the value of the tariffDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffDescription }
     * 
     * 
     */
    public List<TariffDescription> getTariffDescriptions() {
        if (tariffDescriptions == null) {
            tariffDescriptions = new ArrayList<TariffDescription>();
        }
        return this.tariffDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad tariffCode.
     * 
     * @return
     *     possible object is
     *     {@link TariffCode }
     *     
     */
    public TariffCode getTariffCode() {
        return tariffCode;
    }

    /**
     * Define el valor de la propiedad tariffCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffCode }
     *     
     */
    public void setTariffCode(TariffCode value) {
        this.tariffCode = value;
    }

    /**
     * Obtiene el valor de la propiedad insurancePremiumAmount.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePremiumAmount }
     *     
     */
    public InsurancePremiumAmount getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    /**
     * Define el valor de la propiedad insurancePremiumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePremiumAmount }
     *     
     */
    public void setInsurancePremiumAmount(InsurancePremiumAmount value) {
        this.insurancePremiumAmount = value;
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
     * Obtiene el valor de la propiedad loadingLengthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LoadingLengthMeasure }
     *     
     */
    public LoadingLengthMeasure getLoadingLengthMeasure() {
        return loadingLengthMeasure;
    }

    /**
     * Define el valor de la propiedad loadingLengthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingLengthMeasure }
     *     
     */
    public void setLoadingLengthMeasure(LoadingLengthMeasure value) {
        this.loadingLengthMeasure = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remarks }
     * 
     * 
     */
    public List<Remarks> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<Remarks>();
        }
        return this.remarks;
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
     * Obtiene el valor de la propiedad animalFoodIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodIndicator }
     *     
     */
    public AnimalFoodIndicator getAnimalFoodIndicator() {
        return animalFoodIndicator;
    }

    /**
     * Define el valor de la propiedad animalFoodIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodIndicator }
     *     
     */
    public void setAnimalFoodIndicator(AnimalFoodIndicator value) {
        this.animalFoodIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad humanFoodIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodIndicator }
     *     
     */
    public HumanFoodIndicator getHumanFoodIndicator() {
        return humanFoodIndicator;
    }

    /**
     * Define el valor de la propiedad humanFoodIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodIndicator }
     *     
     */
    public void setHumanFoodIndicator(HumanFoodIndicator value) {
        this.humanFoodIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad livestockIndicator.
     * 
     * @return
     *     possible object is
     *     {@link LivestockIndicator }
     *     
     */
    public LivestockIndicator getLivestockIndicator() {
        return livestockIndicator;
    }

    /**
     * Define el valor de la propiedad livestockIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link LivestockIndicator }
     *     
     */
    public void setLivestockIndicator(LivestockIndicator value) {
        this.livestockIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad bulkCargoIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BulkCargoIndicator }
     *     
     */
    public BulkCargoIndicator getBulkCargoIndicator() {
        return bulkCargoIndicator;
    }

    /**
     * Define el valor de la propiedad bulkCargoIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkCargoIndicator }
     *     
     */
    public void setBulkCargoIndicator(BulkCargoIndicator value) {
        this.bulkCargoIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad containerizedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ContainerizedIndicator }
     *     
     */
    public ContainerizedIndicator getContainerizedIndicator() {
        return containerizedIndicator;
    }

    /**
     * Define el valor de la propiedad containerizedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerizedIndicator }
     *     
     */
    public void setContainerizedIndicator(ContainerizedIndicator value) {
        this.containerizedIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad generalCargoIndicator.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCargoIndicator }
     *     
     */
    public GeneralCargoIndicator getGeneralCargoIndicator() {
        return generalCargoIndicator;
    }

    /**
     * Define el valor de la propiedad generalCargoIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCargoIndicator }
     *     
     */
    public void setGeneralCargoIndicator(GeneralCargoIndicator value) {
        this.generalCargoIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad specialSecurityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SpecialSecurityIndicator }
     *     
     */
    public SpecialSecurityIndicator getSpecialSecurityIndicator() {
        return specialSecurityIndicator;
    }

    /**
     * Define el valor de la propiedad specialSecurityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialSecurityIndicator }
     *     
     */
    public void setSpecialSecurityIndicator(SpecialSecurityIndicator value) {
        this.specialSecurityIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyPayerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyPayerIndicator }
     *     
     */
    public ThirdPartyPayerIndicator getThirdPartyPayerIndicator() {
        return thirdPartyPayerIndicator;
    }

    /**
     * Define el valor de la propiedad thirdPartyPayerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyPayerIndicator }
     *     
     */
    public void setThirdPartyPayerIndicator(ThirdPartyPayerIndicator value) {
        this.thirdPartyPayerIndicator = value;
    }

    /**
     * Gets the value of the carrierServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierServiceInstructions }
     * 
     * 
     */
    public List<CarrierServiceInstructions> getCarrierServiceInstructions() {
        if (carrierServiceInstructions == null) {
            carrierServiceInstructions = new ArrayList<CarrierServiceInstructions>();
        }
        return this.carrierServiceInstructions;
    }

    /**
     * Gets the value of the customsClearanceServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsClearanceServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsClearanceServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsClearanceServiceInstructions }
     * 
     * 
     */
    public List<CustomsClearanceServiceInstructions> getCustomsClearanceServiceInstructions() {
        if (customsClearanceServiceInstructions == null) {
            customsClearanceServiceInstructions = new ArrayList<CustomsClearanceServiceInstructions>();
        }
        return this.customsClearanceServiceInstructions;
    }

    /**
     * Gets the value of the forwarderServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwarderServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwarderServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForwarderServiceInstructions }
     * 
     * 
     */
    public List<ForwarderServiceInstructions> getForwarderServiceInstructions() {
        if (forwarderServiceInstructions == null) {
            forwarderServiceInstructions = new ArrayList<ForwarderServiceInstructions>();
        }
        return this.forwarderServiceInstructions;
    }

    /**
     * Gets the value of the specialServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceInstructions }
     * 
     * 
     */
    public List<SpecialServiceInstructions> getSpecialServiceInstructions() {
        if (specialServiceInstructions == null) {
            specialServiceInstructions = new ArrayList<SpecialServiceInstructions>();
        }
        return this.specialServiceInstructions;
    }

    /**
     * Obtiene el valor de la propiedad sequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceID }
     *     
     */
    public SequenceID getSequenceID() {
        return sequenceID;
    }

    /**
     * Define el valor de la propiedad sequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceID }
     *     
     */
    public void setSequenceID(SequenceID value) {
        this.sequenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingPriorityLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public ShippingPriorityLevelCode getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Define el valor de la propiedad shippingPriorityLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public void setShippingPriorityLevelCode(ShippingPriorityLevelCode value) {
        this.shippingPriorityLevelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingCode.
     * 
     * @return
     *     possible object is
     *     {@link HandlingCode }
     *     
     */
    public HandlingCode getHandlingCode() {
        return handlingCode;
    }

    /**
     * Define el valor de la propiedad handlingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingCode }
     *     
     */
    public void setHandlingCode(HandlingCode value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInstructions }
     * 
     * 
     */
    public List<HandlingInstructions> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<HandlingInstructions>();
        }
        return this.handlingInstructions;
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
     * Obtiene el valor de la propiedad totalGoodsItemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public TotalGoodsItemQuantity getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Define el valor de la propiedad totalGoodsItemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public void setTotalGoodsItemQuantity(TotalGoodsItemQuantity value) {
        this.totalGoodsItemQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTransportHandlingUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public TotalTransportHandlingUnitQuantity getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Define el valor de la propiedad totalTransportHandlingUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public void setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantity value) {
        this.totalTransportHandlingUnitQuantity = value;
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
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructions }
     * 
     * 
     */
    public List<SpecialInstructions> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructions>();
        }
        return this.specialInstructions;
    }

    /**
     * Obtiene el valor de la propiedad splitConsignmentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public SplitConsignmentIndicator getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Define el valor de la propiedad splitConsignmentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public void setSplitConsignmentIndicator(SplitConsignmentIndicator value) {
        this.splitConsignmentIndicator = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInstructions }
     * 
     * 
     */
    public List<DeliveryInstructions> getDeliveryInstructions() {
        if (deliveryInstructions == null) {
            deliveryInstructions = new ArrayList<DeliveryInstructions>();
        }
        return this.deliveryInstructions;
    }

    /**
     * Obtiene el valor de la propiedad consignmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public ConsignmentQuantity getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Define el valor de la propiedad consignmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public void setConsignmentQuantity(ConsignmentQuantity value) {
        this.consignmentQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidatableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatableIndicator }
     *     
     */
    public ConsolidatableIndicator getConsolidatableIndicator() {
        return consolidatableIndicator;
    }

    /**
     * Define el valor de la propiedad consolidatableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatableIndicator }
     *     
     */
    public void setConsolidatableIndicator(ConsolidatableIndicator value) {
        this.consolidatableIndicator = value;
    }

    /**
     * Gets the value of the haulageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HaulageInstructions }
     * 
     * 
     */
    public List<HaulageInstructions> getHaulageInstructions() {
        if (haulageInstructions == null) {
            haulageInstructions = new ArrayList<HaulageInstructions>();
        }
        return this.haulageInstructions;
    }

    /**
     * Obtiene el valor de la propiedad loadingSequenceID.
     * 
     * @return
     *     possible object is
     *     {@link LoadingSequenceID }
     *     
     */
    public LoadingSequenceID getLoadingSequenceID() {
        return loadingSequenceID;
    }

    /**
     * Define el valor de la propiedad loadingSequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingSequenceID }
     *     
     */
    public void setLoadingSequenceID(LoadingSequenceID value) {
        this.loadingSequenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad childConsignmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ChildConsignmentQuantity }
     *     
     */
    public ChildConsignmentQuantity getChildConsignmentQuantity() {
        return childConsignmentQuantity;
    }

    /**
     * Define el valor de la propiedad childConsignmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildConsignmentQuantity }
     *     
     */
    public void setChildConsignmentQuantity(ChildConsignmentQuantity value) {
        this.childConsignmentQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPackagesQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackagesQuantity }
     *     
     */
    public TotalPackagesQuantity getTotalPackagesQuantity() {
        return totalPackagesQuantity;
    }

    /**
     * Define el valor de la propiedad totalPackagesQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackagesQuantity }
     *     
     */
    public void setTotalPackagesQuantity(TotalPackagesQuantity value) {
        this.totalPackagesQuantity = value;
    }

    /**
     * Gets the value of the consolidatedShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getConsolidatedShipments() {
        if (consolidatedShipments == null) {
            consolidatedShipments = new ArrayList<ShipmentType>();
        }
        return this.consolidatedShipments;
    }

    /**
     * Gets the value of the customsDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclaration }
     * 
     * 
     */
    public List<CustomsDeclaration> getCustomsDeclarations() {
        if (customsDeclarations == null) {
            customsDeclarations = new ArrayList<CustomsDeclaration>();
        }
        return this.customsDeclarations;
    }

    /**
     * Obtiene el valor de la propiedad requestedPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedPickupTransportEvent() {
        return requestedPickupTransportEvent;
    }

    /**
     * Define el valor de la propiedad requestedPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedPickupTransportEvent(TransportEventType value) {
        this.requestedPickupTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedDeliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDeliveryTransportEvent() {
        return requestedDeliveryTransportEvent;
    }

    /**
     * Define el valor de la propiedad requestedDeliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDeliveryTransportEvent(TransportEventType value) {
        this.requestedDeliveryTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedPickupTransportEvent() {
        return plannedPickupTransportEvent;
    }

    /**
     * Define el valor de la propiedad plannedPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedPickupTransportEvent(TransportEventType value) {
        this.plannedPickupTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedDeliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDeliveryTransportEvent() {
        return plannedDeliveryTransportEvent;
    }

    /**
     * Define el valor de la propiedad plannedDeliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDeliveryTransportEvent(TransportEventType value) {
        this.plannedDeliveryTransportEvent = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<StatusType>();
        }
        return this.statuses;
    }

    /**
     * Gets the value of the childConsignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childConsignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildConsignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    public List<ConsignmentType> getChildConsignments() {
        if (childConsignments == null) {
            childConsignments = new ArrayList<ConsignmentType>();
        }
        return this.childConsignments;
    }

    /**
     * Obtiene el valor de la propiedad consigneeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Define el valor de la propiedad consigneeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsigneeParty(PartyType value) {
        this.consigneeParty = value;
    }

    /**
     * Obtiene el valor de la propiedad exporterParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getExporterParty() {
        return exporterParty;
    }

    /**
     * Define el valor de la propiedad exporterParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setExporterParty(PartyType value) {
        this.exporterParty = value;
    }

    /**
     * Obtiene el valor de la propiedad consignorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsignorParty() {
        return consignorParty;
    }

    /**
     * Define el valor de la propiedad consignorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsignorParty(PartyType value) {
        this.consignorParty = value;
    }

    /**
     * Obtiene el valor de la propiedad importerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getImporterParty() {
        return importerParty;
    }

    /**
     * Define el valor de la propiedad importerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setImporterParty(PartyType value) {
        this.importerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Define el valor de la propiedad carrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad freightForwarderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Define el valor de la propiedad freightForwarderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFreightForwarderParty(PartyType value) {
        this.freightForwarderParty = value;
    }

    /**
     * Obtiene el valor de la propiedad notifyParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getNotifyParty() {
        return notifyParty;
    }

    /**
     * Define el valor de la propiedad notifyParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setNotifyParty(PartyType value) {
        this.notifyParty = value;
    }

    /**
     * Obtiene el valor de la propiedad originalDespatchParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOriginalDespatchParty() {
        return originalDespatchParty;
    }

    /**
     * Define el valor de la propiedad originalDespatchParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOriginalDespatchParty(PartyType value) {
        this.originalDespatchParty = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDeliveryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFinalDeliveryParty() {
        return finalDeliveryParty;
    }

    /**
     * Define el valor de la propiedad finalDeliveryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFinalDeliveryParty(PartyType value) {
        this.finalDeliveryParty = value;
    }

    /**
     * Obtiene el valor de la propiedad performingCarrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPerformingCarrierParty() {
        return performingCarrierParty;
    }

    /**
     * Define el valor de la propiedad performingCarrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPerformingCarrierParty(PartyType value) {
        this.performingCarrierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad substituteCarrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubstituteCarrierParty() {
        return substituteCarrierParty;
    }

    /**
     * Define el valor de la propiedad substituteCarrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubstituteCarrierParty(PartyType value) {
        this.substituteCarrierParty = value;
    }

    /**
     * Obtiene el valor de la propiedad logisticsOperatorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLogisticsOperatorParty() {
        return logisticsOperatorParty;
    }

    /**
     * Define el valor de la propiedad logisticsOperatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLogisticsOperatorParty(PartyType value) {
        this.logisticsOperatorParty = value;
    }

    /**
     * Obtiene el valor de la propiedad transportAdvisorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTransportAdvisorParty() {
        return transportAdvisorParty;
    }

    /**
     * Define el valor de la propiedad transportAdvisorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportAdvisorParty(PartyType value) {
        this.transportAdvisorParty = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardousItemNotificationParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHazardousItemNotificationParty() {
        return hazardousItemNotificationParty;
    }

    /**
     * Define el valor de la propiedad hazardousItemNotificationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHazardousItemNotificationParty(PartyType value) {
        this.hazardousItemNotificationParty = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInsuranceParty() {
        return insuranceParty;
    }

    /**
     * Define el valor de la propiedad insuranceParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInsuranceParty(PartyType value) {
        this.insuranceParty = value;
    }

    /**
     * Obtiene el valor de la propiedad mortgageHolderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getMortgageHolderParty() {
        return mortgageHolderParty;
    }

    /**
     * Define el valor de la propiedad mortgageHolderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setMortgageHolderParty(PartyType value) {
        this.mortgageHolderParty = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfLadingHolderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getBillOfLadingHolderParty() {
        return billOfLadingHolderParty;
    }

    /**
     * Define el valor de la propiedad billOfLadingHolderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setBillOfLadingHolderParty(PartyType value) {
        this.billOfLadingHolderParty = value;
    }

    /**
     * Obtiene el valor de la propiedad originalDepartureCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginalDepartureCountry() {
        return originalDepartureCountry;
    }

    /**
     * Define el valor de la propiedad originalDepartureCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginalDepartureCountry(CountryType value) {
        this.originalDepartureCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDestinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getFinalDestinationCountry() {
        return finalDestinationCountry;
    }

    /**
     * Define el valor de la propiedad finalDestinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setFinalDestinationCountry(CountryType value) {
        this.finalDestinationCountry = value;
    }

    /**
     * Gets the value of the transitCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getTransitCountries() {
        if (transitCountries == null) {
            transitCountries = new ArrayList<CountryType>();
        }
        return this.transitCountries;
    }

    /**
     * Obtiene el valor de la propiedad transportContract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getTransportContract() {
        return transportContract;
    }

    /**
     * Define el valor de la propiedad transportContract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setTransportContract(ContractType value) {
        this.transportContract = value;
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
     * Obtiene el valor de la propiedad originalDespatchTransportationService.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getOriginalDespatchTransportationService() {
        return originalDespatchTransportationService;
    }

    /**
     * Define el valor de la propiedad originalDespatchTransportationService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setOriginalDespatchTransportationService(TransportationServiceType value) {
        this.originalDespatchTransportationService = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDeliveryTransportationService.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getFinalDeliveryTransportationService() {
        return finalDeliveryTransportationService;
    }

    /**
     * Define el valor de la propiedad finalDeliveryTransportationService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setFinalDeliveryTransportationService(TransportationServiceType value) {
        this.finalDeliveryTransportationService = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTerms }
     *     
     */
    public DeliveryTerms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Define el valor de la propiedad deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTerms }
     *     
     */
    public void setDeliveryTerms(DeliveryTerms value) {
        this.deliveryTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Define el valor de la propiedad paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad collectPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCollectPaymentTerms() {
        return collectPaymentTerms;
    }

    /**
     * Define el valor de la propiedad collectPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCollectPaymentTerms(PaymentTermsType value) {
        this.collectPaymentTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad disbursementPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getDisbursementPaymentTerms() {
        return disbursementPaymentTerms;
    }

    /**
     * Define el valor de la propiedad disbursementPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setDisbursementPaymentTerms(PaymentTermsType value) {
        this.disbursementPaymentTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPrepaidPaymentTerms() {
        return prepaidPaymentTerms;
    }

    /**
     * Define el valor de la propiedad prepaidPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPrepaidPaymentTerms(PaymentTermsType value) {
        this.prepaidPaymentTerms = value;
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
     * Gets the value of the extraAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getExtraAllowanceCharges() {
        if (extraAllowanceCharges == null) {
            extraAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.extraAllowanceCharges;
    }

    /**
     * Gets the value of the mainCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getMainCarriageShipmentStages() {
        if (mainCarriageShipmentStages == null) {
            mainCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.mainCarriageShipmentStages;
    }

    /**
     * Gets the value of the preCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getPreCarriageShipmentStages() {
        if (preCarriageShipmentStages == null) {
            preCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.preCarriageShipmentStages;
    }

    /**
     * Gets the value of the onCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getOnCarriageShipmentStages() {
        if (onCarriageShipmentStages == null) {
            onCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.onCarriageShipmentStages;
    }

    /**
     * Gets the value of the transportHandlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHandlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getTransportHandlingUnits() {
        if (transportHandlingUnits == null) {
            transportHandlingUnits = new ArrayList<TransportHandlingUnitType>();
        }
        return this.transportHandlingUnits;
    }

    /**
     * Obtiene el valor de la propiedad firstArrivalPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Define el valor de la propiedad firstArrivalPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFirstArrivalPortLocation(LocationType value) {
        this.firstArrivalPortLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad lastExitPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Define el valor de la propiedad lastExitPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLastExitPortLocation(LocationType value) {
        this.lastExitPortLocation = value;
    }

}
