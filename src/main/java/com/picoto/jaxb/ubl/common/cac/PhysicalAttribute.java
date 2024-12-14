//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AttributeID;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.DescriptionCode;
import com.picoto.jaxb.ubl.common.cbc.PositionCode;


/**
 * <p>Clase Java para PhysicalAttributeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AttributeID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DescriptionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAttributeType", propOrder = {
    "attributeID",
    "positionCode",
    "descriptionCode",
    "descriptions"
})
@XmlRootElement(name = "PhysicalAttribute")
public class PhysicalAttribute {

    @XmlElement(name = "AttributeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AttributeID attributeID;
    @XmlElement(name = "PositionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PositionCode positionCode;
    @XmlElement(name = "DescriptionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DescriptionCode descriptionCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;

    /**
     * Obtiene el valor de la propiedad attributeID.
     * 
     * @return
     *     possible object is
     *     {@link AttributeID }
     *     
     */
    public AttributeID getAttributeID() {
        return attributeID;
    }

    /**
     * Define el valor de la propiedad attributeID.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeID }
     *     
     */
    public void setAttributeID(AttributeID value) {
        this.attributeID = value;
    }

    /**
     * Obtiene el valor de la propiedad positionCode.
     * 
     * @return
     *     possible object is
     *     {@link PositionCode }
     *     
     */
    public PositionCode getPositionCode() {
        return positionCode;
    }

    /**
     * Define el valor de la propiedad positionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCode }
     *     
     */
    public void setPositionCode(PositionCode value) {
        this.positionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionCode }
     *     
     */
    public DescriptionCode getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Define el valor de la propiedad descriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionCode }
     *     
     */
    public void setDescriptionCode(DescriptionCode value) {
        this.descriptionCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

}
