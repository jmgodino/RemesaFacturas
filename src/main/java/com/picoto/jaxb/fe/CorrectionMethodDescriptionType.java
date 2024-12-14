//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:15 PM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorrectionMethodDescriptionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CorrectionMethodDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rectificación íntegra"/>
 *     &lt;enumeration value="Rectificación por diferencias"/>
 *     &lt;enumeration value="Rectificación por descuento por volumen de operaciones durante un periodo"/>
 *     &lt;enumeration value="Autorizadas por la Agencia Tributaria"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CorrectionMethodDescriptionType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum CorrectionMethodDescriptionType {

    @XmlEnumValue("Rectificaci\u00f3n \u00edntegra")
    RECTIFICACIÓN_ÍNTEGRA("Rectificaci\u00f3n \u00edntegra"),
    @XmlEnumValue("Rectificaci\u00f3n por diferencias")
    RECTIFICACIÓN_POR_DIFERENCIAS("Rectificaci\u00f3n por diferencias"),
    @XmlEnumValue("Rectificaci\u00f3n por descuento por volumen de operaciones durante un periodo")
    RECTIFICACIÓN_POR_DESCUENTO_POR_VOLUMEN_DE_OPERACIONES_DURANTE_UN_PERIODO("Rectificaci\u00f3n por descuento por volumen de operaciones durante un periodo"),
    @XmlEnumValue("Autorizadas por la Agencia Tributaria")
    AUTORIZADAS_POR_LA_AGENCIA_TRIBUTARIA("Autorizadas por la Agencia Tributaria");
    private final String value;

    CorrectionMethodDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorrectionMethodDescriptionType fromValue(String v) {
        for (CorrectionMethodDescriptionType c: CorrectionMethodDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
