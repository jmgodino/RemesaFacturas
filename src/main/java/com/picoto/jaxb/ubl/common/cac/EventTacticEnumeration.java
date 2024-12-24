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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ConsumerIncentiveTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DisplayTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.FeatureTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TradeItemPackingLabelingTypeCode;


/**
 * <p>Clase Java para EventTacticEnumerationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventTacticEnumerationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerIncentiveTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DisplayTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeatureTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeItemPackingLabelingTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTacticEnumerationType", propOrder = {
    "consumerIncentiveTacticTypeCode",
    "displayTacticTypeCode",
    "featureTacticTypeCode",
    "tradeItemPackingLabelingTypeCode"
})
@XmlRootElement(name = "EventTacticEnumeration")
public class EventTacticEnumeration {

    @XmlElement(name = "ConsumerIncentiveTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumerIncentiveTacticTypeCode consumerIncentiveTacticTypeCode;
    @XmlElement(name = "DisplayTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DisplayTacticTypeCode displayTacticTypeCode;
    @XmlElement(name = "FeatureTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FeatureTacticTypeCode featureTacticTypeCode;
    @XmlElement(name = "TradeItemPackingLabelingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TradeItemPackingLabelingTypeCode tradeItemPackingLabelingTypeCode;

    /**
     * Obtiene el valor de la propiedad consumerIncentiveTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerIncentiveTacticTypeCode }
     *     
     */
    public ConsumerIncentiveTacticTypeCode getConsumerIncentiveTacticTypeCode() {
        return consumerIncentiveTacticTypeCode;
    }

    /**
     * Define el valor de la propiedad consumerIncentiveTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerIncentiveTacticTypeCode }
     *     
     */
    public void setConsumerIncentiveTacticTypeCode(ConsumerIncentiveTacticTypeCode value) {
        this.consumerIncentiveTacticTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad displayTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTacticTypeCode }
     *     
     */
    public DisplayTacticTypeCode getDisplayTacticTypeCode() {
        return displayTacticTypeCode;
    }

    /**
     * Define el valor de la propiedad displayTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTacticTypeCode }
     *     
     */
    public void setDisplayTacticTypeCode(DisplayTacticTypeCode value) {
        this.displayTacticTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad featureTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTacticTypeCode }
     *     
     */
    public FeatureTacticTypeCode getFeatureTacticTypeCode() {
        return featureTacticTypeCode;
    }

    /**
     * Define el valor de la propiedad featureTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTacticTypeCode }
     *     
     */
    public void setFeatureTacticTypeCode(FeatureTacticTypeCode value) {
        this.featureTacticTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemPackingLabelingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPackingLabelingTypeCode }
     *     
     */
    public TradeItemPackingLabelingTypeCode getTradeItemPackingLabelingTypeCode() {
        return tradeItemPackingLabelingTypeCode;
    }

    /**
     * Define el valor de la propiedad tradeItemPackingLabelingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPackingLabelingTypeCode }
     *     
     */
    public void setTradeItemPackingLabelingTypeCode(TradeItemPackingLabelingTypeCode value) {
        this.tradeItemPackingLabelingTypeCode = value;
    }

}
