package com.springscopedemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopeDemoMain {

	public static void main(String[] args) {
		
		//Load the context	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from context
		Coach myCoach1 = context.getBean("myCoachUsedInMain", Coach.class);
		
		Coach myCoach2 = context.getBean("myCoachUsedInMain", Coach.class);
		
		//Call methods
		System.out.println(myCoach1.getDailyFortune());
		System.out.println(myCoach2.getDailyFortune());
		boolean result = (myCoach1 == myCoach2);
		//print the address of the instances
		System.out.println(myCoach1);
		System.out.println(myCoach2);
		
		//Check if the objects are the same
		System.out.println(result);
		
		//Close context
		context.close();

	}

}
