package com.jm3190810.scope.singleton.s01;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public void driver() {
		System.out.println("Driving car");
	}

	public Car() {
		System.out.println("Blank Car is being manufactured.");
	}

}
