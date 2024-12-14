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
import com.picoto.jaxb.ubl.common.cbc.RoleCode;
import com.picoto.jaxb.ubl.common.cbc.RoleDescription;


/**
 * <p>Clase Java para EconomicOperatorRoleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorRoleType", propOrder = {
    "roleCode",
    "roleDescriptions"
})
@XmlRootElement(name = "EconomicOperatorRole")
public class EconomicOperatorRole {

    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoleCode roleCode;
    @XmlElement(name = "RoleDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RoleDescription> roleDescriptions;

    /**
     * Obtiene el valor de la propiedad roleCode.
     * 
     * @return
     *     possible object is
     *     {@link RoleCode }
     *     
     */
    public RoleCode getRoleCode() {
        return roleCode;
    }

    /**
     * Define el valor de la propiedad roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCode }
     *     
     */
    public void setRoleCode(RoleCode value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the roleDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDescription }
     * 
     * 
     */
    public List<RoleDescription> getRoleDescriptions() {
        if (roleDescriptions == null) {
            roleDescriptions = new ArrayList<RoleDescription>();
        }
        return this.roleDescriptions;
    }

}
