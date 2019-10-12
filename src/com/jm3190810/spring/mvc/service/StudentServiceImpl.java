package com.jm3190810.spring.mvc.service;

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

}
