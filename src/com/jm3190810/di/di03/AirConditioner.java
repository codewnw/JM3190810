package com.jm3190810.di.di03;

import org.springframework.stereotype.Component;

@Component
public class AirConditioner {

	public AirConditioner() {
		System.out.println("AirConditioner is being constructed...");
	}

	public String cool() {
		return "Cooling.";
	}

}
