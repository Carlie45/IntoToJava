package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task2_PrintNNumbersNo3No7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
