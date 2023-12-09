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
 * <p>Clase Java para AttachmentEncodingType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AttachmentEncodingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE64"/&gt;
 *     &lt;enumeration value="BER"/&gt;
 *     &lt;enumeration value="DER"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentEncodingType")
@XmlEnum
public enum AttachmentEncodingType {

    @XmlEnumValue("BASE64")
    BASE_64("BASE64"),
    BER("BER"),
    DER("DER"),
    NONE("NONE");
    private final String value;

    AttachmentEncodingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentEncodingType fromValue(String v) {
        for (AttachmentEncodingType c: AttachmentEncodingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
