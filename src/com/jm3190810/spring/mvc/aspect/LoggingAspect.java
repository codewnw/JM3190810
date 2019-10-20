package com.jm3190810.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut(value = "execution (* com.jm3190810.spring.mvc.*.*.*(..))")
	public void allMethods() {
	}

	@Before(value = "allMethods()")
	public void logAtTheStartingOfEachMethod(JoinPoint joinPoint) {
		System.out.println(">> " + joinPoint.getSignature().getName() + " started");
	}
}
