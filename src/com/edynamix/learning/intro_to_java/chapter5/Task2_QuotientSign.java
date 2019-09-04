package com.edynamix.learning.intro_to_java.chapter5;

public class Task2_QuotientSign {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		if ((a >= 0 && b >= 0) || (a < 0 && b < 0)) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}

}
