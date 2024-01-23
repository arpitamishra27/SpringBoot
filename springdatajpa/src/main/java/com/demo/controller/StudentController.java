package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Student;
import com.demo.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;

	@PostMapping("/students")
	public Student insertStudent(@RequestBody Student student) {
		repository.save(student);
		return student;
	}

	@GetMapping("/students")
	public List<Student> viewAll() {
		return repository.findAll();
	}


}
