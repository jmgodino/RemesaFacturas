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
import com.picoto.jaxb.ubl.common.cbc.AdmissionCode;
import com.picoto.jaxb.ubl.common.cbc.ExclusionReason;
import com.picoto.jaxb.ubl.common.cbc.Resolution;
import com.picoto.jaxb.ubl.common.cbc.ResolutionDate;
import com.picoto.jaxb.ubl.common.cbc.ResolutionTime;


/**
 * <p>Clase Java para QualificationResolutionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualificationResolutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdmissionCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExclusionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Resolution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationResolutionType", propOrder = {
    "admissionCode",
    "exclusionReasons",
    "resolutions",
    "resolutionDate",
    "resolutionTime",
    "procurementProjectLot"
})
@XmlRootElement(name = "QualificationResolution")
public class QualificationResolution {

    @XmlElement(name = "AdmissionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AdmissionCode admissionCode;
    @XmlElement(name = "ExclusionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExclusionReason> exclusionReasons;
    @XmlElement(name = "Resolution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Resolution> resolutions;
    @XmlElement(name = "ResolutionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ResolutionDate resolutionDate;
    @XmlElement(name = "ResolutionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResolutionTime resolutionTime;
    @XmlElement(name = "ProcurementProjectLot")
    protected ProcurementProjectLotType procurementProjectLot;

    /**
     * Obtiene el valor de la propiedad admissionCode.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionCode }
     *     
     */
    public AdmissionCode getAdmissionCode() {
        return admissionCode;
    }

    /**
     * Define el valor de la propiedad admissionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionCode }
     *     
     */
    public void setAdmissionCode(AdmissionCode value) {
        this.admissionCode = value;
    }

    /**
     * Gets the value of the exclusionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionReason }
     * 
     * 
     */
    public List<ExclusionReason> getExclusionReasons() {
        if (exclusionReasons == null) {
            exclusionReasons = new ArrayList<ExclusionReason>();
        }
        return this.exclusionReasons;
    }

    /**
     * Gets the value of the resolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolution }
     * 
     * 
     */
    public List<Resolution> getResolutions() {
        if (resolutions == null) {
            resolutions = new ArrayList<Resolution>();
        }
        return this.resolutions;
    }

    /**
     * Obtiene el valor de la propiedad resolutionDate.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionDate }
     *     
     */
    public ResolutionDate getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Define el valor de la propiedad resolutionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionDate }
     *     
     */
    public void setResolutionDate(ResolutionDate value) {
        this.resolutionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionTime.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionTime }
     *     
     */
    public ResolutionTime getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Define el valor de la propiedad resolutionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionTime }
     *     
     */
    public void setResolutionTime(ResolutionTime value) {
        this.resolutionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementProjectLot.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public ProcurementProjectLotType getProcurementProjectLot() {
        return procurementProjectLot;
    }

    /**
     * Define el valor de la propiedad procurementProjectLot.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public void setProcurementProjectLot(ProcurementProjectLotType value) {
        this.procurementProjectLot = value;
    }

}
