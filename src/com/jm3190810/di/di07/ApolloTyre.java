package com.jm3190810.di.di07;

import org.springframework.stereotype.Component;

@Component
public class ApolloTyre implements Tyre {

	public ApolloTyre() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public int distanceCovered() {
		return 1000;
	}

}
