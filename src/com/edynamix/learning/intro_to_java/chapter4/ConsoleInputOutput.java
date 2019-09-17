package com.edynamix.learning.intro_to_java.chapter4;

import java.util.Scanner;

public class ConsoleInputOutput {

	public static void main(String[] args) {
		//If you read from System.in, do not close this stream after you are ready with reading in your program.
		
		//Tasks:
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("c = ");
		int c = sc.nextInt();
		
		System.out.printf("The sum is = %d", (a + b + c));
		
		//2.
		System.out.print("r = ");
		double r = sc.nextDouble();
		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * r *r;
		System.out.printf("Perimeter = %f, Area = %f", perimeter, area);
		
		//3.
		System.out.print("Company name: ");
		String companyName = sc.nextLine();
		System.out.print("Company address: ");
		String companyAddress = sc.nextLine();
		System.out.print("Company phone number: ");
		String companyPhoneNumber = sc.nextLine();
		System.out.print("Company fax number: ");
		String companyFaxNumber = sc.nextLine();
		System.out.print("Company website: ");
		String companyWebsite = sc.nextLine();
		System.out.print("Manager first name: ");
		String managerFirstName = sc.nextLine();
		System.out.print("Manager last name: ");
		String managerLastName = sc.nextLine();
		System.out.print("Manager phone number: ");
		String managerPhoneNumber = sc.nextLine();
		
		System.out.printf("Company name: %s, Company address: %s, Company phone number: %s, Company fax number: %s, Company website: %s %n", 
				companyName, companyAddress, companyPhoneNumber, companyFaxNumber, companyWebsite);
		System.out.printf("Manager first name: %s, Manager last name: %s, Manager phone number: %s", 
				managerFirstName, managerLastName, managerPhoneNumber);
		
		//4.
		System.out.print("First number: ");
		int number1 = sc.nextInt();
		System.out.print("Second number: ");
		int number2 = sc.nextInt();
		int counter = 0;
		for (int i = number1 + 1; i < number2; i++) {
			if (i % 5 == 0) {
				counter++;
			}
 		}
		System.out.printf("Numbers between %d and %d that divide by 5: %d", number1, number2, counter);
		
		//5. 
		System.out.print("First number: ");
		number1 = sc.nextInt();
		System.out.print("Second number: ");
		number2 = sc.nextInt();
		System.out.printf("The bigger is %d.", Math.max(number1, number2) );
		
		//6.
		double sum = 0;
		for(int j = 0; j < 5; j++) {
			System.out.print("Enter number: ");
			double n = sc.nextDouble();
			sum += n;
		}
		System.out.printf("The sum is: %f.", sum);
		
		//7.
		double max = Double.MIN_VALUE;
		for(int j = 0; j < 5; j++) {
			System.out.print("Enter number: ");
			double n = sc.nextDouble();
			if (n > max) {
				max = n;
			}
		}
		System.out.printf("The max is: %f.", max);
		
		sc.close();
	}

}
