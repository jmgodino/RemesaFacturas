//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:54:49 PM UTC 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AuctionConstraintIndicator;
import com.picoto.jaxb.ubl.common.cbc.AuctionURI;
import com.picoto.jaxb.ubl.common.cbc.ConditionsDescription;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ElectronicDeviceDescription;
import com.picoto.jaxb.ubl.common.cbc.JustificationDescription;
import com.picoto.jaxb.ubl.common.cbc.ProcessDescription;


/**
 * <p>Clase Java para AuctionTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuctionTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JustificationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicDeviceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionTermsType", propOrder = {
    "auctionConstraintIndicator",
    "justificationDescriptions",
    "descriptions",
    "processDescriptions",
    "conditionsDescriptions",
    "electronicDeviceDescriptions",
    "auctionURI"
})
@XmlRootElement(name = "AuctionTerms")
public class AuctionTerms {

    @XmlElement(name = "AuctionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionConstraintIndicator auctionConstraintIndicator;
    @XmlElement(name = "JustificationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<JustificationDescription> justificationDescriptions;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "ProcessDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ProcessDescription> processDescriptions;
    @XmlElement(name = "ConditionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ConditionsDescription> conditionsDescriptions;
    @XmlElement(name = "ElectronicDeviceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ElectronicDeviceDescription> electronicDeviceDescriptions;
    @XmlElement(name = "AuctionURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionURI auctionURI;

    /**
     * Obtiene el valor de la propiedad auctionConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AuctionConstraintIndicator }
     *     
     */
    public AuctionConstraintIndicator getAuctionConstraintIndicator() {
        return auctionConstraintIndicator;
    }

    /**
     * Define el valor de la propiedad auctionConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionConstraintIndicator }
     *     
     */
    public void setAuctionConstraintIndicator(AuctionConstraintIndicator value) {
        this.auctionConstraintIndicator = value;
    }

    /**
     * Gets the value of the justificationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justificationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustificationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustificationDescription }
     * 
     * 
     */
    public List<JustificationDescription> getJustificationDescriptions() {
        if (justificationDescriptions == null) {
            justificationDescriptions = new ArrayList<JustificationDescription>();
        }
        return this.justificationDescriptions;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the processDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessDescription }
     * 
     * 
     */
    public List<ProcessDescription> getProcessDescriptions() {
        if (processDescriptions == null) {
            processDescriptions = new ArrayList<ProcessDescription>();
        }
        return this.processDescriptions;
    }

    /**
     * Gets the value of the conditionsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionsDescription }
     * 
     * 
     */
    public List<ConditionsDescription> getConditionsDescriptions() {
        if (conditionsDescriptions == null) {
            conditionsDescriptions = new ArrayList<ConditionsDescription>();
        }
        return this.conditionsDescriptions;
    }

    /**
     * Gets the value of the electronicDeviceDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicDeviceDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicDeviceDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicDeviceDescription }
     * 
     * 
     */
    public List<ElectronicDeviceDescription> getElectronicDeviceDescriptions() {
        if (electronicDeviceDescriptions == null) {
            electronicDeviceDescriptions = new ArrayList<ElectronicDeviceDescription>();
        }
        return this.electronicDeviceDescriptions;
    }

    /**
     * Obtiene el valor de la propiedad auctionURI.
     * 
     * @return
     *     possible object is
     *     {@link AuctionURI }
     *     
     */
    public AuctionURI getAuctionURI() {
        return auctionURI;
    }

    /**
     * Define el valor de la propiedad auctionURI.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionURI }
     *     
     */
    public void setAuctionURI(AuctionURI value) {
        this.auctionURI = value;
    }

}
