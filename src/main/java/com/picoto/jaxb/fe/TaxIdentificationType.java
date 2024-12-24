//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxIdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PersonTypeCodeType"/&gt;
 *         &lt;element name="ResidenceTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ResidenceTypeCodeType"/&gt;
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMin3Max30Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentificationType", propOrder = {
    "personTypeCode",
    "residenceTypeCode",
    "taxIdentificationNumber"
})
public class TaxIdentificationType {

    @XmlElement(name = "PersonTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected PersonTypeCodeType personTypeCode;
    @XmlElement(name = "ResidenceTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResidenceTypeCodeType residenceTypeCode;
    @XmlElement(name = "TaxIdentificationNumber", required = true)
    protected String taxIdentificationNumber;

    /**
     * Obtiene el valor de la propiedad personTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public PersonTypeCodeType getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Define el valor de la propiedad personTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public void setPersonTypeCode(PersonTypeCodeType value) {
        this.personTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public ResidenceTypeCodeType getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Define el valor de la propiedad residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCodeType value) {
        this.residenceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Define el valor de la propiedad taxIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

}
