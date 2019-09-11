package com.edynamix.learning.intro_to_java.chapter9;

public class Task5_ElementComparedToNeighbours {

	private static void findIfBiggerBetweenNeighbours(int index, int[] arr) {
		if (index - 1 >= 0 && index + 1 < arr.length) {
			if (arr[index] >= arr[index-1] && arr[index] >= arr[index+1]) {
				System.out.println("Bigger.");
				return;
			} else if (arr[index] <= arr[index-1] && arr[index] <= arr[index+1]) {
				System.out.println("Smaller.");
				return;
			}
		}
		System.out.println("Undefined.");
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,2,6,5,3};
		int index = 1;
		findIfBiggerBetweenNeighbours(index, arr);
	}

}
