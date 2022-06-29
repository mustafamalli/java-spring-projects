package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LacrosCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Throw the ball 250 times to the wall";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
