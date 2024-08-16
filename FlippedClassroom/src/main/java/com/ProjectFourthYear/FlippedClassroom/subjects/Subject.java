package com.ProjectFourthYear.FlippedClassroom.subjects;

import java.util.List;
import java.util.ArrayList;

import com.ProjectFourthYear.FlippedClassroom.student.Student;
import com.ProjectFourthYear.FlippedClassroom.teacher.Material;
import com.ProjectFourthYear.FlippedClassroom.teacher.Teacher;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Subject {
	
	@Id
	private String subid;
	private String name;
	private String department;
	private int semester;
	// private String tid;
	@ManyToOne
	@JoinColumn(name="tid")
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(name="sid")
	private Student student;

	@OneToMany
	@JoinColumn(name="sub_id")
	private List<Material> materials=new ArrayList<>();
	

	

}
