package com.cwb.review;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


public class XmlStorage {
	public static String userFile = "/tmp/data/users.xml";
	
	public static void main(String args[]){
		new XmlStorage();		
	}
	
	public void XmlAdd(User u){
		// open existing file
		File xmlFile = new File(userFile);
		if (!xmlFile.exists()) {
			this.createEmptyXml();
		}
		try {
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
			Document doc = docBuilder.parse(xmlFile);

			this.insertNewEntry(doc, u.getFirstName(), u.getLastName(), u.getMajor());
			Source source = new DOMSource(doc);
			FileOutputStream outStream = new FileOutputStream(xmlFile);
			Result result = new StreamResult(outStream);
			Transformer xformer = TransformerFactory.newInstance().newTransformer();
			xformer.transform(source, result);
			outStream.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

	private void createEmptyXml(){
		try {
			System.out.println("creating new file");
			// Create XML Document
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			// create root element
			Element root = doc.createElement("root");
			doc.appendChild(root);
			
			// create commnet
			Comment comment = doc.createComment("Sample user data");
			root.appendChild(comment);
			Source source = new DOMSource(doc);
			File xmlFile = new File(userFile);
			FileOutputStream outStream = new FileOutputStream(xmlFile);
			Result result = new StreamResult(outStream);
			Transformer xformer = TransformerFactory.newInstance().newTransformer();
			xformer.transform(source, result);
			outStream.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void insertNewEntry(Document doc, 
			   String name, String Sex, String Status)
			   throws Exception {

			  Element person = doc.createElement("User");
			  Element Node = doc.createElement("Firstname");

			  person.appendChild(Node);
			  Text nametextNode = doc.createTextNode(name);
			  Node.appendChild(nametextNode);

			  Element root = doc.getDocumentElement();

			  Element phoneNo = doc.createElement("Lastname");
			  person.appendChild(phoneNo);
			  Text phonetextNode = doc.createTextNode(Sex);
			  phoneNo.appendChild(phonetextNode);

			  Element emailNode = doc.createElement("Field");
			  person.appendChild(emailNode);
			  Text emailtextNode = doc.createTextNode(Status);
			  emailNode.appendChild(emailtextNode);
			  root.appendChild(person);

			  Node firstNode = root.getFirstChild();
			  root.insertBefore(person, firstNode);

			  TransformerFactory factory = 
			   TransformerFactory.newInstance();
			  Transformer transformer = factory.newTransformer();

			  transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			  // create string from xml tree
			  StringWriter sw = new StringWriter();
			  StreamResult result = new StreamResult(sw);
			  DOMSource source = new DOMSource(doc);
			  transformer.transform(source, result);
			  String xmlString = sw.toString();

			  System.out.println(xmlString);
		  }
}
