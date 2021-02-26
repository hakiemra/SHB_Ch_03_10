package com.hakiemra.ch05;

public class CricketCoach implements Coach {

    // Define Private Field for Dependency Injection
	private FortuneService fortuneService;

    // Empty Constructor
    public CricketCoach() {
        System.out.println("CricketCoach constructor is called");
    }

    // Using Setter Function to do DI
    public void setFortuneServiceVal(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

	@Override
	public String getDailyWorkout() {
		return "Spend 60 minutes on Cricket practice";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
