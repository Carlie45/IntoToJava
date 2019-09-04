package com.edynamix.learning.intro_to_java.chapter5;

public class Task9_PrintThreeDigitNumberName {

	private static void printOneDigitNumber(int number) {
		switch (number) {
		case 0:
			System.out.print("нула");
			break;
		case 1:
			System.out.print("едно");
			break;
		case 2:
			System.out.print("две");
			break;
		case 3:
			System.out.print("три");
			break;
		case 4:
			System.out.print("четири");
			break;
		case 5:
			System.out.print("пет");
			break;
		case 6:
			System.out.print("шест");
			break;
		case 7:
			System.out.print("седем");
			break;
		case 8:
			System.out.print("осем");
			break;
		case 9:
			System.out.print("девет");
			break;
		}
	}

	// Prints the last digit of a 2-digit number.
	private static void printRemainderInTwoDigits(int number) {
		int remainder = number % 10;
		if (remainder == 0) {
			return;
		}
		System.out.print(" и ");
		printOneDigitNumber(remainder);
	}

	private static void printTwoDigitNumber(int number) {
		if (number < 20) {
			switch (number) {
			case 11:
				System.out.println("единадесет");
				break;
			case 12:
				System.out.println("дванадесет");
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				printOneDigitNumber(number % 10);
				System.out.print("на");
			case 10:
				System.out.print("десет");
				break;
			}
		} else {
			switch (number / 10) {
			case 2:
				System.out.print("двадесет");
				break;
			case 3:
				System.out.print("тридесет");
				break;
			case 4:
				System.out.print("четиридесет");
				break;
			case 5:
				System.out.print("петдесет");
				break;
			case 6:
				System.out.print("шестдесет");
				break;
			case 7:
				System.out.print("седемдесет");
				break;
			case 8:
				System.out.print("осемдесет");
				break;
			case 9:
				System.out.print("деветдесет");
				break;
			}
			printRemainderInTwoDigits(number);
		}
	}

	// Prints the last two digits of a 3-digit number.
	private static void printRemainderInThreeDigits(int number) {
		int remainder = number % 100;
		if (remainder == 0) {
			return;
		}
		
		if (remainder < 10) {
			System.out.print(" и ");
			printOneDigitNumber(remainder);
			return;
		}
		
		if (remainder % 10 == 0 || (remainder > 10 && remainder < 20)) {
			System.out.print(" и ");
		} else {
			System.out.print(" ");
		}

		printTwoDigitNumber(remainder);
	}
	
	private static void printThreeDigitNumber(int number) {
		switch (number / 100) {
		case 1:
			System.out.print("сто");
			break;
		case 2:
			System.out.print("двеста");
			break;
		case 3:
			System.out.print("триста");
			break;
		case 4:
			System.out.print("четиристотин");
			break;
		case 5:
			System.out.print("петстотин");
			break;
		case 6:
			System.out.print("шестстотин");
			break;
		case 7:
			System.out.print("седемстотин");
			break;
		case 8:
			System.out.print("осемстотин");
			break;
		case 9:
			System.out.print("деветстотин");
			break;
		case 0: 
			break;
		}
		printRemainderInThreeDigits(number);
	}

	public static void main(String[] args) {

		int number = 888;
		int numberDigits = Integer.toString(number).length();
		
		switch(numberDigits) {
		case 1: printOneDigitNumber(number); break;
		case 2: printTwoDigitNumber(number); break;
		case 3: printThreeDigitNumber(number); break;
		default: System.out.println("Not in scope.");
		}
	}

}
