package com.jm3190810.spring.xml.xml05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3190810/spring/xml/xml05/spring-config.xml");
		Car car1 = (Car) context.getBean("car");
		Car car2 = (Car) context.getBean("car");
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
	}

}
