package com.edynamix.learning.intro_to_java.chapter9;

public class Task1_HelloName {

	private static void printHelloName(String name) {
		System.out.printf("Hello, %s!", name);
	}
	
	public static void main(String[] args) {
		String name = "Peter";
		printHelloName(name);
	}

}
