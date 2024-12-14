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
import com.picoto.jaxb.ubl.common.cbc.ComparisonDataSourceCode;
import com.picoto.jaxb.ubl.common.cbc.DataSourceCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastPurposeCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TimeDeltaDaysQuantity;


/**
 * <p>Clase Java para ForecastExceptionCriterionLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionCriterionLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataSourceCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeDeltaDaysQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionCriterionLineType", propOrder = {
    "forecastPurposeCode",
    "forecastTypeCode",
    "comparisonDataSourceCode",
    "dataSourceCode",
    "timeDeltaDaysQuantity"
})
@XmlRootElement(name = "ForecastExceptionCriterionLine")
public class ForecastExceptionCriterionLine {

    @XmlElement(name = "ForecastPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastPurposeCode forecastPurposeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastTypeCode forecastTypeCode;
    @XmlElement(name = "ComparisonDataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonDataSourceCode comparisonDataSourceCode;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DataSourceCode dataSourceCode;
    @XmlElement(name = "TimeDeltaDaysQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeDeltaDaysQuantity timeDeltaDaysQuantity;

    /**
     * Obtiene el valor de la propiedad forecastPurposeCode.
     * 
     * @return
     *     possible object is
     *     {@link ForecastPurposeCode }
     *     
     */
    public ForecastPurposeCode getForecastPurposeCode() {
        return forecastPurposeCode;
    }

    /**
     * Define el valor de la propiedad forecastPurposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastPurposeCode }
     *     
     */
    public void setForecastPurposeCode(ForecastPurposeCode value) {
        this.forecastPurposeCode = value;
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
     * Obtiene el valor de la propiedad comparisonDataSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataSourceCode }
     *     
     */
    public ComparisonDataSourceCode getComparisonDataSourceCode() {
        return comparisonDataSourceCode;
    }

    /**
     * Define el valor de la propiedad comparisonDataSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataSourceCode }
     *     
     */
    public void setComparisonDataSourceCode(ComparisonDataSourceCode value) {
        this.comparisonDataSourceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad dataSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceCode }
     *     
     */
    public DataSourceCode getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * Define el valor de la propiedad dataSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceCode }
     *     
     */
    public void setDataSourceCode(DataSourceCode value) {
        this.dataSourceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timeDeltaDaysQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TimeDeltaDaysQuantity }
     *     
     */
    public TimeDeltaDaysQuantity getTimeDeltaDaysQuantity() {
        return timeDeltaDaysQuantity;
    }

    /**
     * Define el valor de la propiedad timeDeltaDaysQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDeltaDaysQuantity }
     *     
     */
    public void setTimeDeltaDaysQuantity(TimeDeltaDaysQuantity value) {
        this.timeDeltaDaysQuantity = value;
    }

}
