package com.springdemo;

public class HappyFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
