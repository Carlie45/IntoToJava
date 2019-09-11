package com.edynamix.learning.intro_to_java.chapter9;

public class Task4_HowManyOcurrenceInArray {

	private static int countOccurenceOfNumber(int number, int[] arr) {
		int counter = 0;
		for (int a : arr) {
			if (number == a) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,1};
		int number = 1;
		System.out.println(countOccurenceOfNumber(number, arr));
	}

}
