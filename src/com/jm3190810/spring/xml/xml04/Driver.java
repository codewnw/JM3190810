package com.jm3190810.spring.xml.xml04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3190810/spring/xml/xml04/spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.driver();
	}

}
