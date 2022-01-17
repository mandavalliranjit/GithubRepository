package com.springfieldinjection;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements FortuneService{

	private Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		String fortuneArray[] = {"Believe in yourself, always",
		              "Expect the unexpected",
		              "Your surprise awaits you"};
		return fortuneArray[randomNumber(fortuneArray.length)];
	}

	private int randomNumber(int arrayLength) {
		
		return myRandom.nextInt(arrayLength);
	}

}
