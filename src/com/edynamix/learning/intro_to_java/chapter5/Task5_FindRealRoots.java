package com.edynamix.learning.intro_to_java.chapter5;

import java.util.Scanner;

public class Task5_FindRealRoots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a1 = sc.nextDouble();
		System.out.print("b = ");
		double b1 = sc.nextDouble();
		System.out.print("c = ");
		double c1 = sc.nextDouble();

		boolean canDbeFound = (b1 * b1) >= (4 * a1 * c1);
		double D = Math.sqrt(b1 * b1 - 4 * a1 * c1);
		if (!canDbeFound) {
			System.out.println("No real roots.");
		} else if (D == 0) {
			double x = -b1 / (2 * a1);
			System.out.println("x = " + x);
		} else {
			double delimeter = 1.0 / (2 * a1);
			double x1 = (-b1 + D) * delimeter;
			double x2 = (-b1 - D) * delimeter;
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		}
	}
}
