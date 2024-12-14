//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceClassType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OO"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceClassType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum InvoiceClassType {


    /**
     * Original.
     * 					
     * 
     */
    OO,

    /**
     * Original rectificativa
     * 					
     * 
     */
    OR,

    /**
     * Original
     * 						recapitulativa.
     * 
     */
    OC,

    /**
     * Copia original.
     * 					
     * 
     */
    CO,

    /**
     * Copia rectificativa.
     * 					
     * 
     */
    CR,

    /**
     * Copia recapitulativa.
     * 					
     * 
     */
    CC;

    public String value() {
        return name();
    }

    public static InvoiceClassType fromValue(String v) {
        return valueOf(v);
    }

}
