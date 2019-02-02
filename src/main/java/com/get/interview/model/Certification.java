package com.get.interview.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String title;
	@Column
	private Date completionDate;
	@Column
	private Date expirationDate;
	@Column
	private String description;
	
	//added
	@ManyToOne
	private Resume resume2;
	
	
	public Resume getResume2() {
		return resume2;
	}
	public void setResume2(Resume resume2) {
		this.resume2 = resume2;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}