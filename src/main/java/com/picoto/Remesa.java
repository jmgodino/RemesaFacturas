//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.12.09 a las 05:34:13 PM CET 
//


package com.picoto;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}Facturae" maxOccurs="1000"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facturae"
})
@XmlRootElement(name = "remesa", namespace = "https://www.agenciaributaria.gob.es/formato/Versiones/FacturaeElectronicav1_0_0.xml")
public class Remesa {

    @XmlElement(name = "Facturae", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", required = true)
    protected List<Facturae> facturae;

    /**
     * Gets the value of the facturae property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facturae property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturae().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facturae }
     * 
     * 
     */
    public List<Facturae> getFacturae() {
        if (facturae == null) {
            facturae = new ArrayList<Facturae>();
        }
        return this.facturae;
    }

}
