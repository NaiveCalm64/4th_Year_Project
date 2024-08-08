package com.ProjectFourthYear.FlippedClassroom.subjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
	
	@Id
	private String subid;
	private String name;
	private String department;
	private int semister;
	
	public Subject() {
		super();
	}

	public Subject(String subid, String name, String department, int semister) {
		super();
		this.subid = subid;
		this.name = name;
		this.department = department;
		this.semister = semister;
	}

	public String getSubid() {
		return subid;
	}

	public void setSubid(String subid) {
		this.subid = subid;
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

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}
	
	
	
	

}
