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
 * &lt;complexType name="IndicatorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorType", propOrder = {
    "value"
})
@XmlSeeAlso({
    UnknownPriceIndicator.class,
    ToOrderIndicator.class,
    ThirdPartyPayerIndicator.class,
    TaxEvidenceIndicator.class,
    StatusAvailableIndicator.class,
    SplitConsignmentIndicator.class,
    SpecialSecurityIndicator.class,
    ReturnableMaterialIndicator.class,
    ReturnabilityIndicator.class,
    RefrigerationOnIndicator.class,
    RefrigeratedIndicator.class,
    PublishAwardIndicator.class,
    PricingUpdateRequestIndicator.class,
    PrepaidIndicator.class,
    PreCarriageIndicator.class,
    PowerIndicator.class,
    PartialDeliveryIndicator.class,
    OnCarriageIndicator.class,
    MarkCareIndicator.class,
    MarkAttentionIndicator.class,
    LivestockIndicator.class,
    LegalStatusIndicator.class,
    ItemUpdateRequestIndicator.class,
    IndicationIndicator.class,
    HumanFoodIndicator.class,
    HumanFoodApprovedIndicator.class,
    HazardousRiskIndicator.class,
    GeneralCargoIndicator.class,
    FreeOfChargeIndicator.class,
    DangerousGoodsApprovedIndicator.class,
    CustomsImportClassifiedIndicator.class,
    ContainerizedIndicator.class,
    ConsolidatableIndicator.class,
    CompletionIndicator.class,
    ChargeIndicator.class,
    CatalogueIndicator.class,
    BulkCargoIndicator.class,
    BasedOnConsensusIndicator.class,
    BackOrderAllowedIndicator.class,
    AnimalFoodIndicator.class,
    AnimalFoodApprovedIndicator.class,
    AdValoremIndicator.class,
    AcceptedIndicator.class,
    OtherConditionsIndicator.class,
    RequiredCurriculaIndicator.class,
    VariantConstraintIndicator.class,
    GovernmentAgreementConstraintIndicator.class,
    CandidateReductionConstraintIndicator.class,
    OptionalLineItemIndicator.class,
    BalanceBroughtForwardIndicator.class,
    TaxIncludedIndicator.class,
    FullyPaidSharesIndicator.class,
    SoleProprietorshipIndicator.class,
    CopyIndicator.class,
    FrozenDocumentIndicator.class,
    OrderableIndicator.class,
    BindingOnBuyerIndicator.class,
    FollowupContractIndicator.class,
    PrizeIndicator.class,
    AuctionConstraintIndicator.class
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
