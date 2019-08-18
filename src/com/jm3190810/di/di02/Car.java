package com.jm3190810.di.di02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private MusicSystem musicSystem;

	public void driver() {
		System.out.println("Driving car and " + musicSystem.playMusic());
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public MusicSystem getEngine() {
		return musicSystem;
	}

	@Autowired
	public void setEngine(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

}
