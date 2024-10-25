package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService impl;
	
	@PostMapping("/save")
	public String addStudent(@RequestBody Student s) {
		impl.save(s);
		return " Student Saved In Database ";
	}
	
	@DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id")int id) {
		impl.deleteStudent(id);
		return " Student Deleted From DB";
	}
}
