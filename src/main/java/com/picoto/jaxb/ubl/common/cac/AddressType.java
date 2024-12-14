//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.cac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.AdditionalStreetName;
import com.picoto.jaxb.ubl.common.cbc.AddressFormatCode;
import com.picoto.jaxb.ubl.common.cbc.AddressTypeCode;
import com.picoto.jaxb.ubl.common.cbc.BlockName;
import com.picoto.jaxb.ubl.common.cbc.BuildingName;
import com.picoto.jaxb.ubl.common.cbc.BuildingNumber;
import com.picoto.jaxb.ubl.common.cbc.CityName;
import com.picoto.jaxb.ubl.common.cbc.CitySubdivisionName;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentity;
import com.picoto.jaxb.ubl.common.cbc.CountrySubentityCode;
import com.picoto.jaxb.ubl.common.cbc.Department;
import com.picoto.jaxb.ubl.common.cbc.District;
import com.picoto.jaxb.ubl.common.cbc.Floor;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.InhouseMail;
import com.picoto.jaxb.ubl.common.cbc.MarkAttention;
import com.picoto.jaxb.ubl.common.cbc.MarkCare;
import com.picoto.jaxb.ubl.common.cbc.PlotIdentification;
import com.picoto.jaxb.ubl.common.cbc.PostalZone;
import com.picoto.jaxb.ubl.common.cbc.Postbox;
import com.picoto.jaxb.ubl.common.cbc.Region;
import com.picoto.jaxb.ubl.common.cbc.Room;
import com.picoto.jaxb.ubl.common.cbc.StreetName;
import com.picoto.jaxb.ubl.common.cbc.TimezoneOffset;


