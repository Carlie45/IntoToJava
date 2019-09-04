package com.edynamix.learning.intro_to_java.chapter5;

public class Task3_MaxFromThree {
	
	static int maxFromThree(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}

	public static void main(String[] args) {
		int a = 5, b = 4, c = 10;
		int max = maxFromThree(a, b, c);
		System.out.println(max);
	}

}
