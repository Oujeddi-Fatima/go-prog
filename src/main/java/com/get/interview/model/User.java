package com.get.interview.model;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String phoneNumber;
	@Column
	private Date dateOfBirth;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long publicResumeId;
	
	@OneToMany
	@JoinTable(name = "resume_activity")
	private List<Resume> resumes;
	
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> links;
	
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<Application> applications;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Resume> getResumes() {
		return resumes;
	}
	public void setResumes(List<Resume> resumes) {
		this.resumes = resumes;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPublicResumeId() {
		return publicResumeId;
	}
	public void setPublicResumeId(long publicResumeId) {
		this.publicResumeId = publicResumeId;
	}
	public List<String> getLinks() {
		return links;
	}
	public void setLinks(List<String> links) {
		this.links = links;
	}
	public List<Application> getApplications() {
		return applications;
	}
	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

}