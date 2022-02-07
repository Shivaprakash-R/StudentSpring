package com.spring.studentdetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.studentdetail.model.Student;
import com.spring.studentdetail.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/findAll")
	public String listStudents(Model model)
	{
		model.addAttribute("Stud", service.getAllStudent());
		return "Students"; //basically string boot auto configure for resolver using thymle 
	}
	
	@GetMapping("/findAll/new")
	public String createStudentForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("Stud", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		service.saveStudent(student);
		return "redirect:/findAll";
	}
	
	@GetMapping("/students/edit/{id}")
	public String getStudentID(@PathVariable Long id, Model model)
	{
		model.addAttribute("Stud", service.getStudentByID(id));
		return "edit_student";
	}
	@GetMapping("/students/delete/{id}")
	public String deleteStu(@PathVariable Long id)
	{
		service.deleteStudentRecord(id);
		return "redirect:/findAll";
	}
	
	@PostMapping("/students/update/{id}")
	public String updateStud(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)
	{
		Student existingStudent = service.getStudentByID(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setId(student.getId());
		service.updateStudent(existingStudent);
		
		return "redirect:/findAll";
	}
	
}
