package com.jm3190810.di.di02;

import org.springframework.stereotype.Component;

@Component
public class MusicSystem {

	public MusicSystem() {
		System.out.println("MusicSystem is being constructed...");
	}

	public String playMusic() {
		return "Playing music";
	}

}
