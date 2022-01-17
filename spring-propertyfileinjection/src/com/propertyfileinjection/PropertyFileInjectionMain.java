package com.propertyfileinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyFileInjectionMain {
	
	
	public static void main(String[] args) {
		//Load the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);
			
		
		//Call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getName());
		
		//Close context
		context.close();
	}
}
