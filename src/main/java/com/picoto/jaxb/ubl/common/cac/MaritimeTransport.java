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
import com.picoto.jaxb.ubl.common.cbc.GrossTonnageMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetTonnageMeasure;
import com.picoto.jaxb.ubl.common.cbc.RadioCallSignID;
import com.picoto.jaxb.ubl.common.cbc.ShipsRequirements;
import com.picoto.jaxb.ubl.common.cbc.VesselID;
import com.picoto.jaxb.ubl.common.cbc.VesselName;


/**
 * <p>Clase Java para MaritimeTransportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MaritimeTransportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RadioCallSignID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipsRequirements" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossTonnageMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetTonnageMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryCertificateDocumentReference" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryPortLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeTransportType", propOrder = {
    "vesselID",
    "vesselName",
    "radioCallSignID",
    "shipsRequirements",
    "grossTonnageMeasure",
    "netTonnageMeasure",
    "registryCertificateDocumentReference",
    "registryPortLocation"
})
@XmlRootElement(name = "MaritimeTransport")
public class MaritimeTransport {

    @XmlElement(name = "VesselID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselID vesselID;
    @XmlElement(name = "VesselName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselName vesselName;
    @XmlElement(name = "RadioCallSignID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RadioCallSignID radioCallSignID;
    @XmlElement(name = "ShipsRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ShipsRequirements> shipsRequirements;
    @XmlElement(name = "GrossTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossTonnageMeasure grossTonnageMeasure;
    @XmlElement(name = "NetTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetTonnageMeasure netTonnageMeasure;
    @XmlElement(name = "RegistryCertificateDocumentReference")
    protected DocumentReferenceType registryCertificateDocumentReference;
    @XmlElement(name = "RegistryPortLocation")
    protected LocationType registryPortLocation;

    /**
     * Obtiene el valor de la propiedad vesselID.
     * 
     * @return
     *     possible object is
     *     {@link VesselID }
     *     
     */
    public VesselID getVesselID() {
        return vesselID;
    }

    /**
     * Define el valor de la propiedad vesselID.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselID }
     *     
     */
    public void setVesselID(VesselID value) {
        this.vesselID = value;
    }

    /**
     * Obtiene el valor de la propiedad vesselName.
     * 
     * @return
     *     possible object is
     *     {@link VesselName }
     *     
     */
    public VesselName getVesselName() {
        return vesselName;
    }

    /**
     * Define el valor de la propiedad vesselName.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselName }
     *     
     */
    public void setVesselName(VesselName value) {
        this.vesselName = value;
    }

    /**
     * Obtiene el valor de la propiedad radioCallSignID.
     * 
     * @return
     *     possible object is
     *     {@link RadioCallSignID }
     *     
     */
    public RadioCallSignID getRadioCallSignID() {
        return radioCallSignID;
    }

    /**
     * Define el valor de la propiedad radioCallSignID.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCallSignID }
     *     
     */
    public void setRadioCallSignID(RadioCallSignID value) {
        this.radioCallSignID = value;
    }

    /**
     * Gets the value of the shipsRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipsRequirements }
     * 
     * 
     */
    public List<ShipsRequirements> getShipsRequirements() {
        if (shipsRequirements == null) {
            shipsRequirements = new ArrayList<ShipsRequirements>();
        }
        return this.shipsRequirements;
    }

    /**
     * Obtiene el valor de la propiedad grossTonnageMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossTonnageMeasure }
     *     
     */
    public GrossTonnageMeasure getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Define el valor de la propiedad grossTonnageMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTonnageMeasure }
     *     
     */
    public void setGrossTonnageMeasure(GrossTonnageMeasure value) {
        this.grossTonnageMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad netTonnageMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetTonnageMeasure }
     *     
     */
    public NetTonnageMeasure getNetTonnageMeasure() {
        return netTonnageMeasure;
    }

    /**
     * Define el valor de la propiedad netTonnageMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTonnageMeasure }
     *     
     */
    public void setNetTonnageMeasure(NetTonnageMeasure value) {
        this.netTonnageMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad registryCertificateDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getRegistryCertificateDocumentReference() {
        return registryCertificateDocumentReference;
    }

    /**
     * Define el valor de la propiedad registryCertificateDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setRegistryCertificateDocumentReference(DocumentReferenceType value) {
        this.registryCertificateDocumentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad registryPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRegistryPortLocation() {
        return registryPortLocation;
    }

    /**
     * Define el valor de la propiedad registryPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRegistryPortLocation(LocationType value) {
        this.registryPortLocation = value;
    }

}
