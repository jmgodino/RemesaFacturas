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
 * <p>Clase Java para AttachmentCompressionAlgorithmType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentCompressionAlgorithmType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZIP"/&gt;
 *     &lt;enumeration value="GZIP"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentCompressionAlgorithmType")
@XmlEnum
public enum AttachmentCompressionAlgorithmType {

    ZIP,
    GZIP,
    NONE;

    public String value() {
        return name();
    }

    public static AttachmentCompressionAlgorithmType fromValue(String v) {
        return valueOf(v);
    }

}
