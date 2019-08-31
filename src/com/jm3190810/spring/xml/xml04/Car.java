package com.jm3190810.spring.xml.xml04;

public class Car {

	private Engine engine;

	public void driver() {
		System.out.println("Driving car at speed " + engine.getSpeed());
	}

	public Car() {
		System.out.println("Blank Car is being manufactured.");
	}

	private Car(Engine engine) {
		System.out.println("Car is being manufactured.");
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Putting engine into the car.");
		this.engine = engine;
	}

}
