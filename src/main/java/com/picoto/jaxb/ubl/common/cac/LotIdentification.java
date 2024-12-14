//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ExpiryDate;
import com.picoto.jaxb.ubl.common.cbc.LotNumberID;


/**
 * <p>Clase Java para LotIdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LotIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LotNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotIdentificationType", propOrder = {
    "lotNumberID",
    "expiryDate",
    "additionalItemProperties"
})
@XmlRootElement(name = "LotIdentification")
public class LotIdentification {

    @XmlElement(name = "LotNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LotNumberID lotNumberID;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryDate expiryDate;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperties;

    /**
     * Obtiene el valor de la propiedad lotNumberID.
     * 
     * @return
     *     possible object is
     *     {@link LotNumberID }
     *     
     */
    public LotNumberID getLotNumberID() {
        return lotNumberID;
    }

    /**
     * Define el valor de la propiedad lotNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link LotNumberID }
     *     
     */
    public void setLotNumberID(LotNumberID value) {
        this.lotNumberID = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Define el valor de la propiedad expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiryDate(ExpiryDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the additionalItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getAdditionalItemProperties() {
        if (additionalItemProperties == null) {
            additionalItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperties;
    }

}
