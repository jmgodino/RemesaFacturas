//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.MaximumCopiesNumeric;
import com.picoto.jaxb.ubl.common.cbc.PrintQualifier;


/**
 * <p>Clase Java para DocumentDistributionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrintQualifier"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumCopiesNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDistributionType", propOrder = {
    "printQualifier",
    "maximumCopiesNumeric",
    "party"
})
@XmlRootElement(name = "DocumentDistribution")
public class DocumentDistribution {

    @XmlElement(name = "PrintQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrintQualifier printQualifier;
    @XmlElement(name = "MaximumCopiesNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected MaximumCopiesNumeric maximumCopiesNumeric;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;

    /**
     * Obtiene el valor de la propiedad printQualifier.
     * 
     * @return
     *     possible object is
     *     {@link PrintQualifier }
     *     
     */
    public PrintQualifier getPrintQualifier() {
        return printQualifier;
    }

    /**
     * Define el valor de la propiedad printQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintQualifier }
     *     
     */
    public void setPrintQualifier(PrintQualifier value) {
        this.printQualifier = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumCopiesNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumCopiesNumeric }
     *     
     */
    public MaximumCopiesNumeric getMaximumCopiesNumeric() {
        return maximumCopiesNumeric;
    }

    /**
     * Define el valor de la propiedad maximumCopiesNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumCopiesNumeric }
     *     
     */
    public void setMaximumCopiesNumeric(MaximumCopiesNumeric value) {
        this.maximumCopiesNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Define el valor de la propiedad party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

}
