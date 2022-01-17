package com.springdemo;

public class MyAppMain {
	public static void main(String[] args) {
		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}
}
