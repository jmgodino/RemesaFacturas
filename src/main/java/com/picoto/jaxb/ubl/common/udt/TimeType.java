//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.picoto.jaxb.ubl.common.cbc.ActualDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.ActualDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.ActualPickupTime;
import com.picoto.jaxb.ubl.common.cbc.AwardTime;
import com.picoto.jaxb.ubl.common.cbc.CallTime;
import com.picoto.jaxb.ubl.common.cbc.ComparisonForecastIssueTime;
import com.picoto.jaxb.ubl.common.cbc.EarliestPickupTime;
import com.picoto.jaxb.ubl.common.cbc.EffectiveTime;
import com.picoto.jaxb.ubl.common.cbc.EndTime;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.ExpiryTime;
import com.picoto.jaxb.ubl.common.cbc.GuaranteedDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.IssueTime;
import com.picoto.jaxb.ubl.common.cbc.LastRevisionTime;
import com.picoto.jaxb.ubl.common.cbc.LatestDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.LatestPickupTime;
import com.picoto.jaxb.ubl.common.cbc.ManufactureTime;
import com.picoto.jaxb.ubl.common.cbc.NominationTime;
import com.picoto.jaxb.ubl.common.cbc.OccurrenceTime;
import com.picoto.jaxb.ubl.common.cbc.PaidTime;
import com.picoto.jaxb.ubl.common.cbc.ReferenceTime;
import com.picoto.jaxb.ubl.common.cbc.RegisteredTime;
import com.picoto.jaxb.ubl.common.cbc.RequestedDespatchTime;
import com.picoto.jaxb.ubl.common.cbc.RequiredDeliveryTime;
import com.picoto.jaxb.ubl.common.cbc.ResolutionTime;
import com.picoto.jaxb.ubl.common.cbc.ResponseTime;
import com.picoto.jaxb.ubl.common.cbc.RevisionTime;
import com.picoto.jaxb.ubl.common.cbc.SourceForecastIssueTime;
import com.picoto.jaxb.ubl.common.cbc.StartTime;
import com.picoto.jaxb.ubl.common.cbc.ValidationTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000010&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An instance of time that occurs every day.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Time&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para TimeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CallTime.class,
    LatestDeliveryTime.class,
    NominationTime.class,
    LastRevisionTime.class,
    ReferenceTime.class,
    EstimatedDespatchTime.class,
    OccurrenceTime.class,
    ManufactureTime.class,
    SourceForecastIssueTime.class,
    ActualDespatchTime.class,
    RegisteredTime.class,
    PaidTime.class,
    ActualDeliveryTime.class,
    EstimatedDeliveryTime.class,
    GuaranteedDespatchTime.class,
    EffectiveTime.class,
    ResolutionTime.class,
    ValidationTime.class,
    RequiredDeliveryTime.class,
    ActualPickupTime.class,
    EarliestPickupTime.class,
    ComparisonForecastIssueTime.class,
    StartTime.class,
    RevisionTime.class,
    ResponseTime.class,
    IssueTime.class,
    EndTime.class,
    LatestPickupTime.class,
    RequestedDespatchTime.class,
    ExpiryTime.class,
    AwardTime.class
})
public class TimeType {

    @XmlValue
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar value;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
