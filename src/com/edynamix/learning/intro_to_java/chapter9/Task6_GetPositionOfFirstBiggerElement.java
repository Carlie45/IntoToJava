package com.edynamix.learning.intro_to_java.chapter9;

public class Task6_GetPositionOfFirstBiggerElement {

	private static int getPositionOfFirstBiggerElement(int[] arr) {
		int index = -1;
		
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
				index = i;
				break;
			} 
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,1};
		System.out.println(getPositionOfFirstBiggerElement(arr));
	}

}
