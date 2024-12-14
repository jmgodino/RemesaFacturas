//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AltitudeMeasure;
import com.picoto.jaxb.ubl.common.cbc.CoordinateSystemCode;
import com.picoto.jaxb.ubl.common.cbc.LatitudeDegreesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LatitudeDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.LatitudeMinutesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LongitudeDegreesMeasure;
import com.picoto.jaxb.ubl.common.cbc.LongitudeDirectionCode;
import com.picoto.jaxb.ubl.common.cbc.LongitudeMinutesMeasure;


/**
 * <p>Clase Java para LocationCoordinateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocationCoordinateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CoordinateSystemCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDegreesMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeMinutesMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDirectionCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDegreesMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeMinutesMeasure" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDirectionCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AltitudeMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCoordinateType", propOrder = {
    "coordinateSystemCode",
    "latitudeDegreesMeasure",
    "latitudeMinutesMeasure",
    "latitudeDirectionCode",
    "longitudeDegreesMeasure",
    "longitudeMinutesMeasure",
    "longitudeDirectionCode",
    "altitudeMeasure"
})
@XmlRootElement(name = "LocationCoordinate")
public class LocationCoordinate {

    @XmlElement(name = "CoordinateSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CoordinateSystemCode coordinateSystemCode;
    @XmlElement(name = "LatitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDegreesMeasure latitudeDegreesMeasure;
    @XmlElement(name = "LatitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeMinutesMeasure latitudeMinutesMeasure;
    @XmlElement(name = "LatitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDirectionCode latitudeDirectionCode;
    @XmlElement(name = "LongitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDegreesMeasure longitudeDegreesMeasure;
    @XmlElement(name = "LongitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeMinutesMeasure longitudeMinutesMeasure;
    @XmlElement(name = "LongitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDirectionCode longitudeDirectionCode;
    @XmlElement(name = "AltitudeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AltitudeMeasure altitudeMeasure;

    /**
     * Obtiene el valor de la propiedad coordinateSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemCode }
     *     
     */
    public CoordinateSystemCode getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    /**
     * Define el valor de la propiedad coordinateSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemCode }
     *     
     */
    public void setCoordinateSystemCode(CoordinateSystemCode value) {
        this.coordinateSystemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeDegreesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDegreesMeasure }
     *     
     */
    public LatitudeDegreesMeasure getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * Define el valor de la propiedad latitudeDegreesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDegreesMeasure }
     *     
     */
    public void setLatitudeDegreesMeasure(LatitudeDegreesMeasure value) {
        this.latitudeDegreesMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeMinutesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeMinutesMeasure }
     *     
     */
    public LatitudeMinutesMeasure getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    /**
     * Define el valor de la propiedad latitudeMinutesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeMinutesMeasure }
     *     
     */
    public void setLatitudeMinutesMeasure(LatitudeMinutesMeasure value) {
        this.latitudeMinutesMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDirectionCode }
     *     
     */
    public LatitudeDirectionCode getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Define el valor de la propiedad latitudeDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDirectionCode }
     *     
     */
    public void setLatitudeDirectionCode(LatitudeDirectionCode value) {
        this.latitudeDirectionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeDegreesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDegreesMeasure }
     *     
     */
    public LongitudeDegreesMeasure getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * Define el valor de la propiedad longitudeDegreesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDegreesMeasure }
     *     
     */
    public void setLongitudeDegreesMeasure(LongitudeDegreesMeasure value) {
        this.longitudeDegreesMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeMinutesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeMinutesMeasure }
     *     
     */
    public LongitudeMinutesMeasure getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    /**
     * Define el valor de la propiedad longitudeMinutesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeMinutesMeasure }
     *     
     */
    public void setLongitudeMinutesMeasure(LongitudeMinutesMeasure value) {
        this.longitudeMinutesMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDirectionCode }
     *     
     */
    public LongitudeDirectionCode getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Define el valor de la propiedad longitudeDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDirectionCode }
     *     
     */
    public void setLongitudeDirectionCode(LongitudeDirectionCode value) {
        this.longitudeDirectionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad altitudeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeMeasure }
     *     
     */
    public AltitudeMeasure getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Define el valor de la propiedad altitudeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeMeasure }
     *     
     */
    public void setAltitudeMeasure(AltitudeMeasure value) {
        this.altitudeMeasure = value;
    }

}
