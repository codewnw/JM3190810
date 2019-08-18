package com.jm3190810.di.di01;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being constructed...");
	}

	public int getSpeed() {
		return 100;
	}

}
