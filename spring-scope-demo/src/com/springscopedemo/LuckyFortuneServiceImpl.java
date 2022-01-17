package com.springscopedemo;

public class LuckyFortuneServiceImpl implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Lucky fortune awaits you";
	}

}
