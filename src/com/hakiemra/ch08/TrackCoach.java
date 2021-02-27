package com.hakiemra.ch08;

public class TrackCoach implements Coach {
	
	// Define Private Field for Dependency Injection
	private FortuneService fortuneService;
	
	// Using Constructor to do DI
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5k a day";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getName() {
        return null;
    }

    public String getEmail() {
        return null;
    }
}
