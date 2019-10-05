package com.jm3190810.hibernate.association.onetoone.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190810_OTO_UNI_ENGINE")
public class Engine {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "speed")
	private int speed;

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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", name=" + name + ", speed=" + speed + "]";
	}

}
