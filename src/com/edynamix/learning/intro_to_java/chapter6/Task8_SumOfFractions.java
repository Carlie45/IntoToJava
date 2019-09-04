package com.edynamix.learning.intro_to_java.chapter6;

public class Task8_SumOfFractions {

	public static void main(String[] args) {
		int n = 4;
		int x = 5;
		double sum = 1;
		long lastFactorial = 1;
		double lastX = x; 
		
		for (int i = 1; i <= n; i++) {
			sum += lastFactorial/lastX;
			lastFactorial *= i;
			lastX *= x;
		}
		System.out.println(sum);
	}

}
