package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Scanner;

public class Task2_SameArrays {
	
	private static Scanner sc;

	private static void initArray(Scanner sc, int[] arr) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Array 1 length = ");
		int arr1Length = sc.nextInt();
		
		System.out.print("Array 2 length = ");
		int arr2Length = sc.nextInt();

		int[] arr1 = new int[arr1Length];
		initArray(sc, arr1);
		int[] arr2 = new int[arr2Length];
		initArray(sc, arr2);
		
		boolean areArraysTheSame = true;
		if (arr1Length != arr2Length) {
			// They cannot be the same since they have different lengths.
			areArraysTheSame = false;
		} else {
			for (int i = 0; i < arr1Length; i++) {
				if (arr1[i] != arr2[i]) {
					areArraysTheSame = false;
					break;
				}
			}
		}
		
		System.out.println(areArraysTheSame);
	}

}
