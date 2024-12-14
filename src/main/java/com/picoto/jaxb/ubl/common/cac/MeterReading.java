//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.DeliveredQuantity;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterQuantity;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingDate;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingMethod;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingMethodCode;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingComments;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingType;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterQuantity;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingDate;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingMethod;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingMethodCode;


/**
 * <p>Clase Java para MeterReadingType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingComments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingType", propOrder = {
    "id",
    "meterReadingType",
    "meterReadingTypeCode",
    "previousMeterReadingDate",
    "previousMeterQuantity",
    "latestMeterReadingDate",
    "latestMeterQuantity",
    "previousMeterReadingMethod",
    "previousMeterReadingMethodCode",
    "latestMeterReadingMethod",
    "latestMeterReadingMethodCode",
    "meterReadingComments",
    "deliveredQuantity"
})
@XmlRootElement(name = "MeterReading")
public class MeterReading {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "MeterReadingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterReadingType meterReadingType;
    @XmlElement(name = "MeterReadingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterReadingTypeCode meterReadingTypeCode;
    @XmlElement(name = "PreviousMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PreviousMeterReadingDate previousMeterReadingDate;
    @XmlElement(name = "PreviousMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PreviousMeterQuantity previousMeterQuantity;
    @XmlElement(name = "LatestMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LatestMeterReadingDate latestMeterReadingDate;
    @XmlElement(name = "LatestMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LatestMeterQuantity latestMeterQuantity;
    @XmlElement(name = "PreviousMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousMeterReadingMethod previousMeterReadingMethod;
    @XmlElement(name = "PreviousMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousMeterReadingMethodCode previousMeterReadingMethodCode;
    @XmlElement(name = "LatestMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestMeterReadingMethod latestMeterReadingMethod;
    @XmlElement(name = "LatestMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestMeterReadingMethodCode latestMeterReadingMethodCode;
    @XmlElement(name = "MeterReadingComments", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<MeterReadingComments> meterReadingComments;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DeliveredQuantity deliveredQuantity;

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
     * Obtiene el valor de la propiedad meterReadingType.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingType }
     *     
     */
    public MeterReadingType getMeterReadingType() {
        return meterReadingType;
    }

    /**
     * Define el valor de la propiedad meterReadingType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingType }
     *     
     */
    public void setMeterReadingType(MeterReadingType value) {
        this.meterReadingType = value;
    }

    /**
     * Obtiene el valor de la propiedad meterReadingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingTypeCode }
     *     
     */
    public MeterReadingTypeCode getMeterReadingTypeCode() {
        return meterReadingTypeCode;
    }

    /**
     * Define el valor de la propiedad meterReadingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingTypeCode }
     *     
     */
    public void setMeterReadingTypeCode(MeterReadingTypeCode value) {
        this.meterReadingTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad previousMeterReadingDate.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingDate }
     *     
     */
    public PreviousMeterReadingDate getPreviousMeterReadingDate() {
        return previousMeterReadingDate;
    }

    /**
     * Define el valor de la propiedad previousMeterReadingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingDate }
     *     
     */
    public void setPreviousMeterReadingDate(PreviousMeterReadingDate value) {
        this.previousMeterReadingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad previousMeterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterQuantity }
     *     
     */
    public PreviousMeterQuantity getPreviousMeterQuantity() {
        return previousMeterQuantity;
    }

    /**
     * Define el valor de la propiedad previousMeterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterQuantity }
     *     
     */
    public void setPreviousMeterQuantity(PreviousMeterQuantity value) {
        this.previousMeterQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad latestMeterReadingDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingDate }
     *     
     */
    public LatestMeterReadingDate getLatestMeterReadingDate() {
        return latestMeterReadingDate;
    }

    /**
     * Define el valor de la propiedad latestMeterReadingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingDate }
     *     
     */
    public void setLatestMeterReadingDate(LatestMeterReadingDate value) {
        this.latestMeterReadingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad latestMeterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterQuantity }
     *     
     */
    public LatestMeterQuantity getLatestMeterQuantity() {
        return latestMeterQuantity;
    }

    /**
     * Define el valor de la propiedad latestMeterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterQuantity }
     *     
     */
    public void setLatestMeterQuantity(LatestMeterQuantity value) {
        this.latestMeterQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad previousMeterReadingMethod.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethod }
     *     
     */
    public PreviousMeterReadingMethod getPreviousMeterReadingMethod() {
        return previousMeterReadingMethod;
    }

    /**
     * Define el valor de la propiedad previousMeterReadingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethod }
     *     
     */
    public void setPreviousMeterReadingMethod(PreviousMeterReadingMethod value) {
        this.previousMeterReadingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad previousMeterReadingMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethodCode }
     *     
     */
    public PreviousMeterReadingMethodCode getPreviousMeterReadingMethodCode() {
        return previousMeterReadingMethodCode;
    }

    /**
     * Define el valor de la propiedad previousMeterReadingMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethodCode }
     *     
     */
    public void setPreviousMeterReadingMethodCode(PreviousMeterReadingMethodCode value) {
        this.previousMeterReadingMethodCode = value;
    }

    /**
     * Obtiene el valor de la propiedad latestMeterReadingMethod.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethod }
     *     
     */
    public LatestMeterReadingMethod getLatestMeterReadingMethod() {
        return latestMeterReadingMethod;
    }

    /**
     * Define el valor de la propiedad latestMeterReadingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethod }
     *     
     */
    public void setLatestMeterReadingMethod(LatestMeterReadingMethod value) {
        this.latestMeterReadingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad latestMeterReadingMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethodCode }
     *     
     */
    public LatestMeterReadingMethodCode getLatestMeterReadingMethodCode() {
        return latestMeterReadingMethodCode;
    }

    /**
     * Define el valor de la propiedad latestMeterReadingMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethodCode }
     *     
     */
    public void setLatestMeterReadingMethodCode(LatestMeterReadingMethodCode value) {
        this.latestMeterReadingMethodCode = value;
    }

    /**
     * Gets the value of the meterReadingComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReadingComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReadingComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReadingComments }
     * 
     * 
     */
    public List<MeterReadingComments> getMeterReadingComments() {
        if (meterReadingComments == null) {
            meterReadingComments = new ArrayList<MeterReadingComments>();
        }
        return this.meterReadingComments;
    }

    /**
     * Obtiene el valor de la propiedad deliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantity }
     *     
     */
    public DeliveredQuantity getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Define el valor de la propiedad deliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantity }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantity value) {
        this.deliveredQuantity = value;
    }

}
