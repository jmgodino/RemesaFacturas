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
import com.picoto.jaxb.ubl.common.cbc.ForecastTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PerformanceMetricTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SupplyChainActivityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TimeFrequencyCode;


/**
 * <p>Clase Java para ItemInformationRequestLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemInformationRequestLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeFrequencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInformationRequestLineType", propOrder = {
    "timeFrequencyCode",
    "supplyChainActivityTypeCode",
    "forecastTypeCode",
    "performanceMetricTypeCode",
    "periods",
    "salesItems"
})
@XmlRootElement(name = "ItemInformationRequestLine")
public class ItemInformationRequestLine {

    @XmlElement(name = "TimeFrequencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeFrequencyCode timeFrequencyCode;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCode supplyChainActivityTypeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ForecastTypeCode forecastTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCode performanceMetricTypeCode;
    @XmlElement(name = "Period", required = true)
    protected List<PeriodType> periods;
    @XmlElement(name = "SalesItem", required = true)
    protected List<SalesItem> salesItems;

    /**
     * Obtiene el valor de la propiedad timeFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrequencyCode }
     *     
     */
    public TimeFrequencyCode getTimeFrequencyCode() {
        return timeFrequencyCode;
    }

    /**
     * Define el valor de la propiedad timeFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrequencyCode }
     *     
     */
    public void setTimeFrequencyCode(TimeFrequencyCode value) {
        this.timeFrequencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad supplyChainActivityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public SupplyChainActivityTypeCode getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Define el valor de la propiedad supplyChainActivityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCode value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad forecastTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ForecastTypeCode }
     *     
     */
    public ForecastTypeCode getForecastTypeCode() {
        return forecastTypeCode;
    }

    /**
     * Define el valor de la propiedad forecastTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastTypeCode }
     *     
     */
    public void setForecastTypeCode(ForecastTypeCode value) {
        this.forecastTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad performanceMetricTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public PerformanceMetricTypeCode getPerformanceMetricTypeCode() {
        return performanceMetricTypeCode;
    }

    /**
     * Define el valor de la propiedad performanceMetricTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public void setPerformanceMetricTypeCode(PerformanceMetricTypeCode value) {
        this.performanceMetricTypeCode = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<PeriodType>();
        }
        return this.periods;
    }

    /**
     * Gets the value of the salesItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesItem }
     * 
     * 
     */
    public List<SalesItem> getSalesItems() {
        if (salesItems == null) {
            salesItems = new ArrayList<SalesItem>();
        }
        return this.salesItems;
    }

}
