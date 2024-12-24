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
import com.picoto.jaxb.ubl.common.cbc.CrewQuantity;
import com.picoto.jaxb.ubl.common.cbc.DemurrageInstructions;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.Instructions;
import com.picoto.jaxb.ubl.common.cbc.LoadingSequenceID;
import com.picoto.jaxb.ubl.common.cbc.OnCarriageIndicator;
import com.picoto.jaxb.ubl.common.cbc.PassengerQuantity;
import com.picoto.jaxb.ubl.common.cbc.PreCarriageIndicator;
import com.picoto.jaxb.ubl.common.cbc.RequiredDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.RequiredDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.SuccessiveSequenceID;
import com.picoto.jaxb.ubl.common.cbc.TransitDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.TransportMeansTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportModeCode;


/**
 * <p>Clase Java para ShipmentStageType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransitDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OnCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SuccessiveSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DemurrageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CrewQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PassengerQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransshipPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExaminationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AvailabilityTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExportationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DischargeTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarehousingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionalTakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DropoffTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AcceptanceTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TerminalOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsAgentParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedTransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightChargeLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DetentionTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualWaypointTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PassengerPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DriverPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReportingPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CrewMemberPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecurityOfficerPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MasterPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipsSurgeonPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStageType", propOrder = {
    "id",
    "transportModeCode",
    "transportMeansTypeCode",
    "transitDirectionCode",
    "preCarriageIndicator",
    "onCarriageIndicator",
    "estimatedDeliveryDate",
    "estimatedDeliveryTime",
    "requiredDeliveryDate",
    "requiredDeliveryTime",
    "loadingSequenceID",
    "successiveSequenceID",
    "instructions",
    "demurrageInstructions",
    "crewQuantity",
    "passengerQuantity",
    "transitPeriod",
    "carrierParties",
    "transportMeans",
    "loadingPortLocation",
    "unloadingPortLocation",
    "transshipPortLocation",
    "loadingTransportEvent",
    "examinationTransportEvent",
    "availabilityTransportEvent",
    "exportationTransportEvent",
    "dischargeTransportEvent",
    "warehousingTransportEvent",
    "takeoverTransportEvent",
    "optionalTakeoverTransportEvent",
    "dropoffTransportEvent",
    "actualPickupTransportEvent",
    "deliveryTransportEvent",
    "receiptTransportEvent",
    "storageTransportEvent",
    "acceptanceTransportEvent",
    "terminalOperatorParty",
    "customsAgentParty",
    "estimatedTransitPeriod",
    "freightAllowanceCharges",
    "freightChargeLocation",
    "detentionTransportEvents",
    "requestedDepartureTransportEvent",
    "requestedArrivalTransportEvent",
    "requestedWaypointTransportEvents",
    "plannedDepartureTransportEvent",
    "plannedArrivalTransportEvent",
    "plannedWaypointTransportEvents",
    "actualDepartureTransportEvent",
    "actualWaypointTransportEvent",
    "actualArrivalTransportEvent",
    "transportEvents",
    "estimatedDepartureTransportEvent",
    "estimatedArrivalTransportEvent",
    "passengerPersons",
    "driverPersons",
    "reportingPerson",
    "crewMemberPersons",
    "securityOfficerPerson",
    "masterPerson",
    "shipsSurgeonPerson"
})
public class ShipmentStageType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "TransportModeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportModeCode transportModeCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportMeansTypeCode transportMeansTypeCode;
    @XmlElement(name = "TransitDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransitDirectionCode transitDirectionCode;
    @XmlElement(name = "PreCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreCarriageIndicator preCarriageIndicator;
    @XmlElement(name = "OnCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OnCarriageIndicator onCarriageIndicator;
    @XmlElement(name = "EstimatedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDeliveryDate estimatedDeliveryDate;
    @XmlElement(name = "EstimatedDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDeliveryTime estimatedDeliveryTime;
    @XmlElement(name = "RequiredDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredDeliveryDate requiredDeliveryDate;
    @XmlElement(name = "RequiredDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredDeliveryTime requiredDeliveryTime;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingSequenceID loadingSequenceID;
    @XmlElement(name = "SuccessiveSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SuccessiveSequenceID successiveSequenceID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Instructions> instructions;
    @XmlElement(name = "DemurrageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DemurrageInstructions> demurrageInstructions;
    @XmlElement(name = "CrewQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CrewQuantity crewQuantity;
    @XmlElement(name = "PassengerQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PassengerQuantity passengerQuantity;
    @XmlElement(name = "TransitPeriod")
    protected PeriodType transitPeriod;
    @XmlElement(name = "CarrierParty")
    protected List<PartyType> carrierParties;
    @XmlElement(name = "TransportMeans")
    protected TransportMeansType transportMeans;
    @XmlElement(name = "LoadingPortLocation")
    protected LocationType loadingPortLocation;
    @XmlElement(name = "UnloadingPortLocation")
    protected LocationType unloadingPortLocation;
    @XmlElement(name = "TransshipPortLocation")
    protected LocationType transshipPortLocation;
    @XmlElement(name = "LoadingTransportEvent")
    protected TransportEventType loadingTransportEvent;
    @XmlElement(name = "ExaminationTransportEvent")
    protected TransportEventType examinationTransportEvent;
    @XmlElement(name = "AvailabilityTransportEvent")
    protected TransportEventType availabilityTransportEvent;
    @XmlElement(name = "ExportationTransportEvent")
    protected TransportEventType exportationTransportEvent;
    @XmlElement(name = "DischargeTransportEvent")
    protected TransportEventType dischargeTransportEvent;
    @XmlElement(name = "WarehousingTransportEvent")
    protected TransportEventType warehousingTransportEvent;
    @XmlElement(name = "TakeoverTransportEvent")
    protected TransportEventType takeoverTransportEvent;
    @XmlElement(name = "OptionalTakeoverTransportEvent")
    protected TransportEventType optionalTakeoverTransportEvent;
    @XmlElement(name = "DropoffTransportEvent")
    protected TransportEventType dropoffTransportEvent;
    @XmlElement(name = "ActualPickupTransportEvent")
    protected TransportEventType actualPickupTransportEvent;
    @XmlElement(name = "DeliveryTransportEvent")
    protected TransportEventType deliveryTransportEvent;
    @XmlElement(name = "ReceiptTransportEvent")
    protected TransportEventType receiptTransportEvent;
    @XmlElement(name = "StorageTransportEvent")
    protected TransportEventType storageTransportEvent;
    @XmlElement(name = "AcceptanceTransportEvent")
    protected TransportEventType acceptanceTransportEvent;
    @XmlElement(name = "TerminalOperatorParty")
    protected PartyType terminalOperatorParty;
    @XmlElement(name = "CustomsAgentParty")
    protected PartyType customsAgentParty;
    @XmlElement(name = "EstimatedTransitPeriod")
    protected PeriodType estimatedTransitPeriod;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "FreightChargeLocation")
    protected LocationType freightChargeLocation;
    @XmlElement(name = "DetentionTransportEvent")
    protected List<TransportEventType> detentionTransportEvents;
    @XmlElement(name = "RequestedDepartureTransportEvent")
    protected TransportEventType requestedDepartureTransportEvent;
    @XmlElement(name = "RequestedArrivalTransportEvent")
    protected TransportEventType requestedArrivalTransportEvent;
    @XmlElement(name = "RequestedWaypointTransportEvent")
    protected List<TransportEventType> requestedWaypointTransportEvents;
    @XmlElement(name = "PlannedDepartureTransportEvent")
    protected TransportEventType plannedDepartureTransportEvent;
    @XmlElement(name = "PlannedArrivalTransportEvent")
    protected TransportEventType plannedArrivalTransportEvent;
    @XmlElement(name = "PlannedWaypointTransportEvent")
    protected List<TransportEventType> plannedWaypointTransportEvents;
    @XmlElement(name = "ActualDepartureTransportEvent")
    protected TransportEventType actualDepartureTransportEvent;
    @XmlElement(name = "ActualWaypointTransportEvent")
    protected TransportEventType actualWaypointTransportEvent;
    @XmlElement(name = "ActualArrivalTransportEvent")
    protected TransportEventType actualArrivalTransportEvent;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "EstimatedDepartureTransportEvent")
    protected TransportEventType estimatedDepartureTransportEvent;
    @XmlElement(name = "EstimatedArrivalTransportEvent")
    protected TransportEventType estimatedArrivalTransportEvent;
    @XmlElement(name = "PassengerPerson")
    protected List<PersonType> passengerPersons;
    @XmlElement(name = "DriverPerson")
    protected List<PersonType> driverPersons;
    @XmlElement(name = "ReportingPerson")
    protected PersonType reportingPerson;
    @XmlElement(name = "CrewMemberPerson")
    protected List<PersonType> crewMemberPersons;
    @XmlElement(name = "SecurityOfficerPerson")
    protected PersonType securityOfficerPerson;
    @XmlElement(name = "MasterPerson")
    protected PersonType masterPerson;
    @XmlElement(name = "ShipsSurgeonPerson")
    protected PersonType shipsSurgeonPerson;

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
     * Obtiene el valor de la propiedad transportModeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeCode }
     *     
     */
    public TransportModeCode getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Define el valor de la propiedad transportModeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeCode }
     *     
     */
    public void setTransportModeCode(TransportModeCode value) {
        this.transportModeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transportMeansTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansTypeCode }
     *     
     */
    public TransportMeansTypeCode getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Define el valor de la propiedad transportMeansTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansTypeCode }
     *     
     */
    public void setTransportMeansTypeCode(TransportMeansTypeCode value) {
        this.transportMeansTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transitDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link TransitDirectionCode }
     *     
     */
    public TransitDirectionCode getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /**
     * Define el valor de la propiedad transitDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDirectionCode }
     *     
     */
    public void setTransitDirectionCode(TransitDirectionCode value) {
        this.transitDirectionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad preCarriageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PreCarriageIndicator }
     *     
     */
    public PreCarriageIndicator getPreCarriageIndicator() {
        return preCarriageIndicator;
    }

    /**
     * Define el valor de la propiedad preCarriageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCarriageIndicator }
     *     
     */
    public void setPreCarriageIndicator(PreCarriageIndicator value) {
        this.preCarriageIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad onCarriageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OnCarriageIndicator }
     *     
     */
    public OnCarriageIndicator getOnCarriageIndicator() {
        return onCarriageIndicator;
    }

    /**
     * Define el valor de la propiedad onCarriageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCarriageIndicator }
     *     
     */
    public void setOnCarriageIndicator(OnCarriageIndicator value) {
        this.onCarriageIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDate }
     *     
     */
    public EstimatedDeliveryDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Define el valor de la propiedad estimatedDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDate }
     *     
     */
    public void setEstimatedDeliveryDate(EstimatedDeliveryDate value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryTime }
     *     
     */
    public EstimatedDeliveryTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * Define el valor de la propiedad estimatedDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryTime }
     *     
     */
    public void setEstimatedDeliveryTime(EstimatedDeliveryTime value) {
        this.estimatedDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryDate }
     *     
     */
    public RequiredDeliveryDate getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    /**
     * Define el valor de la propiedad requiredDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryDate }
     *     
     */
    public void setRequiredDeliveryDate(RequiredDeliveryDate value) {
        this.requiredDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryTime }
     *     
     */
    public RequiredDeliveryTime getRequiredDeliveryTime() {
        return requiredDeliveryTime;
    }

    /**
     * Define el valor de la propiedad requiredDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryTime }
     *     
     */
    public void setRequiredDeliveryTime(RequiredDeliveryTime value) {
        this.requiredDeliveryTime = value;
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
     * Obtiene el valor de la propiedad successiveSequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SuccessiveSequenceID }
     *     
     */
    public SuccessiveSequenceID getSuccessiveSequenceID() {
        return successiveSequenceID;
    }

    /**
     * Define el valor de la propiedad successiveSequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessiveSequenceID }
     *     
     */
    public void setSuccessiveSequenceID(SuccessiveSequenceID value) {
        this.successiveSequenceID = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the demurrageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demurrageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemurrageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemurrageInstructions }
     * 
     * 
     */
    public List<DemurrageInstructions> getDemurrageInstructions() {
        if (demurrageInstructions == null) {
            demurrageInstructions = new ArrayList<DemurrageInstructions>();
        }
        return this.demurrageInstructions;
    }

    /**
     * Obtiene el valor de la propiedad crewQuantity.
     * 
     * @return
     *     possible object is
     *     {@link CrewQuantity }
     *     
     */
    public CrewQuantity getCrewQuantity() {
        return crewQuantity;
    }

    /**
     * Define el valor de la propiedad crewQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewQuantity }
     *     
     */
    public void setCrewQuantity(CrewQuantity value) {
        this.crewQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PassengerQuantity }
     *     
     */
    public PassengerQuantity getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Define el valor de la propiedad passengerQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerQuantity }
     *     
     */
    public void setPassengerQuantity(PassengerQuantity value) {
        this.passengerQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad transitPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTransitPeriod() {
        return transitPeriod;
    }

    /**
     * Define el valor de la propiedad transitPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTransitPeriod(PeriodType value) {
        this.transitPeriod = value;
    }

    /**
     * Gets the value of the carrierParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getCarrierParties() {
        if (carrierParties == null) {
            carrierParties = new ArrayList<PartyType>();
        }
        return this.carrierParties;
    }

    /**
     * Obtiene el valor de la propiedad transportMeans.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /**
     * Define el valor de la propiedad transportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setTransportMeans(TransportMeansType value) {
        this.transportMeans = value;
    }

    /**
     * Obtiene el valor de la propiedad loadingPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingPortLocation() {
        return loadingPortLocation;
    }

    /**
     * Define el valor de la propiedad loadingPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingPortLocation(LocationType value) {
        this.loadingPortLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad unloadingPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingPortLocation() {
        return unloadingPortLocation;
    }

    /**
     * Define el valor de la propiedad unloadingPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingPortLocation(LocationType value) {
        this.unloadingPortLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad transshipPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getTransshipPortLocation() {
        return transshipPortLocation;
    }

    /**
     * Define el valor de la propiedad transshipPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setTransshipPortLocation(LocationType value) {
        this.transshipPortLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad loadingTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getLoadingTransportEvent() {
        return loadingTransportEvent;
    }

    /**
     * Define el valor de la propiedad loadingTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setLoadingTransportEvent(TransportEventType value) {
        this.loadingTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad examinationTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExaminationTransportEvent() {
        return examinationTransportEvent;
    }

    /**
     * Define el valor de la propiedad examinationTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExaminationTransportEvent(TransportEventType value) {
        this.examinationTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAvailabilityTransportEvent() {
        return availabilityTransportEvent;
    }

    /**
     * Define el valor de la propiedad availabilityTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAvailabilityTransportEvent(TransportEventType value) {
        this.availabilityTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad exportationTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExportationTransportEvent() {
        return exportationTransportEvent;
    }

    /**
     * Define el valor de la propiedad exportationTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExportationTransportEvent(TransportEventType value) {
        this.exportationTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargeTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDischargeTransportEvent() {
        return dischargeTransportEvent;
    }

    /**
     * Define el valor de la propiedad dischargeTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDischargeTransportEvent(TransportEventType value) {
        this.dischargeTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad warehousingTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getWarehousingTransportEvent() {
        return warehousingTransportEvent;
    }

    /**
     * Define el valor de la propiedad warehousingTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setWarehousingTransportEvent(TransportEventType value) {
        this.warehousingTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad takeoverTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getTakeoverTransportEvent() {
        return takeoverTransportEvent;
    }

    /**
     * Define el valor de la propiedad takeoverTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setTakeoverTransportEvent(TransportEventType value) {
        this.takeoverTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad optionalTakeoverTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getOptionalTakeoverTransportEvent() {
        return optionalTakeoverTransportEvent;
    }

    /**
     * Define el valor de la propiedad optionalTakeoverTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setOptionalTakeoverTransportEvent(TransportEventType value) {
        this.optionalTakeoverTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad dropoffTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDropoffTransportEvent() {
        return dropoffTransportEvent;
    }

    /**
     * Define el valor de la propiedad dropoffTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDropoffTransportEvent(TransportEventType value) {
        this.dropoffTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualPickupTransportEvent() {
        return actualPickupTransportEvent;
    }

    /**
     * Define el valor de la propiedad actualPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualPickupTransportEvent(TransportEventType value) {
        this.actualPickupTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDeliveryTransportEvent() {
        return deliveryTransportEvent;
    }

    /**
     * Define el valor de la propiedad deliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDeliveryTransportEvent(TransportEventType value) {
        this.deliveryTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad receiptTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getReceiptTransportEvent() {
        return receiptTransportEvent;
    }

    /**
     * Define el valor de la propiedad receiptTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setReceiptTransportEvent(TransportEventType value) {
        this.receiptTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad storageTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getStorageTransportEvent() {
        return storageTransportEvent;
    }

    /**
     * Define el valor de la propiedad storageTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setStorageTransportEvent(TransportEventType value) {
        this.storageTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptanceTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAcceptanceTransportEvent() {
        return acceptanceTransportEvent;
    }

    /**
     * Define el valor de la propiedad acceptanceTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAcceptanceTransportEvent(TransportEventType value) {
        this.acceptanceTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalOperatorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTerminalOperatorParty() {
        return terminalOperatorParty;
    }

    /**
     * Define el valor de la propiedad terminalOperatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTerminalOperatorParty(PartyType value) {
        this.terminalOperatorParty = value;
    }

    /**
     * Obtiene el valor de la propiedad customsAgentParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCustomsAgentParty() {
        return customsAgentParty;
    }

    /**
     * Define el valor de la propiedad customsAgentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCustomsAgentParty(PartyType value) {
        this.customsAgentParty = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedTransitPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedTransitPeriod() {
        return estimatedTransitPeriod;
    }

    /**
     * Define el valor de la propiedad estimatedTransitPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedTransitPeriod(PeriodType value) {
        this.estimatedTransitPeriod = value;
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
     * Obtiene el valor de la propiedad freightChargeLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFreightChargeLocation() {
        return freightChargeLocation;
    }

    /**
     * Define el valor de la propiedad freightChargeLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFreightChargeLocation(LocationType value) {
        this.freightChargeLocation = value;
    }

    /**
     * Gets the value of the detentionTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detentionTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetentionTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDetentionTransportEvents() {
        if (detentionTransportEvents == null) {
            detentionTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.detentionTransportEvents;
    }

    /**
     * Obtiene el valor de la propiedad requestedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDepartureTransportEvent() {
        return requestedDepartureTransportEvent;
    }

    /**
     * Define el valor de la propiedad requestedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDepartureTransportEvent(TransportEventType value) {
        this.requestedDepartureTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedArrivalTransportEvent() {
        return requestedArrivalTransportEvent;
    }

    /**
     * Define el valor de la propiedad requestedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedArrivalTransportEvent(TransportEventType value) {
        this.requestedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the requestedWaypointTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedWaypointTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedWaypointTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getRequestedWaypointTransportEvents() {
        if (requestedWaypointTransportEvents == null) {
            requestedWaypointTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.requestedWaypointTransportEvents;
    }

    /**
     * Obtiene el valor de la propiedad plannedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDepartureTransportEvent() {
        return plannedDepartureTransportEvent;
    }

    /**
     * Define el valor de la propiedad plannedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDepartureTransportEvent(TransportEventType value) {
        this.plannedDepartureTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedArrivalTransportEvent() {
        return plannedArrivalTransportEvent;
    }

    /**
     * Define el valor de la propiedad plannedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedArrivalTransportEvent(TransportEventType value) {
        this.plannedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the plannedWaypointTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedWaypointTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedWaypointTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPlannedWaypointTransportEvents() {
        if (plannedWaypointTransportEvents == null) {
            plannedWaypointTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.plannedWaypointTransportEvents;
    }

    /**
     * Obtiene el valor de la propiedad actualDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualDepartureTransportEvent() {
        return actualDepartureTransportEvent;
    }

    /**
     * Define el valor de la propiedad actualDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualDepartureTransportEvent(TransportEventType value) {
        this.actualDepartureTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad actualWaypointTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualWaypointTransportEvent() {
        return actualWaypointTransportEvent;
    }

    /**
     * Define el valor de la propiedad actualWaypointTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualWaypointTransportEvent(TransportEventType value) {
        this.actualWaypointTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad actualArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualArrivalTransportEvent() {
        return actualArrivalTransportEvent;
    }

    /**
     * Define el valor de la propiedad actualArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualArrivalTransportEvent(TransportEventType value) {
        this.actualArrivalTransportEvent = value;
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
     * Obtiene el valor de la propiedad estimatedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedDepartureTransportEvent() {
        return estimatedDepartureTransportEvent;
    }

    /**
     * Define el valor de la propiedad estimatedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedDepartureTransportEvent(TransportEventType value) {
        this.estimatedDepartureTransportEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedArrivalTransportEvent() {
        return estimatedArrivalTransportEvent;
    }

    /**
     * Define el valor de la propiedad estimatedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedArrivalTransportEvent(TransportEventType value) {
        this.estimatedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the passengerPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPassengerPersons() {
        if (passengerPersons == null) {
            passengerPersons = new ArrayList<PersonType>();
        }
        return this.passengerPersons;
    }

    /**
     * Gets the value of the driverPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getDriverPersons() {
        if (driverPersons == null) {
            driverPersons = new ArrayList<PersonType>();
        }
        return this.driverPersons;
    }

    /**
     * Obtiene el valor de la propiedad reportingPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getReportingPerson() {
        return reportingPerson;
    }

    /**
     * Define el valor de la propiedad reportingPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setReportingPerson(PersonType value) {
        this.reportingPerson = value;
    }

    /**
     * Gets the value of the crewMemberPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewMemberPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewMemberPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getCrewMemberPersons() {
        if (crewMemberPersons == null) {
            crewMemberPersons = new ArrayList<PersonType>();
        }
        return this.crewMemberPersons;
    }

    /**
     * Obtiene el valor de la propiedad securityOfficerPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getSecurityOfficerPerson() {
        return securityOfficerPerson;
    }

    /**
     * Define el valor de la propiedad securityOfficerPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setSecurityOfficerPerson(PersonType value) {
        this.securityOfficerPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad masterPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getMasterPerson() {
        return masterPerson;
    }

    /**
     * Define el valor de la propiedad masterPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setMasterPerson(PersonType value) {
        this.masterPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad shipsSurgeonPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getShipsSurgeonPerson() {
        return shipsSurgeonPerson;
    }

    /**
     * Define el valor de la propiedad shipsSurgeonPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setShipsSurgeonPerson(PersonType value) {
        this.shipsSurgeonPerson = value;
    }

}
