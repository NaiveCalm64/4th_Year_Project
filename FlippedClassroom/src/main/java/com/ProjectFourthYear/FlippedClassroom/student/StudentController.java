package com.ProjectFourthYear.FlippedClassroom.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{sid}")
    public ResponseEntity<Student> getStudentById(@PathVariable String sid) {
        Optional<Student> student = studentService.getStudentById(sid);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/{sid}")
    public ResponseEntity<Student> updateStudent(@PathVariable String sid, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(sid, studentDetails);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{sid}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String sid) {
        studentService.deleteStudent(sid);
        return ResponseEntity.noContent().build();
    }
}
