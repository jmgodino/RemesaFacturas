//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BudgetYearNumeric;
import com.picoto.jaxb.ubl.common.cbc.CalculationSequenceNumeric;
import com.picoto.jaxb.ubl.common.cbc.FrozenPeriodDaysNumeric;
import com.picoto.jaxb.ubl.common.cbc.LineCountNumeric;
import com.picoto.jaxb.ubl.common.cbc.LineNumberNumeric;
import com.picoto.jaxb.ubl.common.cbc.MaximumCopiesNumeric;
import com.picoto.jaxb.ubl.common.cbc.MaximumNumberNumeric;
import com.picoto.jaxb.ubl.common.cbc.MaximumPaymentInstructionsNumeric;
import com.picoto.jaxb.ubl.common.cbc.MinimumNumberNumeric;
import com.picoto.jaxb.ubl.common.cbc.MultiplierFactorNumeric;
import com.picoto.jaxb.ubl.common.cbc.OrderIntervalDaysNumeric;
import com.picoto.jaxb.ubl.common.cbc.OrderQuantityIncrementNumeric;
import com.picoto.jaxb.ubl.common.cbc.PackSizeNumeric;
import com.picoto.jaxb.ubl.common.cbc.ReminderSequenceNumeric;
import com.picoto.jaxb.ubl.common.cbc.ResidentOccupantsNumeric;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumeric;
import com.picoto.jaxb.ubl.common.cbc.WeightNumeric;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000014&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric information that is assigned or is determined by calculation, counting, or sequencing. It does not require a unit of quantity or unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para NumericType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NumericType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>NumericType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType")
@XmlSeeAlso({
    MinimumNumberNumeric.class,
    MultiplierFactorNumeric.class,
    FrozenPeriodDaysNumeric.class,
    ReminderSequenceNumeric.class,
    PackSizeNumeric.class,
    WeightNumeric.class,
    ResidentOccupantsNumeric.class,
    MaximumNumberNumeric.class,
    OrderQuantityIncrementNumeric.class,
    BudgetYearNumeric.class,
    MaximumPaymentInstructionsNumeric.class,
    MaximumCopiesNumeric.class,
    LineCountNumeric.class,
    SequenceNumeric.class,
    LineNumberNumeric.class,
    OrderIntervalDaysNumeric.class,
    CalculationSequenceNumeric.class
})
public class NumericType
    extends com.picoto.jaxb.ubl.common.ccts.NumericType
{


}
