package com.springfieldinjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjectionAppMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("golfCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}
