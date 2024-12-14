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
import com.picoto.jaxb.ubl.common.cbc.ConsumptionReportID;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionType;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TotalConsumedQuantity;


/**
 * <p>Clase Java para ConsumptionReportReferenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionReportID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportReferenceType", propOrder = {
    "consumptionReportID",
    "consumptionType",
    "consumptionTypeCode",
    "totalConsumedQuantity",
    "period"
})
@XmlRootElement(name = "ConsumptionReportReference")
public class ConsumptionReportReference {

    @XmlElement(name = "ConsumptionReportID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ConsumptionReportID consumptionReportID;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TotalConsumedQuantity totalConsumedQuantity;
    @XmlElement(name = "Period", required = true)
    protected PeriodType period;

    /**
     * Obtiene el valor de la propiedad consumptionReportID.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionReportID }
     *     
     */
    public ConsumptionReportID getConsumptionReportID() {
        return consumptionReportID;
    }

    /**
     * Define el valor de la propiedad consumptionReportID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionReportID }
     *     
     */
    public void setConsumptionReportID(ConsumptionReportID value) {
        this.consumptionReportID = value;
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

}
