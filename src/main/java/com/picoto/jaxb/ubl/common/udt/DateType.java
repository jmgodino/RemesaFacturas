//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 09:16:24 PM CET 
//


package com.picoto.jaxb.ubl.common.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.picoto.jaxb.ubl.common.cbc.ActualDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.ActualDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.ActualPickupDate;
import com.picoto.jaxb.ubl.common.cbc.ApprovalDate;
import com.picoto.jaxb.ubl.common.cbc.AvailabilityDate;
import com.picoto.jaxb.ubl.common.cbc.AwardDate;
import com.picoto.jaxb.ubl.common.cbc.BestBeforeDate;
import com.picoto.jaxb.ubl.common.cbc.BirthDate;
import com.picoto.jaxb.ubl.common.cbc.CallDate;
import com.picoto.jaxb.ubl.common.cbc.ComparisonForecastIssueDate;
import com.picoto.jaxb.ubl.common.cbc.Date;
import com.picoto.jaxb.ubl.common.cbc.DueDate;
import com.picoto.jaxb.ubl.common.cbc.EarliestPickupDate;
import com.picoto.jaxb.ubl.common.cbc.EffectiveDate;
import com.picoto.jaxb.ubl.common.cbc.EndDate;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.EstimatedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.ExpiryDate;
import com.picoto.jaxb.ubl.common.cbc.FirstShipmentAvailibilityDate;
import com.picoto.jaxb.ubl.common.cbc.GuaranteedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.InstallmentDueDate;
import com.picoto.jaxb.ubl.common.cbc.IssueDate;
import com.picoto.jaxb.ubl.common.cbc.LastRevisionDate;
import com.picoto.jaxb.ubl.common.cbc.LatestDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.LatestMeterReadingDate;
import com.picoto.jaxb.ubl.common.cbc.LatestPickupDate;
import com.picoto.jaxb.ubl.common.cbc.LatestProposalAcceptanceDate;
import com.picoto.jaxb.ubl.common.cbc.LatestSecurityClearanceDate;
import com.picoto.jaxb.ubl.common.cbc.ManufactureDate;
import com.picoto.jaxb.ubl.common.cbc.NominationDate;
import com.picoto.jaxb.ubl.common.cbc.OccurrenceDate;
import com.picoto.jaxb.ubl.common.cbc.PaidDate;
import com.picoto.jaxb.ubl.common.cbc.PaymentDueDate;
import com.picoto.jaxb.ubl.common.cbc.PlannedDate;
import com.picoto.jaxb.ubl.common.cbc.PreviousMeterReadingDate;
import com.picoto.jaxb.ubl.common.cbc.ReceivedDate;
import com.picoto.jaxb.ubl.common.cbc.ReferenceDate;
import com.picoto.jaxb.ubl.common.cbc.RegisteredDate;
import com.picoto.jaxb.ubl.common.cbc.RegistrationDate;
import com.picoto.jaxb.ubl.common.cbc.RegistrationExpirationDate;
import com.picoto.jaxb.ubl.common.cbc.RequestedDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.RequestedDespatchDate;
import com.picoto.jaxb.ubl.common.cbc.RequestedPublicationDate;
import com.picoto.jaxb.ubl.common.cbc.RequiredDeliveryDate;
import com.picoto.jaxb.ubl.common.cbc.ResolutionDate;
import com.picoto.jaxb.ubl.common.cbc.ResponseDate;
import com.picoto.jaxb.ubl.common.cbc.RevisionDate;
import com.picoto.jaxb.ubl.common.cbc.SourceForecastIssueDate;
import com.picoto.jaxb.ubl.common.cbc.StartDate;
import com.picoto.jaxb.ubl.common.cbc.SubmissionDate;
import com.picoto.jaxb.ubl.common.cbc.SubmissionDueDate;
import com.picoto.jaxb.ubl.common.cbc.TaxPointDate;
import com.picoto.jaxb.ubl.common.cbc.ValidationDate;
import com.picoto.jaxb.ubl.common.cbc.ValidityStartDate;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000009&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;One calendar day according the Gregorian calendar.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para DateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "value"
})
@XmlSeeAlso({
    TaxPointDate.class,
    SubmissionDueDate.class,
    RevisionDate.class,
    ResponseDate.class,
    RequiredDeliveryDate.class,
    RequestedPublicationDate.class,
    RegisteredDate.class,
    ReceivedDate.class,
    PlannedDate.class,
    PaidDate.class,
    OccurrenceDate.class,
    NominationDate.class,
    LatestDeliveryDate.class,
    LastRevisionDate.class,
    InstallmentDueDate.class,
    EstimatedDeliveryDate.class,
    EffectiveDate.class,
    DueDate.class,
    Date.class,
    BirthDate.class,
    ApprovalDate.class,
    ActualDeliveryDate.class,
    ReferenceDate.class,
    LatestSecurityClearanceDate.class,
    AwardDate.class,
    ResolutionDate.class,
    LatestProposalAcceptanceDate.class,
    FirstShipmentAvailibilityDate.class,
    SubmissionDate.class,
    EndDate.class,
    StartDate.class,
    RequestedDeliveryDate.class,
    LatestPickupDate.class,
    EarliestPickupDate.class,
    ActualPickupDate.class,
    PaymentDueDate.class,
    RegistrationExpirationDate.class,
    RegistrationDate.class,
    LatestMeterReadingDate.class,
    PreviousMeterReadingDate.class,
    BestBeforeDate.class,
    ManufactureDate.class,
    AvailabilityDate.class,
    SourceForecastIssueDate.class,
    ComparisonForecastIssueDate.class,
    IssueDate.class,
    GuaranteedDespatchDate.class,
    ActualDespatchDate.class,
    EstimatedDespatchDate.class,
    RequestedDespatchDate.class,
    CallDate.class,
    ValidationDate.class,
    ExpiryDate.class,
    ValidityStartDate.class
})
public class DateType {

    @XmlValue
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
