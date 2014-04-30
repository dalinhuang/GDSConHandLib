package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class RestaurantInfoR implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2177990212070574927L;
	public int poiId;	
	public String  category;
	public String 	priceInfo;
	public String	iconUrl;
	public String  name;
		
	public RestaurantInfoR(int poiId, String category, String name, String iconUrl, String price){
		this.poiId = poiId;
		this.category = category;
		this.name = name;
		this.iconUrl = iconUrl;
		this.priceInfo = price;
	}
		
}
