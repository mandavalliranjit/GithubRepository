package com.springbeanscope;

import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html
@Scope("singleton")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TennisCoach getDailyWorkout()";
	}

	@PostConstruct
	private void initializeMethod() throws FileNotFoundException {
		System.out.println("TennisCoach initializeMethod");


	}

	@PreDestroy
	private void destroyMethod() {
		System.out.println("TennisCoach destroyMethod");
	}

}
