package com.jm3190810.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void driver() {
		System.out.println("Driving car at speed " + engine.getSpeed());
	}

	@Autowired
	private Car(Engine engine) {
		System.out.println("Car is being manufactured.");
		System.out.println("Putting engine into the car.");
		this.engine = engine;
	}

	@PostConstruct
	public void afterCarConstruction() {
		System.out.println("Notifying the registered user...");
	}

	@PreDestroy
	public void beforeCarDestruction() {
		System.out.println("Removing engine.");
	}
}
