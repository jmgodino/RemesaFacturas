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
import com.picoto.jaxb.ubl.common.cbc.ComparisonDataCode;
import com.picoto.jaxb.ubl.common.cbc.ComparisonForecastIssueDate;
import com.picoto.jaxb.ubl.common.cbc.ComparisonForecastIssueTime;
import com.picoto.jaxb.ubl.common.cbc.DataSourceCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastPurposeCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastTypeCode;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.IssueTime;


/**
 * <p>Clase Java para ForecastExceptionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueTime" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionType", propOrder = {
    "forecastPurposeCode",
    "forecastTypeCode",
    "issueDate",
    "issueTime",
    "dataSourceCode",
    "comparisonDataCode",
    "comparisonForecastIssueTime",
    "comparisonForecastIssueDate"
})
@XmlRootElement(name = "ForecastException")
public class ForecastException {

    @XmlElement(name = "ForecastPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastPurposeCode forecastPurposeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastTypeCode forecastTypeCode;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDate issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTime issueTime;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DataSourceCode dataSourceCode;
    @XmlElement(name = "ComparisonDataCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonDataCode comparisonDataCode;
    @XmlElement(name = "ComparisonForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonForecastIssueTime comparisonForecastIssueTime;
    @XmlElement(name = "ComparisonForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ComparisonForecastIssueDate comparisonForecastIssueDate;

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
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link IssueDate }
     *     
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDate }
     *     
     */
    public void setIssueDate(IssueDate value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad issueTime.
     * 
     * @return
     *     possible object is
     *     {@link IssueTime }
     *     
     */
    public IssueTime getIssueTime() {
        return issueTime;
    }

    /**
     * Define el valor de la propiedad issueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTime }
     *     
     */
    public void setIssueTime(IssueTime value) {
        this.issueTime = value;
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
     * Obtiene el valor de la propiedad comparisonDataCode.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataCode }
     *     
     */
    public ComparisonDataCode getComparisonDataCode() {
        return comparisonDataCode;
    }

    /**
     * Define el valor de la propiedad comparisonDataCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataCode }
     *     
     */
    public void setComparisonDataCode(ComparisonDataCode value) {
        this.comparisonDataCode = value;
    }

    /**
     * Obtiene el valor de la propiedad comparisonForecastIssueTime.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueTime }
     *     
     */
    public ComparisonForecastIssueTime getComparisonForecastIssueTime() {
        return comparisonForecastIssueTime;
    }

    /**
     * Define el valor de la propiedad comparisonForecastIssueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueTime }
     *     
     */
    public void setComparisonForecastIssueTime(ComparisonForecastIssueTime value) {
        this.comparisonForecastIssueTime = value;
    }

    /**
     * Obtiene el valor de la propiedad comparisonForecastIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueDate }
     *     
     */
    public ComparisonForecastIssueDate getComparisonForecastIssueDate() {
        return comparisonForecastIssueDate;
    }

    /**
     * Define el valor de la propiedad comparisonForecastIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueDate }
     *     
     */
    public void setComparisonForecastIssueDate(ComparisonForecastIssueDate value) {
        this.comparisonForecastIssueDate = value;
    }

}
