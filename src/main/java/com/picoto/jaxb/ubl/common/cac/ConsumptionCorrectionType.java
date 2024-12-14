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
import com.picoto.jaxb.ubl.common.cbc.ActualTemperatureReductionQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionEnergyQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionWaterQuantity;
import com.picoto.jaxb.ubl.common.cbc.CorrectionAmount;
import com.picoto.jaxb.ubl.common.cbc.CorrectionType;
import com.picoto.jaxb.ubl.common.cbc.CorrectionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CorrectionUnitAmount;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.DifferenceTemperatureReductionQuantity;
import com.picoto.jaxb.ubl.common.cbc.GasPressureQuantity;
import com.picoto.jaxb.ubl.common.cbc.MeterNumber;
import com.picoto.jaxb.ubl.common.cbc.NormalTemperatureReductionQuantity;


/**
 * <p>Clase Java para ConsumptionCorrectionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCorrectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GasPressureQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NormalTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DifferenceTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionEnergyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionWaterQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCorrectionType", propOrder = {
    "correctionType",
    "correctionTypeCode",
    "meterNumber",
    "gasPressureQuantity",
    "actualTemperatureReductionQuantity",
    "normalTemperatureReductionQuantity",
    "differenceTemperatureReductionQuantity",
    "descriptions",
    "correctionUnitAmount",
    "consumptionEnergyQuantity",
    "consumptionWaterQuantity",
    "correctionAmount"
})
public class ConsumptionCorrectionType {

    @XmlElement(name = "CorrectionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionType correctionType;
    @XmlElement(name = "CorrectionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionTypeCode correctionTypeCode;
    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNumber meterNumber;
    @XmlElement(name = "GasPressureQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GasPressureQuantity gasPressureQuantity;
    @XmlElement(name = "ActualTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualTemperatureReductionQuantity actualTemperatureReductionQuantity;
    @XmlElement(name = "NormalTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NormalTemperatureReductionQuantity normalTemperatureReductionQuantity;
    @XmlElement(name = "DifferenceTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DifferenceTemperatureReductionQuantity differenceTemperatureReductionQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "CorrectionUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionUnitAmount correctionUnitAmount;
    @XmlElement(name = "ConsumptionEnergyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionEnergyQuantity consumptionEnergyQuantity;
    @XmlElement(name = "ConsumptionWaterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionWaterQuantity consumptionWaterQuantity;
    @XmlElement(name = "CorrectionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionAmount correctionAmount;

    /**
     * Obtiene el valor de la propiedad correctionType.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionType }
     *     
     */
    public CorrectionType getCorrectionType() {
        return correctionType;
    }

    /**
     * Define el valor de la propiedad correctionType.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionType }
     *     
     */
    public void setCorrectionType(CorrectionType value) {
        this.correctionType = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionTypeCode }
     *     
     */
    public CorrectionTypeCode getCorrectionTypeCode() {
        return correctionTypeCode;
    }

    /**
     * Define el valor de la propiedad correctionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionTypeCode }
     *     
     */
    public void setCorrectionTypeCode(CorrectionTypeCode value) {
        this.correctionTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad meterNumber.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumber }
     *     
     */
    public MeterNumber getMeterNumber() {
        return meterNumber;
    }

    /**
     * Define el valor de la propiedad meterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumber }
     *     
     */
    public void setMeterNumber(MeterNumber value) {
        this.meterNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad gasPressureQuantity.
     * 
     * @return
     *     possible object is
     *     {@link GasPressureQuantity }
     *     
     */
    public GasPressureQuantity getGasPressureQuantity() {
        return gasPressureQuantity;
    }

    /**
     * Define el valor de la propiedad gasPressureQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPressureQuantity }
     *     
     */
    public void setGasPressureQuantity(GasPressureQuantity value) {
        this.gasPressureQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad actualTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ActualTemperatureReductionQuantity }
     *     
     */
    public ActualTemperatureReductionQuantity getActualTemperatureReductionQuantity() {
        return actualTemperatureReductionQuantity;
    }

    /**
     * Define el valor de la propiedad actualTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualTemperatureReductionQuantity }
     *     
     */
    public void setActualTemperatureReductionQuantity(ActualTemperatureReductionQuantity value) {
        this.actualTemperatureReductionQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad normalTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link NormalTemperatureReductionQuantity }
     *     
     */
    public NormalTemperatureReductionQuantity getNormalTemperatureReductionQuantity() {
        return normalTemperatureReductionQuantity;
    }

    /**
     * Define el valor de la propiedad normalTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalTemperatureReductionQuantity }
     *     
     */
    public void setNormalTemperatureReductionQuantity(NormalTemperatureReductionQuantity value) {
        this.normalTemperatureReductionQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad differenceTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DifferenceTemperatureReductionQuantity }
     *     
     */
    public DifferenceTemperatureReductionQuantity getDifferenceTemperatureReductionQuantity() {
        return differenceTemperatureReductionQuantity;
    }

    /**
     * Define el valor de la propiedad differenceTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferenceTemperatureReductionQuantity }
     *     
     */
    public void setDifferenceTemperatureReductionQuantity(DifferenceTemperatureReductionQuantity value) {
        this.differenceTemperatureReductionQuantity = value;
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
     * Obtiene el valor de la propiedad correctionUnitAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionUnitAmount }
     *     
     */
    public CorrectionUnitAmount getCorrectionUnitAmount() {
        return correctionUnitAmount;
    }

    /**
     * Define el valor de la propiedad correctionUnitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionUnitAmount }
     *     
     */
    public void setCorrectionUnitAmount(CorrectionUnitAmount value) {
        this.correctionUnitAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionEnergyQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionEnergyQuantity }
     *     
     */
    public ConsumptionEnergyQuantity getConsumptionEnergyQuantity() {
        return consumptionEnergyQuantity;
    }

    /**
     * Define el valor de la propiedad consumptionEnergyQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionEnergyQuantity }
     *     
     */
    public void setConsumptionEnergyQuantity(ConsumptionEnergyQuantity value) {
        this.consumptionEnergyQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionWaterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionWaterQuantity }
     *     
     */
    public ConsumptionWaterQuantity getConsumptionWaterQuantity() {
        return consumptionWaterQuantity;
    }

    /**
     * Define el valor de la propiedad consumptionWaterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionWaterQuantity }
     *     
     */
    public void setConsumptionWaterQuantity(ConsumptionWaterQuantity value) {
        this.consumptionWaterQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionAmount }
     *     
     */
    public CorrectionAmount getCorrectionAmount() {
        return correctionAmount;
    }

    /**
     * Define el valor de la propiedad correctionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionAmount }
     *     
     */
    public void setCorrectionAmount(CorrectionAmount value) {
        this.correctionAmount = value;
    }

}
