package com.winjune.wifiindoor.lib.map;

import java.io.Serializable;


public class IndoorMapR implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 87208639628090845L;
	private int id;
	private String normalMapUrl;
	private String largeMapUrl;
	private String name;
	private String label;	
	private int cellPixel;
	private int longitude;
	private int latitude;

	public IndoorMapR(int id, String normalMapUrl, String largeMapUrl, String name,
			String label, int cellPixel, int longitude, int latitude){
		this.id = id;
		this.normalMapUrl = normalMapUrl;
		this.largeMapUrl = largeMapUrl;
		this.name = name;
		this.label = label;
		this.cellPixel = cellPixel;
		this.longitude = longitude;
		this.latitude = latitude;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNormalMapUrl() {
		return normalMapUrl;
	}

	public void setNormalMapUrl(String normalMapUrl) {
		this.normalMapUrl = normalMapUrl;
	}

	public String getLargeMapUrl() {
		return largeMapUrl;
	}

	public void setLargeMapUrl(String largeMapUrl) {
		this.largeMapUrl = largeMapUrl;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getCellPixel() {
		return cellPixel;
	}

	public void setCellPixel(int cellPixel) {
		this.cellPixel = cellPixel;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

}
