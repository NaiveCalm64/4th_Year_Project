package com.ProjectFourthYear.FlippedClassroom.teacher;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private String tid;
	private String name;
	private String email;
	private Long phone_number;
	private LocalDate birthdate;
	private String password;
	
	
	
	public Teacher() {
		super();
	}

	public Teacher(String tid, String name, String email, Long phone_number, LocalDate birthdate, String password) {
		super();
		this.tid = tid;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.birthdate = birthdate;
		this.password = password;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Teacher [tid=" + tid + ", name=" + name + ", email=" + email + ", phone_number=" + phone_number
				+ ", birthdate=" + birthdate + ", password=" + password + "]";
	}
	
	
	

}
