package com.picoto.main.xades4j;

import java.security.KeyStoreException;

import xades4j.providers.KeyingDataProvider;
import xades4j.providers.impl.FileSystemKeyStoreKeyingDataProvider;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

public class SignerBase extends SignatureServicesTestBase {

	static protected KeyingDataProvider keyingProviderMy;

	static {
		try {
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
