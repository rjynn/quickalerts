package com.dazeez.quickalerts413;

import java.util.Date;
import java.util.UUID;

public class Report {
	
	private String id;
	private String location;
	private int certaintyRating;
	private String disease;
	private Date date;
	private Date updated;
	
	public Report(String loc, int rating, String disease) {
		this.id = UUID.randomUUID().toString();
		this.location = loc;
		this.certaintyRating = rating;
		this.disease = disease;
		this.date = new Date();
		this.updated = new Date();
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public int getRating() {
		return this.certaintyRating;
	}
	
	public String getDisease() {
		return this.disease;
	}
	
	public Date getDate() {
		return this.date;
	}

	public Date getUpdated() {
		return this.updated;
	}
	
	public void updateReportDate() {
		this.updated = new Date();
	}
}
