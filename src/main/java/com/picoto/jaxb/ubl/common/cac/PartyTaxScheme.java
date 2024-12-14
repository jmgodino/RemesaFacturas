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
import com.picoto.jaxb.ubl.common.cbc.CompanyID;
import com.picoto.jaxb.ubl.common.cbc.ExemptionReason;
import com.picoto.jaxb.ubl.common.cbc.ExemptionReasonCode;
import com.picoto.jaxb.ubl.common.cbc.RegistrationName;
import com.picoto.jaxb.ubl.common.cbc.TaxLevelCode;


/**
 * <p>Clase Java para PartyTaxSchemeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyTaxSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxSchemeType", propOrder = {
    "registrationName",
    "companyID",
    "taxLevelCode",
    "exemptionReasonCode",
    "exemptionReasons",
    "registrationAddress",
    "taxScheme"
})
@XmlRootElement(name = "PartyTaxScheme")
public class PartyTaxScheme {

    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationName registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyID companyID;
    @XmlElement(name = "TaxLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxLevelCode taxLevelCode;
    @XmlElement(name = "ExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExemptionReasonCode exemptionReasonCode;
    @XmlElement(name = "ExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExemptionReason> exemptionReasons;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxScheme taxScheme;

    /**
     * Obtiene el valor de la propiedad registrationName.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationName }
     *     
     */
    public RegistrationName getRegistrationName() {
        return registrationName;
    }

    /**
     * Define el valor de la propiedad registrationName.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationName }
     *     
     */
    public void setRegistrationName(RegistrationName value) {
        this.registrationName = value;
    }

    /**
     * Obtiene el valor de la propiedad companyID.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getCompanyID() {
        return companyID;
    }

    /**
     * Define el valor de la propiedad companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setCompanyID(CompanyID value) {
        this.companyID = value;
    }

    /**
     * Obtiene el valor de la propiedad taxLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxLevelCode }
     *     
     */
    public TaxLevelCode getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * Define el valor de la propiedad taxLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLevelCode }
     *     
     */
    public void setTaxLevelCode(TaxLevelCode value) {
        this.taxLevelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReasonCode }
     *     
     */
    public ExemptionReasonCode getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * Define el valor de la propiedad exemptionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReasonCode }
     *     
     */
    public void setExemptionReasonCode(ExemptionReasonCode value) {
        this.exemptionReasonCode = value;
    }

    /**
     * Gets the value of the exemptionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionReason }
     * 
     * 
     */
    public List<ExemptionReason> getExemptionReasons() {
        if (exemptionReasons == null) {
            exemptionReasons = new ArrayList<ExemptionReason>();
        }
        return this.exemptionReasons;
    }

    /**
     * Obtiene el valor de la propiedad registrationAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Define el valor de la propiedad registrationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad taxScheme.
     * 
     * @return
     *     possible object is
     *     {@link TaxScheme }
     *     
     */
    public TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Define el valor de la propiedad taxScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxScheme }
     *     
     */
    public void setTaxScheme(TaxScheme value) {
        this.taxScheme = value;
    }

}
