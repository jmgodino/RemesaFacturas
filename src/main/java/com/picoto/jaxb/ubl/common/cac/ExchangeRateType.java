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
import com.picoto.jaxb.ubl.common.cbc.CalculationRate;
import com.picoto.jaxb.ubl.common.cbc.Date;
import com.picoto.jaxb.ubl.common.cbc.ExchangeMarketID;
import com.picoto.jaxb.ubl.common.cbc.MathematicOperatorCode;
import com.picoto.jaxb.ubl.common.cbc.SourceCurrencyBaseRate;
import com.picoto.jaxb.ubl.common.cbc.SourceCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.TargetCurrencyBaseRate;
import com.picoto.jaxb.ubl.common.cbc.TargetCurrencyCode;


/**
 * <p>Clase Java para ExchangeRateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangeMarketID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MathematicOperatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForeignExchangeContract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateType", propOrder = {
    "sourceCurrencyCode",
    "sourceCurrencyBaseRate",
    "targetCurrencyCode",
    "targetCurrencyBaseRate",
    "exchangeMarketID",
    "calculationRate",
    "mathematicOperatorCode",
    "date",
    "foreignExchangeContract"
})
public class ExchangeRateType {

    @XmlElement(name = "SourceCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceCurrencyCode sourceCurrencyCode;
    @XmlElement(name = "SourceCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SourceCurrencyBaseRate sourceCurrencyBaseRate;
    @XmlElement(name = "TargetCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TargetCurrencyCode targetCurrencyCode;
    @XmlElement(name = "TargetCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetCurrencyBaseRate targetCurrencyBaseRate;
    @XmlElement(name = "ExchangeMarketID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExchangeMarketID exchangeMarketID;
    @XmlElement(name = "CalculationRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationRate calculationRate;
    @XmlElement(name = "MathematicOperatorCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MathematicOperatorCode mathematicOperatorCode;
    @XmlElement(name = "Date", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Date date;
    @XmlElement(name = "ForeignExchangeContract")
    protected ContractType foreignExchangeContract;

    /**
     * Obtiene el valor de la propiedad sourceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyCode }
     *     
     */
    public SourceCurrencyCode getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Define el valor de la propiedad sourceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyCode }
     *     
     */
    public void setSourceCurrencyCode(SourceCurrencyCode value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceCurrencyBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyBaseRate }
     *     
     */
    public SourceCurrencyBaseRate getSourceCurrencyBaseRate() {
        return sourceCurrencyBaseRate;
    }

    /**
     * Define el valor de la propiedad sourceCurrencyBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyBaseRate }
     *     
     */
    public void setSourceCurrencyBaseRate(SourceCurrencyBaseRate value) {
        this.sourceCurrencyBaseRate = value;
    }

    /**
     * Obtiene el valor de la propiedad targetCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyCode }
     *     
     */
    public TargetCurrencyCode getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Define el valor de la propiedad targetCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyCode }
     *     
     */
    public void setTargetCurrencyCode(TargetCurrencyCode value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad targetCurrencyBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyBaseRate }
     *     
     */
    public TargetCurrencyBaseRate getTargetCurrencyBaseRate() {
        return targetCurrencyBaseRate;
    }

    /**
     * Define el valor de la propiedad targetCurrencyBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyBaseRate }
     *     
     */
    public void setTargetCurrencyBaseRate(TargetCurrencyBaseRate value) {
        this.targetCurrencyBaseRate = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeMarketID.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMarketID }
     *     
     */
    public ExchangeMarketID getExchangeMarketID() {
        return exchangeMarketID;
    }

    /**
     * Define el valor de la propiedad exchangeMarketID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMarketID }
     *     
     */
    public void setExchangeMarketID(ExchangeMarketID value) {
        this.exchangeMarketID = value;
    }

    /**
     * Obtiene el valor de la propiedad calculationRate.
     * 
     * @return
     *     possible object is
     *     {@link CalculationRate }
     *     
     */
    public CalculationRate getCalculationRate() {
        return calculationRate;
    }

    /**
     * Define el valor de la propiedad calculationRate.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationRate }
     *     
     */
    public void setCalculationRate(CalculationRate value) {
        this.calculationRate = value;
    }

    /**
     * Obtiene el valor de la propiedad mathematicOperatorCode.
     * 
     * @return
     *     possible object is
     *     {@link MathematicOperatorCode }
     *     
     */
    public MathematicOperatorCode getMathematicOperatorCode() {
        return mathematicOperatorCode;
    }

    /**
     * Define el valor de la propiedad mathematicOperatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MathematicOperatorCode }
     *     
     */
    public void setMathematicOperatorCode(MathematicOperatorCode value) {
        this.mathematicOperatorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignExchangeContract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getForeignExchangeContract() {
        return foreignExchangeContract;
    }

    /**
     * Define el valor de la propiedad foreignExchangeContract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setForeignExchangeContract(ContractType value) {
        this.foreignExchangeContract = value;
    }

}
