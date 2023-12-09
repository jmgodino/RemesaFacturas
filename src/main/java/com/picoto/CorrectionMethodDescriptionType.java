//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.09 a las 05:34:13 PM CET 
//


package com.picoto;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorrectionMethodDescriptionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CorrectionMethodDescriptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Rectificación íntegra"/&gt;
 *     &lt;enumeration value="Rectificación por diferencias"/&gt;
 *     &lt;enumeration value="Rectificación por descuento por volumen de operaciones durante un periodo"/&gt;
 *     &lt;enumeration value="Autorizadas por la Agencia Tributaria"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorrectionMethodDescriptionType")
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
