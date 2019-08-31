package com.jm3190810.spring.xml.xml02;

public class Car {

	public Car() {
		System.out.println("Manufacturing car");
	}

	public Car(String color) {
		System.out.println("Manufacturing " + color + " car");
	}

	public Car(String color, String brand) {
		System.out.println("Manufacturing " + color + " " + brand + " car");
	}

	public Car(String color, String brand, int speed, double price) {
		System.out.println(
				"Manufacturing " + color + " " + brand + " car at speed of " + speed + " KM/h and bought at " + price);
	}

}
