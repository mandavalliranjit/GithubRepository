package com.springlifecycle;

import org.springframework.beans.factory.DisposableBean;

public class PrototypeScopeCoach implements Coach, DisposableBean {

	private FortuneService fortuneService;
	
	public PrototypeScopeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "PrototypeScopeCoach.getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	private void initMethodPrototypeScopeCoach() {
		System.out.println("initMethodPrototypeScopeCoach");
	}
	
	private void destroyMethodPrototypeScopeCoach() {
		System.out.println("destroyMethodPrototypeScopeCoach");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroyMethod from Disposable bean");
		
	}


}
