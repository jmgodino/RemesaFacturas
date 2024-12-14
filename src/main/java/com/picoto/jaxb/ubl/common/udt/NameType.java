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
import com.picoto.jaxb.ubl.common.cbc.AdditionalStreetName;
import com.picoto.jaxb.ubl.common.cbc.AliasName;
import com.picoto.jaxb.ubl.common.cbc.BlockName;
import com.picoto.jaxb.ubl.common.cbc.BrandName;
import com.picoto.jaxb.ubl.common.cbc.BuildingName;
import com.picoto.jaxb.ubl.common.cbc.CategoryName;
import com.picoto.jaxb.ubl.common.cbc.CityName;
import com.picoto.jaxb.ubl.common.cbc.CitySubdivisionName;
import com.picoto.jaxb.ubl.common.cbc.FamilyName;
import com.picoto.jaxb.ubl.common.cbc.FileName;
import com.picoto.jaxb.ubl.common.cbc.FirstName;
import com.picoto.jaxb.ubl.common.cbc.HolderName;
import com.picoto.jaxb.ubl.common.cbc.MiddleName;
import com.picoto.jaxb.ubl.common.cbc.ModelName;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.OtherName;
import com.picoto.jaxb.ubl.common.cbc.RegistrationName;
import com.picoto.jaxb.ubl.common.cbc.RetailEventName;
import com.picoto.jaxb.ubl.common.cbc.RoamingPartnerName;
import com.picoto.jaxb.ubl.common.cbc.ServiceName;
import com.picoto.jaxb.ubl.common.cbc.StreetName;
import com.picoto.jaxb.ubl.common.cbc.TechnicalName;
import com.picoto.jaxb.ubl.common.cbc.VesselName;
import com.picoto.jaxb.ubl.common.ccts.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000020&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string that constitutes the distinctive designation of a person, place, thing or concept.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para NameType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;TextType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType")
@XmlSeeAlso({
    VesselName.class,
    TechnicalName.class,
    StreetName.class,
    ServiceName.class,
    RoamingPartnerName.class,
    RetailEventName.class,
    RegistrationName.class,
    OtherName.class,
    ModelName.class,
    MiddleName.class,
    HolderName.class,
    FirstName.class,
    FileName.class,
    FamilyName.class,
    CitySubdivisionName.class,
    CityName.class,
    CategoryName.class,
    BuildingName.class,
    BrandName.class,
    BlockName.class,
    AliasName.class,
    AdditionalStreetName.class,
    Name.class
})
public class NameType
    extends TextType
{


}
