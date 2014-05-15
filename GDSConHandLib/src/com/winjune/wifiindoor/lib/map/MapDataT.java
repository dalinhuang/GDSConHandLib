package com.winjune.wifiindoor.lib.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.winjune.wifiindoor.lib.poi.RestaurantInfoR;

public class MapDataT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5441323857884982503L;
	public ArrayList<MapDataR> maps = new ArrayList<MapDataR>();
	
	public ArrayList<MapDataR> getMaps(){
		return maps;
	}
	
	public void addIndoorMapItem(int id, String normalMapUrl, String largeMapUrl, String name,
			String label, int cellPixel, int longitude, int latitude){
		MapDataR item = new MapDataR(id, normalMapUrl, largeMapUrl, name, label, cellPixel, longitude, latitude);
		maps.add(item);		
	}
	//Serialize current object to XML file
	public boolean toXML(String fullFileName, Object obj){
		
		
		//Serialize this object
		XStream xs = new XStream(new DomDriver("utf-8"));
				
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
		
}
