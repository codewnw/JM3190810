package com.jm3190810.di.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void driver() {
		System.out.println("Driving car at speed " + engine.getSpeed());
	}

	@Autowired
	public Car(@Qualifier("fordEngine") Engine engine) {
		System.out.println("Car is being manufactured.");
		System.out.println("Putting engine into the car.");
		this.engine = engine;
	}

}
