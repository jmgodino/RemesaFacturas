package com.picoto.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class CustomResourceResolver implements LSResourceResolver {

	private Class<?> clazz;
	private Charset charset = Charset.forName("ISO-8859-1");
	
	public CustomResourceResolver(Class<?> clazz) {
		this.clazz = clazz;
	}

	@Override
	public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
		debug("     Cargando schema: "+clazz.getCanonicalName()+" "+systemId);
		return new Input(publicId, systemId);
	}

	class Input implements LSInput {

		private String publicId;

		private String systemId;

		public String getPublicId() {
			return publicId;
		}

		public void setPublicId(String publicId) {
			this.publicId = publicId;
		}

		public String getBaseURI() {
			return null;
		}

		public InputStream getByteStream() {
			try {
				return IOUtils.toInputStream(
						IOUtils.resourceToString(systemId, charset, clazz.getClassLoader()),
						charset);
			} catch (Exception e) {
				throw new IllegalArgumentException("Error al cargar esquema", e);
			}
		}

		public boolean getCertifiedText() {
			return false;
		}

		public Reader getCharacterStream() {
			try {
				return new StringReader(
						IOUtils.resourceToString(systemId, charset, clazz.getClassLoader()));
			} catch (Exception e) {
				throw new IllegalArgumentException("Error al cargar esquema", e);
			}
		}

		public String getEncoding() {
			return null;
		}

		public String getStringData() {

			try {
				return IOUtils.resourceToString(systemId, charset, clazz.getClassLoader());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Exception " + e);
				return null;
			}
		}

		public void setBaseURI(String baseURI) {
		}

		public void setByteStream(InputStream byteStream) {
		}

		public void setCertifiedText(boolean certifiedText) {
		}

		public void setCharacterStream(Reader characterStream) {
		}

		public void setEncoding(String encoding) {
		}

		public void setStringData(String stringData) {
		}

		public String getSystemId() {
			return systemId;
		}

		public void setSystemId(String systemId) {
			this.systemId = systemId;
		}

		public Input(String publicId, String sysId) {
			this.publicId = publicId;
			this.systemId = sysId;
		}
	}

	public void debug(String msg) {
		System.out.println(msg);
	}

}