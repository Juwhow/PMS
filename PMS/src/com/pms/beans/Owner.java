package com.pms.beans;

public class Owner {

	private String ownerId;
	private String ownerName;
	private String tel;
	private String IDCardNo;
	private String houseId;
	private String parkingSpaceId;
	private double balance = 0.0;
	public Owner()
	{
		
	}
	
	public Owner(String ownerId, String ownerName, String tel, String iDCardNo,
			String houseId, String parkingSpaceId) {
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.tel = tel;
		IDCardNo = iDCardNo;
		this.houseId = houseId;
		this.parkingSpaceId = parkingSpaceId;
	}
	public Owner(String ownerId, String ownerName, String tel, String iDCardNo,
			String houseId, String parkingSpaceId, double balance) {
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.tel = tel;
		IDCardNo = iDCardNo;
		this.houseId = houseId;
		this.parkingSpaceId = parkingSpaceId;
		this.balance = balance;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIDCardNo() {
		return IDCardNo;
	}
	public void setIDCardNo(String iDCardNo) {
		IDCardNo = iDCardNo;
	}
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getParkingSpaceId() {
		return parkingSpaceId;
	}
	public void setParkingSpaceId(String parkingSpaceId) {
		this.parkingSpaceId = parkingSpaceId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
