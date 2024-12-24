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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.SubscriberID;
import com.picoto.jaxb.ubl.common.cbc.SubscriberType;
import com.picoto.jaxb.ubl.common.cbc.SubscriberTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TotalDeliveredQuantity;


/**
 * <p>Clase Java para ConsumptionPointType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WebSiteAccess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityMeter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionPointType", propOrder = {
    "id",
    "descriptions",
    "subscriberID",
    "subscriberType",
    "subscriberTypeCode",
    "totalDeliveredQuantity",
    "address",
    "webSiteAccess",
    "utilityMeters"
})
public class ConsumptionPointType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "SubscriberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberID subscriberID;
    @XmlElement(name = "SubscriberType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberType subscriberType;
    @XmlElement(name = "SubscriberTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeCode subscriberTypeCode;
    @XmlElement(name = "TotalDeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalDeliveredQuantity totalDeliveredQuantity;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "WebSiteAccess")
    protected WebSiteAccess webSiteAccess;
    @XmlElement(name = "UtilityMeter")
    protected List<MeterType> utilityMeters;

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
     * Obtiene el valor de la propiedad subscriberID.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberID }
     *     
     */
    public SubscriberID getSubscriberID() {
        return subscriberID;
    }

    /**
     * Define el valor de la propiedad subscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberID }
     *     
     */
    public void setSubscriberID(SubscriberID value) {
        this.subscriberID = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberType.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberType }
     *     
     */
    public SubscriberType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Define el valor de la propiedad subscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberType }
     *     
     */
    public void setSubscriberType(SubscriberType value) {
        this.subscriberType = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public SubscriberTypeCode getSubscriberTypeCode() {
        return subscriberTypeCode;
    }

    /**
     * Define el valor de la propiedad subscriberTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public void setSubscriberTypeCode(SubscriberTypeCode value) {
        this.subscriberTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDeliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public TotalDeliveredQuantity getTotalDeliveredQuantity() {
        return totalDeliveredQuantity;
    }

    /**
     * Define el valor de la propiedad totalDeliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public void setTotalDeliveredQuantity(TotalDeliveredQuantity value) {
        this.totalDeliveredQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad webSiteAccess.
     * 
     * @return
     *     possible object is
     *     {@link WebSiteAccess }
     *     
     */
    public WebSiteAccess getWebSiteAccess() {
        return webSiteAccess;
    }

    /**
     * Define el valor de la propiedad webSiteAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link WebSiteAccess }
     *     
     */
    public void setWebSiteAccess(WebSiteAccess value) {
        this.webSiteAccess = value;
    }

    /**
     * Gets the value of the utilityMeters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilityMeters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilityMeters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterType }
     * 
     * 
     */
    public List<MeterType> getUtilityMeters() {
        if (utilityMeters == null) {
            utilityMeters = new ArrayList<MeterType>();
        }
        return this.utilityMeters;
    }

}
