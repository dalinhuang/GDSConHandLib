package com.winjune.wifiindoor.lib.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class OffileDataT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6707809803440817987L;
	public static final String xmlFileExtension = ".xml";
	public static final String jsonFileExtension = ".json";

	//Serialize current object to XML file
	public boolean toXML(String fullFileName, Object obj){
		
		
		//Serialize this object
		XStream xs = new XStream(new DomDriver("utf-8"));
				
		//Write to the file
		try{
			FileOutputStream fos = new FileOutputStream(fullFileName);

			xs.toXML(obj, fos);
			
			fos.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	//Set current object from XML file
	public boolean fromXML(String fullFileName, Object obj){	
		XStream xs = new XStream(new DomDriver("utf-8"));
		
		try {
			FileInputStream fis = new FileInputStream(fullFileName);
			
			xs.fromXML(fis, obj);		
			
			fis.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}	
		
	//Serialize current object to Json file
	public boolean toJson(String fullFileName, Object obj){
		
		
		Gson gson = new Gson();
		
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);

				
		//Write to the file
		try {
			//write converted json data to a file
//			FileWriter writer = new FileWriter(fullFileName);
			System.out.println("system encoding is : " + System.getProperty("file.encoding")); 
    		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fullFileName),"GBK");
			writer.write(json);
			writer.flush();
			writer.close();
	 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	// Set current object from Json file
	public Object fromJson(String fullFileName,
			Class<? extends Object> classOfT) {
		Gson gson = new Gson();

		try {
//			BufferedReader br = new BufferedReader(new FileReader(fullFileName));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName), "GBK"));
			// convert the json string back to object
			return gson.fromJson(br, classOfT);
		} catch (JsonSyntaxException ex) {
			ex.printStackTrace();
		} catch (JsonIOException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
