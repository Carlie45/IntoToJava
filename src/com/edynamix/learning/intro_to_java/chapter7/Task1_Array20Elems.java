package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task1_Array20Elems {

	public static void main(String[] args) {
		final int NUM_ELEMS = 20;
		int[] arr = new int[NUM_ELEMS];
		
		for(int i = 0; i < NUM_ELEMS; i++) {
			arr[i] = i * 5;
		}
		System.out.println(Arrays.toString(arr));
	}

}
