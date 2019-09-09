package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task14_MergeSort {

	private static void mergeSort(int[] arr, int left, int right) {
		if (right > left) {
			int middle = (left + right) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	private static void merge(int[] arr, int left, int middle, int right) {
		int leftSize = middle - left + 1;
		int rightSize = right - middle;

		int[] lArr = new int[leftSize];
		int[] rArr = new int[rightSize];

		// Copy left part of the data to a temp array.
		for (int i = 0; i < leftSize; i++) {
			lArr[i] = arr[left + i];
		}

		// Copy right part of the data to a temp array
		for (int i = 0; i < rightSize; i++) {
			rArr[i] = arr[middle + i + 1];
		}

		// Merge the temp arrays to the original array.
		int i = 0, j = 0, k = left;
		while (i < leftSize && j < rightSize) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		// Copy the remaining data in the temp left array to the original one.
		while (i < leftSize) {
			arr[k] = lArr[i];
			i++;
			k++;
		}

		// Copy the remaining data in the temp right array to the original one.
		while (j < rightSize) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		int left = 0;
		int right = arr.length - 1;

		mergeSort(arr, left, right);
		System.out.println(Arrays.toString(arr));
	}

}
