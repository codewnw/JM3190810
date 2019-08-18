package com.jm3190810.di.di01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void driver() {
		System.out.println("Driving car ar speed " + engine.getSpeed());
	}

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car is being manufactured.");
	}

}
