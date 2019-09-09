package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task8_MostCommonElementInArray {

	public static void main(String[] args) {
		int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		
		Arrays.sort(arr);
		Task4_MaxSequenceOfSameElements.findMaxSequenceOfSameElements(arr);
	}

}
