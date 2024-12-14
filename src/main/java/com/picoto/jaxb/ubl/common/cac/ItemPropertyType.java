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
import javax.xml.bind.annotation.XmlType;
import com.picoto.jaxb.ubl.common.cbc.ID;
import com.picoto.jaxb.ubl.common.cbc.ImportanceCode;
import com.picoto.jaxb.ubl.common.cbc.ListValue;
import com.picoto.jaxb.ubl.common.cbc.Name;
import com.picoto.jaxb.ubl.common.cbc.NameCode;
import com.picoto.jaxb.ubl.common.cbc.TestMethod;
import com.picoto.jaxb.ubl.common.cbc.Value;
import com.picoto.jaxb.ubl.common.cbc.ValueQualifier;
import com.picoto.jaxb.ubl.common.cbc.ValueQuantity;


/**
 * <p>Clase Java para ItemPropertyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TestMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Value" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQualifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImportanceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ListValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UsabilityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RangeDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPropertyType", propOrder = {
    "id",
    "name",
    "nameCode",
    "testMethod",
    "value",
    "valueQuantity",
    "valueQualifiers",
    "importanceCode",
    "listValues",
    "usabilityPeriod",
    "itemPropertyGroups",
    "rangeDimension",
    "itemPropertyRange"
})
public class ItemPropertyType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected Name name;
    @XmlElement(name = "NameCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameCode nameCode;
    @XmlElement(name = "TestMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TestMethod testMethod;
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Value value;
    @XmlElement(name = "ValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueQuantity valueQuantity;
    @XmlElement(name = "ValueQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ValueQualifier> valueQualifiers;
    @XmlElement(name = "ImportanceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ImportanceCode importanceCode;
    @XmlElement(name = "ListValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ListValue> listValues;
    @XmlElement(name = "UsabilityPeriod")
    protected PeriodType usabilityPeriod;
    @XmlElement(name = "ItemPropertyGroup")
    protected List<ItemPropertyGroup> itemPropertyGroups;
    @XmlElement(name = "RangeDimension")
    protected DimensionType rangeDimension;
    @XmlElement(name = "ItemPropertyRange")
    protected ItemPropertyRange itemPropertyRange;

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
     * Obtiene el valor de la propiedad nameCode.
     * 
     * @return
     *     possible object is
     *     {@link NameCode }
     *     
     */
    public NameCode getNameCode() {
        return nameCode;
    }

    /**
     * Define el valor de la propiedad nameCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCode }
     *     
     */
    public void setNameCode(NameCode value) {
        this.nameCode = value;
    }

    /**
     * Obtiene el valor de la propiedad testMethod.
     * 
     * @return
     *     possible object is
     *     {@link TestMethod }
     *     
     */
    public TestMethod getTestMethod() {
        return testMethod;
    }

    /**
     * Define el valor de la propiedad testMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMethod }
     *     
     */
    public void setTestMethod(TestMethod value) {
        this.testMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad valueQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ValueQuantity }
     *     
     */
    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Define el valor de la propiedad valueQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQuantity }
     *     
     */
    public void setValueQuantity(ValueQuantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueQualifier }
     * 
     * 
     */
    public List<ValueQualifier> getValueQualifiers() {
        if (valueQualifiers == null) {
            valueQualifiers = new ArrayList<ValueQualifier>();
        }
        return this.valueQualifiers;
    }

    /**
     * Obtiene el valor de la propiedad importanceCode.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceCode }
     *     
     */
    public ImportanceCode getImportanceCode() {
        return importanceCode;
    }

    /**
     * Define el valor de la propiedad importanceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceCode }
     *     
     */
    public void setImportanceCode(ImportanceCode value) {
        this.importanceCode = value;
    }

    /**
     * Gets the value of the listValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListValue }
     * 
     * 
     */
    public List<ListValue> getListValues() {
        if (listValues == null) {
            listValues = new ArrayList<ListValue>();
        }
        return this.listValues;
    }

    /**
     * Obtiene el valor de la propiedad usabilityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getUsabilityPeriod() {
        return usabilityPeriod;
    }

    /**
     * Define el valor de la propiedad usabilityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setUsabilityPeriod(PeriodType value) {
        this.usabilityPeriod = value;
    }

    /**
     * Gets the value of the itemPropertyGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPropertyGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPropertyGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyGroup }
     * 
     * 
     */
    public List<ItemPropertyGroup> getItemPropertyGroups() {
        if (itemPropertyGroups == null) {
            itemPropertyGroups = new ArrayList<ItemPropertyGroup>();
        }
        return this.itemPropertyGroups;
    }

    /**
     * Obtiene el valor de la propiedad rangeDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getRangeDimension() {
        return rangeDimension;
    }

    /**
     * Define el valor de la propiedad rangeDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setRangeDimension(DimensionType value) {
        this.rangeDimension = value;
    }

    /**
     * Obtiene el valor de la propiedad itemPropertyRange.
     * 
     * @return
     *     possible object is
     *     {@link ItemPropertyRange }
     *     
     */
    public ItemPropertyRange getItemPropertyRange() {
        return itemPropertyRange;
    }

    /**
     * Define el valor de la propiedad itemPropertyRange.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPropertyRange }
     *     
     */
    public void setItemPropertyRange(ItemPropertyRange value) {
        this.itemPropertyRange = value;
    }

}
