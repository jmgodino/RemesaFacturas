//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.ImportanceCode;
import com.picoto.jaxb.ubl.common.cbc.Name;


/**
 * <p>Clase Java para ItemPropertyGroupType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemPropertyGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImportanceCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPropertyGroupType", propOrder = {
    "id",
    "name",
    "importanceCode"
})
@XmlRootElement(name = "ItemPropertyGroup")
public class ItemPropertyGroup {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Name name;
    @XmlElement(name = "ImportanceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ImportanceCode importanceCode;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad importanceCode.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceCode }
     *     
     */
    public ImportanceCode getImportanceCode() {
        return importanceCode;
    }

    /**
     * Define el valor de la propiedad importanceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceCode }
     *     
     */
    public void setImportanceCode(ImportanceCode value) {
        this.importanceCode = value;
    }

}
