package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class FestivalT implements Serializable{
	private static final long serialVersionUID = 1465252297515797306L;
	private ArrayList<Date> festivalDays = new ArrayList<Date>();
	
	public void addFestivalDay(String strDt) { 
	    // 2012-02-24  
	    Date dt = java.sql.Date.valueOf(strDt);
	    
	    festivalDays.add(dt);		
	}
		
	public boolean isFestivalDay(Date dt) {
		
		for (Date tmpDt:festivalDays) {						
			if (tmpDt == dt) return true; 
		}			
		
		return false;
	}	
	
	
}
