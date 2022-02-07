package com.spring.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.studentdetail.model.Student;

//second param is type of the primary key
public interface StudentRepository extends JpaRepository<Student, Long>{

}
