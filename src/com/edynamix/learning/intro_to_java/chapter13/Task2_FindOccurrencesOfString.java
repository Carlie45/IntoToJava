package com.edynamix.learning.intro_to_java.chapter13;

public class Task2_FindOccurrencesOfString {

	public static void main(String[] args) {
		String line = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.";
		
		line = line.toLowerCase();
		int count = 0;
		int index = 0;
		String substring = "in";
		while (index != -1) {
			index = line.indexOf(substring);
			if (index > -1) {
				count++;
				line = line.substring(index + 1);
			}
		}
		System.out.println(count);
	}

}
