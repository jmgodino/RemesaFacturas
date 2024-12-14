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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;


/**
 * <p>Clase Java para ProcurementProjectLotType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcurementProjectLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectLotType", propOrder = {
    "id",
    "tenderingTerms",
    "procurementProject"
})
public class ProcurementProjectLotType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "TenderingTerms")
    protected TenderingTerms tenderingTerms;
    @XmlElement(name = "ProcurementProject")
    protected ProcurementProject procurementProject;

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
     * Obtiene el valor de la propiedad tenderingTerms.
     * 
     * @return
     *     possible object is
     *     {@link TenderingTerms }
     *     
     */
    public TenderingTerms getTenderingTerms() {
        return tenderingTerms;
    }

    /**
     * Define el valor de la propiedad tenderingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderingTerms }
     *     
     */
    public void setTenderingTerms(TenderingTerms value) {
        this.tenderingTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementProject.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProject }
     *     
     */
    public ProcurementProject getProcurementProject() {
        return procurementProject;
    }

    /**
     * Define el valor de la propiedad procurementProject.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProject }
     *     
     */
    public void setProcurementProject(ProcurementProject value) {
        this.procurementProject = value;
    }

}
