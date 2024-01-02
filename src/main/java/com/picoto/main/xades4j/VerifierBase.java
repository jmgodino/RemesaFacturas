package com.picoto.main.xades4j;

import java.io.FileInputStream;
import java.security.KeyStore;

import org.apache.xml.security.utils.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import xades4j.providers.CertificateValidationProvider;
import xades4j.providers.impl.PKIXCertificateValidationProvider;
import xades4j.verification.SignatureSpecificVerificationOptions;
import xades4j.verification.XAdESVerificationResult;
import xades4j.verification.XadesVerificationProfile;

public class VerifierBase extends SignatureServicesTestBase {
	public static CertificateValidationProvider validationProviderMySigs;

	static {
		try {
			KeyStore ks = createAndLoadJKSKeyStore("./certs/trustStoreTest.pfx", "test1234");
			validationProviderMySigs = PKIXCertificateValidationProvider.builder(ks).checkRevocation(false).build();

		} catch (Exception ex) {
			throw new NullPointerException("VerifierTestBase init failed: " + ex.getMessage());
		}
	}

	protected static XAdESVerificationResult verifySignature(String sigFileName) throws Exception {
		return verifySignature(sigFileName, new XadesVerificationProfile(validationProviderMySigs),
				null);
	}

	protected static XAdESVerificationResult verifySignature(String sigFileName, XadesVerificationProfile p)
			throws Exception {
		return verifySignature(sigFileName, p, null);
	}

	protected static XAdESVerificationResult verifySignature(String sigFileName,
			SignatureSpecificVerificationOptions options) throws Exception {
		return verifySignature(sigFileName, new XadesVerificationProfile(validationProviderMySigs), options);
	}

	protected static XAdESVerificationResult verifySignature(String sigFileName, XadesVerificationProfile p,
			SignatureSpecificVerificationOptions options) throws Exception {
		Element signatureNode = getSigElement(getDocument(sigFileName));
		return p.newVerifier().verify(signatureNode, options);
	}

	static public Element getSigElement(Document doc) throws Exception {
		return (Element) doc.getElementsByTagNameNS(Constants.SignatureSpecNS, Constants._TAG_SIGNATURE).item(0);
	}

	protected static KeyStore createAndLoadJKSKeyStore(String path, String pwd) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		KeyStore ks = KeyStore.getInstance("PKCS12");
		ks.load(fis, pwd.toCharArray());
		fis.close();
		return ks;
	}

}
