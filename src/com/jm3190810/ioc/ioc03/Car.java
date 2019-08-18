package com.jm3190810.ioc.ioc03;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {
	public void driver() {
		System.out.println("Driving car...");
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}

}
