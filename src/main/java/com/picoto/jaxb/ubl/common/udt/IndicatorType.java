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
import javax.xml.bind.annotation.XmlValue;
import com.picoto.jaxb.ubl.common.cbc.AcceptedIndicator;
import com.picoto.jaxb.ubl.common.cbc.AdValoremIndicator;
import com.picoto.jaxb.ubl.common.cbc.AnimalFoodApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.AnimalFoodIndicator;
import com.picoto.jaxb.ubl.common.cbc.AuctionConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.BackOrderAllowedIndicator;
import com.picoto.jaxb.ubl.common.cbc.BalanceBroughtForwardIndicator;
import com.picoto.jaxb.ubl.common.cbc.BasedOnConsensusIndicator;
import com.picoto.jaxb.ubl.common.cbc.BindingOnBuyerIndicator;
import com.picoto.jaxb.ubl.common.cbc.BulkCargoIndicator;
import com.picoto.jaxb.ubl.common.cbc.CandidateReductionConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.CatalogueIndicator;
import com.picoto.jaxb.ubl.common.cbc.ChargeIndicator;
import com.picoto.jaxb.ubl.common.cbc.CompletionIndicator;
import com.picoto.jaxb.ubl.common.cbc.ConsolidatableIndicator;
import com.picoto.jaxb.ubl.common.cbc.ContainerizedIndicator;
import com.picoto.jaxb.ubl.common.cbc.CopyIndicator;
import com.picoto.jaxb.ubl.common.cbc.CustomsImportClassifiedIndicator;
import com.picoto.jaxb.ubl.common.cbc.DangerousGoodsApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.FollowupContractIndicator;
import com.picoto.jaxb.ubl.common.cbc.FreeOfChargeIndicator;
import com.picoto.jaxb.ubl.common.cbc.FrozenDocumentIndicator;
import com.picoto.jaxb.ubl.common.cbc.FullyPaidSharesIndicator;
import com.picoto.jaxb.ubl.common.cbc.GeneralCargoIndicator;
import com.picoto.jaxb.ubl.common.cbc.GovernmentAgreementConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.HazardousRiskIndicator;
import com.picoto.jaxb.ubl.common.cbc.HumanFoodApprovedIndicator;
import com.picoto.jaxb.ubl.common.cbc.HumanFoodIndicator;
import com.picoto.jaxb.ubl.common.cbc.IndicationIndicator;
import com.picoto.jaxb.ubl.common.cbc.ItemUpdateRequestIndicator;
import com.picoto.jaxb.ubl.common.cbc.LegalStatusIndicator;
import com.picoto.jaxb.ubl.common.cbc.LivestockIndicator;
import com.picoto.jaxb.ubl.common.cbc.MarkAttentionIndicator;
import com.picoto.jaxb.ubl.common.cbc.MarkCareIndicator;
import com.picoto.jaxb.ubl.common.cbc.OnCarriageIndicator;
import com.picoto.jaxb.ubl.common.cbc.OptionalLineItemIndicator;
import com.picoto.jaxb.ubl.common.cbc.OrderableIndicator;
import com.picoto.jaxb.ubl.common.cbc.OtherConditionsIndicator;
import com.picoto.jaxb.ubl.common.cbc.PartialDeliveryIndicator;
import com.picoto.jaxb.ubl.common.cbc.PowerIndicator;
import com.picoto.jaxb.ubl.common.cbc.PreCarriageIndicator;
import com.picoto.jaxb.ubl.common.cbc.PrepaidIndicator;
import com.picoto.jaxb.ubl.common.cbc.PricingUpdateRequestIndicator;
import com.picoto.jaxb.ubl.common.cbc.PrizeIndicator;
import com.picoto.jaxb.ubl.common.cbc.PublishAwardIndicator;
import com.picoto.jaxb.ubl.common.cbc.RefrigeratedIndicator;
import com.picoto.jaxb.ubl.common.cbc.RefrigerationOnIndicator;
import com.picoto.jaxb.ubl.common.cbc.RequiredCurriculaIndicator;
import com.picoto.jaxb.ubl.common.cbc.ReturnabilityIndicator;
import com.picoto.jaxb.ubl.common.cbc.ReturnableMaterialIndicator;
import com.picoto.jaxb.ubl.common.cbc.SoleProprietorshipIndicator;
import com.picoto.jaxb.ubl.common.cbc.SpecialSecurityIndicator;
import com.picoto.jaxb.ubl.common.cbc.SplitConsignmentIndicator;
import com.picoto.jaxb.ubl.common.cbc.StatusAvailableIndicator;
import com.picoto.jaxb.ubl.common.cbc.TaxEvidenceIndicator;
import com.picoto.jaxb.ubl.common.cbc.TaxIncludedIndicator;
import com.picoto.jaxb.ubl.common.cbc.ThirdPartyPayerIndicator;
import com.picoto.jaxb.ubl.common.cbc.ToOrderIndicator;
import com.picoto.jaxb.ubl.common.cbc.UnknownPriceIndicator;
import com.picoto.jaxb.ubl.common.cbc.VariantConstraintIndicator;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000012&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A list of two mutually exclusive Boolean values that express the only possible states of a property.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para IndicatorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IndicatorType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorType", propOrder = {
    "value"
})
@XmlSeeAlso({
    BasedOnConsensusIndicator.class,
    PrepaidIndicator.class,
    CatalogueIndicator.class,
    AdValoremIndicator.class,
    ContainerizedIndicator.class,
    OnCarriageIndicator.class,
    PreCarriageIndicator.class,
    ReturnableMaterialIndicator.class,
    RefrigeratedIndicator.class,
    OtherConditionsIndicator.class,
    ConsolidatableIndicator.class,
    HumanFoodIndicator.class,
    GovernmentAgreementConstraintIndicator.class,
    LivestockIndicator.class,
    FrozenDocumentIndicator.class,
    PublishAwardIndicator.class,
    GeneralCargoIndicator.class,
    BulkCargoIndicator.class,
    MarkCareIndicator.class,
    ChargeIndicator.class,
    CustomsImportClassifiedIndicator.class,
    ItemUpdateRequestIndicator.class,
    TaxIncludedIndicator.class,
    UnknownPriceIndicator.class,
    PrizeIndicator.class,
    HazardousRiskIndicator.class,
    SplitConsignmentIndicator.class,
    CopyIndicator.class,
    OrderableIndicator.class,
    ReturnabilityIndicator.class,
    OptionalLineItemIndicator.class,
    DangerousGoodsApprovedIndicator.class,
    TaxEvidenceIndicator.class,
    FollowupContractIndicator.class,
    SpecialSecurityIndicator.class,
    FreeOfChargeIndicator.class,
    AnimalFoodIndicator.class,
    AcceptedIndicator.class,
    CompletionIndicator.class,
    FullyPaidSharesIndicator.class,
    ThirdPartyPayerIndicator.class,
    BackOrderAllowedIndicator.class,
    PricingUpdateRequestIndicator.class,
    SoleProprietorshipIndicator.class,
    HumanFoodApprovedIndicator.class,
    StatusAvailableIndicator.class,
    CandidateReductionConstraintIndicator.class,
    AuctionConstraintIndicator.class,
    BindingOnBuyerIndicator.class,
    BalanceBroughtForwardIndicator.class,
    PowerIndicator.class,
    PartialDeliveryIndicator.class,
    ToOrderIndicator.class,
    IndicationIndicator.class,
    VariantConstraintIndicator.class,
    RequiredCurriculaIndicator.class,
    RefrigerationOnIndicator.class,
    LegalStatusIndicator.class,
    AnimalFoodApprovedIndicator.class,
    MarkAttentionIndicator.class
})
public class IndicatorType {

    @XmlValue
    protected boolean value;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
