package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Coach myGolfCoach = context.getBean("myGolfCoachUsedInMain", Coach.class);
		
		System.out.println(myGolfCoach.getDailyFortune());
		
		context.close();
		
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Coach myGolfCoach2 = context2.getBean("myGolfCoachUsedInMain2", Coach.class);
		
		System.out.println(myGolfCoach2.getDailyFortune());
		
		context2.close();

	}

}
