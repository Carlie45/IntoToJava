package com.edynamix.learning.intro_to_java.chapter8;

public class Task1_DecimalToBinary {
	
	public static String decimalToBinary(int number) {
		String binaryNum = "";
		while (number != 0) {
			binaryNum = (number % 2) + binaryNum;
			number /= 2;
		}
		
		return binaryNum;
	}

	public static void main(String[] args) {
		System.out.println(decimalToBinary(151));
		System.out.println(decimalToBinary(35));
		System.out.println(decimalToBinary(43));
		System.out.println(decimalToBinary(251));
		System.out.println(decimalToBinary(-0));
		System.out.println(decimalToBinary(41));

	}

}
