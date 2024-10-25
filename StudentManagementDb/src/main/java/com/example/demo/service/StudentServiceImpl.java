package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository ss;

	@Override
	public void save(Student s) {
	ss.save(s);
		
	}

	@Override
	public Student getStudent(int id) {
		//ss.findById(id);
		return ss.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		ss.deleteById(id);
		
	}

}
