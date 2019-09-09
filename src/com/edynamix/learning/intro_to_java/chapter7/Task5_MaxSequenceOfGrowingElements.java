package com.edynamix.learning.intro_to_java.chapter7;

public class Task5_MaxSequenceOfGrowingElements {

	public static void main(String[] args) {
		int[] arr = {3,2,3,2,5,2,2,4};
		int maxSequenceStartIndex = 0;
		int maxSequenceEndIndex = 0; // To store the indexes of the beginning and the end of the max growing sequence.
		int maxSequenceLength = 0;
		
		int startIndex = 0;
		int currentSequenceLength = 0;
		for (int i = startIndex; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				currentSequenceLength++;
				if (currentSequenceLength > maxSequenceLength) {
					maxSequenceLength = currentSequenceLength;
					maxSequenceStartIndex = startIndex;
					maxSequenceEndIndex = i + 1;
				}
			} else {
				currentSequenceLength = 1;
				startIndex = i + 1;
			}
		}
		
		for (int i = maxSequenceStartIndex; i <= maxSequenceEndIndex; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
