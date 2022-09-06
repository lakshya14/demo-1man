
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.student;

public interface studentService {
    List<student> getAllStudents();
student saveStudent(student student);
	
	student getStudentById(Long id);
	
	student updateStudent(student student);
	
	void deleteStudentById(Long id);
}
