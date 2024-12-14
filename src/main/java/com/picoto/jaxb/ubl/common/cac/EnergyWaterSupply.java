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


/**
 * <p>Clase Java para EnergyWaterSupplyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnergyWaterSupplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyTaxReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionAverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyWaterConsumptionCorrection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyWaterSupplyType", propOrder = {
    "consumptionReports",
    "energyTaxReports",
    "consumptionAverages",
    "energyWaterConsumptionCorrections"
})
@XmlRootElement(name = "EnergyWaterSupply")
public class EnergyWaterSupply {

    @XmlElement(name = "ConsumptionReport")
    protected List<ConsumptionReport> consumptionReports;
    @XmlElement(name = "EnergyTaxReport")
    protected List<EnergyTaxReport> energyTaxReports;
    @XmlElement(name = "ConsumptionAverage")
    protected List<ConsumptionAverage> consumptionAverages;
    @XmlElement(name = "EnergyWaterConsumptionCorrection")
    protected List<ConsumptionCorrectionType> energyWaterConsumptionCorrections;

    /**
     * Gets the value of the consumptionReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionReport }
     * 
     * 
     */
    public List<ConsumptionReport> getConsumptionReports() {
        if (consumptionReports == null) {
            consumptionReports = new ArrayList<ConsumptionReport>();
        }
        return this.consumptionReports;
    }

    /**
     * Gets the value of the energyTaxReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyTaxReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyTaxReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyTaxReport }
     * 
     * 
     */
    public List<EnergyTaxReport> getEnergyTaxReports() {
        if (energyTaxReports == null) {
            energyTaxReports = new ArrayList<EnergyTaxReport>();
        }
        return this.energyTaxReports;
    }

    /**
     * Gets the value of the consumptionAverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionAverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionAverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionAverage }
     * 
     * 
     */
    public List<ConsumptionAverage> getConsumptionAverages() {
        if (consumptionAverages == null) {
            consumptionAverages = new ArrayList<ConsumptionAverage>();
        }
        return this.consumptionAverages;
    }

    /**
     * Gets the value of the energyWaterConsumptionCorrections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyWaterConsumptionCorrections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyWaterConsumptionCorrections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCorrectionType }
     * 
     * 
     */
    public List<ConsumptionCorrectionType> getEnergyWaterConsumptionCorrections() {
        if (energyWaterConsumptionCorrections == null) {
            energyWaterConsumptionCorrections = new ArrayList<ConsumptionCorrectionType>();
        }
        return this.energyWaterConsumptionCorrections;
    }

}
