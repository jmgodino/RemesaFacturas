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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.BudgetYearNumeric;
import com.picoto.jaxb.ubl.common.cbc.ID;


/**
 * <p>Clase Java para BudgetAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BudgetAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BudgetYearNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredClassificationScheme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetAccountType", propOrder = {
    "id",
    "budgetYearNumeric",
    "requiredClassificationScheme"
})
@XmlRootElement(name = "BudgetAccount")
public class BudgetAccount {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "BudgetYearNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BudgetYearNumeric budgetYearNumeric;
    @XmlElement(name = "RequiredClassificationScheme")
    protected ClassificationSchemeType requiredClassificationScheme;

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
     * Obtiene el valor de la propiedad budgetYearNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BudgetYearNumeric }
     *     
     */
    public BudgetYearNumeric getBudgetYearNumeric() {
        return budgetYearNumeric;
    }

    /**
     * Define el valor de la propiedad budgetYearNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetYearNumeric }
     *     
     */
    public void setBudgetYearNumeric(BudgetYearNumeric value) {
        this.budgetYearNumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredClassificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public ClassificationSchemeType getRequiredClassificationScheme() {
        return requiredClassificationScheme;
    }

    /**
     * Define el valor de la propiedad requiredClassificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public void setRequiredClassificationScheme(ClassificationSchemeType value) {
        this.requiredClassificationScheme = value;
    }

}
