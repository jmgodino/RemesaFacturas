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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AttributeID;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.MaximumMeasure;
import com.picoto.jaxb.ubl.common.cbc.Measure;
import com.picoto.jaxb.ubl.common.cbc.MinimumMeasure;


/**
 * <p>Clase Java para DimensionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AttributeID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Measure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "attributeID",
    "measure",
    "descriptions",
    "minimumMeasure",
    "maximumMeasure"
})
public class DimensionType {

    @XmlElement(name = "AttributeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AttributeID attributeID;
    @XmlElement(name = "Measure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Measure measure;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "MinimumMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumMeasure minimumMeasure;
    @XmlElement(name = "MaximumMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumMeasure maximumMeasure;

    /**
     * Obtiene el valor de la propiedad attributeID.
     * 
     * @return
     *     possible object is
     *     {@link AttributeID }
     *     
     */
    public AttributeID getAttributeID() {
        return attributeID;
    }

    /**
     * Define el valor de la propiedad attributeID.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeID }
     *     
     */
    public void setAttributeID(AttributeID value) {
        this.attributeID = value;
    }

    /**
     * Obtiene el valor de la propiedad measure.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Define el valor de la propiedad measure.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setMeasure(Measure value) {
        this.measure = value;
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
     * Obtiene el valor de la propiedad minimumMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MinimumMeasure }
     *     
     */
    public MinimumMeasure getMinimumMeasure() {
        return minimumMeasure;
    }

    /**
     * Define el valor de la propiedad minimumMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumMeasure }
     *     
     */
    public void setMinimumMeasure(MinimumMeasure value) {
        this.minimumMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MaximumMeasure }
     *     
     */
    public MaximumMeasure getMaximumMeasure() {
        return maximumMeasure;
    }

    /**
     * Define el valor de la propiedad maximumMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumMeasure }
     *     
     */
    public void setMaximumMeasure(MaximumMeasure value) {
        this.maximumMeasure = value;
    }

}
