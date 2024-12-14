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
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.PreviousCancellationReasonCode;
import com.picoto.jaxb.ubl.common.cbc.ProcessReason;
import com.picoto.jaxb.ubl.common.cbc.ProcessReasonCode;


/**
 * <p>Clase Java para ProcessJustificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessJustificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousCancellationReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessJustificationType", propOrder = {
    "previousCancellationReasonCode",
    "processReasonCode",
    "processReasons",
    "descriptions"
})
@XmlRootElement(name = "ProcessJustification")
public class ProcessJustification {

    @XmlElement(name = "PreviousCancellationReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousCancellationReasonCode previousCancellationReasonCode;
    @XmlElement(name = "ProcessReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcessReasonCode processReasonCode;
    @XmlElement(name = "ProcessReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ProcessReason> processReasons;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;

    /**
     * Obtiene el valor de la propiedad previousCancellationReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCancellationReasonCode }
     *     
     */
    public PreviousCancellationReasonCode getPreviousCancellationReasonCode() {
        return previousCancellationReasonCode;
    }

    /**
     * Define el valor de la propiedad previousCancellationReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCancellationReasonCode }
     *     
     */
    public void setPreviousCancellationReasonCode(PreviousCancellationReasonCode value) {
        this.previousCancellationReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad processReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcessReasonCode }
     *     
     */
    public ProcessReasonCode getProcessReasonCode() {
        return processReasonCode;
    }

    /**
     * Define el valor de la propiedad processReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessReasonCode }
     *     
     */
    public void setProcessReasonCode(ProcessReasonCode value) {
        this.processReasonCode = value;
    }

    /**
     * Gets the value of the processReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessReason }
     * 
     * 
     */
    public List<ProcessReason> getProcessReasons() {
        if (processReasons == null) {
            processReasons = new ArrayList<ProcessReason>();
        }
        return this.processReasons;
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

}
