//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.fe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FactoringAssignmentDocumentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FactoringAssignmentDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentCharacter" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax50Type"/&gt;
 *         &lt;element name="RepresentationIdentity" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax80Type" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax50Type"/&gt;
 *         &lt;element name="Repository" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RepositoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactoringAssignmentDocumentType", propOrder = {
    "documentCharacter",
    "representationIdentity",
    "documentType",
    "repository"
})
public class FactoringAssignmentDocumentType {

    @XmlElement(name = "DocumentCharacter", required = true)
    protected String documentCharacter;
    @XmlElement(name = "RepresentationIdentity")
    protected String representationIdentity;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "Repository")
    protected RepositoryType repository;

    /**
     * Obtiene el valor de la propiedad documentCharacter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCharacter() {
        return documentCharacter;
    }

    /**
     * Define el valor de la propiedad documentCharacter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCharacter(String value) {
        this.documentCharacter = value;
    }

    /**
     * Obtiene el valor de la propiedad representationIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationIdentity() {
        return representationIdentity;
    }

    /**
     * Define el valor de la propiedad representationIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationIdentity(String value) {
        this.representationIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad repository.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryType }
     *     
     */
    public RepositoryType getRepository() {
        return repository;
    }

    /**
     * Define el valor de la propiedad repository.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryType }
     *     
     */
    public void setRepository(RepositoryType value) {
        this.repository = value;
    }

}
