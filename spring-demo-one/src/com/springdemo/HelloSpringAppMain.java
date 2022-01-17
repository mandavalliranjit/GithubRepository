package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAppMain {

	public static void main(String[] args) {
		//load spring application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoachUsedInMain", Coach.class);
		
		//Call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Close context
		context.close();
	}

}
