package com.springlifecycle;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "TrackCoach.getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	private void initMethod() {
		System.out.println("TrackCoach.initMethod");
	}
	
	private void destroyMethod() {
		System.out.println("TrackCoach.destroyMethod");
	}

}
