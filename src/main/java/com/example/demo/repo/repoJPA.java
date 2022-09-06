package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.student;


public interface repoJPA extends JpaRepository<student,Long>{
	@Query(value = "SELECT * FROM student WHERE firstName < :firstName", nativeQuery = true)
    public List<student> getfirstName(String firstName);
}
