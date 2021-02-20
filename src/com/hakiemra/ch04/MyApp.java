package com.hakiemra.ch04;

public class MyApp { // Run as Java Application
	
	public static void main(String[] args) {
		// Create Object
		Coach theCoach = new BaseballCoach();
		
		// Use Methods of Object
		System.out.println(theCoach.getDailyWorkout());
		
	}
}
