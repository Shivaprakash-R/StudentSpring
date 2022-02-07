package com.spring.studentdetail.service;

import java.util.List;

import com.spring.studentdetail.model.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentByID(Long id);
	Student updateStudent(Student student);
	int deleteStudentRecord(Long id);

}
