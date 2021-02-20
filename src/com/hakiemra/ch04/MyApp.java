package com.hakiemra.ch04;

public class MyApp { // Run as Java Application
	
	public static void main(String[] args) {
		// Create Object
		Coach theCoach = new TrackCoach(); // Hardcode, Not the right way to do it
		
		// Use Methods of Object
		System.out.println(theCoach.getDailyWorkout());
		
	}
}
