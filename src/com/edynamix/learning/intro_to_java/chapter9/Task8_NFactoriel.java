package com.edynamix.learning.intro_to_java.chapter9;

import java.math.BigInteger;

public class Task8_NFactoriel {

	private static BigInteger factoriel(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n = 27;
		System.out.println(factoriel(50));
	}

}
