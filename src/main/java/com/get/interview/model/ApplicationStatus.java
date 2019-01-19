package com.get.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public enum ApplicationStatus {
	
	PENDING("Pending"),PASSED("Passed"),DISCARED("Discarded");

	@Column
	private String status;
	
	ApplicationStatus(String status){
		this.status = status;
	}	
	
	public String getStatus(){
		return this.status;
	}
}
