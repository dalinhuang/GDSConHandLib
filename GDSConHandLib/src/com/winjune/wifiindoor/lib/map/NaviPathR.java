package com.winjune.wifiindoor.lib.map;

import java.io.Serializable;


public class NaviPathR implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5998473751511054034L;
	private int id;
	private int fromNode;
	private int toNode;
	private byte direction;
	private String forwardGuide;	
	private String backwardGuide;	

	public NaviPathR(int id, int fromNode, int toNode, byte direction, String forwardGuide, String backwardGuide){
		this.id = id;
		this.fromNode = fromNode;
		this.toNode = toNode;
		this.direction = direction;
		this.forwardGuide = forwardGuide;
		this.backwardGuide = backwardGuide;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromNode() {
		return fromNode;
	}

	public void setFromNode(int fromNode) {
		this.fromNode = fromNode;
	}

	public int getToNode() {
		return toNode;
	}

	public void setToNode(int toNode) {
		this.toNode = toNode;
	}

	public byte getDirection() {
		return direction;
	}

	public void setDirection(byte direction) {
		this.direction = direction;
	}

	public String getForwardGuide() {
		return forwardGuide;
	}

	public void setForwardGuide(String forwardGuide) {
		this.forwardGuide = forwardGuide;
	}

	public String getBackwardGuide() {
		return backwardGuide;
	}

	public void setBackwardGuide(String backwardGuide) {
		this.backwardGuide = backwardGuide;
	}

}
