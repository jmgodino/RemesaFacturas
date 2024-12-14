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
import com.picoto.jaxb.ubl.common.cbc.MeterConstant;
import com.picoto.jaxb.ubl.common.cbc.MeterConstantCode;
import com.picoto.jaxb.ubl.common.cbc.MeterName;
import com.picoto.jaxb.ubl.common.cbc.MeterNumber;
import com.picoto.jaxb.ubl.common.cbc.TotalDeliveredQuantity;


/**
 * <p>Clase Java para MeterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MeterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstant" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstantCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterReading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterType", propOrder = {
    "meterNumber",
    "meterName",
    "meterConstant",
    "meterConstantCode",
    "totalDeliveredQuantity",
    "meterReadings",
    "meterProperties"
})
public class MeterType {

    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNumber meterNumber;
    @XmlElement(name = "MeterName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterName meterName;
    @XmlElement(name = "MeterConstant", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterConstant meterConstant;
    @XmlElement(name = "MeterConstantCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterConstantCode meterConstantCode;
    @XmlElement(name = "TotalDeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalDeliveredQuantity totalDeliveredQuantity;
    @XmlElement(name = "MeterReading")
    protected List<MeterReading> meterReadings;
    @XmlElement(name = "MeterProperty")
    protected List<MeterProperty> meterProperties;

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
     * Obtiene el valor de la propiedad meterName.
     * 
     * @return
     *     possible object is
     *     {@link MeterName }
     *     
     */
    public MeterName getMeterName() {
        return meterName;
    }

    /**
     * Define el valor de la propiedad meterName.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterName }
     *     
     */
    public void setMeterName(MeterName value) {
        this.meterName = value;
    }

    /**
     * Obtiene el valor de la propiedad meterConstant.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstant }
     *     
     */
    public MeterConstant getMeterConstant() {
        return meterConstant;
    }

    /**
     * Define el valor de la propiedad meterConstant.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstant }
     *     
     */
    public void setMeterConstant(MeterConstant value) {
        this.meterConstant = value;
    }

    /**
     * Obtiene el valor de la propiedad meterConstantCode.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstantCode }
     *     
     */
    public MeterConstantCode getMeterConstantCode() {
        return meterConstantCode;
    }

    /**
     * Define el valor de la propiedad meterConstantCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstantCode }
     *     
     */
    public void setMeterConstantCode(MeterConstantCode value) {
        this.meterConstantCode = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDeliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public TotalDeliveredQuantity getTotalDeliveredQuantity() {
        return totalDeliveredQuantity;
    }

    /**
     * Define el valor de la propiedad totalDeliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public void setTotalDeliveredQuantity(TotalDeliveredQuantity value) {
        this.totalDeliveredQuantity = value;
    }

    /**
     * Gets the value of the meterReadings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReadings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReading }
     * 
     * 
     */
    public List<MeterReading> getMeterReadings() {
        if (meterReadings == null) {
            meterReadings = new ArrayList<MeterReading>();
        }
        return this.meterReadings;
    }

    /**
     * Gets the value of the meterProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterProperty }
     * 
     * 
     */
    public List<MeterProperty> getMeterProperties() {
        if (meterProperties == null) {
            meterProperties = new ArrayList<MeterProperty>();
        }
        return this.meterProperties;
    }

}
