package com.ProjectFourthYear.FlippedClassroom.teacher;

import java.time.LocalDateTime;

// import com.ProjectFourthYear.FlippedClassroom.student.Student;
import com.ProjectFourthYear.FlippedClassroom.subjects.Subject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long material_id;
    private String Subject_id;
    private String material_name;
    private int material_size;
    private String material_path;
    private LocalDateTime upload_time;
    // private String sub_id;

    // @ManyToOne
	// @JoinColumn(name="subid")
	// private Subject subject;
}
