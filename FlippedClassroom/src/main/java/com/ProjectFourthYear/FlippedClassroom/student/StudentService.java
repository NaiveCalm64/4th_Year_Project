package com.ProjectFourthYear.FlippedClassroom.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String sid) {
        return studentRepository.findById(sid);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(String sid, Student studentDetails) {
        Optional<Student> optionalStudent = studentRepository.findById(sid);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(studentDetails.getName());
            existingStudent.setDepartment(studentDetails.getDepartment());
            existingStudent.setYear(studentDetails.getYear());
            existingStudent.setSemister(studentDetails.getSemister());
            existingStudent.setEmail(studentDetails.getEmail());
            existingStudent.setPhone_number(studentDetails.getPhone_number());
            existingStudent.setBirthdate(studentDetails.getBirthdate());
            existingStudent.setPassword(studentDetails.getPassword());
            return studentRepository.save(existingStudent);
        } else {
            return null; // Handle this case in the controller
        }
    }

    public void deleteStudent(String sid) {
        studentRepository.deleteById(sid);
    }
}

