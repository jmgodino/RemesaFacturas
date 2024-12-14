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
import com.picoto.jaxb.ubl.common.cbc.CharacterSetCode;
import com.picoto.jaxb.ubl.common.cbc.Description;
import com.picoto.jaxb.ubl.common.cbc.DocumentHash;
import com.picoto.jaxb.ubl.common.cbc.EncodingCode;
import com.picoto.jaxb.ubl.common.cbc.ExpiryDate;
import com.picoto.jaxb.ubl.common.cbc.ExpiryTime;
import com.picoto.jaxb.ubl.common.cbc.FileName;
import com.picoto.jaxb.ubl.common.cbc.FormatCode;
import com.picoto.jaxb.ubl.common.cbc.HashAlgorithmMethod;
import com.picoto.jaxb.ubl.common.cbc.MimeCode;
import com.picoto.jaxb.ubl.common.cbc.URI;


/**
 * <p>Clase Java para ExternalReferenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentHash" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HashAlgorithmMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MimeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EncodingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CharacterSetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FileName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferenceType", propOrder = {
    "uri",
    "documentHash",
    "hashAlgorithmMethod",
    "expiryDate",
    "expiryTime",
    "mimeCode",
    "formatCode",
    "encodingCode",
    "characterSetCode",
    "fileName",
    "descriptions"
})
@XmlRootElement(name = "ExternalReference")
public class ExternalReference {

    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected URI uri;
    @XmlElement(name = "DocumentHash", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentHash documentHash;
    @XmlElement(name = "HashAlgorithmMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HashAlgorithmMethod hashAlgorithmMethod;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryDate expiryDate;
    @XmlElement(name = "ExpiryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryTime expiryTime;
    @XmlElement(name = "MimeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MimeCode mimeCode;
    @XmlElement(name = "FormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FormatCode formatCode;
    @XmlElement(name = "EncodingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EncodingCode encodingCode;
    @XmlElement(name = "CharacterSetCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CharacterSetCode characterSetCode;
    @XmlElement(name = "FileName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FileName fileName;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<Description> descriptions;

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
     * Obtiene el valor de la propiedad documentHash.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHash }
     *     
     */
    public DocumentHash getDocumentHash() {
        return documentHash;
    }

    /**
     * Define el valor de la propiedad documentHash.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHash }
     *     
     */
    public void setDocumentHash(DocumentHash value) {
        this.documentHash = value;
    }

    /**
     * Obtiene el valor de la propiedad hashAlgorithmMethod.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithmMethod }
     *     
     */
    public HashAlgorithmMethod getHashAlgorithmMethod() {
        return hashAlgorithmMethod;
    }

    /**
     * Define el valor de la propiedad hashAlgorithmMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithmMethod }
     *     
     */
    public void setHashAlgorithmMethod(HashAlgorithmMethod value) {
        this.hashAlgorithmMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Define el valor de la propiedad expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiryDate(ExpiryDate value) {
        this.expiryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryTime.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryTime }
     *     
     */
    public ExpiryTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * Define el valor de la propiedad expiryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryTime }
     *     
     */
    public void setExpiryTime(ExpiryTime value) {
        this.expiryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad mimeCode.
     * 
     * @return
     *     possible object is
     *     {@link MimeCode }
     *     
     */
    public MimeCode getMimeCode() {
        return mimeCode;
    }

    /**
     * Define el valor de la propiedad mimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeCode }
     *     
     */
    public void setMimeCode(MimeCode value) {
        this.mimeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad formatCode.
     * 
     * @return
     *     possible object is
     *     {@link FormatCode }
     *     
     */
    public FormatCode getFormatCode() {
        return formatCode;
    }

    /**
     * Define el valor de la propiedad formatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatCode }
     *     
     */
    public void setFormatCode(FormatCode value) {
        this.formatCode = value;
    }

    /**
     * Obtiene el valor de la propiedad encodingCode.
     * 
     * @return
     *     possible object is
     *     {@link EncodingCode }
     *     
     */
    public EncodingCode getEncodingCode() {
        return encodingCode;
    }

    /**
     * Define el valor de la propiedad encodingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingCode }
     *     
     */
    public void setEncodingCode(EncodingCode value) {
        this.encodingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad characterSetCode.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetCode }
     *     
     */
    public CharacterSetCode getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Define el valor de la propiedad characterSetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetCode }
     *     
     */
    public void setCharacterSetCode(CharacterSetCode value) {
        this.characterSetCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link FileName }
     *     
     */
    public FileName getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link FileName }
     *     
     */
    public void setFileName(FileName value) {
        this.fileName = value;
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

}
