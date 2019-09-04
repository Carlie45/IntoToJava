package com.edynamix.learning.intro_to_java.chapter6;

public class Task11_ZerosInFactorial {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		for (int i = 5; i <= n; i+=5) {
			count++;
		}
		System.out.println(count);
	}

}
