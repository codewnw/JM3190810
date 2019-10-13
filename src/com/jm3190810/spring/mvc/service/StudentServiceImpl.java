package com.jm3190810.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm3190810.spring.mvc.dao.StudentDao;
import com.jm3190810.spring.mvc.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void save(Student student) {
		System.out.println("In service");
		studentDao.save(student);
	}

	@Override
	public Student get(long id) {
		return studentDao.get(id);
	}

	@Override
	public void delete(long id) {
		studentDao.delete(id);		
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

	@Override
	public List<Student> all() {
		return studentDao.all();
	}

}
