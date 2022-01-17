package com.propertyfileinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.name}")
	String name;
	
	@Value("${foo.email}")
	String emailAddress;
	
	@Override
	public String getDailyWorkout() {
		return "SwimCoach getDailyWorkout";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
