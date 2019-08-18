package com.jm3190810.ioc.ioc02;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void driver() {
		System.out.println("Driving car...");
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}

}
