//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CalculationMethodCode;
import com.picoto.jaxb.ubl.common.cbc.FullnessIndicationCode;


/**
 * <p>Clase Java para EmissionCalculationMethodType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmissionCalculationMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementFromLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementToLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmissionCalculationMethodType", propOrder = {
    "calculationMethodCode",
    "fullnessIndicationCode",
    "measurementFromLocation",
    "measurementToLocation"
})
@XmlRootElement(name = "EmissionCalculationMethod")
public class EmissionCalculationMethod {

    @XmlElement(name = "CalculationMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationMethodCode calculationMethodCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullnessIndicationCode fullnessIndicationCode;
    @XmlElement(name = "MeasurementFromLocation")
    protected LocationType measurementFromLocation;
    @XmlElement(name = "MeasurementToLocation")
    protected LocationType measurementToLocation;

    /**
     * Obtiene el valor de la propiedad calculationMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethodCode }
     *     
     */
    public CalculationMethodCode getCalculationMethodCode() {
        return calculationMethodCode;
    }

    /**
     * Define el valor de la propiedad calculationMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethodCode }
     *     
     */
    public void setCalculationMethodCode(CalculationMethodCode value) {
        this.calculationMethodCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fullnessIndicationCode.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public FullnessIndicationCode getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Define el valor de la propiedad fullnessIndicationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCode value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad measurementFromLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementFromLocation() {
        return measurementFromLocation;
    }

    /**
     * Define el valor de la propiedad measurementFromLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementFromLocation(LocationType value) {
        this.measurementFromLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad measurementToLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementToLocation() {
        return measurementToLocation;
    }

    /**
     * Define el valor de la propiedad measurementToLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementToLocation(LocationType value) {
        this.measurementToLocation = value;
    }

}
