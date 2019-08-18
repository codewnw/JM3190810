package com.jm3190810.di.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private AirConditioner airConditioner;

	public void driver() {
		System.out.println("Driving car and " + airConditioner.cool());
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}
}
