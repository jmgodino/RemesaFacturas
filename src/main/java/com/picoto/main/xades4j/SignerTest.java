package com.picoto.main.xades4j;

import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.signature.XMLSignature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import xades4j.production.BasicSignatureOptions;
import xades4j.production.Enveloped;
import xades4j.production.SignatureAlgorithms;
import xades4j.production.XadesEpesSigningProfile;
import xades4j.production.XadesSigner;

public class SignerTest extends SignerBase {

	public static void main(String args[]) throws Exception {
		Document doc = getDocument("./examples/ejemploRegistro.xml");
		Element elemToSign = doc.getDocumentElement();

		XadesSigner signer = new XadesEpesSigningProfile(keyingProviderMy, policyInfoProvider)
				.withBasicSignatureOptions(new BasicSignatureOptions().includePublicKey(true))
				.withSignatureAlgorithms(new SignatureAlgorithms()
						.withSignatureAlgorithm("RSA", XMLSignature.ALGO_ID_SIGNATURE_RSA_SHA256)
						.withDigestAlgorithmForReferenceProperties(MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA256)
						.withDigestAlgorithmForDataObjectReferences(MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA256)
						)
				.newSigner();

		new Enveloped(signer).sign(elemToSign);
		outputDocument(doc, "./examples/ejemploRegistro-signed-epes-xades4j.xml");
	}

}
