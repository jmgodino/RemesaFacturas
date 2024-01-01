//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.02 a las 12:15:08 AM CET 
//


package com.picoto.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CertifiedRoleTypeV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRoleTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}X509AttributeCertificate"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}OtherAttributeCertificate"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedRoleTypeV2", propOrder = {
    "x509AttributeCertificate",
    "otherAttributeCertificate"
})
public class CertifiedRoleTypeV2 {

    @XmlElement(name = "X509AttributeCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected EncapsulatedPKIDataType x509AttributeCertificate;
    @XmlElement(name = "OtherAttributeCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected AnyType otherAttributeCertificate;

    /**
     * Obtiene el valor de la propiedad x509AttributeCertificate.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public EncapsulatedPKIDataType getX509AttributeCertificate() {
        return x509AttributeCertificate;
    }

    /**
     * Define el valor de la propiedad x509AttributeCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public void setX509AttributeCertificate(EncapsulatedPKIDataType value) {
        this.x509AttributeCertificate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherAttributeCertificate.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOtherAttributeCertificate() {
        return otherAttributeCertificate;
    }

    /**
     * Define el valor de la propiedad otherAttributeCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOtherAttributeCertificate(AnyType value) {
        this.otherAttributeCertificate = value;
    }

}
