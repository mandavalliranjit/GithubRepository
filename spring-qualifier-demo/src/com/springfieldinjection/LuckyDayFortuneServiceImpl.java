package com.springfieldinjection;

import org.springframework.stereotype.Component;

@Component
public class LuckyDayFortuneServiceImpl implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

}
