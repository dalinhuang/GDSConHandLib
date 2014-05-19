package com.winjune.wifiindoor.lib.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.winjune.wifiindoor.lib.common.OffileDataT;
import com.winjune.wifiindoor.lib.poi.RestaurantInfoR;

public class MapDataT extends OffileDataT{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8330058725113076759L;
	public ArrayList<MapDataR> maps = new ArrayList<MapDataR>();
	
	public ArrayList<MapDataR> getMaps(){
		return maps;
	}
	
	public void addMapItem(int id, String normalMapUrl, String largeMapUrl, String name,
			String label, int cellPixel, int longitude, int latitude){
		MapDataR item = new MapDataR(id, normalMapUrl, largeMapUrl, name, label, cellPixel, longitude, latitude);
		maps.add(item);		
	}
}
