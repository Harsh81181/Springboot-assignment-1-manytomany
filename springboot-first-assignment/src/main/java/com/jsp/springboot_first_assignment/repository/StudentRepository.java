package com.jsp.springboot_first_assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.springboot_first_assignment.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
//	@Query("SELECT s FROM Student s " +
//	           "WHERE EXISTS (" +
//	           "    SELECT sub1 FROM Subject sub1 " +
//	           "    WHERE sub1.subjectName = ?1 " +
//	           "    AND sub1.student = s" +
//	           ") " +
//	           "AND EXISTS (" +
//	           "    SELECT sub2 FROM Subject sub2 " +
//	           "    WHERE sub2.subjectName = ?2 " +
//	           "    AND sub2.student = s" +
//	           ")")
//	public List<Student> findByMathAndScience( String subject1,  String subject2); 
	
	public List<Student> findBySubjectsSubjectNameInOrderByNameAsc(List<String> subjectNames);
    
	public List<Student> findBySubjectsSubjectName(String subjectName);
}
