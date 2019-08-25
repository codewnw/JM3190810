package com.jm3190810.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car1 = (Car) context.getBean("car");
		Car car2 = (Car) context.getBean("car");
		Car car3 = (Car) context.getBean("car");
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
	}

}
