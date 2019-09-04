package com.edynamix.learning.intro_to_java.chapter6;

public class Task15_HexToDec {

	public static void main(String[] args) {
		String hex = "2D";
		char[] arr = hex.toCharArray();
		int dec = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - '0' >= 0 && arr[i] - '0' <= 9) {
				dec += (arr[i] - '0') * Math.pow(16, arr.length - 1 - i);
			} else {
				switch(arr[i]) {
				case 'A': dec += 10 * Math.pow(16, arr.length - 1 - i); break;
				case 'B': dec += 11 * Math.pow(16, arr.length - 1 - i); break;
				case 'C': dec += 12 * Math.pow(16, arr.length - 1 - i); break;
				case 'D': dec += 13 * Math.pow(16, arr.length - 1 - i); break;
				case 'E': dec += 14 * Math.pow(16, arr.length - 1 - i); break;
				case 'F': dec += 15 * Math.pow(16, arr.length - 1 - i); break;
				}
			}
			
		}
		System.out.println(dec);
	}

}
