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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Company extends ResourceSupport{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long companyId;
	@Column
	private String name;
	@Column
	private String infoNumber;
	@Column
	private String primeObjective;
	@Column
	private String vision;
	@Column
	private String mission;
	@Column
	private Date startDate;
	@Column
	private String fax;
	@Column
	private BusinessType businessType;

	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> phone;

	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> contacts;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@JsonBackReference(value="company-employer")
	@ManyToOne(cascade = CascadeType.ALL)
	private Employer employer;

	

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  String getInfoNumber() {
		return infoNumber;
	}

	public  void setInfoNumber(String infoNumber) {
		this.infoNumber = infoNumber;
	}

	public  String getPrimeObjective() {
		return primeObjective;
	}

	public  void setPrimeObjective(String primeObjective) {
		this.primeObjective = primeObjective;
	}

	public  String getVision() {
		return vision;
	}

	public  void setVision(String vision) {
		this.vision = vision;
	}

	public  String getMission() {
		return mission;
	}

	public  void setMission(String mission) {
		this.mission = mission;
	}

	public  Date getStartDate() {
		return startDate;
	}

	public  void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public  String getFax() {
		return fax;
	}

	public  void setFax(String fax) {
		this.fax = fax;
	}

	public  BusinessType getBusinessType() {
		return businessType;
	}

	public  void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public  List<String> getPhone() {
		return phone;
	}

	public  void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public  List<String> getContacts() {
		return contacts;
	}

	public  void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public  Address getAddress() {
		return address;
	}

	public  void setAddress(Address address) {
		this.address = address;
	}

	public  Employer getEmployer() {
		return employer;
	}

	public  void setEmployer(Employer employer) {
		this.employer = employer;
	}

}
