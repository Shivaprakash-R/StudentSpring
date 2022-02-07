package com.spring.studentdetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.studentdetail.model.Student;
import com.spring.studentdetail.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	//whenever springbean have only one contructor we can avoid autowire and go with construtor DI, dont do below
	
	//@Autowired
	private StudentRepository repository;
	 
	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}	
	@Override
	public Student saveStudent(Student student) {	
		return repository.save(student);
	}
	@Override
	public Student getStudentByID(Long id) {
		return repository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}
	@Override
	public int deleteStudentRecord(Long id) {
		
		 repository.deleteById(id);
		 return 0;
	}

}
