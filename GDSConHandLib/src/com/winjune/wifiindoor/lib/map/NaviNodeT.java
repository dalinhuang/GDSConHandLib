package com.winjune.wifiindoor.lib.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.winjune.wifiindoor.lib.common.OffileDataT;
import com.winjune.wifiindoor.lib.map.NaviNodeR;

public class NaviNodeT extends OffileDataT{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7750539700303228998L;
	public ArrayList<NaviNodeR> nodes = new ArrayList<NaviNodeR>();
	
	public ArrayList<NaviNodeR> getNodes(){
		return nodes;
	}
	
	public void addNode(int id, int mapId, int placeX, int placeY, String label){
		NaviNodeR node = new NaviNodeR(id, mapId, placeX, placeY, label);
		nodes.add(node);		
	}
}
