package com.ProjectFourthYear.FlippedClassroom.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.ProjectFourthYear.FlippedClassroom.subjects.Subject;
// import com.ProjectFourthYear.FlippedClassroom.subjects.SubjectDTO;
import com.ProjectFourthYear.FlippedClassroom.subjects.SubjectRepository;
import com.ProjectFourthYear.FlippedClassroom.subjects.Subject_Student_DTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Subject_Student_DTO> getSubjectsAndTeacherByStudentId(String studentId) {
        List<Object[]> results = subjectRepository.findSubjectsAndTeacherByStudentId(studentId);
        
        return results.stream()
                .map(row -> new Subject_Student_DTO(
                        ((String) row[0]),              // student ID
                        (String) row[1]  ,              // Subject Name
                        (String) row[2]               // Teacher Name
                ))
                .collect(Collectors.toList());
        // return subjectRepository.findSubjectsByStudentId(studentId);
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
            existingStudent.setSemester(studentDetails.getSemester());
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
