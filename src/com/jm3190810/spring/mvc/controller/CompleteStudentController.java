package com.jm3190810.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		student.setName("Sachin");
		studentSetvice.save(student);
		return "Save Success";
	}

	@GetMapping(path = "/get/{id}")
	public @ResponseBody String get(@PathVariable("id") Long id) {
		System.out.println(studentSetvice.get(id));
		return "Get Success";
	}

	@GetMapping("/delete/{id}")
	public @ResponseBody String delete(@PathVariable("id") Long id) {
		studentSetvice.delete(id);
		return "Delete Successfull";
	}

	@GetMapping("/update/{id}")
	public @ResponseBody String update(@PathVariable("id") Long id) {
		Student student = new Student();
		student.setId(id);
		student.setName("Sachin is amazing.");
		studentSetvice.update(student);
		return "Update Successfull";
	}

	@GetMapping("/all")
	public @ResponseBody String all() {
		List<Student> students = studentSetvice.all();
		System.out.println(students);
		return "Fetched All";
	}
}
