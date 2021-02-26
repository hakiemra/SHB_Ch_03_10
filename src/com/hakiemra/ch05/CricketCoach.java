package com.hakiemra.ch05;

public class CricketCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 60 minutes on Cricket practice";
	}
	
	@Override
	public String getDailyFortune() {
		return null;
	}
}
