package com.edynamix.learning.intro_to_java.chapter5;

public class Task1_SwapIfBigger {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
	}

}
