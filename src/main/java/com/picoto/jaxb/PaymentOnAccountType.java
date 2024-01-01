//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.02 a las 12:15:08 AM CET 
//


package com.picoto.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentOnAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentOnAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentOnAccountDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PaymentOnAccountAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOnAccountType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "paymentOnAccountDate",
    "paymentOnAccountAmount"
})
public class PaymentOnAccountType {

    @XmlElement(name = "PaymentOnAccountDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentOnAccountDate;
    @XmlElement(name = "PaymentOnAccountAmount")
    protected double paymentOnAccountAmount;

    /**
     * Obtiene el valor de la propiedad paymentOnAccountDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentOnAccountDate() {
        return paymentOnAccountDate;
    }

    /**
     * Define el valor de la propiedad paymentOnAccountDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentOnAccountDate(XMLGregorianCalendar value) {
        this.paymentOnAccountDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentOnAccountAmount.
     * 
     */
    public double getPaymentOnAccountAmount() {
        return paymentOnAccountAmount;
    }

    /**
     * Define el valor de la propiedad paymentOnAccountAmount.
     * 
     */
    public void setPaymentOnAccountAmount(double value) {
        this.paymentOnAccountAmount = value;
    }

}
