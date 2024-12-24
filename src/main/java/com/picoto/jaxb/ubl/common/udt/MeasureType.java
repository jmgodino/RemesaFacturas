//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AltitudeMeasure;
import com.picoto.jaxb.ubl.common.cbc.BaseUnitMeasure;
import com.picoto.jaxb.ubl.common.cbc.ChargeableWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.ComparedValueMeasure;
import com.picoto.jaxb.ubl.common.cbc.DurationMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossTonnageMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.GrossWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.LatitudeDegreesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LatitudeMinutesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LeadTimeMeasure;
import com.picoto.jaxb.ubl.common.cbc.LoadingLengthMeasure;
import com.picoto.jaxb.ubl.common.cbc.LongitudeDegreesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LongitudeMinutesMeasure;
import com.picoto.jaxb.ubl.common.cbc.MaximumMeasure;
import com.picoto.jaxb.ubl.common.cbc.Measure;
import com.picoto.jaxb.ubl.common.cbc.MinimumMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetNetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetTonnageMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetVolumeMeasure;
import com.picoto.jaxb.ubl.common.cbc.NetWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.PostEventNotificationDurationMeasure;
import com.picoto.jaxb.ubl.common.cbc.PreEventNotificationDurationMeasure;
import com.picoto.jaxb.ubl.common.cbc.SourceValueMeasure;
import com.picoto.jaxb.ubl.common.cbc.TareWeightMeasure;
import com.picoto.jaxb.ubl.common.cbc.ValueMeasure;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000013&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A numeric value determined by measuring an object using a specified unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Type&lt;/ccts:PropertyTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para MeasureType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;MeasureType"&gt;
 *       &lt;attribute name="unitCode" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType")
@XmlSeeAlso({
    TareWeightMeasure.class,
    NetNetWeightMeasure.class,
    LoadingLengthMeasure.class,
    LeadTimeMeasure.class,
    GrossWeightMeasure.class,
    GrossVolumeMeasure.class,
    DurationMeasure.class,
    ChargeableWeightMeasure.class,
    BaseUnitMeasure.class,
    PreEventNotificationDurationMeasure.class,
    PostEventNotificationDurationMeasure.class,
    NetTonnageMeasure.class,
    GrossTonnageMeasure.class,
    AltitudeMeasure.class,
    LongitudeMinutesMeasure.class,
    LongitudeDegreesMeasure.class,
    LatitudeMinutesMeasure.class,
    LatitudeDegreesMeasure.class,
    NetVolumeMeasure.class,
    NetWeightMeasure.class,
    SourceValueMeasure.class,
    ComparedValueMeasure.class,
    ValueMeasure.class,
    MaximumMeasure.class,
    MinimumMeasure.class,
    Measure.class
})
public class MeasureType
    extends com.picoto.jaxb.ubl.common.ccts.MeasureType
{


}
