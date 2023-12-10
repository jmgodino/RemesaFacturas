//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.10 a las 12:29:54 PM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonTypeCodeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PersonTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonTypeCodeType")
@XmlEnum
public enum PersonTypeCodeType {


    /**
     * Persona física.
     * 					
     * 
     */
    F,

    /**
     * Persona jurídica.
     * 					
     * 
     */
    J;

    public String value() {
        return name();
    }

    public static PersonTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
