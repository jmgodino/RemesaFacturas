package com.picoto.main.xades;

import static java.time.ZonedDateTime.now;
import static java.util.Collections.singletonList;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.dom.DOMResult;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.picoto.jaxb.CertIDListType;
import com.picoto.jaxb.CertIDType;
import com.picoto.jaxb.DigestAlgAndValueType;
import com.picoto.jaxb.ObjectFactory;
import com.picoto.jaxb.QualifyingPropertiesType;
import com.picoto.jaxb.SignaturePolicyIdentifierType;
import com.picoto.jaxb.SignedPropertiesType;
import com.picoto.jaxb.SignedSignaturePropertiesType;
import com.picoto.jaxb.X509IssuerSerialType;
import com.picoto.main.Utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class XAdESSigner extends XAdESCommon {

	// Removes "enveloped signature" from a document, so the signature element
	// itself is not digested
	private static final String ENVELOPED_SIGNATURE_TRANSFORM_ALGORITHM = "http://www.w3.org/2000/09/xmldsig#enveloped-signature";
	// Canonicals (normalizes) a document. Preserves comments. E.g. removes line
	// feeds, normalizes attributes, CDATA, etc.
	private static final String C14N_CANONICALIZATION_ALGORITHM = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
	private static final String SIGNED_PROPERTIES_REFERENCE_TYPE = "http://uri.etsi.org/01903#SignedProperties";
	private static final String SHA256_DIGEST_ALGORITHM = "http://www.w3.org/2001/04/xmlenc#sha256";
	private static final String RSA_SHA512_SIGN_ALGORITHM = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";

	private static final C14NMethodParameterSpec EMPTY_C14N_PARAMS = null;
	private static final DigestMethodParameterSpec EMPTY_DIGEST_PARAMS = null;
	private static final SignatureMethodParameterSpec EMPTY_SIGN_PARAMS = null;
	private static final TransformParameterSpec EMPTY_TRANSFORM_PARAMS = null;

	private final X509Certificate certificate;
	private final PrivateKey privateKey;
	private final XMLSignatureFactory xmlSignatureFactory;

	public XAdESSigner(X509Certificate certificate, PrivateKey privateKey) {
		this.certificate = certificate;
		this.privateKey = privateKey;
		this.xmlSignatureFactory = signatureFactory();
	}

	public Document signEnveloped(Document document) {
		try {
			String signatureId = "signature-" + UUID.randomUUID();
			String signedPropertiesId = "signed-properties-" + UUID.randomUUID();

			SignedInfo signedInfo = createSignedInfo(signedPropertiesId);
			KeyInfo keyInfo = createKeyInfo();
			XMLObject qualifyingProperties = createQualifyingProperties(document, signedPropertiesId, signatureId);

			XMLSignature xmlSignature = xmlSignatureFactory.newXMLSignature(signedInfo, keyInfo,
					List.of(qualifyingProperties), signatureId, null);

			DOMSignContext domSignContext = createDomSignContext(document);
			xmlSignature.sign(domSignContext);

			return document;
		} catch (MarshalException | InvalidAlgorithmParameterException | NoSuchAlgorithmException
				| XMLSignatureException e) {
			throw new RuntimeException(e);
		}
	}

	private SignedInfo createSignedInfo(String signedPropertiesId)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		CanonicalizationMethod c14nMethod = xmlSignatureFactory
				.newCanonicalizationMethod(C14N_CANONICALIZATION_ALGORITHM, EMPTY_C14N_PARAMS);
		SignatureMethod signMethod = xmlSignatureFactory.newSignatureMethod(RSA_SHA512_SIGN_ALGORITHM,
				EMPTY_SIGN_PARAMS);

		List<Reference> references = List.of(createSignedDocumentReference(),
				createSignedPropertiesReference(signedPropertiesId));

		return xmlSignatureFactory.newSignedInfo(c14nMethod, signMethod, references);
	}

	/**
	 * This reference points to the document / element we are signing.
	 * <p>
	 * Because signature is _enveloped_, the signed element is the root element of
	 * the document.
	 */
	private Reference createSignedDocumentReference()
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
		DigestMethod digestMethod = xmlSignatureFactory.newDigestMethod(SHA256_DIGEST_ALGORITHM, EMPTY_DIGEST_PARAMS);
		// Because the signature is enveloped (included) in the signed document
		// it has to be removed before calculating digest. E.g. for signature
		// verification. This transformation does exactly that.
		Transform envelopedSignatureTransform = xmlSignatureFactory
				.newTransform(ENVELOPED_SIGNATURE_TRANSFORM_ALGORITHM, EMPTY_TRANSFORM_PARAMS);
		// Before calculating digest the document has to be normalized. This
		// canonicalization algorithm normalizes line feeds, etc. but prevents
		// comments.
		Transform c14nWithCommentsTransform = xmlSignatureFactory.newTransform(C14N_CANONICALIZATION_ALGORITHM,
				EMPTY_TRANSFORM_PARAMS);

		List<Transform> transforms = List.of(envelopedSignatureTransform, c14nWithCommentsTransform);

		// Empty URI points to the root element. Otherwise, the URI would have to point
		// to a signed element.
		return xmlSignatureFactory.newReference("", digestMethod, transforms, null, null);
	}

	/**
	 * This reference points to the XAdES signed properties.
	 * <p>
	 * The properties have to be digested / signed as well to prevent them from
	 * changing.
	 */
	private Reference createSignedPropertiesReference(String signedPropertiesId)
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
		String uri = "#" + signedPropertiesId;
		DigestMethod digestMethod = xmlSignatureFactory.newDigestMethod(SHA256_DIGEST_ALGORITHM, EMPTY_DIGEST_PARAMS);
		Transform c14nWithCommentsTransform = xmlSignatureFactory.newTransform(C14N_CANONICALIZATION_ALGORITHM,
				EMPTY_TRANSFORM_PARAMS);

		List<Transform> transforms = List.of(c14nWithCommentsTransform);

		return xmlSignatureFactory.newReference(uri, digestMethod, transforms, SIGNED_PROPERTIES_REFERENCE_TYPE, null);
	}

	private KeyInfo createKeyInfo() {
		KeyInfoFactory keyInfoFactory = xmlSignatureFactory.getKeyInfoFactory();
		X509Data x509Data = keyInfoFactory.newX509Data(List.of(certificate));
		return keyInfoFactory.newKeyInfo(List.of(x509Data));
	}

	/**
	 * The method creates type safely qualifying properties using DTOs generated
	 * from XAdES schema. Structure then has to be marshalled and adopted into the
	 * signing document.
	 * <p>
	 * Alternative approach would be to create properties structure manually via
	 * `document.createElement()` methods.
	 */
	private XMLObject createQualifyingProperties(Document ownerDocument, String signedPropertiesId,
			String signatureId) {
		ObjectFactory xadesFactory = new ObjectFactory();
		ObjectFactory xmldSigFactory = new ObjectFactory();

		DigestAlgAndValueType certificateDigest = xadesFactory.createDigestAlgAndValueType();
		certificateDigest.setDigestValue(calculateCertificateSha256Digest());
		certificateDigest.setDigestMethod(xmldSigFactory.createDigestMethodType());
		certificateDigest.getDigestMethod().setAlgorithm(SHA256_DIGEST_ALGORITHM);

		X509IssuerSerialType x509IssuerSerialType = xmldSigFactory.createX509IssuerSerialType();
		x509IssuerSerialType.setX509IssuerName(certificate.getIssuerX500Principal().getName());
		x509IssuerSerialType.setX509SerialNumber(certificate.getSerialNumber());

		CertIDType signingCertificate = xadesFactory.createCertIDType();
		signingCertificate.setCertDigest(certificateDigest);
		signingCertificate.setIssuerSerial(x509IssuerSerialType);

		CertIDListType signingCertificates = xadesFactory.createCertIDListType();
		signingCertificates.getCert().add(signingCertificate);

		// Usually the signature policy identifier points to a particular
		// policy. Alternatively, the empty "implied element" can be used to
		// state policy can be derived from semantics of the document.
		SignaturePolicyIdentifierType signaturePolicyIdentifierType = xadesFactory
				.createSignaturePolicyIdentifierType();
		signaturePolicyIdentifierType.setSignaturePolicyImplied("");

		SignedSignaturePropertiesType signedSignaturePropertiesType = xadesFactory
				.createSignedSignaturePropertiesType();
		signedSignaturePropertiesType.setSigningTime(currentTime());
		signedSignaturePropertiesType.setSigningCertificate(signingCertificates);
		signedSignaturePropertiesType.setSignaturePolicyIdentifier(signaturePolicyIdentifierType);

		SignedPropertiesType signedPropertiesType = xadesFactory.createSignedPropertiesType();
		signedPropertiesType.setId(signedPropertiesId);
		signedPropertiesType.setSignedSignatureProperties(signedSignaturePropertiesType);

		QualifyingPropertiesType qualifyingPropertiesType = xadesFactory.createQualifyingPropertiesType();
		qualifyingPropertiesType.setTarget("#" + signatureId);
		qualifyingPropertiesType.setSignedProperties(signedPropertiesType);

		JAXBElement<QualifyingPropertiesType> qualifyingProperties = xadesFactory
				.createQualifyingProperties(qualifyingPropertiesType);
		Element qualifyingPropertiesElement = marshall(qualifyingProperties);

		// If the qualifying-properties owner document is different to an owner
		// document of signed-data, then the DOMXMLSignature.marshal() ->
		// DOMXMLObject.marshal() method will try to adopt the qualifying-properties
		// element. This adoption removes id flags from attributes leading to
		// the "Cannot resolve element with ID" error.
		//
		// Explained:
		// https://stackoverflow.com/questions/17331187/xml-dig-sig-error-after-upgrade-to-java7u25
		//
		// Also, sometimes the document object is just a wrapper delegating to
		// a different document object. Different instances of owner-document
		// objects lead to aforementioned error.
		//
		// To mitigate the issues, the qualifying-properties element is imported
		// into the signed-data owner document.
		Node importedQualifyingProperties = ownerDocument.importNode(qualifyingPropertiesElement, true);

		// Re-set id flag lost during element import to all xs:id attributes
		// by setting the `Element.setIdAttribute("Id", true)`.
		markSignerPropertiesId((Element) importedQualifyingProperties);

		// If the owner document of the DOMStructure is different than the target
		// document of an XMLSignature,
		// the XMLSignature.sign(XMLSignContext) method imports the node into the target
		// document before
		// generating the signature.
		DOMStructure qualifyingPropertiesObject = new DOMStructure(importedQualifyingProperties);
		return xmlSignatureFactory.newXMLObject(singletonList(qualifyingPropertiesObject), null, null, null);
	}

	private byte[] calculateCertificateSha256Digest() {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			byte[] der = certificate.getEncoded();
			messageDigest.update(der);
			return messageDigest.digest();
		} catch (CertificateEncodingException | NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	private DOMSignContext createDomSignContext(Document document) {
		Element rootNode = document.getDocumentElement();
		DOMSignContext domSignContext = new DOMSignContext(privateKey, rootNode);
		// In our example we want to specify XML Signature namespace on the
		// root element of the document. E.g.:
		//
		// <docToSign ... xmlns:ns2="http://www.w3.org/2000/09/xmldsig#">
		// <ns2:Signature>
		//
		// So, to prefix the signature element with name spaces, we have to
		// specify the namespace via `setDefaultNamespacePrefix()` method.
		//
		// If no default namespace is specified, then the signing algorithm
		// adds namespace to the signature element itself. E.g.:
		//
		// <docToSign ...>
		// <Signature xmlns="http://www.w3.org/2000/09/xmldsig#">
		domSignContext.setDefaultNamespacePrefix("ds");
		return domSignContext;
	}

	private static XMLSignatureFactory signatureFactory() {
		try {
			return XMLSignatureFactory.getInstance("DOM", "XMLDSig");
		} catch (NoSuchProviderException e) {
			throw new RuntimeException(e);
		}
	}

	private static XMLGregorianCalendar currentTime() {
		try {
			GregorianCalendar gregorianCalendar = GregorianCalendar.from(now());
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	private static Element marshall(JAXBElement<QualifyingPropertiesType> qualifyingProperties) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(QualifyingPropertiesType.class);
			Marshaller marshaller = jaxbContext.createMarshaller();

			DOMResult domResult = new DOMResult();
			marshaller.marshal(qualifyingProperties, domResult);
			Node node = domResult.getNode();
			if (node instanceof Document) {
				Document qualifyingPropertiesDocument = (Document)node;
				return qualifyingPropertiesDocument.getDocumentElement();
			} else {
				throw new IllegalStateException("Node " + node + " is not document!");
			}
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String args[]) throws Exception {
		XAdESSigner signer = new XAdESSigner(getCert(), getPrivateKey("RSA"));
		String strDoc = IOUtils.toString(Utils.getFile("./examples/ejemplo.xml"), Charset.defaultCharset());
		Document signed = signer.signEnveloped(Utils.parseDocument(strDoc));
		String strSigned = new String(Utils.getDatosCompleto(signed, false));
		IOUtils.write(strSigned, new FileOutputStream("./examples/ejemplo-signed-custom.xml"), Charset.defaultCharset());
		Utils.log(strSigned);
	}

	public static PrivateKey getPrivateKey(String algorithm) throws Exception {
		byte[] contenido = IOUtils.toByteArray(Utils.getFile("./certs/privateKey.key"));

		String temp = new String(contenido);
		String privKeyPEM = temp.replace("-----BEGIN PRIVATE KEY-----", "");
		privKeyPEM = privKeyPEM.replace("-----END PRIVATE KEY-----", "");

		Base64 b64 = new Base64();
		byte[] decoded = b64.decode(privKeyPEM);

		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
		KeyFactory kf = KeyFactory.getInstance(algorithm);
		return kf.generatePrivate(spec);
	}

	public static X509Certificate getCert() throws Exception {
		CertificateFactory fact = CertificateFactory.getInstance("X.509");
		InputStream is = Utils.getFile("./certs/certificate.crt");
		X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
		return cer;
	}

}
