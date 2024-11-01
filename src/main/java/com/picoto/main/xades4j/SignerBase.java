package com.picoto.main.xades4j;

import java.security.KeyStoreException;

import com.picoto.main.Utils;

import xades4j.properties.DataObjectDesc;
import xades4j.properties.DataObjectFormatProperty;
import xades4j.properties.IdentifierType;
import xades4j.properties.ObjectIdentifier;
import xades4j.properties.SignaturePolicyBase;
import xades4j.properties.SignaturePolicyIdentifierProperty;
import xades4j.providers.DataObjectPropertiesProvider;
import xades4j.providers.KeyingDataProvider;
import xades4j.providers.SignaturePolicyInfoProvider;
import xades4j.providers.impl.FileSystemKeyStoreKeyingDataProvider;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

public class SignerBase extends SignatureServicesTestBase {

	static protected KeyingDataProvider keyingProviderMy;
	static protected SignaturePolicyInfoProvider policyInfoProviderMy;
	static protected DataObjectPropertiesProvider dataObjectPropertiesProviderMy;

	static {
		try {
			policyInfoProviderMy = new SignaturePolicyInfoProvider() {
				public SignaturePolicyBase getSignaturePolicy() {
					return new SignaturePolicyIdentifierProperty(
							new ObjectIdentifier("urn:oid:2.16.724.1.3.1.1.2.1.9", IdentifierType.URI, ""),
							Utils.getFile("politica/politica_de_firma_anexo_1.pdf"))
							.withLocationUrl("https://sede.administracion.gob.es/politica_de_firma_anexo_1.pdf");
				}
			};

			keyingProviderMy = createFileSystemKeyingDataProvider("PKCS12", "./certs/keyStoreTest.pfx", "test1234", true);

		} catch (KeyStoreException e) {
			throw new IllegalStateException("SignerTestBase init failed: " + e.getMessage());
		}

		dataObjectPropertiesProviderMy = new DataObjectPropertiesProvider() {

			@Override
			public void provideProperties(DataObjectDesc dataObj) {
				ObjectIdentifier idObj = new ObjectIdentifier("urn:oid:1.2.840.10003.5.109.10", IdentifierType.URI, "");
				dataObj.withDataObjectFormat(new DataObjectFormatProperty("text/xml").withIdentifier(idObj));
			}

		};

	}

	protected static FileSystemKeyStoreKeyingDataProvider createFileSystemKeyingDataProvider(String keyStoreType,
			String keyStorePath, String keyStorePwd, boolean returnFullChain) throws KeyStoreException {
		return FileSystemKeyStoreKeyingDataProvider
				.builder(keyStoreType, keyStorePath, KeyStoreKeyingDataProvider.SigningCertificateSelector.single())
				.storePassword(new DirectPasswordProvider(keyStorePwd))
				.entryPassword(new DirectPasswordProvider(keyStorePwd)).fullChain(returnFullChain).build();
	}

}
