package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task6_NFactOverKFact {

	public static void main(String[] args) {
		System.out.print("k = ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.print("n = ");
		int n = sc.nextInt();
		sc.close();
		
		int prod = 1;
		for (int i = k + 1; i <= n; i++) {
			prod *= i;
		}
		System.out.println(prod);
	}

}