/**
 * <p>Clase Java para AddressType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressFormatCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Postbox" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Floor" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Room" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StreetName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalStreetName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BlockName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhouseMail" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Department" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttention" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCare" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlotIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CitySubdivisionName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CityName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostalZone" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentityCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Region" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}District" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimezoneOffset" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LocationCoordinate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "id",
    "addressTypeCode",
    "addressFormatCode",
    "postbox",
    "floor",
    "room",
    "streetName",
    "additionalStreetName",
    "blockName",
    "buildingName",
    "buildingNumber",
    "inhouseMail",
    "department",
    "markAttention",
    "markCare",
    "plotIdentification",
    "citySubdivisionName",
    "cityName",
    "postalZone",
    "countrySubentity",
    "countrySubentityCode",
    "region",
    "district",
    "timezoneOffset",
    "addressLines",
    "country",
    "locationCoordinates"
})
public class AddressType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "AddressTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressTypeCode addressTypeCode;
    @XmlElement(name = "AddressFormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressFormatCode addressFormatCode;
    @XmlElement(name = "Postbox", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Postbox postbox;
    @XmlElement(name = "Floor", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Floor floor;
    @XmlElement(name = "Room", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Room room;
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StreetName streetName;
    @XmlElement(name = "AdditionalStreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdditionalStreetName additionalStreetName;
    @XmlElement(name = "BlockName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BlockName blockName;
    @XmlElement(name = "BuildingName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingName buildingName;
    @XmlElement(name = "BuildingNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingNumber buildingNumber;
    @XmlElement(name = "InhouseMail", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InhouseMail inhouseMail;
    @XmlElement(name = "Department", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Department department;
    @XmlElement(name = "MarkAttention", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkAttention markAttention;
    @XmlElement(name = "MarkCare", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkCare markCare;
    @XmlElement(name = "PlotIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlotIdentification plotIdentification;
    @XmlElement(name = "CitySubdivisionName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CitySubdivisionName citySubdivisionName;
    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CityName cityName;
    @XmlElement(name = "PostalZone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostalZone postalZone;
    @XmlElement(name = "CountrySubentity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentity countrySubentity;
    @XmlElement(name = "CountrySubentityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityCode countrySubentityCode;
    @XmlElement(name = "Region", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Region region;
    @XmlElement(name = "District", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected District district;
    @XmlElement(name = "TimezoneOffset", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimezoneOffset timezoneOffset;
    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLines;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "LocationCoordinate")
    protected List<LocationCoordinate> locationCoordinates;

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
     * Obtiene el valor de la propiedad addressTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeCode }
     *     
     */
    public AddressTypeCode getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Define el valor de la propiedad addressTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeCode }
     *     
     */
    public void setAddressTypeCode(AddressTypeCode value) {
        this.addressTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad addressFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressFormatCode }
     *     
     */
    public AddressFormatCode getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * Define el valor de la propiedad addressFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFormatCode }
     *     
     */
    public void setAddressFormatCode(AddressFormatCode value) {
        this.addressFormatCode = value;
    }

    /**
     * Obtiene el valor de la propiedad postbox.
     * 
     * @return
     *     possible object is
     *     {@link Postbox }
     *     
     */
    public Postbox getPostbox() {
        return postbox;
    }

    /**
     * Define el valor de la propiedad postbox.
     * 
     * @param value
     *     allowed object is
     *     {@link Postbox }
     *     
     */
    public void setPostbox(Postbox value) {
        this.postbox = value;
    }

    /**
     * Obtiene el valor de la propiedad floor.
     * 
     * @return
     *     possible object is
     *     {@link Floor }
     *     
     */
    public Floor getFloor() {
        return floor;
    }

    /**
     * Define el valor de la propiedad floor.
     * 
     * @param value
     *     allowed object is
     *     {@link Floor }
     *     
     */
    public void setFloor(Floor value) {
        this.floor = value;
    }

    /**
     * Obtiene el valor de la propiedad room.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Define el valor de la propiedad room.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     */
    public void setRoom(Room value) {
        this.room = value;
    }

    /**
     * Obtiene el valor de la propiedad streetName.
     * 
     * @return
     *     possible object is
     *     {@link StreetName }
     *     
     */
    public StreetName getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetName }
     *     
     */
    public void setStreetName(StreetName value) {
        this.streetName = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalStreetName.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStreetName }
     *     
     */
    public AdditionalStreetName getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * Define el valor de la propiedad additionalStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStreetName }
     *     
     */
    public void setAdditionalStreetName(AdditionalStreetName value) {
        this.additionalStreetName = value;
    }

    /**
     * Obtiene el valor de la propiedad blockName.
     * 
     * @return
     *     possible object is
     *     {@link BlockName }
     *     
     */
    public BlockName getBlockName() {
        return blockName;
    }

    /**
     * Define el valor de la propiedad blockName.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockName }
     *     
     */
    public void setBlockName(BlockName value) {
        this.blockName = value;
    }

    /**
     * Obtiene el valor de la propiedad buildingName.
     * 
     * @return
     *     possible object is
     *     {@link BuildingName }
     *     
     */
    public BuildingName getBuildingName() {
        return buildingName;
    }

    /**
     * Define el valor de la propiedad buildingName.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingName }
     *     
     */
    public void setBuildingName(BuildingName value) {
        this.buildingName = value;
    }

    /**
     * Obtiene el valor de la propiedad buildingNumber.
     * 
     * @return
     *     possible object is
     *     {@link BuildingNumber }
     *     
     */
    public BuildingNumber getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Define el valor de la propiedad buildingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingNumber }
     *     
     */
    public void setBuildingNumber(BuildingNumber value) {
        this.buildingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad inhouseMail.
     * 
     * @return
     *     possible object is
     *     {@link InhouseMail }
     *     
     */
    public InhouseMail getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Define el valor de la propiedad inhouseMail.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseMail }
     *     
     */
    public void setInhouseMail(InhouseMail value) {
        this.inhouseMail = value;
    }

    /**
     * Obtiene el valor de la propiedad department.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Define el valor de la propiedad department.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Obtiene el valor de la propiedad markAttention.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttention }
     *     
     */
    public MarkAttention getMarkAttention() {
        return markAttention;
    }

    /**
     * Define el valor de la propiedad markAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttention }
     *     
     */
    public void setMarkAttention(MarkAttention value) {
        this.markAttention = value;
    }

    /**
     * Obtiene el valor de la propiedad markCare.
     * 
     * @return
     *     possible object is
     *     {@link MarkCare }
     *     
     */
    public MarkCare getMarkCare() {
        return markCare;
    }

    /**
     * Define el valor de la propiedad markCare.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCare }
     *     
     */
    public void setMarkCare(MarkCare value) {
        this.markCare = value;
    }

    /**
     * Obtiene el valor de la propiedad plotIdentification.
     * 
     * @return
     *     possible object is
     *     {@link PlotIdentification }
     *     
     */
    public PlotIdentification getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * Define el valor de la propiedad plotIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link PlotIdentification }
     *     
     */
    public void setPlotIdentification(PlotIdentification value) {
        this.plotIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad citySubdivisionName.
     * 
     * @return
     *     possible object is
     *     {@link CitySubdivisionName }
     *     
     */
    public CitySubdivisionName getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * Define el valor de la propiedad citySubdivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySubdivisionName }
     *     
     */
    public void setCitySubdivisionName(CitySubdivisionName value) {
        this.citySubdivisionName = value;
    }

    /**
     * Obtiene el valor de la propiedad cityName.
     * 
     * @return
     *     possible object is
     *     {@link CityName }
     *     
     */
    public CityName getCityName() {
        return cityName;
    }

    /**
     * Define el valor de la propiedad cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link CityName }
     *     
     */
    public void setCityName(CityName value) {
        this.cityName = value;
    }

    /**
     * Obtiene el valor de la propiedad postalZone.
     * 
     * @return
     *     possible object is
     *     {@link PostalZone }
     *     
     */
    public PostalZone getPostalZone() {
        return postalZone;
    }

    /**
     * Define el valor de la propiedad postalZone.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalZone }
     *     
     */
    public void setPostalZone(PostalZone value) {
        this.postalZone = value;
    }

    /**
     * Obtiene el valor de la propiedad countrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentity }
     *     
     */
    public CountrySubentity getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Define el valor de la propiedad countrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentity }
     *     
     */
    public void setCountrySubentity(CountrySubentity value) {
        this.countrySubentity = value;
    }

    /**
     * Obtiene el valor de la propiedad countrySubentityCode.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentityCode }
     *     
     */
    public CountrySubentityCode getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Define el valor de la propiedad countrySubentityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentityCode }
     *     
     */
    public void setCountrySubentityCode(CountrySubentityCode value) {
        this.countrySubentityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad timezoneOffset.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneOffset }
     *     
     */
    public TimezoneOffset getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Define el valor de la propiedad timezoneOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneOffset }
     *     
     */
    public void setTimezoneOffset(TimezoneOffset value) {
        this.timezoneOffset = value;
    }

    /**
     * Gets the value of the addressLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<AddressLine>();
        }
        return this.addressLines;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the locationCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCoordinate }
     * 
     * 
     */
    public List<LocationCoordinate> getLocationCoordinates() {
        if (locationCoordinates == null) {
            locationCoordinates = new ArrayList<LocationCoordinate>();
        }
        return this.locationCoordinates;
    }

}
