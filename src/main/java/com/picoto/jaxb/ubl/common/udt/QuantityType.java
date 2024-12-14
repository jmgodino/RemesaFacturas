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
import com.picoto.jaxb.ubl.common.cbc.ActualTemperatureReductionQuantity;
import com.picoto.jaxb.ubl.common.cbc.BackorderQuantity;
import com.picoto.jaxb.ubl.common.cbc.BaseQuantity;
import com.picoto.jaxb.ubl.common.cbc.BasicConsumedQuantity;
import com.picoto.jaxb.ubl.common.cbc.BatchQuantity;
import com.picoto.jaxb.ubl.common.cbc.ChargeableQuantity;
import com.picoto.jaxb.ubl.common.cbc.ChildConsignmentQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsignmentQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumerUnitQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionEnergyQuantity;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionWaterQuantity;
import com.picoto.jaxb.ubl.common.cbc.ContentUnitQuantity;
import com.picoto.jaxb.ubl.common.cbc.CreditedQuantity;
import com.picoto.jaxb.ubl.common.cbc.CrewQuantity;
import com.picoto.jaxb.ubl.common.cbc.CustomsTariffQuantity;
import com.picoto.jaxb.ubl.common.cbc.DebitedQuantity;
import com.picoto.jaxb.ubl.common.cbc.DeliveredQuantity;
import com.picoto.jaxb.ubl.common.cbc.DifferenceTemperatureReductionQuantity;
import com.picoto.jaxb.ubl.common.cbc.EmployeeQuantity;
import com.picoto.jaxb.ubl.common.cbc.EstimatedConsumedQuantity;
import com.picoto.jaxb.ubl.common.cbc.EstimatedOverallContractQuantity;
import com.picoto.jaxb.ubl.common.cbc.ExpectedOperatorQuantity;
import com.picoto.jaxb.ubl.common.cbc.ExpectedQuantity;
import com.picoto.jaxb.ubl.common.cbc.GasPressureQuantity;
import com.picoto.jaxb.ubl.common.cbc.InvoicedQuantity;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterQuantity;
import com.picoto.jaxb.ubl.common.cbc.MaximumBackorderQuantity;
import com.picoto.jaxb.ubl.common.cbc.MaximumOperatorQuantity;
import com.picoto.jaxb.ubl.common.cbc.MaximumOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.MaximumQuantity;
import com.picoto.jaxb.ubl.common.cbc.MaximumVariantQuantity;
import com.picoto.jaxb.ubl.common.cbc.MinimumBackorderQuantity;
import com.picoto.jaxb.ubl.common.cbc.MinimumInventoryQuantity;
import com.picoto.jaxb.ubl.common.cbc.MinimumOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.MinimumQuantity;
import com.picoto.jaxb.ubl.common.cbc.MultipleOrderQuantity;
import com.picoto.jaxb.ubl.common.cbc.NormalTemperatureReductionQuantity;
import com.picoto.jaxb.ubl.common.cbc.OperatingYearsQuantity;
import com.picoto.jaxb.ubl.common.cbc.OutstandingQuantity;
import com.picoto.jaxb.ubl.common.cbc.OversupplyQuantity;
import com.picoto.jaxb.ubl.common.cbc.PackQuantity;
import com.picoto.jaxb.ubl.common.cbc.PassengerQuantity;
import com.picoto.jaxb.ubl.common.cbc.PerformanceValueQuantity;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterQuantity;
import com.picoto.jaxb.ubl.common.cbc.Quantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedElectronicTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedForeignTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.RejectedQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReturnableQuantity;
import com.picoto.jaxb.ubl.common.cbc.SharesNumberQuantity;
import com.picoto.jaxb.ubl.common.cbc.ShortQuantity;
import com.picoto.jaxb.ubl.common.cbc.TargetInventoryQuantity;
import com.picoto.jaxb.ubl.common.cbc.ThresholdQuantity;
import com.picoto.jaxb.ubl.common.cbc.TimeDeltaDaysQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalConsumedQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalDeliveredQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalGoodsItemQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalMeteredQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalPackageQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalPackagesQuantity;
import com.picoto.jaxb.ubl.common.cbc.TotalTransportHandlingUnitQuantity;
import com.picoto.jaxb.ubl.common.cbc.ValueQuantity;
import com.picoto.jaxb.ubl.common.cbc.VarianceQuantity;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units, possibly including a fractional part.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para QuantityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>QuantityType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
@XmlSeeAlso({
    TotalTransportHandlingUnitQuantity.class,
    Quantity.class,
    BackorderQuantity.class,
    ReceivedForeignTenderQuantity.class,
    PackQuantity.class,
    DeliveredQuantity.class,
    DebitedQuantity.class,
    ReceivedQuantity.class,
    MaximumVariantQuantity.class,
    OversupplyQuantity.class,
    MinimumOrderQuantity.class,
    BatchQuantity.class,
    TotalPackageQuantity.class,
    TargetInventoryQuantity.class,
    SharesNumberQuantity.class,
    ChildConsignmentQuantity.class,
    LatestMeterQuantity.class,
    ValueQuantity.class,
    OutstandingQuantity.class,
    BasicConsumedQuantity.class,
    GasPressureQuantity.class,
    ReceivedElectronicTenderQuantity.class,
    ConsumerUnitQuantity.class,
    InvoicedQuantity.class,
    ActualTemperatureReductionQuantity.class,
    CustomsTariffQuantity.class,
    CreditedQuantity.class,
    VarianceQuantity.class,
    PreviousMeterQuantity.class,
    TotalGoodsItemQuantity.class,
    ReturnableQuantity.class,
    DifferenceTemperatureReductionQuantity.class,
    ContentUnitQuantity.class,
    TimeDeltaDaysQuantity.class,
    ConsumptionWaterQuantity.class,
    ShortQuantity.class,
    PassengerQuantity.class,
    RejectedQuantity.class,
    MinimumInventoryQuantity.class,
    PerformanceValueQuantity.class,
    TotalDeliveredQuantity.class,
    BaseQuantity.class,
    ConsumptionEnergyQuantity.class,
    MaximumOperatorQuantity.class,
    MultipleOrderQuantity.class,
    MaximumQuantity.class,
    ExpectedOperatorQuantity.class,
    ReceivedTenderQuantity.class,
    TotalPackagesQuantity.class,
    ExpectedQuantity.class,
    ThresholdQuantity.class,
    MaximumBackorderQuantity.class,
    MaximumOrderQuantity.class,
    MinimumBackorderQuantity.class,
    EstimatedConsumedQuantity.class,
    ConsignmentQuantity.class,
    EmployeeQuantity.class,
    MinimumQuantity.class,
    ChargeableQuantity.class,
    EstimatedOverallContractQuantity.class,
    NormalTemperatureReductionQuantity.class,
    TotalMeteredQuantity.class,
    OperatingYearsQuantity.class,
    TotalConsumedQuantity.class,
    CrewQuantity.class
})
public class QuantityType
    extends com.picoto.jaxb.ubl.common.ccts.QuantityType
{


}
