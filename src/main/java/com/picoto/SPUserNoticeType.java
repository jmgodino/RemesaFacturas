//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.31 a las 09:17:37 AM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SPUserNoticeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SPUserNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoticeRef" type="{http://uri.etsi.org/01903/v1.3.2#}NoticeReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ExplicitText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPUserNoticeType", propOrder = {
    "noticeRef",
    "explicitText"
})
public class SPUserNoticeType {

    @XmlElement(name = "NoticeRef", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected NoticeReferenceType noticeRef;
    @XmlElement(name = "ExplicitText", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected String explicitText;

    /**
     * Obtiene el valor de la propiedad noticeRef.
     * 
     * @return
     *     possible object is
     *     {@link NoticeReferenceType }
     *     
     */
    public NoticeReferenceType getNoticeRef() {
        return noticeRef;
    }

    /**
     * Define el valor de la propiedad noticeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeReferenceType }
     *     
     */
    public void setNoticeRef(NoticeReferenceType value) {
        this.noticeRef = value;
    }

    /**
     * Obtiene el valor de la propiedad explicitText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplicitText() {
        return explicitText;
    }

    /**
     * Define el valor de la propiedad explicitText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplicitText(String value) {
        this.explicitText = value;
    }

}
