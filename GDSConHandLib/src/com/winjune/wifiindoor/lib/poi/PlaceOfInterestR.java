package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;

public class PlaceOfInterestR implements Serializable{

	private static final long serialVersionUID = 7639909124051293630L;
		
	private int poiType;
	
	public int id;
	
	public int hallId;
	
	public int ttsNo;
	
	public int mapId;
	
	public int placeX;
	public int placeY;

	private String 	iconUrl;
	public String 	audioUrl;
	public String 	webUrl;	
	public String  picUrl;
	
	
	public String label;
	public String generalDesc;
	public String detailedDesc;
	
		
	
	public boolean shareble;
	public boolean reachable;
	public boolean readable;
	
	public float scale;
	public float alpha;
	public float rotation;
	public float minZoomFactor;
	public float maxZoomFactor;
	
	public PlaceOfInterestR(PlaceOfInterestR that) {
		this.poiType = that.poiType;		
		this.id = that.id;
		
		this.hallId = that.hallId;
		
		this.ttsNo = that.ttsNo;
		
		this.mapId = that.mapId;
		
		this.placeX = that.placeX;
		this.placeY = that.placeY;

		this.iconUrl = that.iconUrl;
		this.audioUrl = that.audioUrl;
		this.webUrl = that.webUrl;	
		this.picUrl = that.picUrl;
		
		
		this.label = that.label;
		this.generalDesc = that.generalDesc;
		this.detailedDesc = that.detailedDesc;
		
			
		
		this.shareble = that.shareble;
		this.reachable = that.reachable;
		this.readable = that.readable;
		
		this.scale = that.scale;
		this.alpha = that.alpha;
		this.rotation = that.rotation;
		this.minZoomFactor = that.minZoomFactor;
		this.maxZoomFactor = that.maxZoomFactor;		
	}
	
	public PlaceOfInterestR(POIType poiType){
		this.poiType = poiType.ordinal();
		this.id = 0;
		
		this.ttsNo = 0;
		this.mapId = 0;
		this.placeX = 0;
		this.placeY = 0;
			
		this.iconUrl = "";		
		this.label = "";

		this.generalDesc = "";
		this.detailedDesc = "";
		
		this.webUrl = "";
		
		this.shareble = false;
		
		this.reachable = true;
		
		this.readable = false;
		
		this.scale = 0f;
		this.alpha = 0f;
		this.rotation = 0f;
		this.maxZoomFactor = 0.5f;
		this.maxZoomFactor = 3f;							
	}
	
	public PlaceOfInterestR(){
		this(POIType.Normal);
	}
	
	public PlaceOfInterestR(String label){
		this(POIType.Normal);
		this.label = label;
	}
			
	public String getGeneralDesc(){
		return generalDesc;
	}

	public int getHall(){
		return hallId;
	}
	
	public POIType getPoiType(){
		return POIType.values()[poiType];
	}
	
	public String getLabel(){
		return label;
	}	

	public int getX(){
		return placeX;
	}
	
	public void setX(int x){
		this.placeX = x;
	}
	
	public int getY(){
		return placeY;
	}
	
	public void setY(int y){
		this.placeY = y;
	}
	
	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public float getAlpha() {
		return alpha;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public float getMinZoomFactor() {
		return minZoomFactor;
	}

	public void setMinZoomFactor(float minZoomFactor) {
		this.minZoomFactor = minZoomFactor;
	}

	public float getMaxZoomFactor() {
		return maxZoomFactor;
	}

	public void setMaxZoomFactor(float maxZoomFactor) {
		this.maxZoomFactor = maxZoomFactor;
	}	
		
	public String getWebUrl(){
		return webUrl;
	}
}
