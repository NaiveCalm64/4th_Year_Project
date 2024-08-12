package com.ProjectFourthYear.FlippedClassroom.teacher;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(String sid) {
        return teacherRepository.findById(sid);
    }

    public Teacher addTeacher(Teacher Teacher) {
        return teacherRepository.save(Teacher);
    }

    public Teacher updateTeacher(String tid, Teacher teacherDetails) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(tid);
        if (optionalTeacher.isPresent()) {
            Teacher existingTeacher = optionalTeacher.get();
            existingTeacher.setName(teacherDetails.getName());
            existingTeacher.setEmail(teacherDetails.getEmail());
            existingTeacher.setPhone_number(teacherDetails.getPhone_number());
            existingTeacher.setBirthdate(teacherDetails.getBirthdate());
            existingTeacher.setPassword(teacherDetails.getPassword());
    
            return teacherRepository.save(existingTeacher);
        } else {
            return null; // Handle this case in the controller
        }
        // return teacherDetails;
    }

    public void deleteTeacher(String sid) {
        teacherRepository.deleteById(sid);
    }
}
