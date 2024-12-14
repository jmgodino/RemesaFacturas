//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
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
 * &lt;complexType name="RoadTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LicensePlateID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
