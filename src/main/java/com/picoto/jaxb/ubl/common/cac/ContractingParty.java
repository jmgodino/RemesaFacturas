//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BuyerProfileURI;


/**
 * <p>Clase Java para ContractingPartyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractingPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuyerProfileURI" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingPartyType", propOrder = {
    "buyerProfileURI",
    "contractingPartyTypes",
    "contractingActivities",
    "party"
})
@XmlRootElement(name = "ContractingParty")
public class ContractingParty {

    @XmlElement(name = "BuyerProfileURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuyerProfileURI buyerProfileURI;
    @XmlElement(name = "ContractingPartyType")
    protected List<ContractingPartyType> contractingPartyTypes;
    @XmlElement(name = "ContractingActivity")
    protected List<ContractingActivity> contractingActivities;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;

    /**
     * Obtiene el valor de la propiedad buyerProfileURI.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProfileURI }
     *     
     */
    public BuyerProfileURI getBuyerProfileURI() {
        return buyerProfileURI;
    }

    /**
     * Define el valor de la propiedad buyerProfileURI.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProfileURI }
     *     
     */
    public void setBuyerProfileURI(BuyerProfileURI value) {
        this.buyerProfileURI = value;
    }

    /**
     * Gets the value of the contractingPartyTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingPartyTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingPartyTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingPartyType }
     * 
     * 
     */
    public List<ContractingPartyType> getContractingPartyTypes() {
        if (contractingPartyTypes == null) {
            contractingPartyTypes = new ArrayList<ContractingPartyType>();
        }
        return this.contractingPartyTypes;
    }

    /**
     * Gets the value of the contractingActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingActivity }
     * 
     * 
     */
    public List<ContractingActivity> getContractingActivities() {
        if (contractingActivities == null) {
            contractingActivities = new ArrayList<ContractingActivity>();
        }
        return this.contractingActivities;
    }

    /**
     * Obtiene el valor de la propiedad party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Define el valor de la propiedad party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

}
