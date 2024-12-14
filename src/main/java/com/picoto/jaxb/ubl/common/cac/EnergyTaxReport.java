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
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyBalanceAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyOnAccountAmount;


/**
 * <p>Clase Java para EnergyTaxReportType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnergyTaxReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyOnAccountAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyBalanceAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyTaxReportType", propOrder = {
    "taxEnergyAmount",
    "taxEnergyOnAccountAmount",
    "taxEnergyBalanceAmount",
    "taxScheme"
})
@XmlRootElement(name = "EnergyTaxReport")
public class EnergyTaxReport {

    @XmlElement(name = "TaxEnergyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyAmount taxEnergyAmount;
    @XmlElement(name = "TaxEnergyOnAccountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyOnAccountAmount taxEnergyOnAccountAmount;
    @XmlElement(name = "TaxEnergyBalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyBalanceAmount taxEnergyBalanceAmount;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxScheme taxScheme;

    /**
     * Obtiene el valor de la propiedad taxEnergyAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyAmount }
     *     
     */
    public TaxEnergyAmount getTaxEnergyAmount() {
        return taxEnergyAmount;
    }

    /**
     * Define el valor de la propiedad taxEnergyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyAmount }
     *     
     */
    public void setTaxEnergyAmount(TaxEnergyAmount value) {
        this.taxEnergyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxEnergyOnAccountAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyOnAccountAmount }
     *     
     */
    public TaxEnergyOnAccountAmount getTaxEnergyOnAccountAmount() {
        return taxEnergyOnAccountAmount;
    }

    /**
     * Define el valor de la propiedad taxEnergyOnAccountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyOnAccountAmount }
     *     
     */
    public void setTaxEnergyOnAccountAmount(TaxEnergyOnAccountAmount value) {
        this.taxEnergyOnAccountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxEnergyBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyBalanceAmount }
     *     
     */
    public TaxEnergyBalanceAmount getTaxEnergyBalanceAmount() {
        return taxEnergyBalanceAmount;
    }

    /**
     * Define el valor de la propiedad taxEnergyBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyBalanceAmount }
     *     
     */
    public void setTaxEnergyBalanceAmount(TaxEnergyBalanceAmount value) {
        this.taxEnergyBalanceAmount = value;
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
