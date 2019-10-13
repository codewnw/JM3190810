package com.jm3190810.spring.mvc.dao;

import java.util.List;

import com.jm3190810.spring.mvc.entity.Student;

public interface StudentDao {
	void save(Student student);

	Student get(long id);

	void delete(long id);
	
	void update(Student student);

	List<Student> all();
}
