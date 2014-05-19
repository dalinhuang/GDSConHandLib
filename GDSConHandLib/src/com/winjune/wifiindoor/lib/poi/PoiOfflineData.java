package com.winjune.wifiindoor.lib.poi;

import com.winjune.wifiindoor.lib.common.OffileDataT;

public class PoiOfflineData extends OffileDataT{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2055835205988095257L;
	public static final String poiTableName = "poi_table.xml";
	public static final String buslineTableName = "busline_table.xml";
	public static final String movieTableName = "movie_table.xml";
	public static final String playhouseTableName = "playhouse_table.xml";
	public static final String restaurantTableName = "restaurant_table.xml";
	public static final String festivalTableName = "festival_table.xml";
	
	public String filesDir;
	
	public PlaceOfInterestT poiTable;
	public BusLinesT buslineTable;
	public MovieInfoT movieTable;
	public PlayhouseInfoT playhouseTable;
	public RestaurantInfoT restaurantTable;
	public FestivalT festivalTable;
	
	public PoiOfflineData(String filesDir){
		
		this.filesDir = filesDir;
		
		poiTable = new PlaceOfInterestT();
		buslineTable = new BusLinesT();
		movieTable = new MovieInfoT();
		playhouseTable = new PlayhouseInfoT();
		restaurantTable = new RestaurantInfoT();
		festivalTable = new FestivalT();
	}
	
	public void fromXML(){
		fromXML(filesDir + poiTableName, poiTable);
		fromXML(filesDir + buslineTableName, buslineTable);
		fromXML(filesDir + movieTableName, movieTable);
		fromXML(filesDir + playhouseTableName, playhouseTable);
		fromXML(filesDir + restaurantTableName, restaurantTable);		
		fromXML(filesDir + festivalTableName, festivalTable);
	}
	
	public void toXML(){
		toXML(filesDir + poiTableName, poiTable);
		toXML(filesDir + buslineTableName, buslineTable);
		toXML(filesDir + movieTableName, movieTable);
		toXML(filesDir + playhouseTableName, playhouseTable);
		toXML(filesDir + restaurantTableName, restaurantTable);	
		toXML(filesDir + festivalTableName, festivalTable);
	}
	
}
