//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BestBeforeDate;
import com.picoto.jaxb.ubl.common.cbc.ManufactureDate;
import com.picoto.jaxb.ubl.common.cbc.ManufactureTime;
import com.picoto.jaxb.ubl.common.cbc.ProductTraceID;
import com.picoto.jaxb.ubl.common.cbc.RegistrationID;
import com.picoto.jaxb.ubl.common.cbc.SerialID;


/**
 * <p>Clase Java para ItemInstanceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemInstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProductTraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BestBeforeDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SerialID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInstanceType", propOrder = {
    "productTraceID",
    "manufactureDate",
    "manufactureTime",
    "bestBeforeDate",
    "registrationID",
    "serialID",
    "additionalItemProperties",
    "lotIdentification"
})
@XmlRootElement(name = "ItemInstance")
public class ItemInstance {

    @XmlElement(name = "ProductTraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProductTraceID productTraceID;
    @XmlElement(name = "ManufactureDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ManufactureDate manufactureDate;
    @XmlElement(name = "ManufactureTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ManufactureTime manufactureTime;
    @XmlElement(name = "BestBeforeDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BestBeforeDate bestBeforeDate;
    @XmlElement(name = "RegistrationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationID registrationID;
    @XmlElement(name = "SerialID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SerialID serialID;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperties;
    @XmlElement(name = "LotIdentification")
    protected LotIdentification lotIdentification;

    /**
     * Obtiene el valor de la propiedad productTraceID.
     * 
     * @return
     *     possible object is
     *     {@link ProductTraceID }
     *     
     */
    public ProductTraceID getProductTraceID() {
        return productTraceID;
    }

    /**
     * Define el valor de la propiedad productTraceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTraceID }
     *     
     */
    public void setProductTraceID(ProductTraceID value) {
        this.productTraceID = value;
    }

    /**
     * Obtiene el valor de la propiedad manufactureDate.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureDate }
     *     
     */
    public ManufactureDate getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Define el valor de la propiedad manufactureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureDate }
     *     
     */
    public void setManufactureDate(ManufactureDate value) {
        this.manufactureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad manufactureTime.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureTime }
     *     
     */
    public ManufactureTime getManufactureTime() {
        return manufactureTime;
    }

    /**
     * Define el valor de la propiedad manufactureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureTime }
     *     
     */
    public void setManufactureTime(ManufactureTime value) {
        this.manufactureTime = value;
    }

    /**
     * Obtiene el valor de la propiedad bestBeforeDate.
     * 
     * @return
     *     possible object is
     *     {@link BestBeforeDate }
     *     
     */
    public BestBeforeDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * Define el valor de la propiedad bestBeforeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BestBeforeDate }
     *     
     */
    public void setBestBeforeDate(BestBeforeDate value) {
        this.bestBeforeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationID.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationID }
     *     
     */
    public RegistrationID getRegistrationID() {
        return registrationID;
    }

    /**
     * Define el valor de la propiedad registrationID.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationID }
     *     
     */
    public void setRegistrationID(RegistrationID value) {
        this.registrationID = value;
    }

    /**
     * Obtiene el valor de la propiedad serialID.
     * 
     * @return
     *     possible object is
     *     {@link SerialID }
     *     
     */
    public SerialID getSerialID() {
        return serialID;
    }

    /**
     * Define el valor de la propiedad serialID.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialID }
     *     
     */
    public void setSerialID(SerialID value) {
        this.serialID = value;
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

    /**
     * Obtiene el valor de la propiedad lotIdentification.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Define el valor de la propiedad lotIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

}
