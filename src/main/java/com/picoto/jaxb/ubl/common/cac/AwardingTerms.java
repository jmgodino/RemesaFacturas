//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BindingOnBuyerIndicator;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.FollowupContractIndicator;
import com.picoto.jaxb.ubl.common.cbc.LowTendersDescription;
import com.picoto.jaxb.ubl.common.cbc.PaymentDescription;
import com.picoto.jaxb.ubl.common.cbc.PrizeDescription;
import com.picoto.jaxb.ubl.common.cbc.PrizeIndicator;
import com.picoto.jaxb.ubl.common.cbc.TechnicalCommitteeDescription;
import com.picoto.jaxb.ubl.common.cbc.WeightingAlgorithmCode;


/**
 * <p>Clase Java para AwardingTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AwardingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightingAlgorithmCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TechnicalCommitteeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowTendersDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrizeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrizeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FollowupContractIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BindingOnBuyerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalCommitteePerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardingTermsType", propOrder = {
    "weightingAlgorithmCode",
    "descriptions",
    "technicalCommitteeDescriptions",
    "lowTendersDescriptions",
    "prizeIndicator",
    "prizeDescriptions",
    "paymentDescriptions",
    "followupContractIndicator",
    "bindingOnBuyerIndicator",
    "awardingCriterions",
    "technicalCommitteePersons"
})
@XmlRootElement(name = "AwardingTerms")
public class AwardingTerms {

    @XmlElement(name = "WeightingAlgorithmCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeightingAlgorithmCode weightingAlgorithmCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "TechnicalCommitteeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TechnicalCommitteeDescription> technicalCommitteeDescriptions;
    @XmlElement(name = "LowTendersDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<LowTendersDescription> lowTendersDescriptions;
    @XmlElement(name = "PrizeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrizeIndicator prizeIndicator;
    @XmlElement(name = "PrizeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PrizeDescription> prizeDescriptions;
    @XmlElement(name = "PaymentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentDescription> paymentDescriptions;
    @XmlElement(name = "FollowupContractIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FollowupContractIndicator followupContractIndicator;
    @XmlElement(name = "BindingOnBuyerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BindingOnBuyerIndicator bindingOnBuyerIndicator;
    @XmlElement(name = "AwardingCriterion")
    protected List<AwardingCriterionType> awardingCriterions;
    @XmlElement(name = "TechnicalCommitteePerson")
    protected List<PersonType> technicalCommitteePersons;

    /**
     * Obtiene el valor de la propiedad weightingAlgorithmCode.
     * 
     * @return
     *     possible object is
     *     {@link WeightingAlgorithmCode }
     *     
     */
    public WeightingAlgorithmCode getWeightingAlgorithmCode() {
        return weightingAlgorithmCode;
    }

    /**
     * Define el valor de la propiedad weightingAlgorithmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightingAlgorithmCode }
     *     
     */
    public void setWeightingAlgorithmCode(WeightingAlgorithmCode value) {
        this.weightingAlgorithmCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the technicalCommitteeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCommitteeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCommitteeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalCommitteeDescription }
     * 
     * 
     */
    public List<TechnicalCommitteeDescription> getTechnicalCommitteeDescriptions() {
        if (technicalCommitteeDescriptions == null) {
            technicalCommitteeDescriptions = new ArrayList<TechnicalCommitteeDescription>();
        }
        return this.technicalCommitteeDescriptions;
    }

    /**
     * Gets the value of the lowTendersDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowTendersDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowTendersDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowTendersDescription }
     * 
     * 
     */
    public List<LowTendersDescription> getLowTendersDescriptions() {
        if (lowTendersDescriptions == null) {
            lowTendersDescriptions = new ArrayList<LowTendersDescription>();
        }
        return this.lowTendersDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad prizeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PrizeIndicator }
     *     
     */
    public PrizeIndicator getPrizeIndicator() {
        return prizeIndicator;
    }

    /**
     * Define el valor de la propiedad prizeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PrizeIndicator }
     *     
     */
    public void setPrizeIndicator(PrizeIndicator value) {
        this.prizeIndicator = value;
    }

    /**
     * Gets the value of the prizeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrizeDescription }
     * 
     * 
     */
    public List<PrizeDescription> getPrizeDescriptions() {
        if (prizeDescriptions == null) {
            prizeDescriptions = new ArrayList<PrizeDescription>();
        }
        return this.prizeDescriptions;
    }

    /**
     * Gets the value of the paymentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDescription }
     * 
     * 
     */
    public List<PaymentDescription> getPaymentDescriptions() {
        if (paymentDescriptions == null) {
            paymentDescriptions = new ArrayList<PaymentDescription>();
        }
        return this.paymentDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad followupContractIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FollowupContractIndicator }
     *     
     */
    public FollowupContractIndicator getFollowupContractIndicator() {
        return followupContractIndicator;
    }

    /**
     * Define el valor de la propiedad followupContractIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowupContractIndicator }
     *     
     */
    public void setFollowupContractIndicator(FollowupContractIndicator value) {
        this.followupContractIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad bindingOnBuyerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BindingOnBuyerIndicator }
     *     
     */
    public BindingOnBuyerIndicator getBindingOnBuyerIndicator() {
        return bindingOnBuyerIndicator;
    }

    /**
     * Define el valor de la propiedad bindingOnBuyerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingOnBuyerIndicator }
     *     
     */
    public void setBindingOnBuyerIndicator(BindingOnBuyerIndicator value) {
        this.bindingOnBuyerIndicator = value;
    }

    /**
     * Gets the value of the awardingCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionType }
     * 
     * 
     */
    public List<AwardingCriterionType> getAwardingCriterions() {
        if (awardingCriterions == null) {
            awardingCriterions = new ArrayList<AwardingCriterionType>();
        }
        return this.awardingCriterions;
    }

    /**
     * Gets the value of the technicalCommitteePersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCommitteePersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCommitteePersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getTechnicalCommitteePersons() {
        if (technicalCommitteePersons == null) {
            technicalCommitteePersons = new ArrayList<PersonType>();
        }
        return this.technicalCommitteePersons;
    }

}
