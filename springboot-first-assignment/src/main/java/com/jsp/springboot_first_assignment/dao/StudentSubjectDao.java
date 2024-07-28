package com.jsp.springboot_first_assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot_first_assignment.dto.Student;
import com.jsp.springboot_first_assignment.dto.Subject;
import com.jsp.springboot_first_assignment.repository.StudentRepository;
import com.jsp.springboot_first_assignment.repository.SubjectRepository;

@Repository
public class StudentSubjectDao {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Student> addAllStudent(List<Student> students){
		return studentRepository.saveAll(students);
	}

	public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudentsBySubjects(List<String> subjectNames) {
        return studentRepository.findBySubjectsSubjectNameInOrderByNameAsc(subjectNames);
    }
    
    public void deleteFirst5StudentsBySubject(String subjectName) {
        List<Student> students = studentRepository.findBySubjectsSubjectName(subjectName);
        for (int i = 0; i < 5 && i < students.size(); i++) {
            studentRepository.delete(students.get(i));
        }
    }
    
    public Subject addOrUpdateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
    
//	
//	public Student saveStudentDao(Student student) {
//		List<Subject> subjects=student.getSubjects();
//		student.setSubjects(null);
//		for(Subject subject:subjects) {
//			subject.setStudent(student);
//		}
//		student.setSubjects(subjects);
//		return repository1.save(student);
//	}
//	
//	public Student getStudentById(int id) {
//	Optional<Student> optional=	repository1.findById(id);
//	if(optional.isPresent()) {
//		return optional.get();
//	}
//	return null;
//	}
//	
//	public Student addSubjectbyStudentId(int id,List<Subject> subjects) {
//		Student student=getStudentById(id);
//		if(student!=null) {
//			student.getSubjects().addAll(subjects);
//		}
//		return saveStudentDao(student);
//	}
//	
//	public List<Student> getStudentMathAndScience(){
//		List<Student> students=repository1.findByMathAndScience("Math", "Science");
//		for(Student student:students) {
//			System.out.println(student);
//		}
//		return students;
//		}
//}
