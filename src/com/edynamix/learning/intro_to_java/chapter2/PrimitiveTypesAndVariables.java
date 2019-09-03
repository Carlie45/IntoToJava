package com.edynamix.learning.intro_to_java.chapter2;

public class PrimitiveTypesAndVariables {

	public static void main(String[] args) {
		//Assert 0.1f is rounded.
		float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		boolean equal = 1.0f == sum;
		System.out.println(equal);
		
		//Tasks:
		//1.
		int i1 = 52130; //because short's maximum value is 32,767.
		byte b1 = -115; //because bute's minimum value is -128.
		int i2 = 4825932; //still in the range of int.
		byte b2 = 97; //because byte's maximum value is 127.
		short s1 = -10000; //because short's minimum value is -32,768.		

		//2.
		double d1 = 34.567839023; //because there are more than 8 digits.
		float f1 = 12.345f; //because it fits in float.
		double d2 = 8923.1234857;
		float f2 = 3456.091f;

		//3.
		int hexValue = 0x100;
		
		//4.
		boolean isMale = false;
		
		//5.
		String hello = "Hello";
		String world = "World";
		Object helloWorld = hello + " " + world;
		System.out.println(helloWorld);
		String helloWorldStr = (String) helloWorld;
		
		//6.
		String sentence = "The \"use\" of quotations causes difficulties.";
		System.out.println(sentence);
		
		//7.
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		
		//8.
		System.out.println(" o o");
		System.out.println("o o o");
		System.out.println(" o o");
		System.out.println("  o");
		
		//9.
		String firstName;
		String lastName;
		byte age;
		char sex; //'m' or 'f'
		int id;
		int employeeID;
		
		//10.
		int a = 5;
		int b = 10;
		//swap a and b
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ", b = " + b);
		
	}
}
