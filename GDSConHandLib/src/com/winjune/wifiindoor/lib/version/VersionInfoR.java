package com.winjune.wifiindoor.lib.version;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class VersionInfoR implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8091167965380300520L;
	public String  tableName;
	public int version;	
		
	public VersionInfoR(String tableName, int version){
		this.tableName = tableName;
		this.version = version;
	}
		
}
