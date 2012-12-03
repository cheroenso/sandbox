package com.cwb.review;

import java.io.*;

import org.w3c.*;
import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class ReadXmlFile {
	public static String userFile = "/tmp/data/users.xml";

	public static void main (String[] args){
		try {
			// open existing file
			File xmlFile = new File(userFile);
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuild = dbfac.newDocumentBuilder();
			Document doc = dbuild.parse(xmlFile);
			

//			DocumentBuilderFactory dbfac2 = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = dbfac2.newDocumentBuilder();
//			Document doc2 = docBuilder.parse(xmlFile);			
//			doc.getDocumentElement().normalize();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void read(Document doc) {
		try {
			Element root = doc.getDocumentElement();
			NodeList nList = doc.getElementsByTagName("user");
			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element) node;

				}
			}
//			Element e1 = (Element) nList.item(0);
		} catch (Exception e) {
			
		}
	}
}
