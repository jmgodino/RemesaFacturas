package com.picoto.main.xades4j;

import java.io.ByteArrayInputStream;
import java.security.KeyStoreException;

import xades4j.properties.IdentifierType;
import xades4j.properties.ObjectIdentifier;
import xades4j.properties.SignaturePolicyBase;
import xades4j.properties.SignaturePolicyIdentifierProperty;
import xades4j.providers.KeyingDataProvider;
import xades4j.providers.SignaturePolicyInfoProvider;
import xades4j.providers.impl.FileSystemKeyStoreKeyingDataProvider;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

public class SignerBase extends SignatureServicesTestBase {

	static protected KeyingDataProvider keyingProviderMy;
	static protected SignaturePolicyInfoProvider policyInfoProvider;

	static {
		try {
			policyInfoProvider = new SignaturePolicyInfoProvider() {
	            public SignaturePolicyBase getSignaturePolicy() {
	                return new SignaturePolicyIdentifierProperty(
	                        new ObjectIdentifier("oid:/2.16.724.1.3.1.1.2.1.9", IdentifierType.OID_AS_URI, "Política de Firma Electrónica y de Certificados de la\n"
	                        		+ "Administración General del Estado"),
	                        new ByteArrayInputStream("En el Punto de acceso general de la Administración General del Estado".getBytes()))
	                                .withLocationUrl("http://administracionelectronica.gob.es/es/ctt/politicafirma");
	            }
	        };
			
			keyingProviderMy = createFileSystemKeyingDataProvider("PKCS12", "./certs/keyStoreTest.pfx", "test1234", true);

		} catch (KeyStoreException e) {
			throw new IllegalStateException("SignerTestBase init failed: " + e.getMessage());
		}

	}

	protected static FileSystemKeyStoreKeyingDataProvider createFileSystemKeyingDataProvider(String keyStoreType,
			String keyStorePath, String keyStorePwd, boolean returnFullChain) throws KeyStoreException {
		return FileSystemKeyStoreKeyingDataProvider
				.builder(keyStoreType, keyStorePath, KeyStoreKeyingDataProvider.SigningCertificateSelector.single())
				.storePassword(new DirectPasswordProvider(keyStorePwd))
				.entryPassword(new DirectPasswordProvider(keyStorePwd)).fullChain(returnFullChain).build();
	}
	
	

}
