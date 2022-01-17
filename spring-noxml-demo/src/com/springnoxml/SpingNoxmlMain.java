package com.springnoxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpingNoxmlMain {

	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// Read spring config java class instead of xml
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach myCoach = context.getBean("swimCoach", Coach.class);

		System.out.println(myCoach.getDailyWorkout());

		context.close();
	}

}
