package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayhouseInfoT implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3450868866850631080L;
	
	public ArrayList<PlayhouseInfoR> schedules = new ArrayList<PlayhouseInfoR>();
	
	public ArrayList<PlayhouseInfoR> getSchedules() {
		return schedules;
	}
	
	public void addSchedule(PlayhouseInfoR item){
		schedules.add(item);
	}
	
}
