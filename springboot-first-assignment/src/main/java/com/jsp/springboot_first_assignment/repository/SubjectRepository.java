package com.jsp.springboot_first_assignment.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

//import com.jsp.springboot_first_assignment.dto.Student;
import com.jsp.springboot_first_assignment.dto.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	
//	@Query("select * from student where id = 
//	(select student_id from subject where subject_name= ?1 
//	and student_id in (select student_id from subject where subject_name= ?2))",
//	nativeQuery = true)
	
//	public List<Student> findByMathOrScience( String subject1,  String subject2); 
}
