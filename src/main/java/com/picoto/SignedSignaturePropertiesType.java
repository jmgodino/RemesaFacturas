//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.31 a las 09:17:37 AM CET 
//


package com.picoto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para SignedSignaturePropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignedSignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificateV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlace" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlaceV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRoleV2" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedSignaturePropertiesType", propOrder = {
    "signingTime",
    "signingCertificate",
    "signingCertificateV2",
    "signaturePolicyIdentifier",
    "signatureProductionPlace",
    "signatureProductionPlaceV2",
    "signerRole",
    "signerRoleV2",
    "any"
})
public class SignedSignaturePropertiesType {

    @XmlElement(name = "SigningTime", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElement(name = "SigningCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CertIDListType signingCertificate;
    @XmlElement(name = "SigningCertificateV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CertIDListV2Type signingCertificateV2;
    @XmlElement(name = "SignaturePolicyIdentifier", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignaturePolicyIdentifierType signaturePolicyIdentifier;
    @XmlElement(name = "SignatureProductionPlace", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignatureProductionPlaceType signatureProductionPlace;
    @XmlElement(name = "SignatureProductionPlaceV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignatureProductionPlaceV2Type signatureProductionPlaceV2;
    @XmlElement(name = "SignerRole", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignerRoleType signerRole;
    @XmlElement(name = "SignerRoleV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected SignerRoleV2Type signerRoleV2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad signingTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Define el valor de la propiedad signingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

    /**
     * Obtiene el valor de la propiedad signingCertificate.
     * 
     * @return
     *     possible object is
     *     {@link CertIDListType }
     *     
     */
    public CertIDListType getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Define el valor de la propiedad signingCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDListType }
     *     
     */
    public void setSigningCertificate(CertIDListType value) {
        this.signingCertificate = value;
    }

    /**
     * Obtiene el valor de la propiedad signingCertificateV2.
     * 
     * @return
     *     possible object is
     *     {@link CertIDListV2Type }
     *     
     */
    public CertIDListV2Type getSigningCertificateV2() {
        return signingCertificateV2;
    }

    /**
     * Define el valor de la propiedad signingCertificateV2.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDListV2Type }
     *     
     */
    public void setSigningCertificateV2(CertIDListV2Type value) {
        this.signingCertificateV2 = value;
    }

    /**
     * Obtiene el valor de la propiedad signaturePolicyIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdentifierType }
     *     
     */
    public SignaturePolicyIdentifierType getSignaturePolicyIdentifier() {
        return signaturePolicyIdentifier;
    }

    /**
     * Define el valor de la propiedad signaturePolicyIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdentifierType }
     *     
     */
    public void setSignaturePolicyIdentifier(SignaturePolicyIdentifierType value) {
        this.signaturePolicyIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureProductionPlace.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlaceType }
     *     
     */
    public SignatureProductionPlaceType getSignatureProductionPlace() {
        return signatureProductionPlace;
    }

    /**
     * Define el valor de la propiedad signatureProductionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlaceType }
     *     
     */
    public void setSignatureProductionPlace(SignatureProductionPlaceType value) {
        this.signatureProductionPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureProductionPlaceV2.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlaceV2Type }
     *     
     */
    public SignatureProductionPlaceV2Type getSignatureProductionPlaceV2() {
        return signatureProductionPlaceV2;
    }

    /**
     * Define el valor de la propiedad signatureProductionPlaceV2.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlaceV2Type }
     *     
     */
    public void setSignatureProductionPlaceV2(SignatureProductionPlaceV2Type value) {
        this.signatureProductionPlaceV2 = value;
    }

    /**
     * Obtiene el valor de la propiedad signerRole.
     * 
     * @return
     *     possible object is
     *     {@link SignerRoleType }
     *     
     */
    public SignerRoleType getSignerRole() {
        return signerRole;
    }

    /**
     * Define el valor de la propiedad signerRole.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRoleType }
     *     
     */
    public void setSignerRole(SignerRoleType value) {
        this.signerRole = value;
    }

    /**
     * Obtiene el valor de la propiedad signerRoleV2.
     * 
     * @return
     *     possible object is
     *     {@link SignerRoleV2Type }
     *     
     */
    public SignerRoleV2Type getSignerRoleV2() {
        return signerRoleV2;
    }

    /**
     * Define el valor de la propiedad signerRoleV2.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRoleV2Type }
     *     
     */
    public void setSignerRoleV2(SignerRoleV2Type value) {
        this.signerRoleV2 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
