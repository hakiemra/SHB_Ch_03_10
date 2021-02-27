package com.hakiemra.ch07;

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
		Coach theCoach = context.getBean("cricketCoach", Coach.class); // Must be same with beans.id in XML config file
		
		Coach theCoach02 = context.getBean("cricketCoach", Coach.class);

		Boolean compareInstance = (theCoach == theCoach02);

		// Use Methods of Object
		// System.out.println(theCoach.getDailyWorkout());
		// System.out.println(theCoach.getDailyFortune());
		// System.out.println(theCoach.getName());
		// System.out.println(theCoach.getEmail());

		System.out.println("Object Hash value for theCoach: " + theCoach.toString());
		System.out.println("Object Hash value for theCoach02: " + theCoach02.toString());
		System.out.println("theCoach == theCoach02: " + compareInstance.toString());
		// System.out.println("theCoach and theCoach02 has different Hash value so they are different object.");
		// System.out.println("It's called PROTOTYPE Bean Scopes.");
		
		context.close();
	}
}
