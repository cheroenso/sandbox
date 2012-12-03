package com.cwb.review;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class XmlStorage2 {
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
			// EXPERIMENTAL:
			Node node = doc.getDocumentElement();
			String root = node.getNodeName();
////			this.insertNewEntry(doc, "foo1", "foo2", "foo3");
// THE FOLLOWING LINE WORKS:
//			this.insertNewEntry(doc, u.getFirstName(), u.getLastName(), u.getMajor());
////			doc.getDocumentElement().normalize();
////
////			System.out.println("adding user: " + u.getFirstName());
////			Element user = doc.createElement("user");
////			user.setAttribute("id", "0");
////			user.setAttribute("firstname", u.getFirstName());
////			user.setAttribute("lastname", u.getLastName());
////			user.setAttribute("field", u.getMajor());
////			System.out.println("importing user Node: " + u.getFirstName());
////			doc.importNode(user, false);
////			System.out.println("appending user Node: " + u.getFirstName());
////			
////			doc.appendChild(user);
////			Element docEle = doc.getDocumentElement();
			// http://tutorials.jenkov.com/java-xml/dom-document-object.html
//			// http://www.java-samples.com/showtutorial.php?tutorialid=152
//			// http://www.vogella.de/articles/JavaXML/article.html#xml_overview_s2b
//			// http://www.mkyong.com/java/how-to-modify-xml-file-in-java-jdom/
//			// http://www.roseindia.net/xml/index.shtml
//			//			NodeList nList = docEle.getElementsByTagName("user");
////			if (nList != null && nList.getLength() > 0) {
////				fir
////			}
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
	// build dom from existing file
	// append user element to dom
	// write new dom
	public void XmlStorageBack(){
		try {
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
			
			// add a user element
			Element user = doc.createElement("user");
			user.setAttribute("id", "0");
			user.setAttribute("firstname", "mary");
			user.setAttribute("lastname", "Jones");
			user.setAttribute("field", "math");
			root.appendChild(user);
			
			// Output
			TransformerFactory transfac = TransformerFactory.newInstance();
			Transformer trans = transfac.newTransformer();
			trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			trans.setOutputProperty(OutputKeys.INDENT, "yes");
			
			// create string from xml tree
			StringWriter sw = new StringWriter();
			StreamResult result = new StreamResult(sw);
			DOMSource source = new DOMSource(doc);
			trans.transform(source, result);
			String xmlString = sw.toString();
			
			// print xml
			System.out.println("Here's the xml:\n\n" + xmlString);
			
					
		} catch (Exception e) {
			System.err.println("Xml error: " + e.getMessage());
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
