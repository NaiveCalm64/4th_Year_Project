package com.ProjectFourthYear.FlippedClassroom.teacher;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{tid}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable String tid) {
        Optional<Teacher> Teacher = teacherService.getTeacherById(tid);
        if (Teacher.isPresent()) {
            return ResponseEntity.ok(Teacher.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @PutMapping("/{tid}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable String tid, @RequestBody Teacher teacherDetails) {
        Teacher updatedTeacher = teacherService.updateTeacher(tid, teacherDetails);
        if (updatedTeacher != null) {
            return ResponseEntity.ok(updatedTeacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{tid}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable String tid) {
        teacherService.deleteTeacher(tid);
        return ResponseEntity.noContent().build();
    }
}