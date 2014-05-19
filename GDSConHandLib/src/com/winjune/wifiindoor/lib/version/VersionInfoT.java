package com.winjune.wifiindoor.lib.version;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.winjune.wifiindoor.lib.common.OffileDataT;

public class VersionInfoT extends OffileDataT{

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
}
