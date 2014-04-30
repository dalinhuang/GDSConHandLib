package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class PlayhouseInfoR implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6461732438279457847L;
	
	public int poiId;
	protected ArrayList<ScheduleTime> normalDayTime;
	protected ArrayList<ScheduleTime> weekendTime;
	protected ArrayList<ScheduleTime> festivalTime;

	public PlayhouseInfoR(){
		this.poiId = 0;
		normalDayTime = new ArrayList<ScheduleTime>();
		weekendTime = new ArrayList<ScheduleTime>();
		festivalTime = new ArrayList<ScheduleTime>();			
	}
	
	
	public PlayhouseInfoR(int poiId){
		this();
		this.poiId = poiId;
	}
		
	public ArrayList<ScheduleTime> getNormalDayTime() {
		return normalDayTime;
	}
	
	public ArrayList<ScheduleTime> getWeekendTime() {
		return weekendTime;
	}

	public ArrayList<ScheduleTime> getFestivalTime() {
		return normalDayTime;
	}

	public void addNormalDayTimes(String schedulesStr){
		ScheduleTime.addScheduleList(schedulesStr, normalDayTime);
	}
	
	public void addWeekendTimes(String schedulesStr){
		ScheduleTime.addScheduleList(schedulesStr, weekendTime);
	}
	
	public void addFestivalTimes(String schedulesStr){
		ScheduleTime.addScheduleList(schedulesStr, festivalTime);
	}
		
	public void addNormalDayTime(int fromHour, int fromMin, int toHour, int toMin){
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);		
		this.normalDayTime.add(eventTime);		
	}
	
	public void addWeekendTime(int fromHour, int fromMin, int toHour, int toMin){
				
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);
		
		this.weekendTime.add(eventTime);				
	}
	
	public void addFestivalTime(int fromHour, int fromMin, int toHour, int toMin){
				
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);
		
		this.festivalTime.add(eventTime);				
	}
	
	public void addWeekdayTime(int fromHour, int fromMin, int toHour, int toMin){
		
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);
		
		this.normalDayTime.add(eventTime);		
		this.weekendTime.add(eventTime);				
	}
	
	public void addHolidayTime(int fromHour, int fromMin, int toHour, int toMin){
		
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);
		
		this.weekendTime.add(eventTime);
		this.festivalTime.add(eventTime);				
	}
	
	public void addAllTime(int fromHour, int fromMin, int toHour, int toMin){
		
		ScheduleTime eventTime = new ScheduleTime(fromHour, fromMin, toHour, toMin);
		
		this.normalDayTime.add(eventTime);				
		this.weekendTime.add(eventTime);
		this.festivalTime.add(eventTime);				
	}
		
	

}
