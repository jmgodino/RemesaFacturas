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
import com.picoto.jaxb.ubl.common.cbc.PartyType;
import com.picoto.jaxb.ubl.common.cbc.PartyTypeCode;


/**
 * <p>Clase Java para ContractingPartyTypeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractingPartyTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingPartyTypeType", propOrder = {
    "partyTypeCode",
    "partyType"
})
@XmlRootElement(name = "ContractingPartyType")
public class ContractingPartyType {

    @XmlElement(name = "PartyTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyTypeCode partyTypeCode;
    @XmlElement(name = "PartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyType partyType;

    /**
     * Obtiene el valor de la propiedad partyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeCode }
     *     
     */
    public PartyTypeCode getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Define el valor de la propiedad partyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeCode }
     *     
     */
    public void setPartyTypeCode(PartyTypeCode value) {
        this.partyTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad partyType.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPartyType() {
        return partyType;
    }

    /**
     * Define el valor de la propiedad partyType.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPartyType(PartyType value) {
        this.partyType = value;
    }

}
