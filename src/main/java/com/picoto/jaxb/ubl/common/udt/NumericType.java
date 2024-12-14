//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
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
 * &lt;complexType name="NumericType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;NumericType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType")
@XmlSeeAlso({
    WeightNumeric.class,
    SequenceNumeric.class,
    ResidentOccupantsNumeric.class,
    ReminderSequenceNumeric.class,
    PackSizeNumeric.class,
    OrderQuantityIncrementNumeric.class,
    OrderIntervalDaysNumeric.class,
    MultiplierFactorNumeric.class,
    MinimumNumberNumeric.class,
    MaximumPaymentInstructionsNumeric.class,
    MaximumNumberNumeric.class,
    MaximumCopiesNumeric.class,
    LineNumberNumeric.class,
    LineCountNumeric.class,
    FrozenPeriodDaysNumeric.class,
    CalculationSequenceNumeric.class,
    BudgetYearNumeric.class
})
public class NumericType
    extends com.picoto.jaxb.ubl.common.ccts.NumericType
{


}
