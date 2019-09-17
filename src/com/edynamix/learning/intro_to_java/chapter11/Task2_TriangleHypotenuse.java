package com.edynamix.learning.intro_to_java.chapter11;

import java.util.Scanner;

public class Task2_TriangleHypotenuse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double sideA = sc.nextDouble();
		
		System.out.print("b = ");
		double sideB = sc.nextDouble();
		
		double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
		System.out.println("c = " + hypotenuse);
		
		sc.close();
	}

}
