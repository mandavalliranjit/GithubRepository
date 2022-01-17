package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	/* (non-Javadoc)
	 * @see com.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "getting daily workout from track coach";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach says "+ fortuneService.getFortune();
	}

}
