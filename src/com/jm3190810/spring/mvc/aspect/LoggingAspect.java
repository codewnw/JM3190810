package com.jm3190810.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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

	@Pointcut(value = "execution (* com.jm3190810.spring.mvc.*.*.showHomePage(..))")
	public void homePage() {
	}

	@Before(value = "allMethods()")
	public void logAtTheStartingOfEachMethod(JoinPoint joinPoint) {
		System.out.println(">> " + joinPoint.getSignature() + " started");
	}

	@After(value = "allMethods()")
	public void logAfterEachMethod(JoinPoint joinPoint) {
		System.out.println("<< " + joinPoint.getSignature() + " completed");
	}

	@AfterReturning(value = "allMethods()", returning = "retVal")
	public void logAfterReturningEachMethod(JoinPoint joinPoint, Object retVal) {
		System.out.println("<< " + joinPoint.getSignature() + " returning" + " " + retVal);
	}

	@Around(value = "allMethods()")
	public Object logAfterEachMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println(">> " + proceedingJoinPoint.getSignature() + " around");
		Object result = proceedingJoinPoint.proceed();
		System.out.println("<< " + proceedingJoinPoint.getSignature() + " around " + result);
		
		/*
		if (result instanceof String && result.equals("index")) {
			result = "contact-us";
		}
		*/
		return result;
	}
	
	@AfterThrowing(value = "homePage()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
		System.out.println(ex.getMessage());
	}
}
