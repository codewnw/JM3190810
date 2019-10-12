package com.jm3190810.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jm3190810.spring.mvc.entity.Student;
import com.jm3190810.spring.mvc.service.StudentService;

@Controller
public class CompleteStudentController {

	@Autowired
	private StudentService studentSetvice;

	@GetMapping(path = "/save")
	public @ResponseBody String save() {
		Student student = new Student();
		student.setRollNumber(10903L);
		student.setName("From Spring");
		studentSetvice.save(student);
		return "Success";
	}
}
