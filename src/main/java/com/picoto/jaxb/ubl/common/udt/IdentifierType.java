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
import com.picoto.jaxb.ubl.common.cbc.AccountID;
import com.picoto.jaxb.ubl.common.cbc.AdditionalAccountID;
import com.picoto.jaxb.ubl.common.cbc.AgencyID;
import com.picoto.jaxb.ubl.common.cbc.AircraftID;
import com.picoto.jaxb.ubl.common.cbc.AttributeID;
import com.picoto.jaxb.ubl.common.cbc.AuctionURI;
import com.picoto.jaxb.ubl.common.cbc.AwardingCriterionID;
import com.picoto.jaxb.ubl.common.cbc.BarcodeSymbologyID;
import com.picoto.jaxb.ubl.common.cbc.BrokerAssignedID;
import com.picoto.jaxb.ubl.common.cbc.BusinessClassificationEvidenceID;
import com.picoto.jaxb.ubl.common.cbc.BusinessIdentityEvidenceID;
import com.picoto.jaxb.ubl.common.cbc.BuyerEventID;
import com.picoto.jaxb.ubl.common.cbc.BuyerProfileURI;
import com.picoto.jaxb.ubl.common.cbc.CV2ID;
import com.picoto.jaxb.ubl.common.cbc.CarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.ChipApplicationID;
import com.picoto.jaxb.ubl.common.cbc.CompanyID;
import com.picoto.jaxb.ubl.common.cbc.ConsigneeAssignedID;
import com.picoto.jaxb.ubl.common.cbc.ConsignorAssignedID;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionID;
import com.picoto.jaxb.ubl.common.cbc.ConsumptionReportID;
import com.picoto.jaxb.ubl.common.cbc.ContractFolderID;
import com.picoto.jaxb.ubl.common.cbc.ContractedCarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.CustomerAssignedAccountID;
import com.picoto.jaxb.ubl.common.cbc.CustomizationID;
import com.picoto.jaxb.ubl.common.cbc.DocumentID;
import com.picoto.jaxb.ubl.common.cbc.EconomicOperatorRegistryURI;
import com.picoto.jaxb.ubl.common.cbc.EndpointID;
import com.picoto.jaxb.ubl.common.cbc.ExchangeMarketID;
import com.picoto.jaxb.ubl.common.cbc.ExtendedID;
import com.picoto.jaxb.ubl.common.cbc.FreightForwarderAssignedID;
import com.picoto.jaxb.ubl.common.cbc.HazardClassID;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.IdentificationID;
import com.picoto.jaxb.ubl.common.cbc.ImmobilizationCertificateID;
import com.picoto.jaxb.ubl.common.cbc.InformationURI;
import com.picoto.jaxb.ubl.common.cbc.InstructionID;
import com.picoto.jaxb.ubl.common.cbc.IssueNumberID;
import com.picoto.jaxb.ubl.common.cbc.IssuerID;
import com.picoto.jaxb.ubl.common.cbc.JourneyID;
import com.picoto.jaxb.ubl.common.cbc.LanguageID;
import com.picoto.jaxb.ubl.common.cbc.LicensePlateID;
import com.picoto.jaxb.ubl.common.cbc.LineID;
import com.picoto.jaxb.ubl.common.cbc.LoadingSequenceID;
import com.picoto.jaxb.ubl.common.cbc.LocationID;
import com.picoto.jaxb.ubl.common.cbc.LogoReferenceID;
import com.picoto.jaxb.ubl.common.cbc.LotNumberID;
import com.picoto.jaxb.ubl.common.cbc.LowerOrangeHazardPlacardID;
import com.picoto.jaxb.ubl.common.cbc.MarkingID;
import com.picoto.jaxb.ubl.common.cbc.NationalityID;
import com.picoto.jaxb.ubl.common.cbc.NetworkID;
import com.picoto.jaxb.ubl.common.cbc.OntologyURI;
import com.picoto.jaxb.ubl.common.cbc.OpenTenderID;
import com.picoto.jaxb.ubl.common.cbc.OriginalContractingSystemID;
import com.picoto.jaxb.ubl.common.cbc.OriginalJobID;
import com.picoto.jaxb.ubl.common.cbc.ParentDocumentID;
import com.picoto.jaxb.ubl.common.cbc.ParentDocumentLineReferenceID;
import com.picoto.jaxb.ubl.common.cbc.ParentDocumentVersionID;
import com.picoto.jaxb.ubl.common.cbc.PaymentID;
import com.picoto.jaxb.ubl.common.cbc.PaymentMeansID;
import com.picoto.jaxb.ubl.common.cbc.PaymentTermsDetailsURI;
import com.picoto.jaxb.ubl.common.cbc.PerformingCarrierAssignedID;
import com.picoto.jaxb.ubl.common.cbc.PrepaidPaymentReferenceID;
import com.picoto.jaxb.ubl.common.cbc.PreviousJobID;
import com.picoto.jaxb.ubl.common.cbc.PreviousVersionID;
import com.picoto.jaxb.ubl.common.cbc.PrimaryAccountNumberID;
import com.picoto.jaxb.ubl.common.cbc.ProductTraceID;
import com.picoto.jaxb.ubl.common.cbc.ProfileExecutionID;
import com.picoto.jaxb.ubl.common.cbc.ProfileID;
import com.picoto.jaxb.ubl.common.cbc.RadioCallSignID;
import com.picoto.jaxb.ubl.common.cbc.RailCarID;
import com.picoto.jaxb.ubl.common.cbc.ReferenceID;
import com.picoto.jaxb.ubl.common.cbc.ReferencedConsignmentID;
import com.picoto.jaxb.ubl.common.cbc.RegistrationID;
import com.picoto.jaxb.ubl.common.cbc.RegistrationNationalityID;
import com.picoto.jaxb.ubl.common.cbc.ReleaseID;
import com.picoto.jaxb.ubl.common.cbc.RequestForQuotationLineID;
import com.picoto.jaxb.ubl.common.cbc.RequiredCustomsID;
import com.picoto.jaxb.ubl.common.cbc.RevisedForecastLineID;
import com.picoto.jaxb.ubl.common.cbc.SalesOrderID;
import com.picoto.jaxb.ubl.common.cbc.SalesOrderLineID;
import com.picoto.jaxb.ubl.common.cbc.SchemeURI;
import com.picoto.jaxb.ubl.common.cbc.SecurityID;
import com.picoto.jaxb.ubl.common.cbc.SellerEventID;
import com.picoto.jaxb.ubl.common.cbc.SequenceID;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumberID;
import com.picoto.jaxb.ubl.common.cbc.SerialID;
import com.picoto.jaxb.ubl.common.cbc.ShippingOrderID;
import com.picoto.jaxb.ubl.common.cbc.SignatureID;
import com.picoto.jaxb.ubl.common.cbc.SpecificationID;
import com.picoto.jaxb.ubl.common.cbc.SubscriberID;
import com.picoto.jaxb.ubl.common.cbc.SuccessiveSequenceID;
import com.picoto.jaxb.ubl.common.cbc.SupplierAssignedAccountID;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeID;
import com.picoto.jaxb.ubl.common.cbc.TraceID;
import com.picoto.jaxb.ubl.common.cbc.TrackingID;
import com.picoto.jaxb.ubl.common.cbc.TrainID;
import com.picoto.jaxb.ubl.common.cbc.TransportExecutionPlanReferenceID;
import com.picoto.jaxb.ubl.common.cbc.TransportationServiceDetailsURI;
import com.picoto.jaxb.ubl.common.cbc.UBLVersionID;
import com.picoto.jaxb.ubl.common.cbc.URI;
import com.picoto.jaxb.ubl.common.cbc.UUID;
import com.picoto.jaxb.ubl.common.cbc.UpperOrangeHazardPlacardID;
import com.picoto.jaxb.ubl.common.cbc.ValidatorID;
import com.picoto.jaxb.ubl.common.cbc.VariantID;
import com.picoto.jaxb.ubl.common.cbc.VersionID;
import com.picoto.jaxb.ubl.common.cbc.VesselID;
import com.picoto.jaxb.ubl.common.cbc.WebsiteURI;
import com.picoto.jaxb.ubl.common.cec.ExtensionAgencyID;
import com.picoto.jaxb.ubl.common.cec.ExtensionAgencyURI;
import com.picoto.jaxb.ubl.common.cec.ExtensionURI;
import com.picoto.jaxb.ubl.common.cec.ExtensionVersionID;
import com.picoto.jaxb.ubl.common.sbc.ReferencedSignatureID;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and uniquely distinguish one instance of an object in an identification scheme from all other objects in the same scheme, together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the identifier list and thus, are not declared as attributes. &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para IdentifierType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;IdentifierType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType")
@XmlSeeAlso({
    ReferencedSignatureID.class,
    ExtensionURI.class,
    ExtensionAgencyURI.class,
    ExtensionVersionID.class,
    ExtensionAgencyID.class,
    WebsiteURI.class,
    VersionID.class,
    VariantID.class,
    UBLVersionID.class,
    TransportationServiceDetailsURI.class,
    TrackingID.class,
    TraceID.class,
    SupplierAssignedAccountID.class,
    SuccessiveSequenceID.class,
    ShippingOrderID.class,
    SequenceNumberID.class,
    SequenceID.class,
    SellerEventID.class,
    SchemeURI.class,
    RequiredCustomsID.class,
    RegistrationNationalityID.class,
    ReferencedConsignmentID.class,
    ProfileID.class,
    ProfileExecutionID.class,
    PreviousVersionID.class,
    PrepaidPaymentReferenceID.class,
    PerformingCarrierAssignedID.class,
    PaymentTermsDetailsURI.class,
    PaymentMeansID.class,
    ParentDocumentVersionID.class,
    ParentDocumentID.class,
    OntologyURI.class,
    NationalityID.class,
    LogoReferenceID.class,
    LoadingSequenceID.class,
    LanguageID.class,
    JourneyID.class,
    InformationURI.class,
    IdentificationID.class,
    FreightForwarderAssignedID.class,
    ExtendedID.class,
    ExchangeMarketID.class,
    EndpointID.class,
    DocumentID.class,
    CustomizationID.class,
    CustomerAssignedAccountID.class,
    ContractedCarrierAssignedID.class,
    ContractFolderID.class,
    ConsignorAssignedID.class,
    ConsigneeAssignedID.class,
    CarrierAssignedID.class,
    BuyerEventID.class,
    BusinessIdentityEvidenceID.class,
    BusinessClassificationEvidenceID.class,
    BrokerAssignedID.class,
    BarcodeSymbologyID.class,
    AwardingCriterionID.class,
    AgencyID.class,
    AdditionalAccountID.class,
    TransportExecutionPlanReferenceID.class,
    EconomicOperatorRegistryURI.class,
    OriginalContractingSystemID.class,
    OpenTenderID.class,
    TenderEnvelopeID.class,
    ConsumptionID.class,
    LocationID.class,
    LicensePlateID.class,
    RailCarID.class,
    TrainID.class,
    RequestForQuotationLineID.class,
    SpecificationID.class,
    PaymentID.class,
    InstructionID.class,
    SignatureID.class,
    CompanyID.class,
    SalesOrderID.class,
    UUID.class,
    SalesOrderLineID.class,
    LineID.class,
    RadioCallSignID.class,
    VesselID.class,
    LotNumberID.class,
    SerialID.class,
    RegistrationID.class,
    ProductTraceID.class,
    SecurityID.class,
    ImmobilizationCertificateID.class,
    HazardClassID.class,
    MarkingID.class,
    LowerOrangeHazardPlacardID.class,
    UpperOrangeHazardPlacardID.class,
    RevisedForecastLineID.class,
    URI.class,
    ReleaseID.class,
    AccountID.class,
    BuyerProfileURI.class,
    SubscriberID.class,
    ParentDocumentLineReferenceID.class,
    ConsumptionReportID.class,
    AttributeID.class,
    PreviousJobID.class,
    OriginalJobID.class,
    ReferenceID.class,
    ValidatorID.class,
    ChipApplicationID.class,
    CV2ID.class,
    IssueNumberID.class,
    IssuerID.class,
    NetworkID.class,
    PrimaryAccountNumberID.class,
    ID.class,
    AuctionURI.class,
    AircraftID.class
})
public class IdentifierType
    extends com.picoto.jaxb.ubl.common.ccts.IdentifierType
{


}
