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
import com.picoto.jaxb.ubl.common.cbc.MaximumNumberNumeric;
import com.picoto.jaxb.ubl.common.cbc.MinimumNumberNumeric;
import com.picoto.jaxb.ubl.common.cbc.OptionsDescription;


/**
 * <p>Clase Java para ContractExtensionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OptionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Renewal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractExtensionType", propOrder = {
    "optionsDescriptions",
    "minimumNumberNumeric",
    "maximumNumberNumeric",
    "optionValidityPeriod",
    "renewals"
})
@XmlRootElement(name = "ContractExtension")
public class ContractExtension {

    @XmlElement(name = "OptionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<OptionsDescription> optionsDescriptions;
    @XmlElement(name = "MinimumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumNumberNumeric minimumNumberNumeric;
    @XmlElement(name = "MaximumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumNumberNumeric maximumNumberNumeric;
    @XmlElement(name = "OptionValidityPeriod")
    protected PeriodType optionValidityPeriod;
    @XmlElement(name = "Renewal")
    protected List<Renewal> renewals;

    /**
     * Gets the value of the optionsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionsDescription }
     * 
     * 
     */
    public List<OptionsDescription> getOptionsDescriptions() {
        if (optionsDescriptions == null) {
            optionsDescriptions = new ArrayList<OptionsDescription>();
        }
        return this.optionsDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad minimumNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MinimumNumberNumeric }
     *     
     */
    public MinimumNumberNumeric getMinimumNumberNumeric() {
        return minimumNumberNumeric;
    }

    /**
     * Define el valor de la propiedad minimumNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumNumberNumeric }
     *     
     */
    public void setMinimumNumberNumeric(MinimumNumberNumeric value) {
        this.minimumNumberNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberNumeric }
     *     
     */
    public MaximumNumberNumeric getMaximumNumberNumeric() {
        return maximumNumberNumeric;
    }

    /**
     * Define el valor de la propiedad maximumNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberNumeric }
     *     
     */
    public void setMaximumNumberNumeric(MaximumNumberNumeric value) {
        this.maximumNumberNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad optionValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getOptionValidityPeriod() {
        return optionValidityPeriod;
    }

    /**
     * Define el valor de la propiedad optionValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setOptionValidityPeriod(PeriodType value) {
        this.optionValidityPeriod = value;
    }

    /**
     * Gets the value of the renewals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renewals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenewals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Renewal }
     * 
     * 
     */
    public List<Renewal> getRenewals() {
        if (renewals == null) {
            renewals = new ArrayList<Renewal>();
        }
        return this.renewals;
    }

}
