package com.winjune.wifiindoor.lib.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class MovieInfoT implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6940701012727934560L;
	protected ArrayList<MovieInfoR> movies;
		
	public MovieInfoT(){
		movies = new ArrayList<MovieInfoR>();
	}
	
	public void addMovie(MovieInfoR movie){
		movies.add(movie);
	}

	public ArrayList<MovieInfoR> getMovies() {				
		return movies;
	}
}
