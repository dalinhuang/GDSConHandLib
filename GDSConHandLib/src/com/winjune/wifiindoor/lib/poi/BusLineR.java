package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.util.ArrayList;

public class BusLineR implements Serializable {
	private static final long serialVersionUID = 3611171904054576255L;

	public int stationId; //POI id
		
	public String lineName;
	public String startTime;
	public String endTime;
	public String priceInfo;
	
	private ArrayList<String> stopList;
	
	public BusLineR(int id, String name, String startTime, String endTime, String price, String stopInfo) {
		this.stationId = id;
		this.lineName = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.priceInfo = price;
		
		String[] stops = stopInfo.split(";");
		
		stopList = new ArrayList<String>();
		
		for (String stop:stops)
			stopList.add(stop);
	}
	
	public ArrayList<String>  getStopList(){
		return stopList;
	}
	
	public String getStartEndInfo(){
		
		// normally the stop number should be bigger than 1.
		if (stopList.size() > 1) {
			
			String info = "(";
			info += stopList.get(0);
			info += "-";
			info += stopList.get(stopList.size()-1);
			info +=")";
			
			return info;
		}
		
		return null;
	}
	
}
