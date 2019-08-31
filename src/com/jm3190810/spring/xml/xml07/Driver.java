package com.jm3190810.spring.xml.xml07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3190810/spring/xml/xml07/spring-config.xml");
		context.close();
	}

}
