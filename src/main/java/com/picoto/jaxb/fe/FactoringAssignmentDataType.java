//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.fe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FactoringAssignmentDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FactoringAssignmentDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assignee" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AssigneeType"/&gt;
 *         &lt;element name="PaymentDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InstallmentsType"/&gt;
 *         &lt;element name="FactoringAssignmentClauses" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *         &lt;element name="FactoringAssignmentDocument" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}FactoringAssignmentDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactoringAssignmentDataType", propOrder = {
    "assignee",
    "paymentDetails",
    "factoringAssignmentClauses",
    "factoringAssignmentDocuments"
})
public class FactoringAssignmentDataType {

    @XmlElement(name = "Assignee", required = true)
    protected AssigneeType assignee;
    @XmlElement(name = "PaymentDetails", required = true)
    protected InstallmentsType paymentDetails;
    @XmlElement(name = "FactoringAssignmentClauses", required = true)
    protected String factoringAssignmentClauses;
    @XmlElement(name = "FactoringAssignmentDocument")
    protected List<FactoringAssignmentDocumentType> factoringAssignmentDocuments;

    /**
     * Obtiene el valor de la propiedad assignee.
     * 
     * @return
     *     possible object is
     *     {@link AssigneeType }
     *     
     */
    public AssigneeType getAssignee() {
        return assignee;
    }

    /**
     * Define el valor de la propiedad assignee.
     * 
     * @param value
     *     allowed object is
     *     {@link AssigneeType }
     *     
     */
    public void setAssignee(AssigneeType value) {
        this.assignee = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentsType }
     *     
     */
    public InstallmentsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Define el valor de la propiedad paymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentsType }
     *     
     */
    public void setPaymentDetails(InstallmentsType value) {
        this.paymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad factoringAssignmentClauses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoringAssignmentClauses() {
        return factoringAssignmentClauses;
    }

    /**
     * Define el valor de la propiedad factoringAssignmentClauses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoringAssignmentClauses(String value) {
        this.factoringAssignmentClauses = value;
    }

    /**
     * Gets the value of the factoringAssignmentDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factoringAssignmentDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactoringAssignmentDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactoringAssignmentDocumentType }
     * 
     * 
     */
    public List<FactoringAssignmentDocumentType> getFactoringAssignmentDocuments() {
        if (factoringAssignmentDocuments == null) {
            factoringAssignmentDocuments = new ArrayList<FactoringAssignmentDocumentType>();
        }
        return this.factoringAssignmentDocuments;
    }

}
