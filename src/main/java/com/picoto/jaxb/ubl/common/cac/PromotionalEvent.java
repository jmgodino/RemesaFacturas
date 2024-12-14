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
import com.picoto.jaxb.ubl.common.cbc.FirstShipmentAvailibilityDate;
import com.picoto.jaxb.ubl.common.cbc.LatestProposalAcceptanceDate;
import com.picoto.jaxb.ubl.common.cbc.PromotionalEventTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SubmissionDate;


/**
 * <p>Clase Java para PromotionalEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PromotionalEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstShipmentAvailibilityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestProposalAcceptanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalEventType", propOrder = {
    "promotionalEventTypeCode",
    "submissionDate",
    "firstShipmentAvailibilityDate",
    "latestProposalAcceptanceDate",
    "promotionalSpecifications"
})
@XmlRootElement(name = "PromotionalEvent")
public class PromotionalEvent {

    @XmlElement(name = "PromotionalEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PromotionalEventTypeCode promotionalEventTypeCode;
    @XmlElement(name = "SubmissionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionDate submissionDate;
    @XmlElement(name = "FirstShipmentAvailibilityDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FirstShipmentAvailibilityDate firstShipmentAvailibilityDate;
    @XmlElement(name = "LatestProposalAcceptanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestProposalAcceptanceDate latestProposalAcceptanceDate;
    @XmlElement(name = "PromotionalSpecification", required = true)
    protected List<PromotionalSpecification> promotionalSpecifications;

    /**
     * Obtiene el valor de la propiedad promotionalEventTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalEventTypeCode }
     *     
     */
    public PromotionalEventTypeCode getPromotionalEventTypeCode() {
        return promotionalEventTypeCode;
    }

    /**
     * Define el valor de la propiedad promotionalEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalEventTypeCode }
     *     
     */
    public void setPromotionalEventTypeCode(PromotionalEventTypeCode value) {
        this.promotionalEventTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad submissionDate.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionDate }
     *     
     */
    public SubmissionDate getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Define el valor de la propiedad submissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionDate }
     *     
     */
    public void setSubmissionDate(SubmissionDate value) {
        this.submissionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad firstShipmentAvailibilityDate.
     * 
     * @return
     *     possible object is
     *     {@link FirstShipmentAvailibilityDate }
     *     
     */
    public FirstShipmentAvailibilityDate getFirstShipmentAvailibilityDate() {
        return firstShipmentAvailibilityDate;
    }

    /**
     * Define el valor de la propiedad firstShipmentAvailibilityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstShipmentAvailibilityDate }
     *     
     */
    public void setFirstShipmentAvailibilityDate(FirstShipmentAvailibilityDate value) {
        this.firstShipmentAvailibilityDate = value;
    }

    /**
     * Obtiene el valor de la propiedad latestProposalAcceptanceDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestProposalAcceptanceDate }
     *     
     */
    public LatestProposalAcceptanceDate getLatestProposalAcceptanceDate() {
        return latestProposalAcceptanceDate;
    }

    /**
     * Define el valor de la propiedad latestProposalAcceptanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestProposalAcceptanceDate }
     *     
     */
    public void setLatestProposalAcceptanceDate(LatestProposalAcceptanceDate value) {
        this.latestProposalAcceptanceDate = value;
    }

    /**
     * Gets the value of the promotionalSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSpecification }
     * 
     * 
     */
    public List<PromotionalSpecification> getPromotionalSpecifications() {
        if (promotionalSpecifications == null) {
            promotionalSpecifications = new ArrayList<PromotionalSpecification>();
        }
        return this.promotionalSpecifications;
    }

}
