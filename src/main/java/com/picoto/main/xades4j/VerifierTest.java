package com.picoto.main.xades4j;

import com.picoto.main.Utils;

import xades4j.verification.XAdESVerificationResult;

class VerifierTet extends VerifierBase {

	public static void main(String args[]) throws Exception {

		XAdESVerificationResult result = verifySignature("./examples/ejemplo-signed-xades4j.xml");
		Utils.log(result.getSignatureForm().toString());

	}

}
