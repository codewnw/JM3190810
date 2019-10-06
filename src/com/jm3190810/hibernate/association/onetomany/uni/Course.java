package com.jm3190810.hibernate.association.onetomany.uni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190810_ONE_TO_MANY_UNI_COURSE")
public class Course {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COURSE_ID")
	private List<Assignment> assignements;

	public Course() {
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Assignment> getAssignements() {
		return assignements;
	}

	public void setAssignements(List<Assignment> assignements) {
		this.assignements = assignements;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignements=" + assignements + "]";
	}

}
