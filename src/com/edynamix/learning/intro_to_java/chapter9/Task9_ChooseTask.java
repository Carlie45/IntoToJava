package com.edynamix.learning.intro_to_java.chapter9;

import java.util.Scanner;

public class Task9_ChooseTask {

	private static double average(int[] arr) {
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		return average / arr.length;
	}
	
	private static double solveLineralEquasion(double a, double b) {
		return -b / a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose task from 1-3: ");
		int taskIndex = sc.nextInt();
		sc.close();
		if (taskIndex < 1 || taskIndex > 3) {
			System.err.println("Invalid task id!");
			return;
		}

		switch (taskIndex) {
		case 1:
			System.out.print("Enter number: ");
			int number = sc.nextInt();
			System.out.println(Task7_Reverse.reverse(number));
			break;
		case 2:
			int arr[] = { 4, 6, 8 };
			if (arr == null || arr.length == 0) {
				System.err.println("The arr is empty.");
				return;
			}
			System.out.println(average(arr));
			break;
		case 3:
			double a = 8;
			double b = 3;
			if (a == 0) {
				System.err.println("a cannot be 0.");
				return;
			}
			System.out.println(solveLineralEquasion(a, b));
		}
	}

}
