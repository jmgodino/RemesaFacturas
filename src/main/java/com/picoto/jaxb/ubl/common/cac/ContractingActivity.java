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
import com.picoto.jaxb.ubl.common.cbc.ActivityType;
import com.picoto.jaxb.ubl.common.cbc.ActivityTypeCode;


/**
 * <p>Clase Java para ContractingActivityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractingActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingActivityType", propOrder = {
    "activityTypeCode",
    "activityType"
})
@XmlRootElement(name = "ContractingActivity")
public class ContractingActivity {

    @XmlElement(name = "ActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityTypeCode activityTypeCode;
    @XmlElement(name = "ActivityType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityType activityType;

    /**
     * Obtiene el valor de la propiedad activityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeCode }
     *     
     */
    public ActivityTypeCode getActivityTypeCode() {
        return activityTypeCode;
    }

    /**
     * Define el valor de la propiedad activityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeCode }
     *     
     */
    public void setActivityTypeCode(ActivityTypeCode value) {
        this.activityTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad activityType.
     * 
     * @return
     *     possible object is
     *     {@link ActivityType }
     *     
     */
    public ActivityType getActivityType() {
        return activityType;
    }

    /**
     * Define el valor de la propiedad activityType.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityType }
     *     
     */
    public void setActivityType(ActivityType value) {
        this.activityType = value;
    }

}
