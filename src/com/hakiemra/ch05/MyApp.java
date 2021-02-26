package com.hakiemra.ch05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp { // Run as Java Application
	
	public static void main(String[] args) {
		/*
		// Create Object
		Coach theCoach = new TrackCoach(); // Hardcode, Not the right way to do it
		*/
		
		// Start New Context by Getting XML Config Files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean Object
		Coach theCoach = context.getBean("coach", Coach.class); // Must be same with beans.id in XML config file
		
		// Use Methods of Object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		
		context.close();
	}
}
