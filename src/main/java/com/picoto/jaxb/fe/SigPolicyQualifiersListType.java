//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SigPolicyQualifiersListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SigPolicyQualifiersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SigPolicyQualifier" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigPolicyQualifiersListType", propOrder = {
    "sigPolicyQualifier"
})
public class SigPolicyQualifiersListType {

    @XmlElement(name = "SigPolicyQualifier", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    protected List<AnyType> sigPolicyQualifier;

    /**
     * Gets the value of the sigPolicyQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sigPolicyQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigPolicyQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getSigPolicyQualifier() {
        if (sigPolicyQualifier == null) {
            sigPolicyQualifier = new ArrayList<AnyType>();
        }
        return this.sigPolicyQualifier;
    }

}
