//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ValidateProcess;
import com.picoto.jaxb.ubl.common.cbc.ValidateTool;
import com.picoto.jaxb.ubl.common.cbc.ValidateToolVersion;
import com.picoto.jaxb.ubl.common.cbc.ValidationDate;
import com.picoto.jaxb.ubl.common.cbc.ValidationResultCode;
import com.picoto.jaxb.ubl.common.cbc.ValidationTime;
import com.picoto.jaxb.ubl.common.cbc.ValidatorID;


/**
 * <p>Clase Java para ResultOfVerificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultOfVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationResultCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateProcess" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateTool" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateToolVersion" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfVerificationType", propOrder = {
    "validatorID",
    "validationResultCode",
    "validationDate",
    "validationTime",
    "validateProcess",
    "validateTool",
    "validateToolVersion",
    "signatoryParty"
})
@XmlRootElement(name = "ResultOfVerification")
public class ResultOfVerification {

    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatorID validatorID;
    @XmlElement(name = "ValidationResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationResultCode validationResultCode;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationDate validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationTime validationTime;
    @XmlElement(name = "ValidateProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateProcess validateProcess;
    @XmlElement(name = "ValidateTool", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateTool validateTool;
    @XmlElement(name = "ValidateToolVersion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateToolVersion validateToolVersion;
    @XmlElement(name = "SignatoryParty")
    protected PartyType signatoryParty;

    /**
     * Obtiene el valor de la propiedad validatorID.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorID }
     *     
     */
    public ValidatorID getValidatorID() {
        return validatorID;
    }

    /**
     * Define el valor de la propiedad validatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorID }
     *     
     */
    public void setValidatorID(ValidatorID value) {
        this.validatorID = value;
    }

    /**
     * Obtiene el valor de la propiedad validationResultCode.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultCode }
     *     
     */
    public ValidationResultCode getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Define el valor de la propiedad validationResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultCode }
     *     
     */
    public void setValidationResultCode(ValidationResultCode value) {
        this.validationResultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad validationDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDate }
     *     
     */
    public ValidationDate getValidationDate() {
        return validationDate;
    }

    /**
     * Define el valor de la propiedad validationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDate }
     *     
     */
    public void setValidationDate(ValidationDate value) {
        this.validationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad validationTime.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTime }
     *     
     */
    public ValidationTime getValidationTime() {
        return validationTime;
    }

    /**
     * Define el valor de la propiedad validationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTime }
     *     
     */
    public void setValidationTime(ValidationTime value) {
        this.validationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad validateProcess.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProcess }
     *     
     */
    public ValidateProcess getValidateProcess() {
        return validateProcess;
    }

    /**
     * Define el valor de la propiedad validateProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProcess }
     *     
     */
    public void setValidateProcess(ValidateProcess value) {
        this.validateProcess = value;
    }

    /**
     * Obtiene el valor de la propiedad validateTool.
     * 
     * @return
     *     possible object is
     *     {@link ValidateTool }
     *     
     */
    public ValidateTool getValidateTool() {
        return validateTool;
    }

    /**
     * Define el valor de la propiedad validateTool.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateTool }
     *     
     */
    public void setValidateTool(ValidateTool value) {
        this.validateTool = value;
    }

    /**
     * Obtiene el valor de la propiedad validateToolVersion.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolVersion }
     *     
     */
    public ValidateToolVersion getValidateToolVersion() {
        return validateToolVersion;
    }

    /**
     * Define el valor de la propiedad validateToolVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolVersion }
     *     
     */
    public void setValidateToolVersion(ValidateToolVersion value) {
        this.validateToolVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad signatoryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Define el valor de la propiedad signatoryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
    }

}
