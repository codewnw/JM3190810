package com.jm3190810.hibernate.pk.sequence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190810_STUDENT_SEQUENCE")
public class StudentSequence {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence")
	@SequenceGenerator(name = "my_sequence", sequenceName = "JM3190810_STUDENT_MY_SEQUENCE", allocationSize = 1, schema = "PUBLIC")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentIdentity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
