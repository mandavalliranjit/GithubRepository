package com.springcomponentscan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanAppMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("trackCoach", Coach.class);
		
//		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
		

	}

}
