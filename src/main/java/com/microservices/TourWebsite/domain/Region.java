package com.microservices.TourWebsite.domain;

public enum Region {
	Central_Coast("Central Coast"), Southern_California ("Southern California"), Northern_California ("Northern California"),Varies ("Varies");
	private String label;
	private Region(String label) {
		this.label=label;
	}
	
	public static Region findByLabel (String myLabel) {
		for(Region r:Region.values()) {
			if(r.label.equalsIgnoreCase(myLabel)) 
				return r;
		}
		return null;
	}
}
