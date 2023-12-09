//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.09 a las 05:34:13 PM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecialTaxableEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialTaxableEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialTaxableEventCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}SpecialTaxableEventCodeType"/&gt;
 *         &lt;element name="SpecialTaxableEventReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialTaxableEventType", propOrder = {
    "specialTaxableEventCode",
    "specialTaxableEventReason"
})
public class SpecialTaxableEventType {

    @XmlElement(name = "SpecialTaxableEventCode", required = true)
    protected String specialTaxableEventCode;
    @XmlElement(name = "SpecialTaxableEventReason", required = true)
    protected String specialTaxableEventReason;

    /**
     * Obtiene el valor de la propiedad specialTaxableEventCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxableEventCode() {
        return specialTaxableEventCode;
    }

    /**
     * Define el valor de la propiedad specialTaxableEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxableEventCode(String value) {
        this.specialTaxableEventCode = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxableEventReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxableEventReason() {
        return specialTaxableEventReason;
    }

    /**
     * Define el valor de la propiedad specialTaxableEventReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxableEventReason(String value) {
        this.specialTaxableEventReason = value;
    }

}
