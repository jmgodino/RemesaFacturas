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
import com.picoto.jaxb.ubl.common.cbc.RailCarID;
import com.picoto.jaxb.ubl.common.cbc.TrainID;


/**
 * <p>Clase Java para RailTransportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RailTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrainID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RailCarID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailTransportType", propOrder = {
    "trainID",
    "railCarID"
})
@XmlRootElement(name = "RailTransport")
public class RailTransport {

    @XmlElement(name = "TrainID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TrainID trainID;
    @XmlElement(name = "RailCarID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RailCarID railCarID;

    /**
     * Obtiene el valor de la propiedad trainID.
     * 
     * @return
     *     possible object is
     *     {@link TrainID }
     *     
     */
    public TrainID getTrainID() {
        return trainID;
    }

    /**
     * Define el valor de la propiedad trainID.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainID }
     *     
     */
    public void setTrainID(TrainID value) {
        this.trainID = value;
    }

    /**
     * Obtiene el valor de la propiedad railCarID.
     * 
     * @return
     *     possible object is
     *     {@link RailCarID }
     *     
     */
    public RailCarID getRailCarID() {
        return railCarID;
    }

    /**
     * Define el valor de la propiedad railCarID.
     * 
     * @param value
     *     allowed object is
     *     {@link RailCarID }
     *     
     */
    public void setRailCarID(RailCarID value) {
        this.railCarID = value;
    }

}
