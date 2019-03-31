package com.get.interview.model;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends ResourceSupport{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long userId;
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
	@Column
	private String username;
	@Column 
	private String password;
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> userLinks;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL)
	private Resume resume;
	@OneToMany(mappedBy = "applicant")
	private List<Application> applications;
	@OneToMany
	private List<JobPost> savedJobs;
	@OneToMany
	private List<SearchHistory> searchHistory;
	@OneToMany
	private List<Note> notes;
	
	

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public  String getFirstName() {
		return firstName;
	}
	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public  String getLastName() {
		return lastName;
	}
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public  String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public  String getPhoneNumber() {
		return phoneNumber;
	}
	public  void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public  Date getDateOfBirth() {
		return dateOfBirth;
	}
	public  void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public  String getUsername() {
		return username;
	}
	public  void setUsername(String username) {
		this.username = username;
	}
	public  String getPassword() {
		return password;
	}
	public  void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getUserLinks() {
		return userLinks;
	}
	public void setUserLinks(List<String> userLinks) {
		this.userLinks = userLinks;
	}
	public  Address getAddress() {
		return address;
	}
	public  void setAddress(Address address) {
		this.address = address;
	}
	public  Resume getResume() {
		return resume;
	}
	public  void setResume(Resume resume) {
		this.resume = resume;
	}
	public  List<Application> getApplications() {
		return applications;
	}
	public  void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	public  List<JobPost> getSavedJobs() {
		return savedJobs;
	}
	public  void setSavedJobs(List<JobPost> savedJobs) {
		this.savedJobs = savedJobs;
	}
	public  List<SearchHistory> getSearchHistory() {
		return searchHistory;
	}
	public  void setSearchHistory(List<SearchHistory> searchHistory) {
		this.searchHistory = searchHistory;
	}
	public  List<Note> getNotes() {
		return notes;
	}
	public  void setNotes(List<Note> notes) {
		this.notes = notes;
	}
}