package com.winjune.wifiindoor.lib.poi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import com.winjune.wifiindoor.lib.poi.RestaurantInfoR;

public class RestaurantInfoT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8652726469923067566L;
	protected ArrayList<RestaurantInfoR> menus = new ArrayList<RestaurantInfoR>();
	
	public ArrayList<RestaurantInfoR> getMenus(){
		return menus;
	}
	
	public void addMenuItem(int poiId, String category, String name, String iconUrl, String price){
		RestaurantInfoR item = new RestaurantInfoR(poiId, category, name, iconUrl, price);		
		menus.add(item);		
	}

	public ArrayList<String> getCategoryList(){
		HashSet<String> categorySet = new HashSet<String> (); 				
		
		for (RestaurantInfoR item: menus)
			categorySet.add(item.category);
		
		String[] categoryArray = categorySet.toArray(new String[0]);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (String cat: categoryArray)
			list.add(cat);
		
		return list;
	}
	
	public ArrayList<RestaurantInfoR> getMenuByCategory(String category) {
		ArrayList<RestaurantInfoR> menuCat = new ArrayList<RestaurantInfoR>();
		
		for (RestaurantInfoR item:menus){
			if (category.equals(item.category))
				menuCat.add(item);							
		}
			
		return menuCat;
	}
}
