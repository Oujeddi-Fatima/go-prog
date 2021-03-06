package com.get.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SearchHistory {
	
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String SearchKeyWords;
	
	
	public  long getId() {
		return id;
	}
	public  void setId(long id) {
		this.id = id;
	}
	public  String getSearchKeyWords() {
		return SearchKeyWords;
	}
	public  void setSearchKeyWords(String searchKeyWords) {
		SearchKeyWords = searchKeyWords;
	}
	
	
}
