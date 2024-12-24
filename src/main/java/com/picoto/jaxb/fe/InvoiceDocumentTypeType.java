//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceDocumentTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceDocumentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FC"/&gt;
 *     &lt;enumeration value="FA"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceDocumentTypeType")
@XmlEnum
public enum InvoiceDocumentTypeType {


    /**
     * Factura Completa.
     * 					
     * 
     */
    FC,

    /**
     * Factura abreviada.
     * 					
     * 
     */
    FA,

    /**
     * AutoFactura.
     * 					
     * 
     */
    AF;

    public String value() {
        return name();
    }

    public static InvoiceDocumentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
