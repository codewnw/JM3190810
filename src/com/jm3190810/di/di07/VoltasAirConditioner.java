package com.jm3190810.di.di07;

import org.springframework.stereotype.Component;

@Component
public class VoltasAirConditioner implements AirConditioner {

	public VoltasAirConditioner() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public String cool() {
		return "Cooling by " + this.getClass().getSimpleName();
	}

}
