package com.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifecycleDemoMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoachUsedInMain", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		Coach myCoach1 = context.getBean("prototypeScopeCoach", Coach.class);
//		Coach myCoach2 = context.getBean("prototypeScopeCoach", Coach.class);
//		System.out.println(myCoach1==myCoach2);
		
		
		context.close();
		
	}

}
