//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.24 a las 09:49:01 AM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.OpenTenderID;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeID;
import com.picoto.jaxb.ubl.common.cbc.TenderEnvelopeTypeCode;


/**
 * <p>Clase Java para TenderPreparationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TenderPreparationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OpenTenderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderPreparationType", propOrder = {
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "descriptions",
    "openTenderID",
    "procurementProjectLots",
    "documentTenderRequirements"
})
@XmlRootElement(name = "TenderPreparation")
public class TenderPreparation {

    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TenderEnvelopeID tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TenderEnvelopeTypeCode tenderEnvelopeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "OpenTenderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OpenTenderID openTenderID;
    @XmlElement(name = "ProcurementProjectLot")
    protected List<ProcurementProjectLotType> procurementProjectLots;
    @XmlElement(name = "DocumentTenderRequirement")
    protected List<TenderRequirementType> documentTenderRequirements;

    /**
     * Obtiene el valor de la propiedad tenderEnvelopeID.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public TenderEnvelopeID getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Define el valor de la propiedad tenderEnvelopeID.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeID value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Obtiene el valor de la propiedad tenderEnvelopeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public TenderEnvelopeTypeCode getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Define el valor de la propiedad tenderEnvelopeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCode value) {
        this.tenderEnvelopeTypeCode = value;
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
     * Obtiene el valor de la propiedad openTenderID.
     * 
     * @return
     *     possible object is
     *     {@link OpenTenderID }
     *     
     */
    public OpenTenderID getOpenTenderID() {
        return openTenderID;
    }

    /**
     * Define el valor de la propiedad openTenderID.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenTenderID }
     *     
     */
    public void setOpenTenderID(OpenTenderID value) {
        this.openTenderID = value;
    }

    /**
     * Gets the value of the procurementProjectLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getProcurementProjectLots() {
        if (procurementProjectLots == null) {
            procurementProjectLots = new ArrayList<ProcurementProjectLotType>();
        }
        return this.procurementProjectLots;
    }

    /**
     * Gets the value of the documentTenderRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTenderRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTenderRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getDocumentTenderRequirements() {
        if (documentTenderRequirements == null) {
            documentTenderRequirements = new ArrayList<TenderRequirementType>();
        }
        return this.documentTenderRequirements;
    }

}
