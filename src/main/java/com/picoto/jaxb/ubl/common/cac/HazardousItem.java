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
import com.picoto.jaxb.ubl.common.cbc.AdditionalInformation;
import com.picoto.jaxb.ubl.common.cbc.CategoryName;
import com.picoto.jaxb.ubl.common.cbc.EmergencyProceduresCode;
import com.picoto.jaxb.ubl.common.cbc.HazardClassID;
import com.picoto.jaxb.ubl.common.cbc.HazardousCategoryCode;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LowerOrangeHazardPlacardID;
import com.picoto.jaxb.ubl.common.cbc.MarkingID;
import com.picoto.jaxb.ubl.common.cbc.MedicalFirstAidGuideCode;
import com.picoto.jaxb.ubl.common.cbc.NetVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.PlacardEndorsement;
import com.picoto.jaxb.ubl.common.cbc.PlacardNotation;
import com.picoto.jaxb.ubl.common.cbc.Quantity;
import com.picoto.jaxb.ubl.common.cbc.TechnicalName;
import com.picoto.jaxb.ubl.common.cbc.UNDGCode;
import com.picoto.jaxb.ubl.common.cbc.UpperOrangeHazardPlacardID;


/**
 * <p>Clase Java para HazardousItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HazardousItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UNDGCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MedicalFirstAidGuideCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TechnicalName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CategoryName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousCategoryCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UpperOrangeHazardPlacardID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerOrangeHazardPlacardID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkingID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardClassID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContactParty" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecondaryHazard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmergencyTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FlashpointTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalTemperature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousItemType", propOrder = {
    "id",
    "placardNotation",
    "placardEndorsement",
    "additionalInformations",
    "undgCode",
    "emergencyProceduresCode",
    "medicalFirstAidGuideCode",
    "technicalName",
    "categoryName",
    "hazardousCategoryCode",
    "upperOrangeHazardPlacardID",
    "lowerOrangeHazardPlacardID",
    "markingID",
    "hazardClassID",
    "netWeightMeasure",
    "netVolumeMeasure",
    "quantity",
    "contactParty",
    "secondaryHazards",
    "hazardousGoodsTransits",
    "emergencyTemperature",
    "flashpointTemperature",
    "additionalTemperatures"
})
@XmlRootElement(name = "HazardousItem")
public class HazardousItem {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardNotation placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardEndorsement placardEndorsement;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalInformation> additionalInformations;
    @XmlElement(name = "UNDGCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UNDGCode undgCode;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmergencyProceduresCode emergencyProceduresCode;
    @XmlElement(name = "MedicalFirstAidGuideCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MedicalFirstAidGuideCode medicalFirstAidGuideCode;
    @XmlElement(name = "TechnicalName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TechnicalName technicalName;
    @XmlElement(name = "CategoryName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CategoryName categoryName;
    @XmlElement(name = "HazardousCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousCategoryCode hazardousCategoryCode;
    @XmlElement(name = "UpperOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UpperOrangeHazardPlacardID upperOrangeHazardPlacardID;
    @XmlElement(name = "LowerOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LowerOrangeHazardPlacardID lowerOrangeHazardPlacardID;
    @XmlElement(name = "MarkingID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkingID markingID;
    @XmlElement(name = "HazardClassID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardClassID hazardClassID;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetWeightMeasure netWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetVolumeMeasure netVolumeMeasure;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Quantity quantity;
    @XmlElement(name = "ContactParty")
    protected PartyType contactParty;
    @XmlElement(name = "SecondaryHazard")
    protected List<SecondaryHazard> secondaryHazards;
    @XmlElement(name = "HazardousGoodsTransit")
    protected List<HazardousGoodsTransit> hazardousGoodsTransits;
    @XmlElement(name = "EmergencyTemperature")
    protected TemperatureType emergencyTemperature;
    @XmlElement(name = "FlashpointTemperature")
    protected TemperatureType flashpointTemperature;
    @XmlElement(name = "AdditionalTemperature")
    protected List<TemperatureType> additionalTemperatures;

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
     * Obtiene el valor de la propiedad placardNotation.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotation }
     *     
     */
    public PlacardNotation getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Define el valor de la propiedad placardNotation.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotation }
     *     
     */
    public void setPlacardNotation(PlacardNotation value) {
        this.placardNotation = value;
    }

    /**
     * Obtiene el valor de la propiedad placardEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsement }
     *     
     */
    public PlacardEndorsement getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Define el valor de la propiedad placardEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsement }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsement value) {
        this.placardEndorsement = value;
    }

    /**
     * Gets the value of the additionalInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation }
     * 
     * 
     */
    public List<AdditionalInformation> getAdditionalInformations() {
        if (additionalInformations == null) {
            additionalInformations = new ArrayList<AdditionalInformation>();
        }
        return this.additionalInformations;
    }

    /**
     * Obtiene el valor de la propiedad undgCode.
     * 
     * @return
     *     possible object is
     *     {@link UNDGCode }
     *     
     */
    public UNDGCode getUNDGCode() {
        return undgCode;
    }

    /**
     * Define el valor de la propiedad undgCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UNDGCode }
     *     
     */
    public void setUNDGCode(UNDGCode value) {
        this.undgCode = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencyProceduresCode.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public EmergencyProceduresCode getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Define el valor de la propiedad emergencyProceduresCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCode value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Obtiene el valor de la propiedad medicalFirstAidGuideCode.
     * 
     * @return
     *     possible object is
     *     {@link MedicalFirstAidGuideCode }
     *     
     */
    public MedicalFirstAidGuideCode getMedicalFirstAidGuideCode() {
        return medicalFirstAidGuideCode;
    }

    /**
     * Define el valor de la propiedad medicalFirstAidGuideCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalFirstAidGuideCode }
     *     
     */
    public void setMedicalFirstAidGuideCode(MedicalFirstAidGuideCode value) {
        this.medicalFirstAidGuideCode = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalName.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalName }
     *     
     */
    public TechnicalName getTechnicalName() {
        return technicalName;
    }

    /**
     * Define el valor de la propiedad technicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalName }
     *     
     */
    public void setTechnicalName(TechnicalName value) {
        this.technicalName = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryName.
     * 
     * @return
     *     possible object is
     *     {@link CategoryName }
     *     
     */
    public CategoryName getCategoryName() {
        return categoryName;
    }

    /**
     * Define el valor de la propiedad categoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryName }
     *     
     */
    public void setCategoryName(CategoryName value) {
        this.categoryName = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardousCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCategoryCode }
     *     
     */
    public HazardousCategoryCode getHazardousCategoryCode() {
        return hazardousCategoryCode;
    }

    /**
     * Define el valor de la propiedad hazardousCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCategoryCode }
     *     
     */
    public void setHazardousCategoryCode(HazardousCategoryCode value) {
        this.hazardousCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad upperOrangeHazardPlacardID.
     * 
     * @return
     *     possible object is
     *     {@link UpperOrangeHazardPlacardID }
     *     
     */
    public UpperOrangeHazardPlacardID getUpperOrangeHazardPlacardID() {
        return upperOrangeHazardPlacardID;
    }

    /**
     * Define el valor de la propiedad upperOrangeHazardPlacardID.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperOrangeHazardPlacardID }
     *     
     */
    public void setUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardID value) {
        this.upperOrangeHazardPlacardID = value;
    }

    /**
     * Obtiene el valor de la propiedad lowerOrangeHazardPlacardID.
     * 
     * @return
     *     possible object is
     *     {@link LowerOrangeHazardPlacardID }
     *     
     */
    public LowerOrangeHazardPlacardID getLowerOrangeHazardPlacardID() {
        return lowerOrangeHazardPlacardID;
    }

    /**
     * Define el valor de la propiedad lowerOrangeHazardPlacardID.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerOrangeHazardPlacardID }
     *     
     */
    public void setLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardID value) {
        this.lowerOrangeHazardPlacardID = value;
    }

    /**
     * Obtiene el valor de la propiedad markingID.
     * 
     * @return
     *     possible object is
     *     {@link MarkingID }
     *     
     */
    public MarkingID getMarkingID() {
        return markingID;
    }

    /**
     * Define el valor de la propiedad markingID.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingID }
     *     
     */
    public void setMarkingID(MarkingID value) {
        this.markingID = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardClassID.
     * 
     * @return
     *     possible object is
     *     {@link HazardClassID }
     *     
     */
    public HazardClassID getHazardClassID() {
        return hazardClassID;
    }

    /**
     * Define el valor de la propiedad hazardClassID.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardClassID }
     *     
     */
    public void setHazardClassID(HazardClassID value) {
        this.hazardClassID = value;
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
     * Obtiene el valor de la propiedad contactParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContactParty() {
        return contactParty;
    }

    /**
     * Define el valor de la propiedad contactParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContactParty(PartyType value) {
        this.contactParty = value;
    }

    /**
     * Gets the value of the secondaryHazards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryHazards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryHazards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryHazard }
     * 
     * 
     */
    public List<SecondaryHazard> getSecondaryHazards() {
        if (secondaryHazards == null) {
            secondaryHazards = new ArrayList<SecondaryHazard>();
        }
        return this.secondaryHazards;
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
     * Obtiene el valor de la propiedad emergencyTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Define el valor de la propiedad emergencyTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setEmergencyTemperature(TemperatureType value) {
        this.emergencyTemperature = value;
    }

    /**
     * Obtiene el valor de la propiedad flashpointTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Define el valor de la propiedad flashpointTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setFlashpointTemperature(TemperatureType value) {
        this.flashpointTemperature = value;
    }

    /**
     * Gets the value of the additionalTemperatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTemperatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTemperatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getAdditionalTemperatures() {
        if (additionalTemperatures == null) {
            additionalTemperatures = new ArrayList<TemperatureType>();
        }
        return this.additionalTemperatures;
    }

}
