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
import com.picoto.jaxb.ubl.common.cbc.BarcodeSymbologyID;
import com.picoto.jaxb.ubl.common.cbc.ExtendedID;
import com.picoto.jaxb.ubl.common.cbc.ID;


/**
 * <p>Clase Java para ItemIdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExtendedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BarcodeSymbologyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIdentificationType", propOrder = {
    "id",
    "extendedID",
    "barcodeSymbologyID",
    "physicalAttributes",
    "measurementDimensions",
    "issuerParty"
})
public class ItemIdentificationType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "ExtendedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExtendedID extendedID;
    @XmlElement(name = "BarcodeSymbologyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BarcodeSymbologyID barcodeSymbologyID;
    @XmlElement(name = "PhysicalAttribute")
    protected List<PhysicalAttribute> physicalAttributes;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "IssuerParty")
    protected PartyType issuerParty;

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
     * Obtiene el valor de la propiedad extendedID.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedID }
     *     
     */
    public ExtendedID getExtendedID() {
        return extendedID;
    }

    /**
     * Define el valor de la propiedad extendedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedID }
     *     
     */
    public void setExtendedID(ExtendedID value) {
        this.extendedID = value;
    }

    /**
     * Obtiene el valor de la propiedad barcodeSymbologyID.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyID }
     *     
     */
    public BarcodeSymbologyID getBarcodeSymbologyID() {
        return barcodeSymbologyID;
    }

    /**
     * Define el valor de la propiedad barcodeSymbologyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyID }
     *     
     */
    public void setBarcodeSymbologyID(BarcodeSymbologyID value) {
        this.barcodeSymbologyID = value;
    }

    /**
     * Gets the value of the physicalAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAttribute }
     * 
     * 
     */
    public List<PhysicalAttribute> getPhysicalAttributes() {
        if (physicalAttributes == null) {
            physicalAttributes = new ArrayList<PhysicalAttribute>();
        }
        return this.physicalAttributes;
    }

    /**
     * Gets the value of the measurementDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimensions() {
        if (measurementDimensions == null) {
            measurementDimensions = new ArrayList<DimensionType>();
        }
        return this.measurementDimensions;
    }

    /**
     * Obtiene el valor de la propiedad issuerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Define el valor de la propiedad issuerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

}
