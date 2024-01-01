//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.02 a las 12:15:08 AM CET 
//


package com.picoto.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para SignedDataObjectPropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignedDataObjectPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}DataObjectFormat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeIndication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AllDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}IndividualDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedDataObjectPropertiesType", propOrder = {
    "dataObjectFormat",
    "commitmentTypeIndication",
    "allDataObjectsTimeStamp",
    "individualDataObjectsTimeStamp",
    "any"
})
public class SignedDataObjectPropertiesType {

    @XmlElement(name = "DataObjectFormat", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected List<DataObjectFormatType> dataObjectFormat;
    @XmlElement(name = "CommitmentTypeIndication", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected List<CommitmentTypeIndicationType> commitmentTypeIndication;
    @XmlElement(name = "AllDataObjectsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected List<XAdESTimeStampType> allDataObjectsTimeStamp;
    @XmlElement(name = "IndividualDataObjectsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected List<XAdESTimeStampType> individualDataObjectsTimeStamp;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the dataObjectFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjectFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjectFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormatType }
     * 
     * 
     */
    public List<DataObjectFormatType> getDataObjectFormat() {
        if (dataObjectFormat == null) {
            dataObjectFormat = new ArrayList<DataObjectFormatType>();
        }
        return this.dataObjectFormat;
    }

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndicationType }
     * 
     * 
     */
    public List<CommitmentTypeIndicationType> getCommitmentTypeIndication() {
        if (commitmentTypeIndication == null) {
            commitmentTypeIndication = new ArrayList<CommitmentTypeIndicationType>();
        }
        return this.commitmentTypeIndication;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getAllDataObjectsTimeStamp() {
        if (allDataObjectsTimeStamp == null) {
            allDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.allDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the individualDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getIndividualDataObjectsTimeStamp() {
        if (individualDataObjectsTimeStamp == null) {
            individualDataObjectsTimeStamp = new ArrayList<XAdESTimeStampType>();
        }
        return this.individualDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
