package com.winjune.wifiindoor.lib.poi;

import com.winjune.wifiindoor.lib.common.OffileDataT;

public class PoiOfflineData extends OffileDataT{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2055835205988095257L;
	public static final String poiTableName = "poi_table";
	public static final String buslineTableName = "busline_table";
	public static final String movieTableName = "movie_table";
	public static final String playhouseTableName = "playhouse_table";
	public static final String restaurantTableName = "restaurant_table";
	public static final String festivalTableName = "festival_table";
	
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
		fromXML(filesDir + poiTableName + xmlFileExtension, poiTable);
		fromXML(filesDir + buslineTableName + xmlFileExtension, buslineTable);
		fromXML(filesDir + movieTableName + xmlFileExtension, movieTable);
		fromXML(filesDir + playhouseTableName + xmlFileExtension, playhouseTable);
		fromXML(filesDir + restaurantTableName + xmlFileExtension, restaurantTable);		
		fromXML(filesDir + festivalTableName + xmlFileExtension, festivalTable);
	}
	
	public void toXML(){
		toXML(filesDir + poiTableName + xmlFileExtension, poiTable);
		toXML(filesDir + buslineTableName + xmlFileExtension, buslineTable);
		toXML(filesDir + movieTableName + xmlFileExtension, movieTable);
		toXML(filesDir + playhouseTableName + xmlFileExtension, playhouseTable);
		toXML(filesDir + restaurantTableName + xmlFileExtension, restaurantTable);	
		toXML(filesDir + festivalTableName + xmlFileExtension, festivalTable);
	}
	
	public void fromJson(){
		poiTable = (PlaceOfInterestT) fromJson(filesDir + poiTableName + jsonFileExtension, PlaceOfInterestT.class);
		buslineTable = (BusLinesT) fromJson(filesDir + buslineTableName + jsonFileExtension, BusLinesT.class);
		movieTable = (MovieInfoT) fromJson(filesDir + movieTableName + jsonFileExtension, MovieInfoT.class);
		playhouseTable = (PlayhouseInfoT) fromJson(filesDir + playhouseTableName + jsonFileExtension, PlayhouseInfoT.class);
		restaurantTable = (RestaurantInfoT) fromJson(filesDir + restaurantTableName + jsonFileExtension, RestaurantInfoT.class);		
		festivalTable = (FestivalT) fromJson(filesDir + festivalTableName + jsonFileExtension, FestivalT.class);
	}
	
	public void toJson(){
		toJson(filesDir + poiTableName + jsonFileExtension, poiTable);
		toJson(filesDir + buslineTableName + jsonFileExtension, buslineTable);
		toJson(filesDir + movieTableName + jsonFileExtension, movieTable);
		toJson(filesDir + playhouseTableName + jsonFileExtension, playhouseTable);
		toJson(filesDir + restaurantTableName + jsonFileExtension, restaurantTable);	
		toJson(filesDir + festivalTableName + jsonFileExtension, festivalTable);
	}
}
