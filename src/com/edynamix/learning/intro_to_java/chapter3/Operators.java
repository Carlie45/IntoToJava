package com.edynamix.learning.intro_to_java.chapter3;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		//1.
		int number = 4;
		boolean isEven = number % 2 == 0;
		
		//2.
		boolean canBeDevidedBy5And7 = (number % 5 == 0) && (number % 7 == 0);
		
		//3. 
		boolean contains7AtThirdPlace = ((number / 100) / 10) % 7 == 0; //the first part removes the last 2 digits, the second
			//part takes the last digit from the remaining and checks if it divides by 7.
		
		//4.
		int binaryNumber = 0b111;
		boolean isThirdBit1 = (binaryNumber & 0b100) != 0;
		
		//5.
		int width = 4;
		int height = 5;
		System.out.println("Perimeter = " + (2 * width + 2 * height));
		System.out.println("Area = " + (width * height));
		
		//6.
		int a = 4;
		int b = 5;
		int h = 3;
		System.out.println("Area = " + ((a + b) * h / 2.0));
		
		//7.
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter number:");
//		int weight = input.nextInt();
//		System.out.println(weight * 0.83);

		//8.
		int x = 3;
		int y = 7;
		boolean isPointInCircle = (x*x + y*y) <= 5*5;
		
		//9.
		boolean isPointOutsideRectangle = (x < -1 && (y < 1 || y > 5)) || (x > 5 && (y < 1 || y > 5)); // (-1;1), (-1;5), (5;5), (5;1)
		boolean isPointInCircleAndOutsideRectangle = isPointInCircle && isPointOutsideRectangle;
		
		//10.
		int fourDigitNumber = 1234;
		int firstDigit = (fourDigitNumber / 1000) % 10;
		int secondDigit = (fourDigitNumber / 100) % 10;
		int thirdDigit = (fourDigitNumber / 10) % 10;
		int fourthDigit = fourDigitNumber % 10;
		int sumOfDigits =  firstDigit + secondDigit + thirdDigit + fourthDigit;
		System.out.println(sumOfDigits);
		System.out.println("" + fourthDigit + thirdDigit + secondDigit + firstDigit);
		System.out.println("" + fourthDigit + firstDigit + secondDigit + thirdDigit);
		System.out.println("" + firstDigit + thirdDigit + secondDigit + fourthDigit);
		
		//11.
		int n = 35; // 00100011
		int p = 2;
		int i = 1; // 00000001
		int mask = i << p; // Move the 1st bit with p positions
		// If i & mask are positive then the p-th bit of n is 1
		boolean isPbitOne = ((n & mask) != 0) ? true : false;
		System.out.println(isPbitOne);

		//12.
		int v = 1;
		if (isPbitOne) {
			if (v == 0) {
				n ^= mask;
			} else {
				// do not need to do anything
			}
		} else {
			// p bit is 0
			if (v == 0) {
				// do not need to do anything
			} else {
				n |= mask;
			}
		}
		System.out.println(n);
		
		//13.
		int numberToCheckIfPrime = 24;
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(numberToCheckIfPrime); j++) {
			if (numberToCheckIfPrime % j == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("Number " + numberToCheckIfPrime + " is prime: " + isPrime);
	}

}
