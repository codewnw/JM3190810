package com.jm3190810.di.di07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	private MusicSystem musicSystem;

	private Tyre tyre;

	@Autowired
	@Qualifier("samsungAirConditioner")
	private AirConditioner airConditioner;


	public void driver() {
		System.out.println("Driving car at speed " + engine.getSpeed() + ", " + musicSystem.playMusic() + " and "
				+ airConditioner.cool() + " distance covered " + tyre.distanceCovered());
	}

	@Autowired
	public Car(@Qualifier("fordEngine") Engine engine, Tyre tyre) {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
		this.engine = engine;
		this.tyre = tyre;
	}

	@Autowired
	@Qualifier("philipsMusicSystem")
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

}
