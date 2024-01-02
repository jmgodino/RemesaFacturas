//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.02 a las 12:15:08 AM CET 
//


package com.picoto.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResidenceTypeCodeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ResidenceTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidenceTypeCodeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum ResidenceTypeCodeType {


    /**
     * Extranjero (Fuera Unión
     * 						Europea).
     * 
     */
    E,

    /**
     * Residente (en España).
     * 					
     * 
     */
    R,

    /**
     * Residente en la Unión
     * 						Europea (excepto España).
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static ResidenceTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}