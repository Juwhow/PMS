package com.pms.beans;

/**
 * @author zhuhao
 * 这是一个 House实体
 */
public class House {

	private String houseId;
	private String buildingNo;
	private int houseArea;
	private String houseType;
	
	public House()
	{
		
	}
	
	public House(String houseId, String buildingNo, int houseArea, String houseType) {
		this.houseId = houseId;
		this.buildingNo = buildingNo;
		this.houseArea = houseArea;
		this.houseType = houseType;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}

	public int getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(int houseArea) {
		this.houseArea = houseArea;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
}
