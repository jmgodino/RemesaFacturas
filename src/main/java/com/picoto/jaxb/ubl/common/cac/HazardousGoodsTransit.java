//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.HazardousRegulationCode;
import com.picoto.jaxb.ubl.common.cbc.InhalationToxicityZoneCode;
import com.picoto.jaxb.ubl.common.cbc.PackingCriteriaCode;
import com.picoto.jaxb.ubl.common.cbc.TransportAuthorizationCode;
import com.picoto.jaxb.ubl.common.cbc.TransportEmergencyCardCode;


/**
 * <p>Clase Java para HazardousGoodsTransitType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HazardousGoodsTransitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEmergencyCardCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackingCriteriaCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRegulationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhalationToxicityZoneCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportAuthorizationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousGoodsTransitType", propOrder = {
    "transportEmergencyCardCode",
    "packingCriteriaCode",
    "hazardousRegulationCode",
    "inhalationToxicityZoneCode",
    "transportAuthorizationCode",
    "maximumTemperature",
    "minimumTemperature"
})
@XmlRootElement(name = "HazardousGoodsTransit")
public class HazardousGoodsTransit {

    @XmlElement(name = "TransportEmergencyCardCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportEmergencyCardCode transportEmergencyCardCode;
    @XmlElement(name = "PackingCriteriaCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackingCriteriaCode packingCriteriaCode;
    @XmlElement(name = "HazardousRegulationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRegulationCode hazardousRegulationCode;
    @XmlElement(name = "InhalationToxicityZoneCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InhalationToxicityZoneCode inhalationToxicityZoneCode;
    @XmlElement(name = "TransportAuthorizationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportAuthorizationCode transportAuthorizationCode;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;

    /**
     * Obtiene el valor de la propiedad transportEmergencyCardCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportEmergencyCardCode }
     *     
     */
    public TransportEmergencyCardCode getTransportEmergencyCardCode() {
        return transportEmergencyCardCode;
    }

    /**
     * Define el valor de la propiedad transportEmergencyCardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEmergencyCardCode }
     *     
     */
    public void setTransportEmergencyCardCode(TransportEmergencyCardCode value) {
        this.transportEmergencyCardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad packingCriteriaCode.
     * 
     * @return
     *     possible object is
     *     {@link PackingCriteriaCode }
     *     
     */
    public PackingCriteriaCode getPackingCriteriaCode() {
        return packingCriteriaCode;
    }

    /**
     * Define el valor de la propiedad packingCriteriaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingCriteriaCode }
     *     
     */
    public void setPackingCriteriaCode(PackingCriteriaCode value) {
        this.packingCriteriaCode = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardousRegulationCode.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRegulationCode }
     *     
     */
    public HazardousRegulationCode getHazardousRegulationCode() {
        return hazardousRegulationCode;
    }

    /**
     * Define el valor de la propiedad hazardousRegulationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRegulationCode }
     *     
     */
    public void setHazardousRegulationCode(HazardousRegulationCode value) {
        this.hazardousRegulationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad inhalationToxicityZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link InhalationToxicityZoneCode }
     *     
     */
    public InhalationToxicityZoneCode getInhalationToxicityZoneCode() {
        return inhalationToxicityZoneCode;
    }

    /**
     * Define el valor de la propiedad inhalationToxicityZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link InhalationToxicityZoneCode }
     *     
     */
    public void setInhalationToxicityZoneCode(InhalationToxicityZoneCode value) {
        this.inhalationToxicityZoneCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transportAuthorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportAuthorizationCode }
     *     
     */
    public TransportAuthorizationCode getTransportAuthorizationCode() {
        return transportAuthorizationCode;
    }

    /**
     * Define el valor de la propiedad transportAuthorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportAuthorizationCode }
     *     
     */
    public void setTransportAuthorizationCode(TransportAuthorizationCode value) {
        this.transportAuthorizationCode = value;
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

}
