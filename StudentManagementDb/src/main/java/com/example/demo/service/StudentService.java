package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
	public void save(Student s);
	public Student getStudent(int id); //id ka naam kuch bhi ho sakta hai
     public void deleteStudent(int id);
}
