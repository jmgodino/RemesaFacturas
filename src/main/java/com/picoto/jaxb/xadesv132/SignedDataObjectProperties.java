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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="DataObjectFormat" type="{http://uri.etsi.org/01903/v1.3.2#}DataObjectFormatType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentTypeIndication" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeIndicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IndividualDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dataObjectFormats",
    "commitmentTypeIndications",
    "allDataObjectsTimeStamps",
    "individualDataObjectsTimeStamps"
})
@XmlRootElement(name = "SignedDataObjectProperties")
public class SignedDataObjectProperties {

    @XmlElement(name = "DataObjectFormat")
    protected List<DataObjectFormat> dataObjectFormats;
    @XmlElement(name = "CommitmentTypeIndication")
    protected List<CommitmentTypeIndication> commitmentTypeIndications;
    @XmlElement(name = "AllDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> allDataObjectsTimeStamps;
    @XmlElement(name = "IndividualDataObjectsTimeStamp")
    protected List<XAdESTimeStampType> individualDataObjectsTimeStamps;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the dataObjectFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjectFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjectFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormat }
     * 
     * 
     */
    public List<DataObjectFormat> getDataObjectFormats() {
        if (dataObjectFormats == null) {
            dataObjectFormats = new ArrayList<DataObjectFormat>();
        }
        return this.dataObjectFormats;
    }

    /**
     * Gets the value of the commitmentTypeIndications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeIndications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeIndications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndication }
     * 
     * 
     */
    public List<CommitmentTypeIndication> getCommitmentTypeIndications() {
        if (commitmentTypeIndications == null) {
            commitmentTypeIndications = new ArrayList<CommitmentTypeIndication>();
        }
        return this.commitmentTypeIndications;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDataObjectsTimeStamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDataObjectsTimeStamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getAllDataObjectsTimeStamps() {
        if (allDataObjectsTimeStamps == null) {
            allDataObjectsTimeStamps = new ArrayList<XAdESTimeStampType>();
        }
        return this.allDataObjectsTimeStamps;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDataObjectsTimeStamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDataObjectsTimeStamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getIndividualDataObjectsTimeStamps() {
        if (individualDataObjectsTimeStamps == null) {
            individualDataObjectsTimeStamps = new ArrayList<XAdESTimeStampType>();
        }
        return this.individualDataObjectsTimeStamps;
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
