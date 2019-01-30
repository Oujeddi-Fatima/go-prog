package com.get.interview.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private Date submissionDate;
	
	@Column
	private int score;
	
	@Column
	private ApplicationStatus status;
	
	@OneToOne
	@JoinTable(name = "jobpost_activity")
	private JobPost jobPost;
	
	@OneToOne
	@JoinTable(name = "user_activity")
	private User applicant;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}
	public ApplicationStatus getStatus() {
		return status;
	}
	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public JobPost getJobPost() {
		return jobPost;
	}
	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}
	public User getApplicant() {
		return applicant;
	}
	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}

}