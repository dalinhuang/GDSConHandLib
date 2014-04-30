package com.winjune.wifiindoor.lib.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class PlaceOfInterestT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8141231337003378281L;
	
	public ArrayList<PlaceOfInterestR> poiData = new ArrayList<PlaceOfInterestR>();;
	
}
