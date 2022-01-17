package com.springbeanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotationMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = myCoach == alphaCoach;
		System.out.println("Same object?? "+ result);
		
		context.close();
		
	}
}
