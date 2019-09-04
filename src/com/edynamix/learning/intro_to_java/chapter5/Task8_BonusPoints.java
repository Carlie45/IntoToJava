package com.edynamix.learning.intro_to_java.chapter5;

public class Task8_BonusPoints {

	public static void main(String[] args) {
		int points = 8;
		switch (points) {
		case 1:
		case 2:
		case 3:
			points *= 10;
			break;
		case 4:
		case 5:
		case 6:
			points *= 100;
			break;
		case 7:
		case 8:
		case 9:
			points *= 1000;
			break;
		default:
			System.out.println("Invalid points.");
		}
		System.out.println(points);
	}

}
