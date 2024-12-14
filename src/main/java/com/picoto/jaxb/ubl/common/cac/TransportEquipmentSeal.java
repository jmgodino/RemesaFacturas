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
import com.picoto.jaxb.ubl.common.cbc.Condition;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.SealIssuerTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SealStatusCode;
import com.picoto.jaxb.ubl.common.cbc.SealingPartyType;


/**
 * <p>Clase Java para TransportEquipmentSealType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentSealType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealIssuerTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Condition" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealStatusCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealingPartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentSealType", propOrder = {
    "id",
    "sealIssuerTypeCode",
    "condition",
    "sealStatusCode",
    "sealingPartyType"
})
@XmlRootElement(name = "TransportEquipmentSeal")
public class TransportEquipmentSeal {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "SealIssuerTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SealIssuerTypeCode sealIssuerTypeCode;
    @XmlElement(name = "Condition", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Condition condition;
    @XmlElement(name = "SealStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SealStatusCode sealStatusCode;
    @XmlElement(name = "SealingPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SealingPartyType sealingPartyType;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad sealIssuerTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SealIssuerTypeCode }
     *     
     */
    public SealIssuerTypeCode getSealIssuerTypeCode() {
        return sealIssuerTypeCode;
    }

    /**
     * Define el valor de la propiedad sealIssuerTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SealIssuerTypeCode }
     *     
     */
    public void setSealIssuerTypeCode(SealIssuerTypeCode value) {
        this.sealIssuerTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad condition.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Define el valor de la propiedad condition.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Obtiene el valor de la propiedad sealStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link SealStatusCode }
     *     
     */
    public SealStatusCode getSealStatusCode() {
        return sealStatusCode;
    }

    /**
     * Define el valor de la propiedad sealStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SealStatusCode }
     *     
     */
    public void setSealStatusCode(SealStatusCode value) {
        this.sealStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sealingPartyType.
     * 
     * @return
     *     possible object is
     *     {@link SealingPartyType }
     *     
     */
    public SealingPartyType getSealingPartyType() {
        return sealingPartyType;
    }

    /**
     * Define el valor de la propiedad sealingPartyType.
     * 
     * @param value
     *     allowed object is
     *     {@link SealingPartyType }
     *     
     */
    public void setSealingPartyType(SealingPartyType value) {
        this.sealingPartyType = value;
    }

}
