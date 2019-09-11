package com.edynamix.learning.intro_to_java.chapter9;

public class Task2_GetMax {

	private static int getMax(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 2;
		
		System.out.println(getMax(a, b));
		System.out.println(getMax(getMax(a, b), c));
	}

}
