package com.edynamix.learning.intro_to_java.chapter9;

public class Task7_Reverse {

	public static int reverse(int number) {
		int reversed = 0;
		String numberStr = Integer.toString(number);
		int countDigits = numberStr.length();
		
		for (int i = countDigits - 1; i >= 0; i--) {
			reversed += (number % 10) * Math.pow(10, i);
			number = number / 10;
		}
		
		return reversed;
	}
	
	public static void main(String[] args) {
		int number = 256;
		System.out.println(reverse(number));

	}

}
