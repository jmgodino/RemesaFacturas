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
import com.picoto.jaxb.ubl.common.cbc.CallBaseAmount;
import com.picoto.jaxb.ubl.common.cbc.CallDate;
import com.picoto.jaxb.ubl.common.cbc.CallExtensionAmount;
import com.picoto.jaxb.ubl.common.cbc.CallTime;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.MovieTitle;
import com.picoto.jaxb.ubl.common.cbc.PayPerView;
import com.picoto.jaxb.ubl.common.cbc.Quantity;
import com.picoto.jaxb.ubl.common.cbc.RoamingPartnerName;
import com.picoto.jaxb.ubl.common.cbc.ServiceNumberCalled;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCall;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCallCode;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCategory;
import com.picoto.jaxb.ubl.common.cbc.TelecommunicationsServiceCategoryCode;


/**
 * <p>Clase Java para TelecommunicationsServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallTime"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceNumberCalled"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MovieTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoamingPartnerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayPerView" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCall" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCallCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallBaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TimeDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsServiceType", propOrder = {
    "id",
    "callDate",
    "callTime",
    "serviceNumberCalled",
    "telecommunicationsServiceCategory",
    "telecommunicationsServiceCategoryCode",
    "movieTitle",
    "roamingPartnerName",
    "payPerView",
    "quantity",
    "telecommunicationsServiceCall",
    "telecommunicationsServiceCallCode",
    "callBaseAmount",
    "callExtensionAmount",
    "price",
    "country",
    "exchangeRates",
    "allowanceCharges",
    "taxTotals",
    "callDuties",
    "timeDuties"
})
@XmlRootElement(name = "TelecommunicationsService")
public class TelecommunicationsService {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "CallDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CallDate callDate;
    @XmlElement(name = "CallTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected CallTime callTime;
    @XmlElement(name = "ServiceNumberCalled", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ServiceNumberCalled serviceNumberCalled;
    @XmlElement(name = "TelecommunicationsServiceCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCategory telecommunicationsServiceCategory;
    @XmlElement(name = "TelecommunicationsServiceCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCategoryCode telecommunicationsServiceCategoryCode;
    @XmlElement(name = "MovieTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MovieTitle movieTitle;
    @XmlElement(name = "RoamingPartnerName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoamingPartnerName roamingPartnerName;
    @XmlElement(name = "PayPerView", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PayPerView payPerView;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Quantity quantity;
    @XmlElement(name = "TelecommunicationsServiceCall", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCall telecommunicationsServiceCall;
    @XmlElement(name = "TelecommunicationsServiceCallCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TelecommunicationsServiceCallCode telecommunicationsServiceCallCode;
    @XmlElement(name = "CallBaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CallBaseAmount callBaseAmount;
    @XmlElement(name = "CallExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CallExtensionAmount callExtensionAmount;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "ExchangeRate")
    protected List<ExchangeRateType> exchangeRates;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "CallDuty")
    protected List<DutyType> callDuties;
    @XmlElement(name = "TimeDuty")
    protected List<DutyType> timeDuties;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad callDate.
     * 
     * @return
     *     possible object is
     *     {@link CallDate }
     *     
     */
    public CallDate getCallDate() {
        return callDate;
    }

    /**
     * Define el valor de la propiedad callDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CallDate }
     *     
     */
    public void setCallDate(CallDate value) {
        this.callDate = value;
    }

    /**
     * Obtiene el valor de la propiedad callTime.
     * 
     * @return
     *     possible object is
     *     {@link CallTime }
     *     
     */
    public CallTime getCallTime() {
        return callTime;
    }

    /**
     * Define el valor de la propiedad callTime.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTime }
     *     
     */
    public void setCallTime(CallTime value) {
        this.callTime = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceNumberCalled.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNumberCalled }
     *     
     */
    public ServiceNumberCalled getServiceNumberCalled() {
        return serviceNumberCalled;
    }

    /**
     * Define el valor de la propiedad serviceNumberCalled.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNumberCalled }
     *     
     */
    public void setServiceNumberCalled(ServiceNumberCalled value) {
        this.serviceNumberCalled = value;
    }

    /**
     * Obtiene el valor de la propiedad telecommunicationsServiceCategory.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategory }
     *     
     */
    public TelecommunicationsServiceCategory getTelecommunicationsServiceCategory() {
        return telecommunicationsServiceCategory;
    }

    /**
     * Define el valor de la propiedad telecommunicationsServiceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategory }
     *     
     */
    public void setTelecommunicationsServiceCategory(TelecommunicationsServiceCategory value) {
        this.telecommunicationsServiceCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad telecommunicationsServiceCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategoryCode }
     *     
     */
    public TelecommunicationsServiceCategoryCode getTelecommunicationsServiceCategoryCode() {
        return telecommunicationsServiceCategoryCode;
    }

    /**
     * Define el valor de la propiedad telecommunicationsServiceCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategoryCode }
     *     
     */
    public void setTelecommunicationsServiceCategoryCode(TelecommunicationsServiceCategoryCode value) {
        this.telecommunicationsServiceCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad movieTitle.
     * 
     * @return
     *     possible object is
     *     {@link MovieTitle }
     *     
     */
    public MovieTitle getMovieTitle() {
        return movieTitle;
    }

    /**
     * Define el valor de la propiedad movieTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieTitle }
     *     
     */
    public void setMovieTitle(MovieTitle value) {
        this.movieTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad roamingPartnerName.
     * 
     * @return
     *     possible object is
     *     {@link RoamingPartnerName }
     *     
     */
    public RoamingPartnerName getRoamingPartnerName() {
        return roamingPartnerName;
    }

    /**
     * Define el valor de la propiedad roamingPartnerName.
     * 
     * @param value
     *     allowed object is
     *     {@link RoamingPartnerName }
     *     
     */
    public void setRoamingPartnerName(RoamingPartnerName value) {
        this.roamingPartnerName = value;
    }

    /**
     * Obtiene el valor de la propiedad payPerView.
     * 
     * @return
     *     possible object is
     *     {@link PayPerView }
     *     
     */
    public PayPerView getPayPerView() {
        return payPerView;
    }

    /**
     * Define el valor de la propiedad payPerView.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerView }
     *     
     */
    public void setPayPerView(PayPerView value) {
        this.payPerView = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad telecommunicationsServiceCall.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCall }
     *     
     */
    public TelecommunicationsServiceCall getTelecommunicationsServiceCall() {
        return telecommunicationsServiceCall;
    }

    /**
     * Define el valor de la propiedad telecommunicationsServiceCall.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCall }
     *     
     */
    public void setTelecommunicationsServiceCall(TelecommunicationsServiceCall value) {
        this.telecommunicationsServiceCall = value;
    }

    /**
     * Obtiene el valor de la propiedad telecommunicationsServiceCallCode.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCallCode }
     *     
     */
    public TelecommunicationsServiceCallCode getTelecommunicationsServiceCallCode() {
        return telecommunicationsServiceCallCode;
    }

    /**
     * Define el valor de la propiedad telecommunicationsServiceCallCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCallCode }
     *     
     */
    public void setTelecommunicationsServiceCallCode(TelecommunicationsServiceCallCode value) {
        this.telecommunicationsServiceCallCode = value;
    }

    /**
     * Obtiene el valor de la propiedad callBaseAmount.
     * 
     * @return
     *     possible object is
     *     {@link CallBaseAmount }
     *     
     */
    public CallBaseAmount getCallBaseAmount() {
        return callBaseAmount;
    }

    /**
     * Define el valor de la propiedad callBaseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBaseAmount }
     *     
     */
    public void setCallBaseAmount(CallBaseAmount value) {
        this.callBaseAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad callExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link CallExtensionAmount }
     *     
     */
    public CallExtensionAmount getCallExtensionAmount() {
        return callExtensionAmount;
    }

    /**
     * Define el valor de la propiedad callExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CallExtensionAmount }
     *     
     */
    public void setCallExtensionAmount(CallExtensionAmount value) {
        this.callExtensionAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the exchangeRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateType }
     * 
     * 
     */
    public List<ExchangeRateType> getExchangeRates() {
        if (exchangeRates == null) {
            exchangeRates = new ArrayList<ExchangeRateType>();
        }
        return this.exchangeRates;
    }

    /**
     * Gets the value of the allowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharges() {
        if (allowanceCharges == null) {
            allowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharges;
    }

    /**
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Gets the value of the callDuties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callDuties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallDuties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getCallDuties() {
        if (callDuties == null) {
            callDuties = new ArrayList<DutyType>();
        }
        return this.callDuties;
    }

    /**
     * Gets the value of the timeDuties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeDuties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeDuties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getTimeDuties() {
        if (timeDuties == null) {
            timeDuties = new ArrayList<DutyType>();
        }
        return this.timeDuties;
    }

}
