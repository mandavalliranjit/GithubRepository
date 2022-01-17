package com.springnoxml;

public class GolfCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "GolfCoach getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
