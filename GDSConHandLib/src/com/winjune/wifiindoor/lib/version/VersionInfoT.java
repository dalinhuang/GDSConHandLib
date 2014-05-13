package com.winjune.wifiindoor.lib.version;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import com.thoughtworks.xstream.XStream;
import com.winjune.wifiindoor.lib.poi.RestaurantInfoR;

public class VersionInfoT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3235692014890801525L;
	protected ArrayList<VersionInfoR> versions = new ArrayList<VersionInfoR>();
	
	public ArrayList<VersionInfoR> getVersions(){
		return versions;
	}
	
	public void addVersionItem(String tableName, int version){
		VersionInfoR item = new VersionInfoR(tableName, version);		
		versions.add(item);		
	}
	//Serialize current object to XML file
	public boolean toXML(String fullFileName, Object obj){
		
		
		//Serialize this object
		XStream xs = new XStream();
				
		//Write to the map info file
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
		XStream xs = new XStream();
		
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
		
}
