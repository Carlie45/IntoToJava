package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task1_PrintNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
