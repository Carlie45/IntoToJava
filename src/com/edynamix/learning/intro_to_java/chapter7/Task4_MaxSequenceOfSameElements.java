package com.edynamix.learning.intro_to_java.chapter7;

public class Task4_MaxSequenceOfSameElements {
	
	static void findMaxSequenceOfSameElements(int[] arr) {
		int maxSequenceStartIndex = 0;
		int maxSequenceEndIndex = 0; // To store the indexes of the beginning and the end of the max same sequence.
		int maxSequenceLength = 0;
		
		int startIndex = 0;
		int currentSequenceLength = 0;
		for (int endIndex = startIndex; endIndex < arr.length; endIndex++) {
			if (arr[startIndex] == arr[endIndex]) {
				currentSequenceLength++;
				if (maxSequenceLength < currentSequenceLength) {
					maxSequenceLength = currentSequenceLength;
					maxSequenceStartIndex = startIndex;
					maxSequenceEndIndex = endIndex;
				}
			} else {
				startIndex = endIndex;
				currentSequenceLength = 1;
			}
		}
		
		for (int i = maxSequenceStartIndex; i <= maxSequenceEndIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,6,7,7,7,3,2,2,2,2};

		findMaxSequenceOfSameElements(arr);
	}

}
