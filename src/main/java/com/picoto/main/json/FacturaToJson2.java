package com.picoto.main.json;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.JSONException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.picoto.jaxb.ubl.maindoc.invoice.Invoice;


public class FacturaToJson2 {

	public static void main(String[] args) throws IOException {

		try {
			long inic = getTime();

			Invoice factura = parseaFactura("examples/out/invoice-ubl-ordinaria.xml");
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_EMPTY);

			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(factura);

			long fina = getTime();

			FileOutputStream fos = new FileOutputStream("examples/out/invoice-ubl-ordinaria2.json");
			fos.write(jsonString.getBytes());
			fos.close();
			System.out.println("Tiempo: " + (fina - inic) + "ms");

		} catch (JSONException e) {
			System.out.println(e.toString());
		}

	}

	public static long getTime() {
		return System.currentTimeMillis();
	}

	public static Invoice parseaFactura(String path) {
		try {
			JAXBContext context = JAXBContext.newInstance(Invoice.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (Invoice) unmarshaller.unmarshal(new File(path));
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}

}
