package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task3_PrintMinAndMax {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int current;
		for (int i = 0; i < n; i++) {
			System.out.print("n = ");
			current = sc.nextInt();
			if (current < min) {
				min = current;
			}
			if (current > max) {
				max = current;
			}
		}
		System.out.println("min = " + min + ", max = " + max);
	}

}
