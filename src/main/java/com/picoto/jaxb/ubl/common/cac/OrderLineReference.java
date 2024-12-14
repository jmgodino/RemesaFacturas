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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.LineID;
import com.picoto.jaxb.ubl.common.cbc.LineStatusCode;
import com.picoto.jaxb.ubl.common.cbc.SalesOrderLineID;
import com.picoto.jaxb.ubl.common.cbc.UUID;


/**
 * <p>Clase Java para OrderLineReferenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderLineReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderLineID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineReferenceType", propOrder = {
    "lineID",
    "salesOrderLineID",
    "uuid",
    "lineStatusCode",
    "orderReference"
})
@XmlRootElement(name = "OrderLineReference")
public class OrderLineReference {

    @XmlElement(name = "LineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineID lineID;
    @XmlElement(name = "SalesOrderLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SalesOrderLineID salesOrderLineID;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineStatusCode lineStatusCode;
    @XmlElement(name = "OrderReference")
    protected OrderReference orderReference;

    /**
     * Obtiene el valor de la propiedad lineID.
     * 
     * @return
     *     possible object is
     *     {@link LineID }
     *     
     */
    public LineID getLineID() {
        return lineID;
    }

    /**
     * Define el valor de la propiedad lineID.
     * 
     * @param value
     *     allowed object is
     *     {@link LineID }
     *     
     */
    public void setLineID(LineID value) {
        this.lineID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrderLineID.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderLineID }
     *     
     */
    public SalesOrderLineID getSalesOrderLineID() {
        return salesOrderLineID;
    }

    /**
     * Define el valor de la propiedad salesOrderLineID.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderLineID }
     *     
     */
    public void setSalesOrderLineID(SalesOrderLineID value) {
        this.salesOrderLineID = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCode }
     *     
     */
    public LineStatusCode getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Define el valor de la propiedad lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCode }
     *     
     */
    public void setLineStatusCode(LineStatusCode value) {
        this.lineStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad orderReference.
     * 
     * @return
     *     possible object is
     *     {@link OrderReference }
     *     
     */
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Define el valor de la propiedad orderReference.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReference }
     *     
     */
    public void setOrderReference(OrderReference value) {
        this.orderReference = value;
    }

}
