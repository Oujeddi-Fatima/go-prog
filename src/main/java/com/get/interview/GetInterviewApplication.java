package com.get.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetInterviewApplication.class, args);
	}
}

import java.util.Date;

public class AcademicRecord {
	
	private String schoolName;
	private String degree;
	private Date startDate;
	private Date completionDate;
	private float gpa;
	

}

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zipCode;

}

public class Application {
	
	private String aTitle;
	private String aLevel;
	private String cTitle;
	private String cAddress;
	

}

import java.util.Date;

public class Certification {
	
	private String Title;
	private Date completionDate;
	private Date expirationDate;
	private String description;

}
import java.util.Date;

public class Company {
	
	private String cNmae;
	private String cin;
	private String cPrimeObjective;
	private String cVision;
	private String cMission;
	private Date startDate;
	private String cAddress;
	private String cPhone;
	private String cFax;

}

public class Course {
	
	private long id;
	private String title;

}

import java.util.Date;

public class Employer {
	
	private String eName;
	private String cName;
	private String cAddress;
	private Date joinDate;
	private String cDescription;
	private String jobTitle;
	private String ePhone;
	private Date eExperiance;
	private String eFax;
	
}

public class JobPost {
	
	private String cName;
	private String jTitle;
	private String jLevel;
	private String cAddress;
	private String jDescription;
	private String jRequirement;
	private String requiredQalification;

}

public class Project {
	
	private String title;
	private String description;
	private long duration;
	private String link;

}

public class Question {
	
	private String question;
	private String answer;
	private long id;

}

public class Resume {
	
	private String name;
	private String address;
	private String phone;
	private String email;
	private String rTitle;
	private String rDescription;
	private String skills;
	private String professionalExperience;
	private String achievements;
	private String education;

}

import java.util.Date;

public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date date;
	

}

import java.util.Date;

public class WorkExperience {
	
	private Date startDate;
	private Date finishDate;
	private String title;
	private String taskDescription;
	

}


