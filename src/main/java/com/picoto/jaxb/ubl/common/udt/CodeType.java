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
import com.picoto.jaxb.ubl.common.cbc.AccountFormatCode;
import com.picoto.jaxb.ubl.common.cbc.AccountTypeCode;
import com.picoto.jaxb.ubl.common.cbc.AccountingCostCode;
import com.picoto.jaxb.ubl.common.cbc.ActionCode;
import com.picoto.jaxb.ubl.common.cbc.ActivityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.AddressFormatCode;
import com.picoto.jaxb.ubl.common.cbc.AddressTypeCode;
import com.picoto.jaxb.ubl.common.cbc.AdjustmentReasonCode;
import com.picoto.jaxb.ubl.common.cbc.AdmissionCode;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReasonCode;
import com.picoto.jaxb.ubl.common.cbc.ApplicationStatusCode;
import com.picoto.jaxb.ubl.common.cbc.AvailabilityStatusCode;
import com.picoto.jaxb.ubl.common.cbc.AwardingCriterionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.AwardingMethodTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CalculationExpressionCode;
import com.picoto.jaxb.ubl.common.cbc.CalculationMethodCode;
import com.picoto.jaxb.ubl.common.cbc.CapabilityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CardChipCode;
import com.picoto.jaxb.ubl.common.cbc.CardTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CargoTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CertificateTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ChannelCode;
import com.picoto.jaxb.ubl.common.cbc.CharacterSetCode;
import com.picoto.jaxb.ubl.common.cbc.CollaborationPriorityCode;
import com.picoto.jaxb.ubl.common.cbc.CommodityCode;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalFormCode;
import com.picoto.jaxb.ubl.common.cbc.CompanyLiquidationStatusCode;
import com.picoto.jaxb.ubl.common.cbc.ComparisonDataCode;
import com.picoto.jaxb.ubl.common.cbc.ComparisonDataSourceCode;
import com.picoto.jaxb.ubl.common.cbc.ConditionCode;
import com.picoto.jaxb.ubl.common.cbc.ConstitutionCode;
import com.picoto.jaxb.ubl.common.cbc.ConsumerIncentiveTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ConsumersEnergyLevelCode;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionLevelCode;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ContractTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ContractingSystemCode;
import com.picoto.jaxb.ubl.common.cbc.CoordinateSystemCode;
import com.picoto.jaxb.ubl.common.cbc.CorporateRegistrationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CorrectionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentityCode;
import com.picoto.jaxb.ubl.common.cbc.CreditNoteTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.CurrentChargeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CustomsStatusCode;
import com.picoto.jaxb.ubl.common.cbc.DataSourceCode;
import com.picoto.jaxb.ubl.common.cbc.DeclarationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DescriptionCode;
import com.picoto.jaxb.ubl.common.cbc.DespatchAdviceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DirectionCode;
import com.picoto.jaxb.ubl.common.cbc.DisplayTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DispositionCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentStatusCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentStatusReasonCode;
import com.picoto.jaxb.ubl.common.cbc.DocumentTypeCode;
import com.picoto.jaxb.ubl.common.cbc.DutyCode;
import com.picoto.jaxb.ubl.common.cbc.EmergencyProceduresCode;
import com.picoto.jaxb.ubl.common.cbc.EncodingCode;
import com.picoto.jaxb.ubl.common.cbc.EnvironmentalEmissionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.EvaluationCriterionTypeCode;
import com.picoto.jaxb.ubl.common.cbc.EvidenceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ExceptionResolutionCode;
import com.picoto.jaxb.ubl.common.cbc.ExceptionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.ExecutionRequirementCode;
import com.picoto.jaxb.ubl.common.cbc.ExemptionReasonCode;
import com.picoto.jaxb.ubl.common.cbc.ExpenseCode;
import com.picoto.jaxb.ubl.common.cbc.ExpressionCode;
import com.picoto.jaxb.ubl.common.cbc.FeatureTacticTypeCode;
import com.picoto.jaxb.ubl.common.cbc.FinancingInstrumentCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastPurposeCode;
import com.picoto.jaxb.ubl.common.cbc.ForecastTypeCode;
import com.picoto.jaxb.ubl.common.cbc.FormatCode;
import com.picoto.jaxb.ubl.common.cbc.FreightRateClassCode;
import com.picoto.jaxb.ubl.common.cbc.FullnessIndicationCode;
import com.picoto.jaxb.ubl.common.cbc.FundingProgramCode;
import com.picoto.jaxb.ubl.common.cbc.GenderCode;
import com.picoto.jaxb.ubl.common.cbc.GuaranteeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.HandlingCode;
import com.picoto.jaxb.ubl.common.cbc.HazardousCategoryCode;
import com.picoto.jaxb.ubl.common.cbc.HazardousRegulationCode;
import com.picoto.jaxb.ubl.common.cbc.HeatingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.IdentificationCode;
import com.picoto.jaxb.ubl.common.cbc.ImportanceCode;
import com.picoto.jaxb.ubl.common.cbc.IndustryClassificationCode;
import com.picoto.jaxb.ubl.common.cbc.InhalationToxicityZoneCode;
import com.picoto.jaxb.ubl.common.cbc.InspectionMethodCode;
import com.picoto.jaxb.ubl.common.cbc.InvoiceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ItemClassificationCode;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingMethodCode;
import com.picoto.jaxb.ubl.common.cbc.LatitudeDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.LifeCycleStatusCode;
import com.picoto.jaxb.ubl.common.cbc.LineStatusCode;
import com.picoto.jaxb.ubl.common.cbc.LocaleCode;
import com.picoto.jaxb.ubl.common.cbc.LocationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.LongitudeDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.LossRiskResponsibilityCode;
import com.picoto.jaxb.ubl.common.cbc.MandateTypeCode;
import com.picoto.jaxb.ubl.common.cbc.MathematicOperatorCode;
import com.picoto.jaxb.ubl.common.cbc.MedicalFirstAidGuideCode;
import com.picoto.jaxb.ubl.common.cbc.MeterConstantCode;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.MimeCode;
import com.picoto.jaxb.ubl.common.cbc.MiscellaneousEventTypeCode;
import com.picoto.jaxb.ubl.common.cbc.NameCode;
import com.picoto.jaxb.ubl.common.cbc.NatureCode;
import com.picoto.jaxb.ubl.common.cbc.NotificationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.OneTimeChargeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.OrderResponseCode;
import com.picoto.jaxb.ubl.common.cbc.OrderTypeCode;
import com.picoto.jaxb.ubl.common.cbc.OwnerTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PackLevelCode;
import com.picoto.jaxb.ubl.common.cbc.PackageLevelCode;
import com.picoto.jaxb.ubl.common.cbc.PackagingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PackingCriteriaCode;
import com.picoto.jaxb.ubl.common.cbc.ParentDocumentTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PartPresentationCode;
import com.picoto.jaxb.ubl.common.cbc.PartyTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentAlternativeCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentChannelCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentFrequencyCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentMeansCode;
import com.picoto.jaxb.ubl.common.cbc.PaymentPurposeCode;
import com.picoto.jaxb.ubl.common.cbc.PerformanceMetricTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PositionCode;
import com.picoto.jaxb.ubl.common.cbc.PreferenceCriterionCode;
import com.picoto.jaxb.ubl.common.cbc.PreviousCancellationReasonCode;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingMethodCode;
import com.picoto.jaxb.ubl.common.cbc.PriceEvaluationCode;
import com.picoto.jaxb.ubl.common.cbc.PriceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PricingCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.PrivacyCode;
import com.picoto.jaxb.ubl.common.cbc.ProcedureCode;
import com.picoto.jaxb.ubl.common.cbc.ProcessReasonCode;
import com.picoto.jaxb.ubl.common.cbc.ProcurementSubTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ProcurementTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ProfileStatusCode;
import com.picoto.jaxb.ubl.common.cbc.PromotionalEventTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ProviderTypeCode;
import com.picoto.jaxb.ubl.common.cbc.PurposeCode;
import com.picoto.jaxb.ubl.common.cbc.QualityControlCode;
import com.picoto.jaxb.ubl.common.cbc.QuantityDiscrepancyCode;
import com.picoto.jaxb.ubl.common.cbc.ReceiptAdviceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ReferenceEventCode;
import com.picoto.jaxb.ubl.common.cbc.RejectActionCode;
import com.picoto.jaxb.ubl.common.cbc.RejectReasonCode;
import com.picoto.jaxb.ubl.common.cbc.ReminderTypeCode;
import com.picoto.jaxb.ubl.common.cbc.RequestedInvoiceCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.ResidenceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ResolutionCode;
import com.picoto.jaxb.ubl.common.cbc.ResponseCode;
import com.picoto.jaxb.ubl.common.cbc.RetailEventStatusCode;
import com.picoto.jaxb.ubl.common.cbc.RevisionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.RoleCode;
import com.picoto.jaxb.ubl.common.cbc.SealIssuerTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SealStatusCode;
import com.picoto.jaxb.ubl.common.cbc.SecurityClassificationCode;
import com.picoto.jaxb.ubl.common.cbc.ServiceInformationPreferenceCode;
import com.picoto.jaxb.ubl.common.cbc.ServiceTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ShippingPriorityLevelCode;
import com.picoto.jaxb.ubl.common.cbc.ShortageActionCode;
import com.picoto.jaxb.ubl.common.cbc.SizeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SourceCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.SpecificationTypeCode;
import com.picoto.jaxb.ubl.common.cbc.StatementTypeCode;
import com.picoto.jaxb.ubl.common.cbc.StatusCode;
import com.picoto.jaxb.ubl.common.cbc.StatusReasonCode;
import com.picoto.jaxb.ubl.common.cbc.SubcontractingConditionsCode;
import com.picoto.jaxb.ubl.common.cbc.SubmissionMethodCode;
import com.picoto.jaxb.ubl.common.cbc.SubscriberTypeCode;
import com.picoto.jaxb.ubl.common.cbc.SubstitutionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.SupplyChainActivityTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TargetCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.TariffClassCode;
import com.picoto.jaxb.ubl.common.cbc.TariffCode;
import com.picoto.jaxb.ubl.common.cbc.TaxCurrencyCode;
import com.picoto.jaxb.ubl.common.cbc.TaxExemptionReasonCode;
import com.picoto.jaxb.ubl.common.cbc.TaxLevelCode;
import com.picoto.jaxb.ubl.common.cbc.TaxTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCallCode;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCategoryCode;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsSupplyTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TenderResultCode;
import com.picoto.jaxb.ubl.common.cbc.TenderTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TendererRequirementTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TendererRoleCode;
import com.picoto.jaxb.ubl.common.cbc.ThresholdValueComparisonCode;
import com.picoto.jaxb.ubl.common.cbc.TimeFrequencyCode;
import com.picoto.jaxb.ubl.common.cbc.TimingComplaintCode;
import com.picoto.jaxb.ubl.common.cbc.TrackingDeviceCode;
import com.picoto.jaxb.ubl.common.cbc.TradeItemPackingLabelingTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TradeServiceCode;
import com.picoto.jaxb.ubl.common.cbc.TransitDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.TransportAuthorizationCode;
import com.picoto.jaxb.ubl.common.cbc.TransportEmergencyCardCode;
import com.picoto.jaxb.ubl.common.cbc.TransportEquipmentTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportEventTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportExecutionStatusCode;
import com.picoto.jaxb.ubl.common.cbc.TransportHandlingUnitTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportMeansTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportModeCode;
import com.picoto.jaxb.ubl.common.cbc.TransportServiceCode;
import com.picoto.jaxb.ubl.common.cbc.TransportationStatusTypeCode;
import com.picoto.jaxb.ubl.common.cbc.TypeCode;
import com.picoto.jaxb.ubl.common.cbc.UNDGCode;
import com.picoto.jaxb.ubl.common.cbc.UrgencyCode;
import com.picoto.jaxb.ubl.common.cbc.UtilityStatementTypeCode;
import com.picoto.jaxb.ubl.common.cbc.ValidationResultCode;
import com.picoto.jaxb.ubl.common.cbc.WeekDayCode;
import com.picoto.jaxb.ubl.common.cbc.WeightingAlgorithmCode;
import com.picoto.jaxb.ubl.common.cbc.WorkPhaseCode;
import com.picoto.jaxb.ubl.common.cec.ExtensionReasonCode;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000007&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (letters, figures, or symbols) that for brevity and/or language independence may be used to represent or replace a definitive value or text of an attribute, together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the code list and thus, are not declared as attributes. &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para CodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;CodeType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType")
@XmlSeeAlso({
    ExtensionReasonCode.class,
    WeekDayCode.class,
    TypeCode.class,
    TransportationStatusTypeCode.class,
    TransportServiceCode.class,
    TransportModeCode.class,
    TransportMeansTypeCode.class,
    TransportHandlingUnitTypeCode.class,
    TransportExecutionStatusCode.class,
    TransportEventTypeCode.class,
    TransportEquipmentTypeCode.class,
    TransitDirectionCode.class,
    TradeServiceCode.class,
    TrackingDeviceCode.class,
    TimingComplaintCode.class,
    TendererRoleCode.class,
    TendererRequirementTypeCode.class,
    TenderTypeCode.class,
    TaxExemptionReasonCode.class,
    TaxCurrencyCode.class,
    TariffCode.class,
    TariffClassCode.class,
    TargetCurrencyCode.class,
    SubcontractingConditionsCode.class,
    StatusReasonCode.class,
    StatusCode.class,
    StatementTypeCode.class,
    SourceCurrencyCode.class,
    SizeTypeCode.class,
    ShortageActionCode.class,
    ShippingPriorityLevelCode.class,
    ServiceInformationPreferenceCode.class,
    RevisionStatusCode.class,
    RetailEventStatusCode.class,
    ResponseCode.class,
    RequestedInvoiceCurrencyCode.class,
    ReminderTypeCode.class,
    RejectReasonCode.class,
    RejectActionCode.class,
    ReferenceEventCode.class,
    ReceiptAdviceTypeCode.class,
    QuantityDiscrepancyCode.class,
    PurposeCode.class,
    ProviderTypeCode.class,
    ProfileStatusCode.class,
    PricingCurrencyCode.class,
    PriceTypeCode.class,
    PreferenceCriterionCode.class,
    PaymentCurrencyCode.class,
    PaymentAlternativeCurrencyCode.class,
    ParentDocumentTypeCode.class,
    PackagingTypeCode.class,
    PackageLevelCode.class,
    OwnerTypeCode.class,
    OrderResponseCode.class,
    NatureCode.class,
    MeterConstantCode.class,
    MathematicOperatorCode.class,
    LocationTypeCode.class,
    LocaleCode.class,
    ItemClassificationCode.class,
    InvoiceTypeCode.class,
    InspectionMethodCode.class,
    IndustryClassificationCode.class,
    IdentificationCode.class,
    HandlingCode.class,
    GuaranteeTypeCode.class,
    GenderCode.class,
    FreightRateClassCode.class,
    ExpressionCode.class,
    EvidenceTypeCode.class,
    EvaluationCriterionTypeCode.class,
    DutyCode.class,
    DocumentTypeCode.class,
    DocumentStatusReasonCode.class,
    DocumentStatusCode.class,
    DocumentCurrencyCode.class,
    DispositionCode.class,
    DirectionCode.class,
    DespatchAdviceTypeCode.class,
    CustomsStatusCode.class,
    CreditNoteTypeCode.class,
    CountrySubentityCode.class,
    CorrectionTypeCode.class,
    ContractTypeCode.class,
    ConstitutionCode.class,
    ConditionCode.class,
    CommodityCode.class,
    ChannelCode.class,
    CargoTypeCode.class,
    CapabilityTypeCode.class,
    CalculationExpressionCode.class,
    AwardingCriterionTypeCode.class,
    AllowanceChargeReasonCode.class,
    AddressTypeCode.class,
    AddressFormatCode.class,
    AccountTypeCode.class,
    AccountFormatCode.class,
    SealStatusCode.class,
    SealIssuerTypeCode.class,
    PaymentFrequencyCode.class,
    FundingProgramCode.class,
    PriceEvaluationCode.class,
    AwardingMethodTypeCode.class,
    SubmissionMethodCode.class,
    ContractingSystemCode.class,
    PartPresentationCode.class,
    ExpenseCode.class,
    UrgencyCode.class,
    ProcedureCode.class,
    TenderResultCode.class,
    TenderEnvelopeTypeCode.class,
    SpecificationTypeCode.class,
    ServiceTypeCode.class,
    ValidationResultCode.class,
    SecurityClassificationCode.class,
    PaymentPurposeCode.class,
    AccountingCostCode.class,
    AdmissionCode.class,
    PromotionalEventTypeCode.class,
    WorkPhaseCode.class,
    QualityControlCode.class,
    ProcurementSubTypeCode.class,
    ProcurementTypeCode.class,
    ProcessReasonCode.class,
    PreviousCancellationReasonCode.class,
    DescriptionCode.class,
    PositionCode.class,
    FinancingInstrumentCode.class,
    PaymentChannelCode.class,
    PaymentMeansCode.class,
    MandateTypeCode.class,
    ExemptionReasonCode.class,
    TaxLevelCode.class,
    CompanyLiquidationStatusCode.class,
    CompanyLegalFormCode.class,
    OrderTypeCode.class,
    LineStatusCode.class,
    SubstitutionStatusCode.class,
    NotificationTypeCode.class,
    MiscellaneousEventTypeCode.class,
    LatestMeterReadingMethodCode.class,
    PreviousMeterReadingMethodCode.class,
    MeterReadingTypeCode.class,
    NameCode.class,
    LongitudeDirectionCode.class,
    LatitudeDirectionCode.class,
    CoordinateSystemCode.class,
    ImportanceCode.class,
    TimeFrequencyCode.class,
    AvailabilityStatusCode.class,
    HazardousCategoryCode.class,
    MedicalFirstAidGuideCode.class,
    EmergencyProceduresCode.class,
    UNDGCode.class,
    TransportAuthorizationCode.class,
    InhalationToxicityZoneCode.class,
    HazardousRegulationCode.class,
    PackingCriteriaCode.class,
    TransportEmergencyCardCode.class,
    AdjustmentReasonCode.class,
    CharacterSetCode.class,
    EncodingCode.class,
    FormatCode.class,
    MimeCode.class,
    ComparisonDataCode.class,
    ResolutionCode.class,
    DataSourceCode.class,
    ComparisonDataSourceCode.class,
    PerformanceMetricTypeCode.class,
    SupplyChainActivityTypeCode.class,
    ExceptionResolutionCode.class,
    CollaborationPriorityCode.class,
    ExceptionStatusCode.class,
    ThresholdValueComparisonCode.class,
    TradeItemPackingLabelingTypeCode.class,
    FeatureTacticTypeCode.class,
    DisplayTacticTypeCode.class,
    ConsumerIncentiveTacticTypeCode.class,
    ForecastTypeCode.class,
    ForecastPurposeCode.class,
    EnvironmentalEmissionTypeCode.class,
    FullnessIndicationCode.class,
    CalculationMethodCode.class,
    LossRiskResponsibilityCode.class,
    DeclarationTypeCode.class,
    CorporateRegistrationTypeCode.class,
    PartyTypeCode.class,
    ActivityTypeCode.class,
    ExecutionRequirementCode.class,
    OneTimeChargeTypeCode.class,
    CurrentChargeTypeCode.class,
    SubscriberTypeCode.class,
    TelecommunicationsServiceCallCode.class,
    TelecommunicationsServiceCategoryCode.class,
    PrivacyCode.class,
    TelecommunicationsSupplyTypeCode.class,
    CurrencyCode.class,
    TaxTypeCode.class,
    ConsumptionLevelCode.class,
    HeatingTypeCode.class,
    ResidenceTypeCode.class,
    ConsumersEnergyLevelCode.class,
    ConsumptionTypeCode.class,
    UtilityStatementTypeCode.class,
    RoleCode.class,
    ApplicationStatusCode.class,
    CertificateTypeCode.class,
    PackLevelCode.class,
    LifeCycleStatusCode.class,
    ActionCode.class,
    CardChipCode.class,
    CardTypeCode.class,
    WeightingAlgorithmCode.class
})
public class CodeType
    extends com.picoto.jaxb.ubl.common.ccts.CodeType
{


}
