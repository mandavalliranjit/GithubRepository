package com.springfieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GolfCoach implements Coach {
	
//	@Autowired
//	@Qualifier("randomFortuneServiceImpl")
//	@Qualifier("luckyDay")
	private FortuneService fortuneService;
	
	//We can use autowired on the constructor and use qualifier in the argument of constructor
	//OR
	//Use the autowired on the variable declaration and qualifier above the variable
	//Only one of the above can be used but not both
	//To use the field injection, comment out the constructor below and uncomment the autowired
	//and one of the qualifier on the variable declaration above.
	@Autowired
	public GolfCoach (@Qualifier("luckyDay")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "GolfCoach.getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
}
