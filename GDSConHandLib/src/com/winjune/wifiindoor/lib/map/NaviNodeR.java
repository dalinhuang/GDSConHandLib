package com.winjune.wifiindoor.lib.map;

import java.io.Serializable;


public class NaviNodeR implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 781741789734645053L;
	private int id;
	private int mapId;
	private int placeX;
	private int placeY;
	private String label;

	public NaviNodeR(int id, int mapId, int placeX, int placeY, String label ){
		this.id = id;
		this.mapId = mapId;
		this.placeX = placeX;
		this.placeY = placeY;
		this.label = label;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public int getPlaceX() {
		return placeX;
	}

	public void setPlaceX(int placeX) {
		this.placeX = placeX;
	}

	public int getPlaceY() {
		return placeY;
	}

	public void setPlaceY(int placeY) {
		this.placeY = placeY;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}
