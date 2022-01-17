package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService ;
	public BaseballCoach() {
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	} 	
	
	/* (non-Javadoc)
	 * @see com.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "getting daily workout from baseball coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
