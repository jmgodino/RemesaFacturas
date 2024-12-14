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
import com.picoto.jaxb.ubl.common.cbc.LicensePlateID;


/**
 * <p>Clase Java para RoadTransportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoadTransportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LicensePlateID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadTransportType", propOrder = {
    "licensePlateID"
})
@XmlRootElement(name = "RoadTransport")
public class RoadTransport {

    @XmlElement(name = "LicensePlateID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LicensePlateID licensePlateID;

    /**
     * Obtiene el valor de la propiedad licensePlateID.
     * 
     * @return
     *     possible object is
     *     {@link LicensePlateID }
     *     
     */
    public LicensePlateID getLicensePlateID() {
        return licensePlateID;
    }

    /**
     * Define el valor de la propiedad licensePlateID.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensePlateID }
     *     
     */
    public void setLicensePlateID(LicensePlateID value) {
        this.licensePlateID = value;
    }

}
