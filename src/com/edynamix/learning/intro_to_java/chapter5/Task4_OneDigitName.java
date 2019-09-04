package com.edynamix.learning.intro_to_java.chapter5;

import java.util.Scanner;

public class Task4_OneDigitName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 0 and 9:");
		int number = sc.nextInt();

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

}
