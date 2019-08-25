package com.jm3190810.di.di07;

import org.springframework.stereotype.Component;

@Component
public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public String playMusic() {
		return "Playing music on " + this.getClass().getSimpleName();
	}

}
