package com.springnoxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Using Configuration annotation instead of xml
@Configuration
@ComponentScan("com.springnoxml")
public class SportConfig {
	
	//define bean
	@Bean
	public FortuneService sadFortuneServiceImpl() {
		return new SadFortuneServiceImpl();
	}
	
	public Coach swimCoach() {
		System.out.println("SportConfig.swimCoach");
		return new SwimCoach(sadFortuneServiceImpl());
	}

}
