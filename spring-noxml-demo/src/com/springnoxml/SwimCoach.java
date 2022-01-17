package com.springnoxml;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "SwimCoach getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return "SwimCoach getDailyFortune()";
	}

}
