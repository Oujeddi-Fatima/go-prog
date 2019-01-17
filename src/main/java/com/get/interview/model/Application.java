package com.get.interview.model;

import java.util.Date;

public class Application {

	private long id;
	private Date submissionDate;
	private ApplicationStatus status;
	private int score;
	
	
	private JobPost jobPost;
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