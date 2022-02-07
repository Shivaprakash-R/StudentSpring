package com.spring.studentdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.studentdetail.model.Student;
import com.spring.studentdetail.repository.StudentRepository;

@SpringBootApplication
public class SprintStudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SprintStudentApplication.class, args);
		
	}

	@Autowired
	private StudentRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1=new Student("Shiva","prakash","shiva@gmail.com");
		 * repository.save(student1);
		 * 
		 * Student student2=new Student("john","cena","john@gmail.com");
		 * repository.save(student2);
		 * 
		 * Student student3=new Student("mani","sharma","mani@gmail.com");
		 * repository.save(student3);
		 */
		
		//no need to restart spring, we added spring dev-tools dependency
	}

}
