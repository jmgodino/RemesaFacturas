//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AdvertisementAmount;
import com.picoto.jaxb.ubl.common.cbc.AwardDate;
import com.picoto.jaxb.ubl.common.cbc.AwardTime;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.HigherTenderAmount;
import com.picoto.jaxb.ubl.common.cbc.LowerTenderAmount;
import com.picoto.jaxb.ubl.common.cbc.ReceivedElectronicTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedForeignTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.ReceivedTenderQuantity;
import com.picoto.jaxb.ubl.common.cbc.StartDate;
import com.picoto.jaxb.ubl.common.cbc.TenderResultCode;


/**
 * <p>Clase Java para TenderResultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TenderResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HigherTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedElectronicTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedForeignTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardedTenderedProject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractFormalizationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WinningParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderResultType", propOrder = {
    "tenderResultCode",
    "descriptions",
    "advertisementAmount",
    "awardDate",
    "awardTime",
    "receivedTenderQuantity",
    "lowerTenderAmount",
    "higherTenderAmount",
    "startDate",
    "receivedElectronicTenderQuantity",
    "receivedForeignTenderQuantity",
    "contract",
    "awardedTenderedProject",
    "contractFormalizationPeriod",
    "subcontractTerms",
    "winningParties"
})
@XmlRootElement(name = "TenderResult")
public class TenderResult {

    @XmlElement(name = "TenderResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderResultCode tenderResultCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "AdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdvertisementAmount advertisementAmount;
    @XmlElement(name = "AwardDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AwardDate awardDate;
    @XmlElement(name = "AwardTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardTime awardTime;
    @XmlElement(name = "ReceivedTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedTenderQuantity receivedTenderQuantity;
    @XmlElement(name = "LowerTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LowerTenderAmount lowerTenderAmount;
    @XmlElement(name = "HigherTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HigherTenderAmount higherTenderAmount;
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StartDate startDate;
    @XmlElement(name = "ReceivedElectronicTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedElectronicTenderQuantity receivedElectronicTenderQuantity;
    @XmlElement(name = "ReceivedForeignTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedForeignTenderQuantity receivedForeignTenderQuantity;
    @XmlElement(name = "Contract")
    protected ContractType contract;
    @XmlElement(name = "AwardedTenderedProject")
    protected TenderedProjectType awardedTenderedProject;
    @XmlElement(name = "ContractFormalizationPeriod")
    protected PeriodType contractFormalizationPeriod;
    @XmlElement(name = "SubcontractTerms")
    protected List<SubcontractTermsType> subcontractTerms;
    @XmlElement(name = "WinningParty")
    protected List<WinningParty> winningParties;

    /**
     * Obtiene el valor de la propiedad tenderResultCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderResultCode }
     *     
     */
    public TenderResultCode getTenderResultCode() {
        return tenderResultCode;
    }

    /**
     * Define el valor de la propiedad tenderResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderResultCode }
     *     
     */
    public void setTenderResultCode(TenderResultCode value) {
        this.tenderResultCode = value;
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
     * Obtiene el valor de la propiedad advertisementAmount.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementAmount }
     *     
     */
    public AdvertisementAmount getAdvertisementAmount() {
        return advertisementAmount;
    }

    /**
     * Define el valor de la propiedad advertisementAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementAmount }
     *     
     */
    public void setAdvertisementAmount(AdvertisementAmount value) {
        this.advertisementAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad awardDate.
     * 
     * @return
     *     possible object is
     *     {@link AwardDate }
     *     
     */
    public AwardDate getAwardDate() {
        return awardDate;
    }

    /**
     * Define el valor de la propiedad awardDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardDate }
     *     
     */
    public void setAwardDate(AwardDate value) {
        this.awardDate = value;
    }

    /**
     * Obtiene el valor de la propiedad awardTime.
     * 
     * @return
     *     possible object is
     *     {@link AwardTime }
     *     
     */
    public AwardTime getAwardTime() {
        return awardTime;
    }

    /**
     * Define el valor de la propiedad awardTime.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardTime }
     *     
     */
    public void setAwardTime(AwardTime value) {
        this.awardTime = value;
    }

    /**
     * Obtiene el valor de la propiedad receivedTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedTenderQuantity }
     *     
     */
    public ReceivedTenderQuantity getReceivedTenderQuantity() {
        return receivedTenderQuantity;
    }

    /**
     * Define el valor de la propiedad receivedTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedTenderQuantity }
     *     
     */
    public void setReceivedTenderQuantity(ReceivedTenderQuantity value) {
        this.receivedTenderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad lowerTenderAmount.
     * 
     * @return
     *     possible object is
     *     {@link LowerTenderAmount }
     *     
     */
    public LowerTenderAmount getLowerTenderAmount() {
        return lowerTenderAmount;
    }

    /**
     * Define el valor de la propiedad lowerTenderAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerTenderAmount }
     *     
     */
    public void setLowerTenderAmount(LowerTenderAmount value) {
        this.lowerTenderAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad higherTenderAmount.
     * 
     * @return
     *     possible object is
     *     {@link HigherTenderAmount }
     *     
     */
    public HigherTenderAmount getHigherTenderAmount() {
        return higherTenderAmount;
    }

    /**
     * Define el valor de la propiedad higherTenderAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link HigherTenderAmount }
     *     
     */
    public void setHigherTenderAmount(HigherTenderAmount value) {
        this.higherTenderAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad receivedElectronicTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedElectronicTenderQuantity }
     *     
     */
    public ReceivedElectronicTenderQuantity getReceivedElectronicTenderQuantity() {
        return receivedElectronicTenderQuantity;
    }

    /**
     * Define el valor de la propiedad receivedElectronicTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedElectronicTenderQuantity }
     *     
     */
    public void setReceivedElectronicTenderQuantity(ReceivedElectronicTenderQuantity value) {
        this.receivedElectronicTenderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad receivedForeignTenderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedForeignTenderQuantity }
     *     
     */
    public ReceivedForeignTenderQuantity getReceivedForeignTenderQuantity() {
        return receivedForeignTenderQuantity;
    }

    /**
     * Define el valor de la propiedad receivedForeignTenderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedForeignTenderQuantity }
     *     
     */
    public void setReceivedForeignTenderQuantity(ReceivedForeignTenderQuantity value) {
        this.receivedForeignTenderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Obtiene el valor de la propiedad awardedTenderedProject.
     * 
     * @return
     *     possible object is
     *     {@link TenderedProjectType }
     *     
     */
    public TenderedProjectType getAwardedTenderedProject() {
        return awardedTenderedProject;
    }

    /**
     * Define el valor de la propiedad awardedTenderedProject.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderedProjectType }
     *     
     */
    public void setAwardedTenderedProject(TenderedProjectType value) {
        this.awardedTenderedProject = value;
    }

    /**
     * Obtiene el valor de la propiedad contractFormalizationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractFormalizationPeriod() {
        return contractFormalizationPeriod;
    }

    /**
     * Define el valor de la propiedad contractFormalizationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractFormalizationPeriod(PeriodType value) {
        this.contractFormalizationPeriod = value;
    }

    /**
     * Gets the value of the subcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getSubcontractTerms() {
        if (subcontractTerms == null) {
            subcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.subcontractTerms;
    }

    /**
     * Gets the value of the winningParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the winningParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWinningParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WinningParty }
     * 
     * 
     */
    public List<WinningParty> getWinningParties() {
        if (winningParties == null) {
            winningParties = new ArrayList<WinningParty>();
        }
        return this.winningParties;
    }

}
