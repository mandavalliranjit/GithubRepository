package com.springscopedemo;

public class CricketCoach implements Coach {
	
	private FortuneService  fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach default contructor");
	}
	
	public CricketCoach(FortuneService  fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoach.getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	

}
