package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task9_CatalansNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		sc.close();

		double catNumber = 1;
		long last2n = 2;
		long lastN = 1;
		long lastNPlusOne = 2;

		for (int i = 2; i <= n; i++) {
			lastN *= i;
			lastNPlusOne *= (i + 1);
			last2n *= (2 * i - 1) * 2 * i;
			catNumber = last2n / (1.0 * lastNPlusOne * lastN);
		}
		System.out.println(catNumber);
	}

}
