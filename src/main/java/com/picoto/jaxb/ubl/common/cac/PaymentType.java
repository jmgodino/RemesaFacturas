//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InstructionID;
import com.picoto.jaxb.ubl.common.cbc.PaidAmount;
import com.picoto.jaxb.ubl.common.cbc.PaidDate;
import com.picoto.jaxb.ubl.common.cbc.PaidTime;
import com.picoto.jaxb.ubl.common.cbc.ReceivedDate;


/**
 * <p>Clase Java para PaymentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "id",
    "paidAmount",
    "receivedDate",
    "paidDate",
    "paidTime",
    "instructionID"
})
public class PaymentType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "PaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaidAmount paidAmount;
    @XmlElement(name = "ReceivedDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedDate receivedDate;
    @XmlElement(name = "PaidDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaidDate paidDate;
    @XmlElement(name = "PaidTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaidTime paidTime;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstructionID instructionID;

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
     * Obtiene el valor de la propiedad paidAmount.
     * 
     * @return
     *     possible object is
     *     {@link PaidAmount }
     *     
     */
    public PaidAmount getPaidAmount() {
        return paidAmount;
    }

    /**
     * Define el valor de la propiedad paidAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidAmount }
     *     
     */
    public void setPaidAmount(PaidAmount value) {
        this.paidAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad receivedDate.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedDate }
     *     
     */
    public ReceivedDate getReceivedDate() {
        return receivedDate;
    }

    /**
     * Define el valor de la propiedad receivedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedDate }
     *     
     */
    public void setReceivedDate(ReceivedDate value) {
        this.receivedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paidDate.
     * 
     * @return
     *     possible object is
     *     {@link PaidDate }
     *     
     */
    public PaidDate getPaidDate() {
        return paidDate;
    }

    /**
     * Define el valor de la propiedad paidDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidDate }
     *     
     */
    public void setPaidDate(PaidDate value) {
        this.paidDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paidTime.
     * 
     * @return
     *     possible object is
     *     {@link PaidTime }
     *     
     */
    public PaidTime getPaidTime() {
        return paidTime;
    }

    /**
     * Define el valor de la propiedad paidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidTime }
     *     
     */
    public void setPaidTime(PaidTime value) {
        this.paidTime = value;
    }

    /**
     * Obtiene el valor de la propiedad instructionID.
     * 
     * @return
     *     possible object is
     *     {@link InstructionID }
     *     
     */
    public InstructionID getInstructionID() {
        return instructionID;
    }

    /**
     * Define el valor de la propiedad instructionID.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionID }
     *     
     */
    public void setInstructionID(InstructionID value) {
        this.instructionID = value;
    }

}
