package com.picoto.main;

import static java.util.Objects.requireNonNull;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XAdESCommon {
	

	private static final String XADES_NAMESPACE = "http://uri.etsi.org/01903/v1.3.2#";
	
	protected void markSignerPropertiesId(Element document) {
		NodeList signedPropertiesNodeList = document.getElementsByTagNameNS(XADES_NAMESPACE,"SignedProperties");
		requireNonNull(signedPropertiesNodeList);
		for (int i = 0; i < signedPropertiesNodeList.getLength(); i++) {
			Node node = signedPropertiesNodeList.item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				element.setIdAttribute("Id", true);

			}
		}
	}

}
