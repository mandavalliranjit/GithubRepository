package com.springcomponentscan;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements FortuneService {
	

	@Override
	public String getDailyFortune() {
		String a[] = {"Its going to be a happy go easy day", "Just relax for the next few days", "Your next adventure awaits you", "It's time to change jobs"};
		Random randomNumber = new Random();
		return a[randomNumber.nextInt(a.length)];
	}

}
