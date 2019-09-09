package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task7_SelectionSort {
	
	private static int findIndexOfMinElem(int[] arr, int indexAfter) {
		int indexOfMin = indexAfter;
		
		for (int i = indexAfter; i < arr.length; i++) {
			if (arr[i] < arr[indexOfMin]) {
				indexOfMin = i;
			}
		}
		
		return indexOfMin;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,8,6,4,3};

		int indexOfMin = 0;
		for (int currentPos = 0; currentPos < arr.length; currentPos++) {
			indexOfMin = findIndexOfMinElem(arr, currentPos);
			if (currentPos != indexOfMin) {
				int temp = arr[currentPos];
				arr[currentPos] = arr[indexOfMin];
				arr[indexOfMin] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
