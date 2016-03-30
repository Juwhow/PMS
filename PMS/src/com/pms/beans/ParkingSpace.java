package com.pms.beans;

public class ParkingSpace {

	private int parkingSpace_id;
	private int owner_id;
	private int community_id;
	private double price;
	private String state;
	
	
	public int getParkingSpace_id() {
		return parkingSpace_id;
	}
	public void setParkingSpace_id(int parkingSpace_id) {
		this.parkingSpace_id = parkingSpace_id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
}
