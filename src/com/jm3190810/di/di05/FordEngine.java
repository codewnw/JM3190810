package com.jm3190810.di.di05;

import org.springframework.stereotype.Component;

@Component
public class FordEngine implements Engine {

	public FordEngine() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public int getSpeed() {
		return 140;
	}

}
