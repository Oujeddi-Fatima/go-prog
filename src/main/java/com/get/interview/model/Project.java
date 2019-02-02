package com.get.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private long duration;
	@Column
	private String link;
	
	//added
	@ManyToOne
	private Resume resume3;
	
	public Resume getResume3() {
		return resume3;
	}
	public void setResume3(Resume resume3) {
		this.resume3 = resume3;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
}