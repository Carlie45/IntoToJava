package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task5_FibonichiNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		int current;
		for (int i = 1; i < n; i++) {
			current = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = current;
			System.out.println(current);
		}
	}

}
