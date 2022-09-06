package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repo.repoJPA;
import com.example.demo.service.studentService;


@Service
public class studentServiceImpl implements studentService{
public studentServiceImpl(repoJPA studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

private repoJPA studentRepo ;

//public studentServiceImpl(repoJPA studentRepo) {
//		super();
//		this.studentRepo = studentRepo;
//	}
@Override
  public List<student> getAllStudents(){
	  return studentRepo.findAll();
  }

@Override
public student saveStudent(student student) {
	
	// TODO Auto-generated method stub
	return studentRepo.save(student);
}

@Override
public student getStudentById(Long id) {
	// TODO Auto-generated method stub
	return studentRepo.findById(id).get();
}

@Override
public student updateStudent(student student) {
	// TODO Auto-generated method stub
	return studentRepo.save(student);
}

@Override
public void deleteStudentById(Long id) {
	// TODO Auto-generated method stub
	studentRepo.deleteById(id);
	
}
}
