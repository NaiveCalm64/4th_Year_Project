package com.ProjectFourthYear.FlippedClassroom.subjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Subject_Student_DTO {
    private String student_id;
    private String subject_name;
    private String teacher_name;
}

