package com.jm3190810.di.di07;

import org.springframework.stereotype.Component;

@Component
public class SonyMusicSystem implements MusicSystem {

	public SonyMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public String playMusic() {
		return "Playing music on " + this.getClass().getSimpleName();
	}

}
