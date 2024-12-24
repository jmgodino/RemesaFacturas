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
import com.picoto.jaxb.ubl.common.cbc.AdvertisementAmount;
import com.picoto.jaxb.ubl.common.cbc.AllowanceTotalAmount;
import com.picoto.jaxb.ubl.common.cbc.Amount;
import com.picoto.jaxb.ubl.common.cbc.AnnualAverageAmount;
import com.picoto.jaxb.ubl.common.cbc.AverageAmount;
import com.picoto.jaxb.ubl.common.cbc.AverageSubsequentContractAmount;
import com.picoto.jaxb.ubl.common.cbc.BalanceAmount;
import com.picoto.jaxb.ubl.common.cbc.BaseAmount;
import com.picoto.jaxb.ubl.common.cbc.CallBaseAmount;
import com.picoto.jaxb.ubl.common.cbc.CallExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.ChargeTotalAmount;
import com.picoto.jaxb.ubl.common.cbc.CorporateStockAmount;
import com.picoto.jaxb.ubl.common.cbc.CorrectionAmount;
import com.picoto.jaxb.ubl.common.cbc.CorrectionUnitAmount;
import com.picoto.jaxb.ubl.common.cbc.CreditLineAmount;
import com.picoto.jaxb.ubl.common.cbc.DebitLineAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredCarriageValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredCustomsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredForCarriageValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DeclaredStatisticsValueAmount;
import com.picoto.jaxb.ubl.common.cbc.DocumentationFeeAmount;
import com.picoto.jaxb.ubl.common.cbc.EstimatedAmount;
import com.picoto.jaxb.ubl.common.cbc.EstimatedOverallContractAmount;
import com.picoto.jaxb.ubl.common.cbc.FaceValueAmount;
import com.picoto.jaxb.ubl.common.cbc.FeeAmount;
import com.picoto.jaxb.ubl.common.cbc.FreeOnBoardValueAmount;
import com.picoto.jaxb.ubl.common.cbc.HigherTenderAmount;
import com.picoto.jaxb.ubl.common.cbc.InsurancePremiumAmount;
import com.picoto.jaxb.ubl.common.cbc.InsuranceValueAmount;
import com.picoto.jaxb.ubl.common.cbc.InventoryValueAmount;
import com.picoto.jaxb.ubl.common.cbc.LiabilityAmount;
import com.picoto.jaxb.ubl.common.cbc.LineExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.LowerTenderAmount;
import com.picoto.jaxb.ubl.common.cbc.MarketValueAmount;
import com.picoto.jaxb.ubl.common.cbc.MaximumAdvertisementAmount;
import com.picoto.jaxb.ubl.common.cbc.MaximumAmount;
import com.picoto.jaxb.ubl.common.cbc.MaximumPaidAmount;
import com.picoto.jaxb.ubl.common.cbc.MinimumAmount;
import com.picoto.jaxb.ubl.common.cbc.PaidAmount;
import com.picoto.jaxb.ubl.common.cbc.PartyCapacityAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableAlternativeAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableAmount;
import com.picoto.jaxb.ubl.common.cbc.PayableRoundingAmount;
import com.picoto.jaxb.ubl.common.cbc.PenaltyAmount;
import com.picoto.jaxb.ubl.common.cbc.PerUnitAmount;
import com.picoto.jaxb.ubl.common.cbc.PrepaidAmount;
import com.picoto.jaxb.ubl.common.cbc.PriceAmount;
import com.picoto.jaxb.ubl.common.cbc.RequiredFeeAmount;
import com.picoto.jaxb.ubl.common.cbc.RoundingAmount;
import com.picoto.jaxb.ubl.common.cbc.SettlementDiscountAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyBalanceAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxEnergyOnAccountAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxExclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxInclusiveAmount;
import com.picoto.jaxb.ubl.common.cbc.TaxableAmount;
import com.picoto.jaxb.ubl.common.cbc.ThresholdAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalBalanceAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalCreditAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalDebitAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalInvoiceAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalPaymentAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalTaskAmount;
import com.picoto.jaxb.ubl.common.cbc.TotalTaxAmount;
import com.picoto.jaxb.ubl.common.cbc.TransactionCurrencyTaxAmount;
import com.picoto.jaxb.ubl.common.cbc.ValueAmount;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000001&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A number of monetary units specified using a given unit of currency.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para AmountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;AmountType"&gt;
 *       &lt;attribute name="currencyID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType")
@XmlSeeAlso({
    TotalPaymentAmount.class,
    TotalInvoiceAmount.class,
    TotalDebitAmount.class,
    TotalCreditAmount.class,
    TotalBalanceAmount.class,
    ThresholdAmount.class,
    TaxInclusiveAmount.class,
    TaxExclusiveAmount.class,
    SettlementDiscountAmount.class,
    RoundingAmount.class,
    PrepaidAmount.class,
    PenaltyAmount.class,
    PayableRoundingAmount.class,
    PayableAmount.class,
    PayableAlternativeAmount.class,
    PaidAmount.class,
    LiabilityAmount.class,
    InsuranceValueAmount.class,
    InsurancePremiumAmount.class,
    FreeOnBoardValueAmount.class,
    FeeAmount.class,
    EstimatedAmount.class,
    DeclaredStatisticsValueAmount.class,
    DeclaredForCarriageValueAmount.class,
    DeclaredCustomsValueAmount.class,
    DeclaredCarriageValueAmount.class,
    CorrectionUnitAmount.class,
    CorrectionAmount.class,
    ChargeTotalAmount.class,
    BaseAmount.class,
    AllowanceTotalAmount.class,
    DocumentationFeeAmount.class,
    MaximumAdvertisementAmount.class,
    HigherTenderAmount.class,
    LowerTenderAmount.class,
    AdvertisementAmount.class,
    PerUnitAmount.class,
    TransactionCurrencyTaxAmount.class,
    TaxAmount.class,
    TaxableAmount.class,
    ValueAmount.class,
    BalanceAmount.class,
    CreditLineAmount.class,
    DebitLineAmount.class,
    TotalTaxAmount.class,
    AverageSubsequentContractAmount.class,
    MaximumAmount.class,
    MinimumAmount.class,
    EstimatedOverallContractAmount.class,
    RequiredFeeAmount.class,
    MaximumPaidAmount.class,
    CorporateStockAmount.class,
    InventoryValueAmount.class,
    MarketValueAmount.class,
    FaceValueAmount.class,
    CallExtensionAmount.class,
    CallBaseAmount.class,
    LineExtensionAmount.class,
    AverageAmount.class,
    TaxEnergyBalanceAmount.class,
    TaxEnergyOnAccountAmount.class,
    TaxEnergyAmount.class,
    PartyCapacityAmount.class,
    TotalTaskAmount.class,
    AnnualAverageAmount.class,
    PriceAmount.class,
    TotalAmount.class,
    Amount.class
})
public class AmountType
    extends com.picoto.jaxb.ubl.common.ccts.AmountType
{


}
