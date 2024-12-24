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
import com.picoto.jaxb.ubl.common.cbc.FreightRateClassCode;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.NominationDate;
import com.picoto.jaxb.ubl.common.cbc.NominationTime;
import com.picoto.jaxb.ubl.common.cbc.Priority;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumeric;
import com.picoto.jaxb.ubl.common.cbc.TariffClassCode;
import com.picoto.jaxb.ubl.common.cbc.TransportServiceCode;
import com.picoto.jaxb.ubl.common.cbc.TransportationServiceDescription;
import com.picoto.jaxb.ubl.common.cbc.TransportationServiceDetailsURI;


/**
 * <p>Clase Java para TransportationServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightRateClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TotalCapacityDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleTransportServiceProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ScheduledServiceFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationServiceType", propOrder = {
    "transportServiceCode",
    "tariffClassCode",
    "priority",
    "freightRateClassCode",
    "transportationServiceDescriptions",
    "transportationServiceDetailsURI",
    "nominationDate",
    "nominationTime",
    "name",
    "sequenceNumeric",
    "transportEquipments",
    "supportedTransportEquipments",
    "unsupportedTransportEquipments",
    "commodityClassifications",
    "supportedCommodityClassifications",
    "unsupportedCommodityClassifications",
    "totalCapacityDimension",
    "shipmentStages",
    "transportEvents",
    "responsibleTransportServiceProviderParty",
    "environmentalEmissions",
    "estimatedDurationPeriod",
    "scheduledServiceFrequencies"
})
public class TransportationServiceType {

    @XmlElement(name = "TransportServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TransportServiceCode transportServiceCode;
    @XmlElement(name = "TariffClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TariffClassCode tariffClassCode;
    @XmlElement(name = "Priority", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Priority priority;
    @XmlElement(name = "FreightRateClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreightRateClassCode freightRateClassCode;
    @XmlElement(name = "TransportationServiceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportationServiceDescription> transportationServiceDescriptions;
    @XmlElement(name = "TransportationServiceDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportationServiceDetailsURI transportationServiceDetailsURI;
    @XmlElement(name = "NominationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationDate nominationDate;
    @XmlElement(name = "NominationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationTime nominationTime;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Name name;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipmentType> transportEquipments;
    @XmlElement(name = "SupportedTransportEquipment")
    protected List<TransportEquipmentType> supportedTransportEquipments;
    @XmlElement(name = "UnsupportedTransportEquipment")
    protected List<TransportEquipmentType> unsupportedTransportEquipments;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassifications;
    @XmlElement(name = "SupportedCommodityClassification")
    protected List<CommodityClassificationType> supportedCommodityClassifications;
    @XmlElement(name = "UnsupportedCommodityClassification")
    protected List<CommodityClassificationType> unsupportedCommodityClassifications;
    @XmlElement(name = "TotalCapacityDimension")
    protected DimensionType totalCapacityDimension;
    @XmlElement(name = "ShipmentStage")
    protected List<ShipmentStageType> shipmentStages;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "ResponsibleTransportServiceProviderParty")
    protected PartyType responsibleTransportServiceProviderParty;
    @XmlElement(name = "EnvironmentalEmission")
    protected List<EnvironmentalEmission> environmentalEmissions;
    @XmlElement(name = "EstimatedDurationPeriod")
    protected PeriodType estimatedDurationPeriod;
    @XmlElement(name = "ScheduledServiceFrequency")
    protected List<ServiceFrequencyType> scheduledServiceFrequencies;

    /**
     * Obtiene el valor de la propiedad transportServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportServiceCode }
     *     
     */
    public TransportServiceCode getTransportServiceCode() {
        return transportServiceCode;
    }

    /**
     * Define el valor de la propiedad transportServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportServiceCode }
     *     
     */
    public void setTransportServiceCode(TransportServiceCode value) {
        this.transportServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad tariffClassCode.
     * 
     * @return
     *     possible object is
     *     {@link TariffClassCode }
     *     
     */
    public TariffClassCode getTariffClassCode() {
        return tariffClassCode;
    }

    /**
     * Define el valor de la propiedad tariffClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffClassCode }
     *     
     */
    public void setTariffClassCode(TariffClassCode value) {
        this.tariffClassCode = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Obtiene el valor de la propiedad freightRateClassCode.
     * 
     * @return
     *     possible object is
     *     {@link FreightRateClassCode }
     *     
     */
    public FreightRateClassCode getFreightRateClassCode() {
        return freightRateClassCode;
    }

    /**
     * Define el valor de la propiedad freightRateClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateClassCode }
     *     
     */
    public void setFreightRateClassCode(FreightRateClassCode value) {
        this.freightRateClassCode = value;
    }

    /**
     * Gets the value of the transportationServiceDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationServiceDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationServiceDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationServiceDescription }
     * 
     * 
     */
    public List<TransportationServiceDescription> getTransportationServiceDescriptions() {
        if (transportationServiceDescriptions == null) {
            transportationServiceDescriptions = new ArrayList<TransportationServiceDescription>();
        }
        return this.transportationServiceDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad transportationServiceDetailsURI.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceDetailsURI }
     *     
     */
    public TransportationServiceDetailsURI getTransportationServiceDetailsURI() {
        return transportationServiceDetailsURI;
    }

    /**
     * Define el valor de la propiedad transportationServiceDetailsURI.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceDetailsURI }
     *     
     */
    public void setTransportationServiceDetailsURI(TransportationServiceDetailsURI value) {
        this.transportationServiceDetailsURI = value;
    }

    /**
     * Obtiene el valor de la propiedad nominationDate.
     * 
     * @return
     *     possible object is
     *     {@link NominationDate }
     *     
     */
    public NominationDate getNominationDate() {
        return nominationDate;
    }

    /**
     * Define el valor de la propiedad nominationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationDate }
     *     
     */
    public void setNominationDate(NominationDate value) {
        this.nominationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad nominationTime.
     * 
     * @return
     *     possible object is
     *     {@link NominationTime }
     *     
     */
    public NominationTime getNominationTime() {
        return nominationTime;
    }

    /**
     * Define el valor de la propiedad nominationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationTime }
     *     
     */
    public void setNominationTime(NominationTime value) {
        this.nominationTime = value;
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
     * Obtiene el valor de la propiedad sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumeric }
     *     
     */
    public SequenceNumeric getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Define el valor de la propiedad sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumeric }
     *     
     */
    public void setSequenceNumeric(SequenceNumeric value) {
        this.sequenceNumeric = value;
    }

    /**
     * Gets the value of the transportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getTransportEquipments() {
        if (transportEquipments == null) {
            transportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipments;
    }

    /**
     * Gets the value of the supportedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getSupportedTransportEquipments() {
        if (supportedTransportEquipments == null) {
            supportedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.supportedTransportEquipments;
    }

    /**
     * Gets the value of the unsupportedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getUnsupportedTransportEquipments() {
        if (unsupportedTransportEquipments == null) {
            unsupportedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.unsupportedTransportEquipments;
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
     * Gets the value of the supportedCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getSupportedCommodityClassifications() {
        if (supportedCommodityClassifications == null) {
            supportedCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.supportedCommodityClassifications;
    }

    /**
     * Gets the value of the unsupportedCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getUnsupportedCommodityClassifications() {
        if (unsupportedCommodityClassifications == null) {
            unsupportedCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.unsupportedCommodityClassifications;
    }

    /**
     * Obtiene el valor de la propiedad totalCapacityDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getTotalCapacityDimension() {
        return totalCapacityDimension;
    }

    /**
     * Define el valor de la propiedad totalCapacityDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setTotalCapacityDimension(DimensionType value) {
        this.totalCapacityDimension = value;
    }

    /**
     * Gets the value of the shipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getShipmentStages() {
        if (shipmentStages == null) {
            shipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStages;
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
     * Obtiene el valor de la propiedad responsibleTransportServiceProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleTransportServiceProviderParty() {
        return responsibleTransportServiceProviderParty;
    }

    /**
     * Define el valor de la propiedad responsibleTransportServiceProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleTransportServiceProviderParty(PartyType value) {
        this.responsibleTransportServiceProviderParty = value;
    }

    /**
     * Gets the value of the environmentalEmissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmission }
     * 
     * 
     */
    public List<EnvironmentalEmission> getEnvironmentalEmissions() {
        if (environmentalEmissions == null) {
            environmentalEmissions = new ArrayList<EnvironmentalEmission>();
        }
        return this.environmentalEmissions;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDurationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDurationPeriod() {
        return estimatedDurationPeriod;
    }

    /**
     * Define el valor de la propiedad estimatedDurationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDurationPeriod(PeriodType value) {
        this.estimatedDurationPeriod = value;
    }

    /**
     * Gets the value of the scheduledServiceFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledServiceFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledServiceFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFrequencyType }
     * 
     * 
     */
    public List<ServiceFrequencyType> getScheduledServiceFrequencies() {
        if (scheduledServiceFrequencies == null) {
            scheduledServiceFrequencies = new ArrayList<ServiceFrequencyType>();
        }
        return this.scheduledServiceFrequencies;
    }

}
