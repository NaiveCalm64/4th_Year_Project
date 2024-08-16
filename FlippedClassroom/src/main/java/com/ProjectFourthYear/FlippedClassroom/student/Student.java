package com.ProjectFourthYear.FlippedClassroom.student;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import com.ProjectFourthYear.FlippedClassroom.subjects.Subject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
	
	@Id
	private String sid;
	private String name;
	private String department;
	private int year;
	private int semester;
	
	@Email(message = "Invalid email")
	private String email;
	
	private Long phone_number;
	private LocalDate birthdate;
	private String password;
	
	@OneToMany
	private List<Subject> subjects=new ArrayList<>();
	
	
		
	
	
	

}
