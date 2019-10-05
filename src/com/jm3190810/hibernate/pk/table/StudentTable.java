package com.jm3190810.hibernate.pk.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "JM3190810_STUDENT_TABLE")
public class StudentTable {

	@Id
	@GeneratedValue(generator = "seq_table", strategy = GenerationType.TABLE)
	@TableGenerator(name = "seq_table", 
		table = "JM3190810_ID_GENERATOR", 
		pkColumnName = "sequence_name", 
		valueColumnName = "NEXT_VAL", 
		pkColumnValue = "JM3190810_ID_TABLE_SEQ", 
		allocationSize = 1)
	@Column(name = "id")
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
