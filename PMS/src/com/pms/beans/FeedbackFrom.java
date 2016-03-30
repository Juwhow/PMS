package com.pms.beans;

import java.util.Date;

public class FeedbackFrom {
	private int feedbackFrom_id;
	private int owner_id;
	private String information;
	private Date date;
	
	public int getfeedbackFrom_id() {
		return feedbackFrom_id;
	}
	public void setfeedbackFrom_id(int feedbackFrom_id) {
		this.feedbackFrom_id = feedbackFrom_id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
