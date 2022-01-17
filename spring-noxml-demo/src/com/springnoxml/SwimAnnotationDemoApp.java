package com.springnoxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimAnnotationDemoApp {

	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// Read spring config java class instead of xml
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach myCoach = context.getBean("swimCoach", Coach.class);

		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(swimCoach.getName());
		System.out.println(swimCoach.getEmail());

		context.close();
	}

}
