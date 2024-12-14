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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BasicConsumedQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumersEnergyLevel;
import com.picoto.jaxb.ubl.common.cbc.ConsumersEnergyLevelCode;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionType;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.HeatingType;
import com.picoto.jaxb.ubl.common.cbc.HeatingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.ResidenceType;
import com.picoto.jaxb.ubl.common.cbc.ResidenceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ResidentOccupantsNumeric;
import com.picoto.jaxb.ubl.common.cbc.TotalConsumedQuantity;


/**
 * <p>Clase Java para ConsumptionReportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BasicConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidentOccupantsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GuidanceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionReportReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportType", propOrder = {
    "id",
    "consumptionType",
    "consumptionTypeCode",
    "descriptions",
    "totalConsumedQuantity",
    "basicConsumedQuantity",
    "residentOccupantsNumeric",
    "consumersEnergyLevelCode",
    "consumersEnergyLevel",
    "residenceType",
    "residenceTypeCode",
    "heatingType",
    "heatingTypeCode",
    "period",
    "guidanceDocumentReference",
    "documentReference",
    "consumptionReportReferences",
    "consumptionHistories"
})
@XmlRootElement(name = "ConsumptionReport")
public class ConsumptionReport {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalConsumedQuantity totalConsumedQuantity;
    @XmlElement(name = "BasicConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BasicConsumedQuantity basicConsumedQuantity;
    @XmlElement(name = "ResidentOccupantsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidentOccupantsNumeric residentOccupantsNumeric;
    @XmlElement(name = "ConsumersEnergyLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumersEnergyLevelCode consumersEnergyLevelCode;
    @XmlElement(name = "ConsumersEnergyLevel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumersEnergyLevel consumersEnergyLevel;
    @XmlElement(name = "ResidenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidenceType residenceType;
    @XmlElement(name = "ResidenceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidenceTypeCode residenceTypeCode;
    @XmlElement(name = "HeatingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HeatingType heatingType;
    @XmlElement(name = "HeatingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HeatingTypeCode heatingTypeCode;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "GuidanceDocumentReference")
    protected DocumentReferenceType guidanceDocumentReference;
    @XmlElement(name = "DocumentReference")
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "ConsumptionReportReference")
    protected List<ConsumptionReportReference> consumptionReportReferences;
    @XmlElement(name = "ConsumptionHistory")
    protected List<ConsumptionHistory> consumptionHistories;

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
     * Obtiene el valor de la propiedad consumptionType.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Define el valor de la propiedad consumptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumptionType(ConsumptionType value) {
        this.consumptionType = value;
    }

    /**
     * Obtiene el valor de la propiedad consumptionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public ConsumptionTypeCode getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Define el valor de la propiedad consumptionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCode value) {
        this.consumptionTypeCode = value;
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
     * Obtiene el valor de la propiedad totalConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalConsumedQuantity }
     *     
     */
    public TotalConsumedQuantity getTotalConsumedQuantity() {
        return totalConsumedQuantity;
    }

    /**
     * Define el valor de la propiedad totalConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalConsumedQuantity }
     *     
     */
    public void setTotalConsumedQuantity(TotalConsumedQuantity value) {
        this.totalConsumedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad basicConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BasicConsumedQuantity }
     *     
     */
    public BasicConsumedQuantity getBasicConsumedQuantity() {
        return basicConsumedQuantity;
    }

    /**
     * Define el valor de la propiedad basicConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicConsumedQuantity }
     *     
     */
    public void setBasicConsumedQuantity(BasicConsumedQuantity value) {
        this.basicConsumedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad residentOccupantsNumeric.
     * 
     * @return
     *     possible object is
     *     {@link ResidentOccupantsNumeric }
     *     
     */
    public ResidentOccupantsNumeric getResidentOccupantsNumeric() {
        return residentOccupantsNumeric;
    }

    /**
     * Define el valor de la propiedad residentOccupantsNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentOccupantsNumeric }
     *     
     */
    public void setResidentOccupantsNumeric(ResidentOccupantsNumeric value) {
        this.residentOccupantsNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad consumersEnergyLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevelCode }
     *     
     */
    public ConsumersEnergyLevelCode getConsumersEnergyLevelCode() {
        return consumersEnergyLevelCode;
    }

    /**
     * Define el valor de la propiedad consumersEnergyLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevelCode }
     *     
     */
    public void setConsumersEnergyLevelCode(ConsumersEnergyLevelCode value) {
        this.consumersEnergyLevelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad consumersEnergyLevel.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevel }
     *     
     */
    public ConsumersEnergyLevel getConsumersEnergyLevel() {
        return consumersEnergyLevel;
    }

    /**
     * Define el valor de la propiedad consumersEnergyLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevel }
     *     
     */
    public void setConsumersEnergyLevel(ConsumersEnergyLevel value) {
        this.consumersEnergyLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceType.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType }
     *     
     */
    public ResidenceType getResidenceType() {
        return residenceType;
    }

    /**
     * Define el valor de la propiedad residenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType }
     *     
     */
    public void setResidenceType(ResidenceType value) {
        this.residenceType = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCode }
     *     
     */
    public ResidenceTypeCode getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Define el valor de la propiedad residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCode }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCode value) {
        this.residenceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad heatingType.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Define el valor de la propiedad heatingType.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
    }

    /**
     * Obtiene el valor de la propiedad heatingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeCode }
     *     
     */
    public HeatingTypeCode getHeatingTypeCode() {
        return heatingTypeCode;
    }

    /**
     * Define el valor de la propiedad heatingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeCode }
     *     
     */
    public void setHeatingTypeCode(HeatingTypeCode value) {
        this.heatingTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Obtiene el valor de la propiedad guidanceDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getGuidanceDocumentReference() {
        return guidanceDocumentReference;
    }

    /**
     * Define el valor de la propiedad guidanceDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setGuidanceDocumentReference(DocumentReferenceType value) {
        this.guidanceDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad documentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Define el valor de la propiedad documentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the consumptionReportReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionReportReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionReportReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionReportReference }
     * 
     * 
     */
    public List<ConsumptionReportReference> getConsumptionReportReferences() {
        if (consumptionReportReferences == null) {
            consumptionReportReferences = new ArrayList<ConsumptionReportReference>();
        }
        return this.consumptionReportReferences;
    }

    /**
     * Gets the value of the consumptionHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionHistory }
     * 
     * 
     */
    public List<ConsumptionHistory> getConsumptionHistories() {
        if (consumptionHistories == null) {
            consumptionHistories = new ArrayList<ConsumptionHistory>();
        }
        return this.consumptionHistories;
    }

}
