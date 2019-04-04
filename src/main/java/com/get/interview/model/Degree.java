package com.get.interview.model;



public enum Degree {
	
	ASSOCIATE("Associate"),BACHELOR("Bachelor"),MASTER("Master"),DOCTORAL("Doctoral"),Others;

	private String status;
	
	
	Degree(){
	}
	
	Degree(String status){
		this.status = status;
	}	
	
	public String getStatus(){
		return this.status;
	}
}
