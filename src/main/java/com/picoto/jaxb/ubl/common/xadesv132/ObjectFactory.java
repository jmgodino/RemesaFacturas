//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.14 a las 02:46:26 PM CET 
//


package com.picoto.jaxb.ubl.common.xadesv132;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.picoto.jaxb.ubl.common.xadesv132 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AllDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AllDataObjectsTimeStamp");
    private final static QName _AttributeCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeCertificateRefs");
    private final static QName _SigningTime_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningTime");
    private final static QName _IndividualDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "IndividualDataObjectsTimeStamp");
    private final static QName _SigAndRefsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigAndRefsTimeStamp");
    private final static QName _AttrAuthoritiesCertValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttrAuthoritiesCertValues");
    private final static QName _ArchiveTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ArchiveTimeStamp");
    private final static QName _CompleteRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteRevocationRefs");
    private final static QName _AttributeRevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationValues");
    private final static QName _CertificateValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertificateValues");
    private final static QName _RevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RevocationValues");
    private final static QName _CompleteCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteCertificateRefs");
    private final static QName _SignatureTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureTimeStamp");
    private final static QName _AttributeRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationRefs");
    private final static QName _RefsOnlyTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RefsOnlyTimeStamp");
    private final static QName _SPURI_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SPURI");
    private final static QName _XAdESTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "XAdESTimeStamp");
    private final static QName _UnsignedSignaturePropertiesCounterSignature_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CounterSignature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.picoto.jaxb.ubl.common.xadesv132
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignedDataObjectProperties }
     * 
     */
    public SignedDataObjectProperties createSignedDataObjectProperties() {
        return new SignedDataObjectProperties();
    }

    /**
     * Create an instance of {@link DataObjectFormat }
     * 
     */
    public DataObjectFormat createDataObjectFormat() {
        return new DataObjectFormat();
    }

    /**
     * Create an instance of {@link CommitmentTypeIndication }
     * 
     */
    public CommitmentTypeIndication createCommitmentTypeIndication() {
        return new CommitmentTypeIndication();
    }

    /**
     * Create an instance of {@link XAdESTimeStampType }
     * 
     */
    public XAdESTimeStampType createXAdESTimeStampType() {
        return new XAdESTimeStampType();
    }

    /**
     * Create an instance of {@link OtherTimeStamp }
     * 
     */
    public OtherTimeStamp createOtherTimeStamp() {
        return new OtherTimeStamp();
    }

    /**
     * Create an instance of {@link ReferenceInfo }
     * 
     */
    public ReferenceInfo createReferenceInfo() {
        return new ReferenceInfo();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link EncapsulatedPKIData }
     * 
     */
    public EncapsulatedPKIData createEncapsulatedPKIData() {
        return new EncapsulatedPKIData();
    }

    /**
     * Create an instance of {@link Any }
     * 
     */
    public Any createAny() {
        return new Any();
    }

    /**
     * Create an instance of {@link SigningCertificate }
     * 
     */
    public SigningCertificate createSigningCertificate() {
        return new SigningCertificate();
    }

    /**
     * Create an instance of {@link CertIDType }
     * 
     */
    public CertIDType createCertIDType() {
        return new CertIDType();
    }

    /**
     * Create an instance of {@link UnsignedSignatureProperties }
     * 
     */
    public UnsignedSignatureProperties createUnsignedSignatureProperties() {
        return new UnsignedSignatureProperties();
    }

    /**
     * Create an instance of {@link CounterSignature }
     * 
     */
    public CounterSignature createCounterSignature() {
        return new CounterSignature();
    }

    /**
     * Create an instance of {@link CompleteCertificateRefsType }
     * 
     */
    public CompleteCertificateRefsType createCompleteCertificateRefsType() {
        return new CompleteCertificateRefsType();
    }

    /**
     * Create an instance of {@link CompleteRevocationRefsType }
     * 
     */
    public CompleteRevocationRefsType createCompleteRevocationRefsType() {
        return new CompleteRevocationRefsType();
    }

    /**
     * Create an instance of {@link CertificateValuesType }
     * 
     */
    public CertificateValuesType createCertificateValuesType() {
        return new CertificateValuesType();
    }

    /**
     * Create an instance of {@link RevocationValuesType }
     * 
     */
    public RevocationValuesType createRevocationValuesType() {
        return new RevocationValuesType();
    }

    /**
     * Create an instance of {@link QualifyingPropertiesReference }
     * 
     */
    public QualifyingPropertiesReference createQualifyingPropertiesReference() {
        return new QualifyingPropertiesReference();
    }

    /**
     * Create an instance of {@link UnsignedDataObjectProperties }
     * 
     */
    public UnsignedDataObjectProperties createUnsignedDataObjectProperties() {
        return new UnsignedDataObjectProperties();
    }

    /**
     * Create an instance of {@link SignerRole }
     * 
     */
    public SignerRole createSignerRole() {
        return new SignerRole();
    }

    /**
     * Create an instance of {@link ClaimedRolesListType }
     * 
     */
    public ClaimedRolesListType createClaimedRolesListType() {
        return new ClaimedRolesListType();
    }

    /**
     * Create an instance of {@link CertifiedRolesListType }
     * 
     */
    public CertifiedRolesListType createCertifiedRolesListType() {
        return new CertifiedRolesListType();
    }

    /**
     * Create an instance of {@link SignedProperties }
     * 
     */
    public SignedProperties createSignedProperties() {
        return new SignedProperties();
    }

    /**
     * Create an instance of {@link SignedSignatureProperties }
     * 
     */
    public SignedSignatureProperties createSignedSignatureProperties() {
        return new SignedSignatureProperties();
    }

    /**
     * Create an instance of {@link ObjectIdentifier }
     * 
     */
    public ObjectIdentifier createObjectIdentifier() {
        return new ObjectIdentifier();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link DocumentationReferencesType }
     * 
     */
    public DocumentationReferencesType createDocumentationReferencesType() {
        return new DocumentationReferencesType();
    }

    /**
     * Create an instance of {@link QualifyingProperties }
     * 
     */
    public QualifyingProperties createQualifyingProperties() {
        return new QualifyingProperties();
    }

    /**
     * Create an instance of {@link UnsignedProperties }
     * 
     */
    public UnsignedProperties createUnsignedProperties() {
        return new UnsignedProperties();
    }

    /**
     * Create an instance of {@link CommitmentTypeQualifiersListType }
     * 
     */
    public CommitmentTypeQualifiersListType createCommitmentTypeQualifiersListType() {
        return new CommitmentTypeQualifiersListType();
    }

    /**
     * Create an instance of {@link SignatureProductionPlace }
     * 
     */
    public SignatureProductionPlace createSignatureProductionPlace() {
        return new SignatureProductionPlace();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdentifier }
     * 
     */
    public SignaturePolicyIdentifier createSignaturePolicyIdentifier() {
        return new SignaturePolicyIdentifier();
    }

    /**
     * Create an instance of {@link SPUserNotice }
     * 
     */
    public SPUserNotice createSPUserNotice() {
        return new SPUserNotice();
    }

    /**
     * Create an instance of {@link NoticeReferenceType }
     * 
     */
    public NoticeReferenceType createNoticeReferenceType() {
        return new NoticeReferenceType();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdType }
     * 
     */
    public SignaturePolicyIdType createSignaturePolicyIdType() {
        return new SignaturePolicyIdType();
    }

    /**
     * Create an instance of {@link DigestAlgAndValueType }
     * 
     */
    public DigestAlgAndValueType createDigestAlgAndValueType() {
        return new DigestAlgAndValueType();
    }

    /**
     * Create an instance of {@link CRLValuesType }
     * 
     */
    public CRLValuesType createCRLValuesType() {
        return new CRLValuesType();
    }

    /**
     * Create an instance of {@link CRLRefType }
     * 
     */
    public CRLRefType createCRLRefType() {
        return new CRLRefType();
    }

    /**
     * Create an instance of {@link OCSPRefsType }
     * 
     */
    public OCSPRefsType createOCSPRefsType() {
        return new OCSPRefsType();
    }

    /**
     * Create an instance of {@link OtherCertStatusValuesType }
     * 
     */
    public OtherCertStatusValuesType createOtherCertStatusValuesType() {
        return new OtherCertStatusValuesType();
    }

    /**
     * Create an instance of {@link SigPolicyQualifiersListType }
     * 
     */
    public SigPolicyQualifiersListType createSigPolicyQualifiersListType() {
        return new SigPolicyQualifiersListType();
    }

    /**
     * Create an instance of {@link CRLIdentifierType }
     * 
     */
    public CRLIdentifierType createCRLIdentifierType() {
        return new CRLIdentifierType();
    }

    /**
     * Create an instance of {@link CRLRefsType }
     * 
     */
    public CRLRefsType createCRLRefsType() {
        return new CRLRefsType();
    }

    /**
     * Create an instance of {@link OCSPRefType }
     * 
     */
    public OCSPRefType createOCSPRefType() {
        return new OCSPRefType();
    }

    /**
     * Create an instance of {@link OtherCertStatusRefsType }
     * 
     */
    public OtherCertStatusRefsType createOtherCertStatusRefsType() {
        return new OtherCertStatusRefsType();
    }

    /**
     * Create an instance of {@link IntegerListType }
     * 
     */
    public IntegerListType createIntegerListType() {
        return new IntegerListType();
    }

    /**
     * Create an instance of {@link OCSPIdentifierType }
     * 
     */
    public OCSPIdentifierType createOCSPIdentifierType() {
        return new OCSPIdentifierType();
    }

    /**
     * Create an instance of {@link ResponderIDType }
     * 
     */
    public ResponderIDType createResponderIDType() {
        return new ResponderIDType();
    }

    /**
     * Create an instance of {@link OCSPValuesType }
     * 
     */
    public OCSPValuesType createOCSPValuesType() {
        return new OCSPValuesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AllDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createAllDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_AllDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createAttributeCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_AttributeCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigningTime")
    public JAXBElement<XMLGregorianCalendar> createSigningTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SigningTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "IndividualDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createIndividualDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_IndividualDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigAndRefsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSigAndRefsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttrAuthoritiesCertValues")
    public JAXBElement<CertificateValuesType> createAttrAuthoritiesCertValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_AttrAuthoritiesCertValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ArchiveTimeStamp")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createCompleteRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_CompleteRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationValues")
    public JAXBElement<RevocationValuesType> createAttributeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_AttributeRevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CertificateValues")
    public JAXBElement<CertificateValuesType> createCertificateValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_CertificateValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RevocationValues")
    public JAXBElement<RevocationValuesType> createRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_RevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createCompleteCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_CompleteCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSignatureTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SignatureTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createAttributeRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_AttributeRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RefsOnlyTimeStamp")
    public JAXBElement<XAdESTimeStampType> createRefsOnlyTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SPURI")
    public JAXBElement<String> createSPURI(String value) {
        return new JAXBElement<String>(_SPURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "XAdESTimeStamp")
    public JAXBElement<XAdESTimeStampType> createXAdESTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_XAdESTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationRefs", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CompleteRevocationRefsType> createUnsignedSignaturePropertiesAttributeRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_AttributeRevocationRefs_QNAME, CompleteRevocationRefsType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigAndRefsTimeStamp", scope = UnsignedSignatureProperties.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesSigAndRefsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationValues", scope = UnsignedSignatureProperties.class)
    public JAXBElement<RevocationValuesType> createUnsignedSignaturePropertiesAttributeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_AttributeRevocationValues_QNAME, RevocationValuesType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeCertificateRefs", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CompleteCertificateRefsType> createUnsignedSignaturePropertiesAttributeCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_AttributeCertificateRefs_QNAME, CompleteCertificateRefsType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RefsOnlyTimeStamp", scope = UnsignedSignatureProperties.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesRefsOnlyTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CertificateValues", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CertificateValuesType> createUnsignedSignaturePropertiesCertificateValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_CertificateValues_QNAME, CertificateValuesType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttrAuthoritiesCertValues", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CertificateValuesType> createUnsignedSignaturePropertiesAttrAuthoritiesCertValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_AttrAuthoritiesCertValues_QNAME, CertificateValuesType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ArchiveTimeStamp", scope = UnsignedSignatureProperties.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RevocationValues", scope = UnsignedSignatureProperties.class)
    public JAXBElement<RevocationValuesType> createUnsignedSignaturePropertiesRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_RevocationValues_QNAME, RevocationValuesType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteRevocationRefs", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CompleteRevocationRefsType> createUnsignedSignaturePropertiesCompleteRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_CompleteRevocationRefs_QNAME, CompleteRevocationRefsType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteCertificateRefs", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CompleteCertificateRefsType> createUnsignedSignaturePropertiesCompleteCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_CompleteCertificateRefs_QNAME, CompleteCertificateRefsType.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CounterSignature", scope = UnsignedSignatureProperties.class)
    public JAXBElement<CounterSignature> createUnsignedSignaturePropertiesCounterSignature(CounterSignature value) {
        return new JAXBElement<CounterSignature>(_UnsignedSignaturePropertiesCounterSignature_QNAME, CounterSignature.class, UnsignedSignatureProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureTimeStamp", scope = UnsignedSignatureProperties.class)
    public JAXBElement<XAdESTimeStampType> createUnsignedSignaturePropertiesSignatureTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SignatureTimeStamp_QNAME, XAdESTimeStampType.class, UnsignedSignatureProperties.class, value);
    }

}
