package com.ProjectFourthYear.FlippedClassroom.teacher;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MaterialDTO {
    // private String material_id;
    // private String Subject_id
    private String material_name;
    // private int material_size;
    private String material_path;
    private LocalDateTime upload_time;
    // private String subjectId;
}
