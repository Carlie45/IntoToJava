package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Task6_MaxSumOfKElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		
		System.out.print("k = ");
		int k = sc.nextInt();
		
		if (k > n || k < 0 || n < 0) {
			System.err.println("Invalid input.");
			return;
		}
		
		int[] arr = new int[n];
		// Read the array.
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		
		// Sort the array -> the biggest numbers will be at the end.
		Arrays.sort(arr);
		
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[n - i - 1];
		}
		System.out.println("Max sum is " + sum);
		sc.close();
	}

}
