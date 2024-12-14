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
import com.picoto.jaxb.ubl.common.cbc.EmergencyProceduresCode;
import com.picoto.jaxb.ubl.common.cbc.Extension;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.PlacardEndorsement;
import com.picoto.jaxb.ubl.common.cbc.PlacardNotation;


/**
 * <p>Clase Java para SecondaryHazardType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecondaryHazardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryHazardType", propOrder = {
    "id",
    "placardNotation",
    "placardEndorsement",
    "emergencyProceduresCode",
    "extensions"
})
@XmlRootElement(name = "SecondaryHazard")
public class SecondaryHazard {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardNotation placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlacardEndorsement placardEndorsement;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EmergencyProceduresCode emergencyProceduresCode;
    @XmlElement(name = "Extension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Extension> extensions;

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
     * Obtiene el valor de la propiedad placardNotation.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotation }
     *     
     */
    public PlacardNotation getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Define el valor de la propiedad placardNotation.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotation }
     *     
     */
    public void setPlacardNotation(PlacardNotation value) {
        this.placardNotation = value;
    }

    /**
     * Obtiene el valor de la propiedad placardEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsement }
     *     
     */
    public PlacardEndorsement getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Define el valor de la propiedad placardEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsement }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsement value) {
        this.placardEndorsement = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencyProceduresCode.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public EmergencyProceduresCode getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Define el valor de la propiedad emergencyProceduresCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCode value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

}
