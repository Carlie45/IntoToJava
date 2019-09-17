package com.edynamix.learning.intro_to_java.chapter11;

public class Task1_TimeTodayAfterTheBeginning {

	public static void main(String[] args) {
	
		long time = System.currentTimeMillis();
		long seconds = time / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);

	}

}
