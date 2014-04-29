package com.winjune.wifiindoor.lib.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class BusLinesT implements Serializable{
	
	private static final long serialVersionUID = -5969028824407419064L;
	
	private ArrayList<BusLineR> busLines;
	
	public BusLinesT(){
		busLines = new ArrayList<BusLineR>();		
	}
	
	public void addBusLine(BusLineR aBusLine) {		
		busLines.add(aBusLine);
	}
	
	public BusLineR getBusLine(int index) {
		return busLines.get(index);
	}
	
	public ArrayList<BusLineR> getBusLines() {				
		return busLines;
	}

}
