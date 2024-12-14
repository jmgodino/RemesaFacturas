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
import com.picoto.jaxb.ubl.common.cbc.DirectionCode;
import com.picoto.jaxb.ubl.common.cbc.JourneyID;
import com.picoto.jaxb.ubl.common.cbc.RegistrationNationality;
import com.picoto.jaxb.ubl.common.cbc.RegistrationNationalityID;
import com.picoto.jaxb.ubl.common.cbc.TradeServiceCode;
import com.picoto.jaxb.ubl.common.cbc.TransportMeansTypeCode;


/**
 * <p>Clase Java para TransportMeansType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JourneyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationality" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Stowage" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AirTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RoadTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RailTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaritimeTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansType", propOrder = {
    "journeyID",
    "registrationNationalityID",
    "registrationNationalities",
    "directionCode",
    "transportMeansTypeCode",
    "tradeServiceCode",
    "stowage",
    "airTransport",
    "roadTransport",
    "railTransport",
    "maritimeTransport",
    "ownerParty",
    "measurementDimensions"
})
public class TransportMeansType {

    @XmlElement(name = "JourneyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected JourneyID journeyID;
    @XmlElement(name = "RegistrationNationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNationalityID registrationNationalityID;
    @XmlElement(name = "RegistrationNationality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RegistrationNationality> registrationNationalities;
    @XmlElement(name = "DirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DirectionCode directionCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportMeansTypeCode transportMeansTypeCode;
    @XmlElement(name = "TradeServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TradeServiceCode tradeServiceCode;
    @XmlElement(name = "Stowage")
    protected Stowage stowage;
    @XmlElement(name = "AirTransport")
    protected AirTransport airTransport;
    @XmlElement(name = "RoadTransport")
    protected RoadTransport roadTransport;
    @XmlElement(name = "RailTransport")
    protected RailTransport railTransport;
    @XmlElement(name = "MaritimeTransport")
    protected MaritimeTransport maritimeTransport;
    @XmlElement(name = "OwnerParty")
    protected PartyType ownerParty;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimensions;

    /**
     * Obtiene el valor de la propiedad journeyID.
     * 
     * @return
     *     possible object is
     *     {@link JourneyID }
     *     
     */
    public JourneyID getJourneyID() {
        return journeyID;
    }

    /**
     * Define el valor de la propiedad journeyID.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyID }
     *     
     */
    public void setJourneyID(JourneyID value) {
        this.journeyID = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationNationalityID.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNationalityID }
     *     
     */
    public RegistrationNationalityID getRegistrationNationalityID() {
        return registrationNationalityID;
    }

    /**
     * Define el valor de la propiedad registrationNationalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNationalityID }
     *     
     */
    public void setRegistrationNationalityID(RegistrationNationalityID value) {
        this.registrationNationalityID = value;
    }

    /**
     * Gets the value of the registrationNationalities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationNationalities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationNationalities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationNationality }
     * 
     * 
     */
    public List<RegistrationNationality> getRegistrationNationalities() {
        if (registrationNationalities == null) {
            registrationNationalities = new ArrayList<RegistrationNationality>();
        }
        return this.registrationNationalities;
    }

    /**
     * Obtiene el valor de la propiedad directionCode.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCode }
     *     
     */
    public DirectionCode getDirectionCode() {
        return directionCode;
    }

    /**
     * Define el valor de la propiedad directionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCode }
     *     
     */
    public void setDirectionCode(DirectionCode value) {
        this.directionCode = value;
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
     * Obtiene el valor de la propiedad tradeServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link TradeServiceCode }
     *     
     */
    public TradeServiceCode getTradeServiceCode() {
        return tradeServiceCode;
    }

    /**
     * Define el valor de la propiedad tradeServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeServiceCode }
     *     
     */
    public void setTradeServiceCode(TradeServiceCode value) {
        this.tradeServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad stowage.
     * 
     * @return
     *     possible object is
     *     {@link Stowage }
     *     
     */
    public Stowage getStowage() {
        return stowage;
    }

    /**
     * Define el valor de la propiedad stowage.
     * 
     * @param value
     *     allowed object is
     *     {@link Stowage }
     *     
     */
    public void setStowage(Stowage value) {
        this.stowage = value;
    }

    /**
     * Obtiene el valor de la propiedad airTransport.
     * 
     * @return
     *     possible object is
     *     {@link AirTransport }
     *     
     */
    public AirTransport getAirTransport() {
        return airTransport;
    }

    /**
     * Define el valor de la propiedad airTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTransport }
     *     
     */
    public void setAirTransport(AirTransport value) {
        this.airTransport = value;
    }

    /**
     * Obtiene el valor de la propiedad roadTransport.
     * 
     * @return
     *     possible object is
     *     {@link RoadTransport }
     *     
     */
    public RoadTransport getRoadTransport() {
        return roadTransport;
    }

    /**
     * Define el valor de la propiedad roadTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTransport }
     *     
     */
    public void setRoadTransport(RoadTransport value) {
        this.roadTransport = value;
    }

    /**
     * Obtiene el valor de la propiedad railTransport.
     * 
     * @return
     *     possible object is
     *     {@link RailTransport }
     *     
     */
    public RailTransport getRailTransport() {
        return railTransport;
    }

    /**
     * Define el valor de la propiedad railTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link RailTransport }
     *     
     */
    public void setRailTransport(RailTransport value) {
        this.railTransport = value;
    }

    /**
     * Obtiene el valor de la propiedad maritimeTransport.
     * 
     * @return
     *     possible object is
     *     {@link MaritimeTransport }
     *     
     */
    public MaritimeTransport getMaritimeTransport() {
        return maritimeTransport;
    }

    /**
     * Define el valor de la propiedad maritimeTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimeTransport }
     *     
     */
    public void setMaritimeTransport(MaritimeTransport value) {
        this.maritimeTransport = value;
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

}
