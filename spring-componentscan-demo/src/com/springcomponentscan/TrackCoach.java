package com.springcomponentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	// The autowired annotation can be applied to contructor or setter or any custom
	// method
//	@Autowired
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach constructor");
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

	// The autowired annotation can be applied to contructor or setter or any custom
	// method
	//	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach setFortuneService");
		this.fortuneService = fortuneService;
	}

	// The autowired annotation can be applied to contructor or setter or any custom
	// method
	@Autowired
	public void setFortuneServiceCustomMethod(FortuneService fortuneService) {
		System.out.println("TrackCoach setFortuneServiceCustomMethod");
		this.fortuneService = fortuneService;
	}

}
