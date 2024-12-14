//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AcceptedVariantsDescription;
import com.picoto.jaxb.ubl.common.cbc.AccountingCost;
import com.picoto.jaxb.ubl.common.cbc.ActivityType;
import com.picoto.jaxb.ubl.common.cbc.AdditionalConditions;
import com.picoto.jaxb.ubl.common.cbc.AdditionalInformation;
import com.picoto.jaxb.ubl.common.cbc.AgencyName;
import com.picoto.jaxb.ubl.common.cbc.AllowanceChargeReason;
import com.picoto.jaxb.ubl.common.cbc.ApprovalStatus;
import com.picoto.jaxb.ubl.common.cbc.AwardingCriterionDescription;
import com.picoto.jaxb.ubl.common.cbc.BackorderReason;
import com.picoto.jaxb.ubl.common.cbc.BirthplaceName;
import com.picoto.jaxb.ubl.common.cbc.BuildingNumber;
import com.picoto.jaxb.ubl.common.cbc.BuyerReference;
import com.picoto.jaxb.ubl.common.cbc.CalculationExpression;
import com.picoto.jaxb.ubl.common.cbc.CancellationNote;
import com.picoto.jaxb.ubl.common.cbc.CandidateStatement;
import com.picoto.jaxb.ubl.common.cbc.CanonicalizationMethod;
import com.picoto.jaxb.ubl.common.cbc.CarrierServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.CertificateType;
import com.picoto.jaxb.ubl.common.cbc.ChangeConditions;
import com.picoto.jaxb.ubl.common.cbc.Channel;
import com.picoto.jaxb.ubl.common.cbc.Characteristics;
import com.picoto.jaxb.ubl.common.cbc.CodeValue;
import com.picoto.jaxb.ubl.common.cbc.Comment;
import com.picoto.jaxb.ubl.common.cbc.CompanyLegalForm;
import com.picoto.jaxb.ubl.common.cbc.Condition;
import com.picoto.jaxb.ubl.common.cbc.Conditions;
import com.picoto.jaxb.ubl.common.cbc.ConditionsDescription;
import com.picoto.jaxb.ubl.common.cbc.ConsumersEnergyLevel;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionLevel;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionType;
import com.picoto.jaxb.ubl.common.cbc.Content;
import com.picoto.jaxb.ubl.common.cbc.ContractName;
import com.picoto.jaxb.ubl.common.cbc.ContractSubdivision;
import com.picoto.jaxb.ubl.common.cbc.ContractType;
import com.picoto.jaxb.ubl.common.cbc.CorrectionType;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentity;
import com.picoto.jaxb.ubl.common.cbc.CurrentChargeType;
import com.picoto.jaxb.ubl.common.cbc.CustomerReference;
import com.picoto.jaxb.ubl.common.cbc.CustomsClearanceServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.DamageRemarks;
import com.picoto.jaxb.ubl.common.cbc.DataSendingCapability;
import com.picoto.jaxb.ubl.common.cbc.DeliveryInstructions;
import com.picoto.jaxb.ubl.common.cbc.DemurrageInstructions;
import com.picoto.jaxb.ubl.common.cbc.Department;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.District;
import com.picoto.jaxb.ubl.common.cbc.DocumentDescription;
import com.picoto.jaxb.ubl.common.cbc.DocumentHash;
import com.picoto.jaxb.ubl.common.cbc.DocumentStatusReasonDescription;
import com.picoto.jaxb.ubl.common.cbc.DocumentType;
import com.picoto.jaxb.ubl.common.cbc.Duty;
import com.picoto.jaxb.ubl.common.cbc.ElectronicDeviceDescription;
import com.picoto.jaxb.ubl.common.cbc.ElectronicMail;
import com.picoto.jaxb.ubl.common.cbc.ExclusionReason;
import com.picoto.jaxb.ubl.common.cbc.ExemptionReason;
import com.picoto.jaxb.ubl.common.cbc.Expression;
import com.picoto.jaxb.ubl.common.cbc.Extension;
import com.picoto.jaxb.ubl.common.cbc.FeeDescription;
import com.picoto.jaxb.ubl.common.cbc.Floor;
import com.picoto.jaxb.ubl.common.cbc.ForwarderServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.Frequency;
import com.picoto.jaxb.ubl.common.cbc.FundingProgram;
import com.picoto.jaxb.ubl.common.cbc.HandlingInstructions;
import com.picoto.jaxb.ubl.common.cbc.HashAlgorithmMethod;
import com.picoto.jaxb.ubl.common.cbc.HaulageInstructions;
import com.picoto.jaxb.ubl.common.cbc.HeatingType;
import com.picoto.jaxb.ubl.common.cbc.Information;
import com.picoto.jaxb.ubl.common.cbc.InhouseMail;
import com.picoto.jaxb.ubl.common.cbc.InstructionNote;
import com.picoto.jaxb.ubl.common.cbc.Instructions;
import com.picoto.jaxb.ubl.common.cbc.InvoicingPartyReference;
import com.picoto.jaxb.ubl.common.cbc.JobTitle;
import com.picoto.jaxb.ubl.common.cbc.Justification;
import com.picoto.jaxb.ubl.common.cbc.JustificationDescription;
import com.picoto.jaxb.ubl.common.cbc.Keyword;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingMethod;
import com.picoto.jaxb.ubl.common.cbc.LegalReference;
import com.picoto.jaxb.ubl.common.cbc.LimitationDescription;
import com.picoto.jaxb.ubl.common.cbc.Line;
import com.picoto.jaxb.ubl.common.cbc.ListValue;
import com.picoto.jaxb.ubl.common.cbc.Location;
import com.picoto.jaxb.ubl.common.cbc.Login;
import com.picoto.jaxb.ubl.common.cbc.LossRisk;
import com.picoto.jaxb.ubl.common.cbc.LowTendersDescription;
import com.picoto.jaxb.ubl.common.cbc.MarkAttention;
import com.picoto.jaxb.ubl.common.cbc.MarkCare;
import com.picoto.jaxb.ubl.common.cbc.MaximumValue;
import com.picoto.jaxb.ubl.common.cbc.MeterConstant;
import com.picoto.jaxb.ubl.common.cbc.MeterName;
import com.picoto.jaxb.ubl.common.cbc.MeterNumber;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingComments;
import com.picoto.jaxb.ubl.common.cbc.MeterReadingType;
import com.picoto.jaxb.ubl.common.cbc.MinimumImprovementBid;
import com.picoto.jaxb.ubl.common.cbc.MinimumValue;
import com.picoto.jaxb.ubl.common.cbc.MonetaryScope;
import com.picoto.jaxb.ubl.common.cbc.MovieTitle;
import com.picoto.jaxb.ubl.common.cbc.NameSuffix;
import com.picoto.jaxb.ubl.common.cbc.NegotiationDescription;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.OneTimeChargeType;
import com.picoto.jaxb.ubl.common.cbc.OptionsDescription;
import com.picoto.jaxb.ubl.common.cbc.OrderableUnit;
import com.picoto.jaxb.ubl.common.cbc.OrganizationDepartment;
import com.picoto.jaxb.ubl.common.cbc.OtherInstruction;
import com.picoto.jaxb.ubl.common.cbc.OutstandingReason;
import com.picoto.jaxb.ubl.common.cbc.PackingMaterial;
import com.picoto.jaxb.ubl.common.cbc.PartyType;
import com.picoto.jaxb.ubl.common.cbc.Password;
import com.picoto.jaxb.ubl.common.cbc.PayPerView;
import com.picoto.jaxb.ubl.common.cbc.PayerReference;
import com.picoto.jaxb.ubl.common.cbc.PaymentDescription;
import com.picoto.jaxb.ubl.common.cbc.PaymentNote;
import com.picoto.jaxb.ubl.common.cbc.PaymentOrderReference;
import com.picoto.jaxb.ubl.common.cbc.PersonalSituation;
import com.picoto.jaxb.ubl.common.cbc.PhoneNumber;
import com.picoto.jaxb.ubl.common.cbc.PlacardEndorsement;
import com.picoto.jaxb.ubl.common.cbc.PlacardNotation;
import com.picoto.jaxb.ubl.common.cbc.PlotIdentification;
import com.picoto.jaxb.ubl.common.cbc.PostalZone;
import com.picoto.jaxb.ubl.common.cbc.Postbox;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingMethod;
import com.picoto.jaxb.ubl.common.cbc.PriceChangeReason;
import com.picoto.jaxb.ubl.common.cbc.PriceRevisionFormulaDescription;
import com.picoto.jaxb.ubl.common.cbc.PriceType;
import com.picoto.jaxb.ubl.common.cbc.PrintQualifier;
import com.picoto.jaxb.ubl.common.cbc.Priority;
import com.picoto.jaxb.ubl.common.cbc.PrizeDescription;
import com.picoto.jaxb.ubl.common.cbc.ProcessDescription;
import com.picoto.jaxb.ubl.common.cbc.ProcessReason;
import com.picoto.jaxb.ubl.common.cbc.Purpose;
import com.picoto.jaxb.ubl.common.cbc.Rank;
import com.picoto.jaxb.ubl.common.cbc.Reference;
import com.picoto.jaxb.ubl.common.cbc.Region;
import com.picoto.jaxb.ubl.common.cbc.RegistrationNationality;
import com.picoto.jaxb.ubl.common.cbc.RegulatoryDomain;
import com.picoto.jaxb.ubl.common.cbc.RejectReason;
import com.picoto.jaxb.ubl.common.cbc.RejectionNote;
import com.picoto.jaxb.ubl.common.cbc.Remarks;
import com.picoto.jaxb.ubl.common.cbc.ReplenishmentOwnerDescription;
import com.picoto.jaxb.ubl.common.cbc.ResidenceType;
import com.picoto.jaxb.ubl.common.cbc.Resolution;
import com.picoto.jaxb.ubl.common.cbc.RoleDescription;
import com.picoto.jaxb.ubl.common.cbc.Room;
import com.picoto.jaxb.ubl.common.cbc.SealingPartyType;
import com.picoto.jaxb.ubl.common.cbc.ServiceNumberCalled;
import com.picoto.jaxb.ubl.common.cbc.ServiceType;
import com.picoto.jaxb.ubl.common.cbc.ShippingMarks;
import com.picoto.jaxb.ubl.common.cbc.ShipsRequirements;
import com.picoto.jaxb.ubl.common.cbc.SignatureMethod;
import com.picoto.jaxb.ubl.common.cbc.SpecialInstructions;
import com.picoto.jaxb.ubl.common.cbc.SpecialServiceInstructions;
import com.picoto.jaxb.ubl.common.cbc.SpecialTerms;
import com.picoto.jaxb.ubl.common.cbc.SpecialTransportRequirements;
import com.picoto.jaxb.ubl.common.cbc.StatusReason;
import com.picoto.jaxb.ubl.common.cbc.SubscriberType;
import com.picoto.jaxb.ubl.common.cbc.SummaryDescription;
import com.picoto.jaxb.ubl.common.cbc.TariffDescription;
import com.picoto.jaxb.ubl.common.cbc.TaxExemptionReason;
import com.picoto.jaxb.ubl.common.cbc.TechnicalCommitteeDescription;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCall;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCategory;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsSupplyType;
import com.picoto.jaxb.ubl.common.cbc.Telefax;
import com.picoto.jaxb.ubl.common.cbc.Telephone;
import com.picoto.jaxb.ubl.common.cbc.TestMethod;
import com.picoto.jaxb.ubl.common.cbc.Text;
import com.picoto.jaxb.ubl.common.cbc.TierRange;
import com.picoto.jaxb.ubl.common.cbc.TimeAmount;
import com.picoto.jaxb.ubl.common.cbc.TimezoneOffset;
import com.picoto.jaxb.ubl.common.cbc.TimingComplaint;
import com.picoto.jaxb.ubl.common.cbc.Title;
import com.picoto.jaxb.ubl.common.cbc.TradingRestrictions;
import com.picoto.jaxb.ubl.common.cbc.TransportServiceProviderRemarks;
import com.picoto.jaxb.ubl.common.cbc.TransportServiceProviderSpecialTerms;
import com.picoto.jaxb.ubl.common.cbc.TransportUserRemarks;
import com.picoto.jaxb.ubl.common.cbc.TransportUserSpecialTerms;
import com.picoto.jaxb.ubl.common.cbc.TransportationServiceDescription;
import com.picoto.jaxb.ubl.common.cbc.ValidateProcess;
import com.picoto.jaxb.ubl.common.cbc.ValidateTool;
import com.picoto.jaxb.ubl.common.cbc.ValidateToolVersion;
import com.picoto.jaxb.ubl.common.cbc.Value;
import com.picoto.jaxb.ubl.common.cbc.ValueQualifier;
import com.picoto.jaxb.ubl.common.cbc.WarrantyInformation;
import com.picoto.jaxb.ubl.common.cbc.Weight;
import com.picoto.jaxb.ubl.common.cbc.WorkPhase;
import com.picoto.jaxb.ubl.common.cbc.XPath;
import com.picoto.jaxb.ubl.common.cec.ExtensionAgencyName;
import com.picoto.jaxb.ubl.common.cec.ExtensionReason;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000019&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (i.e. a finite set of characters), generally in the form of words of a language.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para TextType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TextType"&gt;
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
@XmlType(name = "TextType")
@XmlSeeAlso({
    ExtensionReason.class,
    ExtensionAgencyName.class,
    XPath.class,
    Weight.class,
    TransportationServiceDescription.class,
    TransportUserRemarks.class,
    TransportServiceProviderRemarks.class,
    TradingRestrictions.class,
    Title.class,
    TimingComplaint.class,
    TimezoneOffset.class,
    Text.class,
    TestMethod.class,
    Telephone.class,
    Telefax.class,
    TaxExemptionReason.class,
    TariffDescription.class,
    SummaryDescription.class,
    StatusReason.class,
    SpecialTransportRequirements.class,
    SpecialServiceInstructions.class,
    SpecialInstructions.class,
    ShippingMarks.class,
    Room.class,
    RejectionNote.class,
    RejectReason.class,
    RegulatoryDomain.class,
    RegistrationNationality.class,
    Region.class,
    Reference.class,
    Purpose.class,
    Priority.class,
    PriceType.class,
    PriceChangeReason.class,
    Postbox.class,
    PostalZone.class,
    PlotIdentification.class,
    PaymentOrderReference.class,
    PaymentNote.class,
    PayerReference.class,
    PackingMaterial.class,
    OutstandingReason.class,
    OtherInstruction.class,
    OrganizationDepartment.class,
    NameSuffix.class,
    MinimumImprovementBid.class,
    MeterName.class,
    MeterConstant.class,
    MarkCare.class,
    MarkAttention.class,
    ListValue.class,
    LegalReference.class,
    Keyword.class,
    JobTitle.class,
    InhouseMail.class,
    Information.class,
    HaulageInstructions.class,
    HandlingInstructions.class,
    ForwarderServiceInstructions.class,
    Floor.class,
    Expression.class,
    ElectronicMail.class,
    Duty.class,
    DocumentType.class,
    DocumentStatusReasonDescription.class,
    DocumentDescription.class,
    District.class,
    Department.class,
    DemurrageInstructions.class,
    DeliveryInstructions.class,
    DataSendingCapability.class,
    DamageRemarks.class,
    CustomsClearanceServiceInstructions.class,
    CountrySubentity.class,
    CorrectionType.class,
    ContractType.class,
    ContractName.class,
    Content.class,
    Conditions.class,
    CodeValue.class,
    Characteristics.class,
    Channel.class,
    CarrierServiceInstructions.class,
    CandidateStatement.class,
    CancellationNote.class,
    CalculationExpression.class,
    BuyerReference.class,
    BuildingNumber.class,
    BirthplaceName.class,
    BackorderReason.class,
    AwardingCriterionDescription.class,
    ApprovalStatus.class,
    AllowanceChargeReason.class,
    AgencyName.class,
    Login.class,
    Password.class,
    ChangeConditions.class,
    TransportServiceProviderSpecialTerms.class,
    TransportUserSpecialTerms.class,
    SealingPartyType.class,
    Condition.class,
    AdditionalConditions.class,
    FundingProgram.class,
    PriceRevisionFormulaDescription.class,
    AcceptedVariantsDescription.class,
    NegotiationDescription.class,
    PersonalSituation.class,
    Rank.class,
    TierRange.class,
    Location.class,
    ServiceType.class,
    ValidateToolVersion.class,
    ValidateTool.class,
    ValidateProcess.class,
    InvoicingPartyReference.class,
    AccountingCost.class,
    Resolution.class,
    ExclusionReason.class,
    WorkPhase.class,
    MonetaryScope.class,
    FeeDescription.class,
    ProcessReason.class,
    InstructionNote.class,
    ExemptionReason.class,
    CompanyLegalForm.class,
    CustomerReference.class,
    MeterReadingComments.class,
    LatestMeterReadingMethod.class,
    PreviousMeterReadingMethod.class,
    MeterReadingType.class,
    ValueQualifier.class,
    ShipsRequirements.class,
    MaximumValue.class,
    MinimumValue.class,
    ReplenishmentOwnerDescription.class,
    Extension.class,
    AdditionalInformation.class,
    PlacardEndorsement.class,
    PlacardNotation.class,
    Frequency.class,
    Justification.class,
    HashAlgorithmMethod.class,
    DocumentHash.class,
    Comment.class,
    LimitationDescription.class,
    RoleDescription.class,
    Instructions.class,
    LossRisk.class,
    SpecialTerms.class,
    PartyType.class,
    ActivityType.class,
    OptionsDescription.class,
    TimeAmount.class,
    OneTimeChargeType.class,
    CurrentChargeType.class,
    SubscriberType.class,
    TelecommunicationsServiceCall.class,
    PayPerView.class,
    MovieTitle.class,
    TelecommunicationsServiceCategory.class,
    ServiceNumberCalled.class,
    PhoneNumber.class,
    TelecommunicationsSupplyType.class,
    ConsumptionLevel.class,
    MeterNumber.class,
    HeatingType.class,
    ResidenceType.class,
    ConsumersEnergyLevel.class,
    ConsumptionType.class,
    PrintQualifier.class,
    SignatureMethod.class,
    CanonicalizationMethod.class,
    Remarks.class,
    CertificateType.class,
    WarrantyInformation.class,
    OrderableUnit.class,
    Note.class,
    ContractSubdivision.class,
    PaymentDescription.class,
    PrizeDescription.class,
    LowTendersDescription.class,
    TechnicalCommitteeDescription.class,
    ElectronicDeviceDescription.class,
    ConditionsDescription.class,
    ProcessDescription.class,
    JustificationDescription.class,
    Description.class,
    Line.class,
    Value.class
})
public class TextType
    extends com.picoto.jaxb.ubl.common.ccts.TextType
{


}
