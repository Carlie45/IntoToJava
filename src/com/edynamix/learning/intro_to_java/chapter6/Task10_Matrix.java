package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Scanner;

public class Task10_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(1 + i + j + " ");
			}
			System.out.println();
		}

	}

}
