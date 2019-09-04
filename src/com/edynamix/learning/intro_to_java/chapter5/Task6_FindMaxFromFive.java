package com.edynamix.learning.intro_to_java.chapter5;

public class Task6_FindMaxFromFive {

	public static void main(String[] args) {
		int m = 4, n = 3, p = 7, q = 11, r = 2;
		// Some lazy solution...
		System.out.println("Max = " + Task3_MaxFromThree.maxFromThree(Task3_MaxFromThree.maxFromThree(m, n, p), q, r));
	}

}
