//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.PrivacyCode;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsSupplyType;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsSupplyTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TotalAmount;


/**
 * <p>Clase Java para TelecommunicationsSupplyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsSupplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivacyCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TelecommunicationsSupplyLine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsSupplyType", propOrder = {
    "telecommunicationsSupplyType",
    "telecommunicationsSupplyTypeCode",
    "privacyCode",
    "descriptions",
    "totalAmount",
    "telecommunicationsSupplyLines"
})
@XmlRootElement(name = "TelecommunicationsSupply")
public class TelecommunicationsSupply {

    @XmlElement(name = "TelecommunicationsSupplyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsSupplyType telecommunicationsSupplyType;
    @XmlElement(name = "TelecommunicationsSupplyTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsSupplyTypeCode telecommunicationsSupplyTypeCode;
    @XmlElement(name = "PrivacyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrivacyCode privacyCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalAmount totalAmount;
    @XmlElement(name = "TelecommunicationsSupplyLine", required = true)
    protected List<TelecommunicationsSupplyLine> telecommunicationsSupplyLines;

    /**
     * Obtiene el valor de la propiedad telecommunicationsSupplyType.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public TelecommunicationsSupplyType getTelecommunicationsSupplyType() {
        return telecommunicationsSupplyType;
    }

    /**
     * Define el valor de la propiedad telecommunicationsSupplyType.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public void setTelecommunicationsSupplyType(TelecommunicationsSupplyType value) {
        this.telecommunicationsSupplyType = value;
    }

    /**
     * Obtiene el valor de la propiedad telecommunicationsSupplyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyTypeCode }
     *     
     */
    public TelecommunicationsSupplyTypeCode getTelecommunicationsSupplyTypeCode() {
        return telecommunicationsSupplyTypeCode;
    }

    /**
     * Define el valor de la propiedad telecommunicationsSupplyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyTypeCode }
     *     
     */
    public void setTelecommunicationsSupplyTypeCode(TelecommunicationsSupplyTypeCode value) {
        this.telecommunicationsSupplyTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad privacyCode.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyCode }
     *     
     */
    public PrivacyCode getPrivacyCode() {
        return privacyCode;
    }

    /**
     * Define el valor de la propiedad privacyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyCode }
     *     
     */
    public void setPrivacyCode(PrivacyCode value) {
        this.privacyCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmount }
     *     
     */
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmount }
     *     
     */
    public void setTotalAmount(TotalAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the telecommunicationsSupplyLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecommunicationsSupplyLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecommunicationsSupplyLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationsSupplyLine }
     * 
     * 
     */
    public List<TelecommunicationsSupplyLine> getTelecommunicationsSupplyLines() {
        if (telecommunicationsSupplyLines == null) {
            telecommunicationsSupplyLines = new ArrayList<TelecommunicationsSupplyLine>();
        }
        return this.telecommunicationsSupplyLines;
    }

}
