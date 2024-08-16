package com.ProjectFourthYear.FlippedClassroom.subjects;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SubjectRepository extends JpaRepository<Subject, String>{

    @Query(value = "SELECT st.name,s.name FROM student_subjects ss inner join subject s on ss.subjects_subid=s.subid inner join student st on ss.student_sid=st.sid  WHERE student_sid = :studentId", nativeQuery = true)
    List<Object[]> findSubjectsByStudentId(@Param("studentId") String studentId);
    
    @Query(value = "SELECT t.name,s.name FROM teacher_subjects ts inner join subject s on ts.subjects_subid=s.subid inner join teacher t on t.tid=ts.teacher_tid  WHERE teacher_tid = :teacherId", nativeQuery = true)
    List<Object[]> findSubjectsByTeacherId(@Param("teacherId") String teacherId);

}
