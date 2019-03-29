package com.get.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String note;
	
	
	
	public  long getId() {
		return id;
	}
	public  void setId(long id) {
		this.id = id;
	}
	public  String getNote() {
		return note;
	}
	public  void setNote(String note) {
		this.note = note;
	}
	
}
