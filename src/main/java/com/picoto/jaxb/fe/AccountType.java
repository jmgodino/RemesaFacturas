//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="IBAN" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMin5Max34Type"/&gt;
 *           &lt;element name="AccountNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMin5Max34Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="BankCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="BranchInSpainAddress" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AddressType" minOccurs="0"/&gt;
 *           &lt;element name="OverseasBranchAddress" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}OverseasAddressType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="BIC" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}BICType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "accountNumber",
    "iban",
    "bankCode",
    "branchCode",
    "overseasBranchAddress",
    "branchInSpainAddress",
    "bic"
})
public class AccountType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "OverseasBranchAddress")
    protected OverseasAddressType overseasBranchAddress;
    @XmlElement(name = "BranchInSpainAddress")
    protected AddressType branchInSpainAddress;
    @XmlElement(name = "BIC")
    protected String bic;

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Define el valor de la propiedad iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad branchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Define el valor de la propiedad branchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Obtiene el valor de la propiedad overseasBranchAddress.
     * 
     * @return
     *     possible object is
     *     {@link OverseasAddressType }
     *     
     */
    public OverseasAddressType getOverseasBranchAddress() {
        return overseasBranchAddress;
    }

    /**
     * Define el valor de la propiedad overseasBranchAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasAddressType }
     *     
     */
    public void setOverseasBranchAddress(OverseasAddressType value) {
        this.overseasBranchAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad branchInSpainAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBranchInSpainAddress() {
        return branchInSpainAddress;
    }

    /**
     * Define el valor de la propiedad branchInSpainAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBranchInSpainAddress(AddressType value) {
        this.branchInSpainAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Define el valor de la propiedad bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

}
