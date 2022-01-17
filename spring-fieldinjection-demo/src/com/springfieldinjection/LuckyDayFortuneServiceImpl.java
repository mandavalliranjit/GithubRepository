package com.springfieldinjection;

import org.springframework.stereotype.Component;

@Component("luckyDay")
public class LuckyDayFortuneServiceImpl implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

}
