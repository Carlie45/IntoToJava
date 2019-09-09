package com.edynamix.learning.intro_to_java.chapter7;

public class Task13_BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 6, 7, 8, 9, 10, 12 };
		int elemToSearchFor = 10;
		
		int startIndex = 0;
		int endEndex = arr.length - 1;
		int middleElemIndex = 0;
		
		while (startIndex <= endEndex) {
			middleElemIndex = (endEndex + startIndex) / 2;
			System.out.println(arr[middleElemIndex]);
			if (arr[middleElemIndex] == elemToSearchFor) {
				System.out.println("The element " + elemToSearchFor + " is found on index " + middleElemIndex);
				break;
			} else if (arr[middleElemIndex] > elemToSearchFor) {
				endEndex = middleElemIndex - 1;
			} else {
				startIndex = middleElemIndex + 1;
			}
		}
	}

}
