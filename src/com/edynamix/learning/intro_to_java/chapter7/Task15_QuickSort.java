package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task15_QuickSort {

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = partition(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		// Use the last element as a pivot.
		int pivot = arr[high];
		
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		
		return i + 1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
