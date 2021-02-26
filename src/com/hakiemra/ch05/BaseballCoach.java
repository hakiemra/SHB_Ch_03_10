package com.hakiemra.ch05;

public class BaseballCoach implements Coach {

	// Define Private Field for Dependency Injection
	private FortuneService fortuneService;
	
	// Using Constructor to do DI
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Baseball practice";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
