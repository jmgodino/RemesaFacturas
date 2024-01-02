package com.picoto.main;

import javax.xml.stream.XMLStreamReader;
import javax.xml.validation.Schema;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class ContextCommon {

	private JAXBContext ctx;

	public ContextCommon() {
		super();
		try {
			if (ctx == null) {
				ctx = JAXBContext.newInstance("com.picoto.jaxb");
			} 
		} catch (Exception e) {
			throw new RuntimeException("Error al cargar contexto JAX-B");
		}
	}
	
	public <T> T getJaxbObject(Class<T> clazz, Schema schema, XMLStreamReader reader) throws JAXBException {
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		unmarshaller.setSchema(schema);
		return unmarshaller.unmarshal(reader, clazz).getValue();

	}

	
}
