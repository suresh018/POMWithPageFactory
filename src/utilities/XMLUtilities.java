package utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import configurations.InputValues;

public class XMLUtilities {
	Map<String,String> testdata=new HashMap<>();
	File xmlFile;
	DocumentBuilderFactory dbfactory;
	DocumentBuilder dBuilder;
	Document doc;
	
	public Map<String,String> getTestData(String testaseId){
		try{
			
			xmlFile=new File(InputValues.getxmlPath());
			dbfactory=DocumentBuilderFactory.newInstance();
			dBuilder=dbfactory.newDocumentBuilder();
			doc=dBuilder.parse(xmlFile);
			NodeList nList=doc.getElementsByTagName(testaseId);
			
			//System.out.println("Node list length"+nList.getLength());
			
			Node childNode=nList.item(0);
			
			NodeList nlist=childNode.getChildNodes();
			//System.out.println("Child nodes count"+nlist.getLength());
			
			for(int i=0;i<nlist.getLength();i++){
				Node nNode = nlist.item(i); 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					String key=nNode.getNodeName();
					String value=nNode.getTextContent();
					testdata.put(key,value);
				}
				
			}
			for(Map.Entry<String, String> entry:testdata.entrySet()){
				//System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testdata;
	}
	
	
	

}
