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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AllowanceTotalAmount;
import com.picoto.jaxb.ubl.common.cbc.ChargeTotalAmount;
import com.picoto.jaxb.ubl.common.cbc.LineExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableAlternativeAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableRoundingAmount;
import com.picoto.jaxb.ubl.common.cbc.PrepaidAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxInclusiveAmount;


/**
 * <p>Clase Java para MonetaryTotalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MonetaryTotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExclusiveAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceTotalAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeTotalAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableRoundingAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAmount"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAlternativeAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryTotalType", propOrder = {
    "lineExtensionAmount",
    "taxExclusiveAmount",
    "taxInclusiveAmount",
    "allowanceTotalAmount",
    "chargeTotalAmount",
    "prepaidAmount",
    "payableRoundingAmount",
    "payableAmount",
    "payableAlternativeAmount"
})
public class MonetaryTotalType {

    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineExtensionAmount lineExtensionAmount;
    @XmlElement(name = "TaxExclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxExclusiveAmount taxExclusiveAmount;
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxInclusiveAmount taxInclusiveAmount;
    @XmlElement(name = "AllowanceTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AllowanceTotalAmount allowanceTotalAmount;
    @XmlElement(name = "ChargeTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeTotalAmount chargeTotalAmount;
    @XmlElement(name = "PrepaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidAmount prepaidAmount;
    @XmlElement(name = "PayableRoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayableRoundingAmount payableRoundingAmount;
    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PayableAmount payableAmount;
    @XmlElement(name = "PayableAlternativeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayableAlternativeAmount payableAlternativeAmount;

    /**
     * Obtiene el valor de la propiedad lineExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmount }
     *     
     */
    public LineExtensionAmount getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Define el valor de la propiedad lineExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmount }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmount value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxExclusiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxExclusiveAmount }
     *     
     */
    public TaxExclusiveAmount getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    /**
     * Define el valor de la propiedad taxExclusiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExclusiveAmount }
     *     
     */
    public void setTaxExclusiveAmount(TaxExclusiveAmount value) {
        this.taxExclusiveAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxInclusiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusiveAmount }
     *     
     */
    public TaxInclusiveAmount getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    /**
     * Define el valor de la propiedad taxInclusiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusiveAmount }
     *     
     */
    public void setTaxInclusiveAmount(TaxInclusiveAmount value) {
        this.taxInclusiveAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad allowanceTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceTotalAmount }
     *     
     */
    public AllowanceTotalAmount getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    /**
     * Define el valor de la propiedad allowanceTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceTotalAmount }
     *     
     */
    public void setAllowanceTotalAmount(AllowanceTotalAmount value) {
        this.allowanceTotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTotalAmount }
     *     
     */
    public ChargeTotalAmount getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    /**
     * Define el valor de la propiedad chargeTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTotalAmount }
     *     
     */
    public void setChargeTotalAmount(ChargeTotalAmount value) {
        this.chargeTotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidAmount.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAmount }
     *     
     */
    public PrepaidAmount getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Define el valor de la propiedad prepaidAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAmount }
     *     
     */
    public void setPrepaidAmount(PrepaidAmount value) {
        this.prepaidAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payableRoundingAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableRoundingAmount }
     *     
     */
    public PayableRoundingAmount getPayableRoundingAmount() {
        return payableRoundingAmount;
    }

    /**
     * Define el valor de la propiedad payableRoundingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableRoundingAmount }
     *     
     */
    public void setPayableRoundingAmount(PayableRoundingAmount value) {
        this.payableRoundingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payableAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableAmount }
     *     
     */
    public PayableAmount getPayableAmount() {
        return payableAmount;
    }

    /**
     * Define el valor de la propiedad payableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAmount }
     *     
     */
    public void setPayableAmount(PayableAmount value) {
        this.payableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payableAlternativeAmount.
     * 
     * @return
     *     possible object is
     *     {@link PayableAlternativeAmount }
     *     
     */
    public PayableAlternativeAmount getPayableAlternativeAmount() {
        return payableAlternativeAmount;
    }

    /**
     * Define el valor de la propiedad payableAlternativeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAlternativeAmount }
     *     
     */
    public void setPayableAlternativeAmount(PayableAlternativeAmount value) {
        this.payableAlternativeAmount = value;
    }

}
