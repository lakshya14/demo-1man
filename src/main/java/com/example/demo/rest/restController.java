package com.example.demo.rest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.student;
import com.example.demo.service.studentService;

@Controller
public class restController {
    public studentService sService;

	public restController(studentService sService) {
		super();
		this.sService = sService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", sService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		student Stud = new student();
		model.addAttribute("student", Stud);
		return "create_student";
		
	}
	
	@GetMapping("/students/firstName")
	public String studentName(Model model) {
		
		// create student object to hold student form data
		student Stud = new student();
		model.addAttribute("student", Stud);
		return "students";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") student stud) {
		sService.saveStudent(stud);
		return "redirect:/students";
	}
}
