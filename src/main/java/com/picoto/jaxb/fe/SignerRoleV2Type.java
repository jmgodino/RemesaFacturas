//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SignerRoleV2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignerRoleV2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRoles" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesV2" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedAssertions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleV2Type", propOrder = {
    "claimedRoles",
    "certifiedRolesV2",
    "signedAssertions"
})
public class SignerRoleV2Type {

    @XmlElement(name = "ClaimedRoles", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected ClaimedRolesListType claimedRoles;
    @XmlElement(name = "CertifiedRolesV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CertifiedRolesListTypeV2 certifiedRolesV2;
    @XmlElement(name = "SignedAssertions", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignedAssertionsListType signedAssertions;

    /**
     * Obtiene el valor de la propiedad claimedRoles.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public ClaimedRolesListType getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Define el valor de la propiedad claimedRoles.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public void setClaimedRoles(ClaimedRolesListType value) {
        this.claimedRoles = value;
    }

    /**
     * Obtiene el valor de la propiedad certifiedRolesV2.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRolesListTypeV2 }
     *     
     */
    public CertifiedRolesListTypeV2 getCertifiedRolesV2() {
        return certifiedRolesV2;
    }

    /**
     * Define el valor de la propiedad certifiedRolesV2.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRolesListTypeV2 }
     *     
     */
    public void setCertifiedRolesV2(CertifiedRolesListTypeV2 value) {
        this.certifiedRolesV2 = value;
    }

    /**
     * Obtiene el valor de la propiedad signedAssertions.
     * 
     * @return
     *     possible object is
     *     {@link SignedAssertionsListType }
     *     
     */
    public SignedAssertionsListType getSignedAssertions() {
        return signedAssertions;
    }

    /**
     * Define el valor de la propiedad signedAssertions.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAssertionsListType }
     *     
     */
    public void setSignedAssertions(SignedAssertionsListType value) {
        this.signedAssertions = value;
    }

}
