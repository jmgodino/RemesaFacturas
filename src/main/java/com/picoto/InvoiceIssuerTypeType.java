//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.09 a las 05:34:13 PM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceIssuerTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InvoiceIssuerTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceIssuerTypeType")
@XmlEnum
public enum InvoiceIssuerTypeType {


    /**
     * Proveedor (Emisor).
     * 
     */
    EM,

    /**
     * Cliente (Receptor).
     * 
     */
    RE,

    /**
     * Tercero.
     * 
     */
    TE;

    public String value() {
        return name();
    }

    public static InvoiceIssuerTypeType fromValue(String v) {
        return valueOf(v);
    }

}
