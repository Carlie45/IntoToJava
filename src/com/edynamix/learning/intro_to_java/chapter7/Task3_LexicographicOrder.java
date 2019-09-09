package com.edynamix.learning.intro_to_java.chapter7;

public class Task3_LexicographicOrder {
	
	private static final String FIRST_ARRAY_IS_BEFORE_THE_SECOND_ONE = "First array is before the second one.";
	private static final String SECOND_ARRAY_IS_BEFORE_THE_FIRST_ONE = "Second array is before the first one.";
	private static final String EQUALITY = "The arrays are equal.";
	
	public static void main(String[] args) {
		char[] arr1 = {'a', 'i', 'u', 'e', 'o'};
		char[] arr2 = {'a', 'i', 'u'};

		int shorterArrayLength = Math.min(arr1.length, arr2.length);
		
		int index = 0;
		
		for ( ; index < shorterArrayLength; index++) {
			if (arr1[index] < arr2[index]) {
				System.out.println(FIRST_ARRAY_IS_BEFORE_THE_SECOND_ONE);
				return;
			} else if (arr1[index] > arr2[index]) {
				System.out.println(SECOND_ARRAY_IS_BEFORE_THE_FIRST_ONE);
				return;
			}
		}
		//Chars until index position are the same.
		
		if (arr1.length == arr2.length) {
			System.out.println(EQUALITY);
		} else if (arr1.length < arr2.length) {
			System.out.println(FIRST_ARRAY_IS_BEFORE_THE_SECOND_ONE);
		} else {
			System.out.println(SECOND_ARRAY_IS_BEFORE_THE_FIRST_ONE);
		}
	}

}
