package com.hakiemra.ch09;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    // Define Private Field for Dependency Injection
    @Autowired
    @Qualifier("randomFortuneService")
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

    @PostConstruct
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
