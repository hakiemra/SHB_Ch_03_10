package com.hakiemra.ch08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // Define Private Field for Dependency Injection
    @Autowired
    @Qualifier("happyFortuneService")
	private FortuneService fortuneService;
    private String name;
    private String email;

    // Empty Constructor
    public CricketCoach() {
        System.out.println("CricketCoach constructor is called");
    }

    // Using Constructor to do DI
    // @Autowired
    // public CricketCoach(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    //     System.out.println("Using @Autowired to do DI - Constructor Injection");
    // }

    // Using Setter Function to do DI
    // @Autowired
    // public void setFortuneServiceVal(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }

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
