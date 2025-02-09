package com.picoto.main.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.XML;
import org.json.JSONObject;
import org.json.JSONException;

public class FacturaToJson {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	public static void main(String[] args) throws IOException {
		File file = new File("examples/out/invoice-ubl-ordinaria.xml");
		FileInputStream fin = new FileInputStream(file);
		byte[] xmlData = new byte[(int) file.length()];
		fin.read(xmlData);
		fin.close();
		String xml = new String(xmlData, "UTF-8");

		try {
			long inic = getTime();
			
			JSONObject xmlJSONObj = XML.toJSONObject(xml);
			String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
			
			long fina = getTime();
			
			FileOutputStream fos = new FileOutputStream("examples/out/invoice-ubl-ordinaria.json");
			fos.write(jsonPrettyPrintString.getBytes());
			fos.close();
			System.out.println("Tiempo: "+(fina-inic)+ "ms");

		} catch (JSONException e) {
			System.out.println(e.toString());
		}

	}
	
	public static long getTime() {
		return System.currentTimeMillis();
	}

}
