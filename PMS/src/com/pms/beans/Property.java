package com.pms.beans;

public class Property {
	private int propertyId;
	private String username;
	private String password;
	private String email;
	public Property() {
	}
	public Property(int propertyId, String username, String password,
			String email) {
		super();
		this.propertyId = propertyId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
