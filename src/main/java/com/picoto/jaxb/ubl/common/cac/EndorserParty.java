//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.RoleCode;
import com.picoto.jaxb.ubl.common.cbc.SequenceNumeric;


/**
 * <p>Clase Java para EndorserPartyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EndorserPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryContact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndorserPartyType", propOrder = {
    "roleCode",
    "sequenceNumeric",
    "party",
    "signatoryContact"
})
@XmlRootElement(name = "EndorserParty")
public class EndorserParty {

    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected RoleCode roleCode;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "SignatoryContact", required = true)
    protected ContactType signatoryContact;

    /**
     * Obtiene el valor de la propiedad roleCode.
     * 
     * @return
     *     possible object is
     *     {@link RoleCode }
     *     
     */
    public RoleCode getRoleCode() {
        return roleCode;
    }

    /**
     * Define el valor de la propiedad roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCode }
     *     
     */
    public void setRoleCode(RoleCode value) {
        this.roleCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumeric }
     *     
     */
    public SequenceNumeric getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Define el valor de la propiedad sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumeric }
     *     
     */
    public void setSequenceNumeric(SequenceNumeric value) {
        this.sequenceNumeric = value;
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

    /**
     * Obtiene el valor de la propiedad signatoryContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSignatoryContact() {
        return signatoryContact;
    }

    /**
     * Define el valor de la propiedad signatoryContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSignatoryContact(ContactType value) {
        this.signatoryContact = value;
    }

}
