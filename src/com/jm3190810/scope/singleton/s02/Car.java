package com.jm3190810.scope.singleton.s02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {

	public void driver() {
		System.out.println("Driving car");
	}

	public Car() {
		System.out.println("Blank Car is being manufactured.");
	}

}
