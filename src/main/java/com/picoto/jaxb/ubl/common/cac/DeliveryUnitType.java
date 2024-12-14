//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BatchQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumerUnitQuantity;
import com.picoto.jaxb.ubl.common.cbc.HazardousRiskIndicator;


/**
 * <p>Clase Java para DeliveryUnitType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeliveryUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BatchQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryUnitType", propOrder = {
    "batchQuantity",
    "consumerUnitQuantity",
    "hazardousRiskIndicator"
})
public class DeliveryUnitType {

    @XmlElement(name = "BatchQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected BatchQuantity batchQuantity;
    @XmlElement(name = "ConsumerUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumerUnitQuantity consumerUnitQuantity;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicator hazardousRiskIndicator;

    /**
     * Obtiene el valor de la propiedad batchQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BatchQuantity }
     *     
     */
    public BatchQuantity getBatchQuantity() {
        return batchQuantity;
    }

    /**
     * Define el valor de la propiedad batchQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchQuantity }
     *     
     */
    public void setBatchQuantity(BatchQuantity value) {
        this.batchQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad consumerUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerUnitQuantity }
     *     
     */
    public ConsumerUnitQuantity getConsumerUnitQuantity() {
        return consumerUnitQuantity;
    }

    /**
     * Define el valor de la propiedad consumerUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerUnitQuantity }
     *     
     */
    public void setConsumerUnitQuantity(ConsumerUnitQuantity value) {
        this.consumerUnitQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public HazardousRiskIndicator getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Define el valor de la propiedad hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicator value) {
        this.hazardousRiskIndicator = value;
    }

}
