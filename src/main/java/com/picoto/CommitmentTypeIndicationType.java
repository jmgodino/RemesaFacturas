//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.31 a las 09:17:37 AM CET 
//


package com.picoto;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
    "objectReference",
    "allSignedDataObjects",
    "commitmentTypeQualifiers"
})
public class CommitmentTypeIndicationType {

    @XmlElement(name = "CommitmentTypeId", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    protected ObjectIdentifierType commitmentTypeId;
    @XmlElement(name = "ObjectReference", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @XmlSchemaType(name = "anyURI")
    protected List<String> objectReference;
    @XmlElement(name = "AllSignedDataObjects", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected Object allSignedDataObjects;
    @XmlElement(name = "CommitmentTypeQualifiers", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CommitmentTypeQualifiersListType commitmentTypeQualifiers;

    /**
     * Obtiene el valor de la propiedad commitmentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentTypeId() {
        return commitmentTypeId;
    }

    /**
     * Define el valor de la propiedad commitmentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentTypeId(ObjectIdentifierType value) {
        this.commitmentTypeId = value;
    }

    /**
     * Gets the value of the objectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the objectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReference() {
        if (objectReference == null) {
            objectReference = new ArrayList<String>();
        }
        return this.objectReference;
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
