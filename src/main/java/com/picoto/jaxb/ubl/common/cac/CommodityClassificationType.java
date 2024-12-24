//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.CargoTypeCode;
import com.picoto.jaxb.ubl.common.cbc.CommodityCode;
import com.picoto.jaxb.ubl.common.cbc.ItemClassificationCode;
import com.picoto.jaxb.ubl.common.cbc.NatureCode;


/**
 * <p>Clase Java para CommodityClassificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommodityClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", propOrder = {
    "natureCode",
    "cargoTypeCode",
    "commodityCode",
    "itemClassificationCode"
})
public class CommodityClassificationType {

    @XmlElement(name = "NatureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NatureCode natureCode;
    @XmlElement(name = "CargoTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CargoTypeCode cargoTypeCode;
    @XmlElement(name = "CommodityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CommodityCode commodityCode;
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ItemClassificationCode itemClassificationCode;

    /**
     * Obtiene el valor de la propiedad natureCode.
     * 
     * @return
     *     possible object is
     *     {@link NatureCode }
     *     
     */
    public NatureCode getNatureCode() {
        return natureCode;
    }

    /**
     * Define el valor de la propiedad natureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureCode }
     *     
     */
    public void setNatureCode(NatureCode value) {
        this.natureCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CargoTypeCode }
     *     
     */
    public CargoTypeCode getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Define el valor de la propiedad cargoTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoTypeCode }
     *     
     */
    public void setCargoTypeCode(CargoTypeCode value) {
        this.cargoTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad commodityCode.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCode }
     *     
     */
    public CommodityCode getCommodityCode() {
        return commodityCode;
    }

    /**
     * Define el valor de la propiedad commodityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCode }
     *     
     */
    public void setCommodityCode(CommodityCode value) {
        this.commodityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad itemClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCode }
     *     
     */
    public ItemClassificationCode getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Define el valor de la propiedad itemClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCode }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCode value) {
        this.itemClassificationCode = value;
    }

}
