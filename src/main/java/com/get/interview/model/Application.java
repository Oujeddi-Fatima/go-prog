package com.get.interview.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	@ManyToOne
	private JobPost jobPost;
	@ManyToOne
	private User applicant;
	
	
	public final long getId() {
		return id;
	}
	public final void setId(long id) {
		this.id = id;
	}
	public final Date getSubmissionDate() {
		return submissionDate;
	}
	public final void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}
	public final int getScore() {
		return score;
	}
	public final void setScore(int score) {
		this.score = score;
	}
	public final ApplicationStatus getStatus() {
		return status;
	}
	public final void setStatus(ApplicationStatus status) {
		this.status = status;
	}
	public final JobPost getJobPost() {
		return jobPost;
	}
	public final void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}
	public final User getApplicant() {
		return applicant;
	}
	public final void setApplicant(User applicant) {
		this.applicant = applicant;
	}
}