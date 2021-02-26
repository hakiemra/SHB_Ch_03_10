package com.hakiemra.ch06;

public class CricketCoach implements Coach {

    // Define Private Field for Dependency Injection
	private FortuneService fortuneService;
    private String name;
    private String email;

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

    public void doStartupStuff() {
        System.out.println("Starting a CricketCoach Bean in LifeCycle");
    }

    public void doCleanupStuff() {
        System.out.println("Destroying a CricketCoach Bean in LifeCycle");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
}
