package com.jm3190810.spring.mvc.service;

import java.util.List;

import com.jm3190810.spring.mvc.entity.Student;

public interface StudentService {
	void save(Student student);

	Student get(long id);

	void delete(long id);
	
	void update(Student student);
	
	List<Student> all();
}
