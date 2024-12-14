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
 * <p>Clase Java para CertifiedRoleTypeV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRoleTypeV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}X509AttributeCertificate"/>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}OtherAttributeCertificate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
