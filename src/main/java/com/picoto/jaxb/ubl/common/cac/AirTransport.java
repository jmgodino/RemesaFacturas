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
import com.picoto.jaxb.ubl.common.cbc.AircraftID;


/**
 * <p>Clase Java para AirTransportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirTransportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AircraftID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTransportType", propOrder = {
    "aircraftID"
})
@XmlRootElement(name = "AirTransport")
public class AirTransport {

    @XmlElement(name = "AircraftID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AircraftID aircraftID;

    /**
     * Obtiene el valor de la propiedad aircraftID.
     * 
     * @return
     *     possible object is
     *     {@link AircraftID }
     *     
     */
    public AircraftID getAircraftID() {
        return aircraftID;
    }

    /**
     * Define el valor de la propiedad aircraftID.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftID }
     *     
     */
    public void setAircraftID(AircraftID value) {
        this.aircraftID = value;
    }

}
