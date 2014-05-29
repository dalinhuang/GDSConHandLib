package com.winjune.wifiindoor.lib.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.winjune.wifiindoor.lib.common.OffileDataT;
import com.winjune.wifiindoor.lib.map.NaviPathR;

public class NaviPathT extends OffileDataT{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5267535501623391772L;
	public ArrayList<NaviPathR> paths = new ArrayList<NaviPathR>();
	
	public ArrayList<NaviPathR> getPaths(){
		return paths;
	}
	
	public void addPath(int id, int fromNode, int toNode, byte direction, String forwardGuide, String backwardGuide){
		NaviPathR path = new NaviPathR(id, fromNode, toNode, direction, forwardGuide, backwardGuide);
		paths.add(path);		
	}
}
