package com.get.interview.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class WorkExperience {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private Date startDate;
	@Column
	private Date finishDate;
	@Column
	private String title;
	@Column
	private String taskDescription;
	
	//added
	@ManyToOne
	private Resume resume1;
	
	public Resume getResume1() {
		return resume1;
	}
	public void setResume1(Resume resume1) {
		this.resume1 = resume1;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
