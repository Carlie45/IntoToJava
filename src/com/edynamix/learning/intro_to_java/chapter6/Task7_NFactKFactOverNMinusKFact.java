package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task7_NFactKFactOverNMinusKFact {
	
	private static long factorial(int number) {
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.print("k = ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.print("n = ");
		int n = sc.nextInt();
		sc.close();
		
		long res = factorial(n) * factorial(k) / factorial(n - k);
		System.out.println(res);
	}

}
