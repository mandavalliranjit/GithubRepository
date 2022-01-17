package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	

	public CricketCoach() {
		 System.out.println("Cricket coach: inside no-arg constructor");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: setter for email address");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: setter for team");
		this.team = team;
	}
	
	public String getEmailAddress() {
		System.out.println("Cricket coach: getter for email address");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("Cricket coach: getter for team");
		return team;
	}

	//Setter method will be called by spring when the dependency is injected
	 public void setFortuneService(FortuneService fortuneService) {
		 System.out.println("Cricket coach setFortuneService method");
			this.fortuneService = fortuneService;
		}
	
	/* (non-Javadoc)
	 * @see com.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "getting daily workout from cricket coach";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket coach says " +fortuneService.getFortune();
	}
	
	


}
