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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AgencyID;
import com.picoto.jaxb.ubl.common.cbc.AgencyName;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.LanguageID;
import com.picoto.jaxb.ubl.common.cbc.LastRevisionDate;
import com.picoto.jaxb.ubl.common.cbc.LastRevisionTime;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.Note;
import com.picoto.jaxb.ubl.common.cbc.SchemeURI;
import com.picoto.jaxb.ubl.common.cbc.URI;
import com.picoto.jaxb.ubl.common.cbc.UUID;
import com.picoto.jaxb.ubl.common.cbc.VersionID;


/**
 * <p>Clase Java para ClassificationSchemeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LastRevisionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LastRevisionTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AgencyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AgencyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SchemeURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LanguageID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ClassificationCategory" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeType", propOrder = {
    "id",
    "uuid",
    "lastRevisionDate",
    "lastRevisionTime",
    "notes",
    "name",
    "descriptions",
    "agencyID",
    "agencyName",
    "versionID",
    "uri",
    "schemeURI",
    "languageID",
    "classificationCategories"
})
public class ClassificationSchemeType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ID id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUID uuid;
    @XmlElement(name = "LastRevisionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LastRevisionDate lastRevisionDate;
    @XmlElement(name = "LastRevisionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LastRevisionTime lastRevisionTime;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Note> notes;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Name name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;
    @XmlElement(name = "AgencyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AgencyID agencyID;
    @XmlElement(name = "AgencyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AgencyName agencyName;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VersionID versionID;
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected URI uri;
    @XmlElement(name = "SchemeURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SchemeURI schemeURI;
    @XmlElement(name = "LanguageID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LanguageID languageID;
    @XmlElement(name = "ClassificationCategory", required = true)
    protected List<ClassificationCategoryType> classificationCategories;

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
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad lastRevisionDate.
     * 
     * @return
     *     possible object is
     *     {@link LastRevisionDate }
     *     
     */
    public LastRevisionDate getLastRevisionDate() {
        return lastRevisionDate;
    }

    /**
     * Define el valor de la propiedad lastRevisionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRevisionDate }
     *     
     */
    public void setLastRevisionDate(LastRevisionDate value) {
        this.lastRevisionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastRevisionTime.
     * 
     * @return
     *     possible object is
     *     {@link LastRevisionTime }
     *     
     */
    public LastRevisionTime getLastRevisionTime() {
        return lastRevisionTime;
    }

    /**
     * Define el valor de la propiedad lastRevisionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRevisionTime }
     *     
     */
    public void setLastRevisionTime(LastRevisionTime value) {
        this.lastRevisionTime = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
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
     * Obtiene el valor de la propiedad agencyID.
     * 
     * @return
     *     possible object is
     *     {@link AgencyID }
     *     
     */
    public AgencyID getAgencyID() {
        return agencyID;
    }

    /**
     * Define el valor de la propiedad agencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyID }
     *     
     */
    public void setAgencyID(AgencyID value) {
        this.agencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad agencyName.
     * 
     * @return
     *     possible object is
     *     {@link AgencyName }
     *     
     */
    public AgencyName getAgencyName() {
        return agencyName;
    }

    /**
     * Define el valor de la propiedad agencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyName }
     *     
     */
    public void setAgencyName(AgencyName value) {
        this.agencyName = value;
    }

    /**
     * Obtiene el valor de la propiedad versionID.
     * 
     * @return
     *     possible object is
     *     {@link VersionID }
     *     
     */
    public VersionID getVersionID() {
        return versionID;
    }

    /**
     * Define el valor de la propiedad versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionID }
     *     
     */
    public void setVersionID(VersionID value) {
        this.versionID = value;
    }

    /**
     * Obtiene el valor de la propiedad uri.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    public URI getURI() {
        return uri;
    }

    /**
     * Define el valor de la propiedad uri.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    public void setURI(URI value) {
        this.uri = value;
    }

    /**
     * Obtiene el valor de la propiedad schemeURI.
     * 
     * @return
     *     possible object is
     *     {@link SchemeURI }
     *     
     */
    public SchemeURI getSchemeURI() {
        return schemeURI;
    }

    /**
     * Define el valor de la propiedad schemeURI.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeURI }
     *     
     */
    public void setSchemeURI(SchemeURI value) {
        this.schemeURI = value;
    }

    /**
     * Obtiene el valor de la propiedad languageID.
     * 
     * @return
     *     possible object is
     *     {@link LanguageID }
     *     
     */
    public LanguageID getLanguageID() {
        return languageID;
    }

    /**
     * Define el valor de la propiedad languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageID }
     *     
     */
    public void setLanguageID(LanguageID value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the classificationCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationCategoryType }
     * 
     * 
     */
    public List<ClassificationCategoryType> getClassificationCategories() {
        if (classificationCategories == null) {
            classificationCategories = new ArrayList<ClassificationCategoryType>();
        }
        return this.classificationCategories;
    }

}
