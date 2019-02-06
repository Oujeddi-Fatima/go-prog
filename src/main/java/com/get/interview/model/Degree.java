package com.get.interview.model;



public enum Degree {
	
	ASSOCIATE("Associate"),BACHELOR("Bachelor"),MASTER("Master"),DOCTORAL("Doctoral");

	private String status;
	
	Degree(String status){
		this.status = status;
	}	
	
	public String getStatus(){
		return this.status;
	}
}
