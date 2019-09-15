package com.jm3190810.spring.mvc.controller.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.jm3190810.spring.mvc.controller.validation.BatchCode;

public class Student {

	@NotNull
	@Size(max = 8, message = " maximum size is 8")
	private String firstName;

	@NotNull(message = " is required")
	@Size(min = 2, message = " minimum size is 2")
	private String lastName;

	@Min(value = 1, message = " minimum age should be greater than and equal to 1 year")
	@Max(value = 100, message = " maximum age should be less than and equal to 100 year")
	private int age;

	private String gender;

	private String country;

	private String[] courses;

	private boolean experienced;

	private String comment;

	@BatchCode(value = "JM2", message=" prefix should be JM2")
	private String batchCode;

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = " only 6 alphanumeric characters are allowed")
	private String studentCode;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past(message = " Date of birth should be in past")
	private Date dob;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future(message = " Date of joining should be in future")
	private Date doj;

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isExperienced() {
		return experienced;
	}

	public void setExperienced(boolean experienced) {
		this.experienced = experienced;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
