package com.edynamix.learning.intro_to_java.chapter5;

import java.util.Scanner;

public class Task4_OneDigitName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 0 and 9:");
		int number = sc.nextInt();
		sc.close();

		switch (number) {
		case 0:
			System.out.print("����");
			break;
		case 1:
			System.out.print("����");
			break;
		case 2:
			System.out.print("���");
			break;
		case 3:
			System.out.print("���");
			break;
		case 4:
			System.out.print("������");
			break;
		case 5:
			System.out.print("���");
			break;
		case 6:
			System.out.print("����");
			break;
		case 7:
			System.out.print("�����");
			break;
		case 8:
			System.out.print("����");
			break;
		case 9:
			System.out.print("�����");
			break;
		}
	}

}
