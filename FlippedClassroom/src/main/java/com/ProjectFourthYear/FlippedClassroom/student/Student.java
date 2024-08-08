package com.ProjectFourthYear.FlippedClassroom.student;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
	
	@Id
	private String sid;
	private String name;
	private String department;
	private int year;
	private int semister;
	
	@Email(message = "Invalid email")
	private String email;
	
	private Long phone_number;
	private LocalDate birthdate;
	private String password;
	
	
	
	public Student() {
		super();
	}

	public Student(String sid, String name, String department, int year, int semister, String email, Long phone_number,
			LocalDate birthdate, String password) {
		super();
		this.sid = sid;
		this.name = name;
		this.department = department;
		this.year = year;
		this.semister = semister;
		this.email = email;
		this.phone_number = phone_number;
		this.birthdate = birthdate;
		this.password = password;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", department=" + department + ", year=" + year
				+ ", semister=" + semister + ", Email=" + email + ", phone_number=" + phone_number + ", birthdate="
				+ birthdate + ", password=" + password + "]";
	}
	
	
	
	

}
