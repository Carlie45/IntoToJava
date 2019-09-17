package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Scanner;

public class Task9_FindSequenceWithTheNeededSum {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 4, 3, 5, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.print("s = ");
		int targetSum = sc.nextInt();
		sc.close();

		int currentSum = 0;
		int startIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			currentSum = arr[i];
			startIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (currentSum + arr[j] > targetSum) {
					break;
				} else if (currentSum + arr[j] < targetSum) {
					currentSum += arr[j];
				} else {
					for (; startIndex <= j; startIndex++) {
						System.out.print(arr[startIndex] + " ");
					}
					return;
				}
			}
		}
		System.out.println("No matching sequence.");
	}

}
