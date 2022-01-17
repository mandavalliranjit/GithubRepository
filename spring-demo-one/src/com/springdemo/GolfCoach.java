package com.springdemo;

public class GolfCoach implements Coach {
	
	FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println("Golf coach default constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Golf coach setter method");
		this.fortuneService = fortuneService;
	}


	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Golf coach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
