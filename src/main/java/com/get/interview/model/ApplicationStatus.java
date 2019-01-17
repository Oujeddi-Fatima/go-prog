package com.get.interview.model;

public enum ApplicationStatus {
	
	PENDING("Pending"),PASSED("Passed"),DISCARED("Discarded");

	private String status;
	
	ApplicationStatus(String status){
		this.status = status;
	}	
	
	public String getStatus(){
		return this.status;
	}
}
