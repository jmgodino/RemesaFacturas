//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.xadesv132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommitmentTypeIndicationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommitmentTypeIndicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitmentTypeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ObjectReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *           &lt;element name="AllSignedDataObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CommitmentTypeQualifiers" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeQualifiersListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentTypeIndicationType", propOrder = {
    "commitmentTypeId",
    "allSignedDataObjects",
    "objectReferences",
    "commitmentTypeQualifiers"
})
@XmlRootElement(name = "CommitmentTypeIndication")
public class CommitmentTypeIndication {

    @XmlElement(name = "CommitmentTypeId", required = true)
    protected ObjectIdentifier commitmentTypeId;
    @XmlElement(name = "AllSignedDataObjects")
    protected Object allSignedDataObjects;
    @XmlElement(name = "ObjectReference")
    @XmlSchemaType(name = "anyURI")
    protected List<String> objectReferences;
    @XmlElement(name = "CommitmentTypeQualifiers")
    protected CommitmentTypeQualifiersListType commitmentTypeQualifiers;

    /**
     * Obtiene el valor de la propiedad commitmentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifier }
     *     
     */
    public ObjectIdentifier getCommitmentTypeId() {
        return commitmentTypeId;
    }

    /**
     * Define el valor de la propiedad commitmentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifier }
     *     
     */
    public void setCommitmentTypeId(ObjectIdentifier value) {
        this.commitmentTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad allSignedDataObjects.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllSignedDataObjects() {
        return allSignedDataObjects;
    }

    /**
     * Define el valor de la propiedad allSignedDataObjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllSignedDataObjects(Object value) {
        this.allSignedDataObjects = value;
    }

    /**
     * Gets the value of the objectReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReferences() {
        if (objectReferences == null) {
            objectReferences = new ArrayList<String>();
        }
        return this.objectReferences;
    }

    /**
     * Obtiene el valor de la propiedad commitmentTypeQualifiers.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public CommitmentTypeQualifiersListType getCommitmentTypeQualifiers() {
        return commitmentTypeQualifiers;
    }

    /**
     * Define el valor de la propiedad commitmentTypeQualifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public void setCommitmentTypeQualifiers(CommitmentTypeQualifiersListType value) {
        this.commitmentTypeQualifiers = value;
    }

}
