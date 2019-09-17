package com.edynamix.learning.intro_to_java.chapter7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Task16_SieveOfErathostenes {

	private static boolean isPrime(int number) {	
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	private static void markNextNumbersThatAreMultiplesOfThePrime(int prime, boolean[] markedNumbers) {
		int i = 2;
		int nextMarked = prime * i;
		while (nextMarked <= markedNumbers.length - 1) {
			markedNumbers[nextMarked] = true;
			i++;
			nextMarked = prime * i;
		}
	}
	
	public static void main(String[] args) {
		int N = 10000000;		
		boolean[] markedNumbers = new boolean[N+1]; // +1 because we want to find all prime numbers from 1 to N and for convenience the index
				// in the array will correspond to the number and we will ignore the 0 element.
		
		for (int number = 2; number <= Math.sqrt(N); number++) {
			if (markedNumbers[number] == true) {
				continue;
			}
			if (isPrime(number)) {
				markNextNumbersThatAreMultiplesOfThePrime(number, markedNumbers);
			}
		}

		// Write the prime numbers to a file because the output is too big.
		try (OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("output.txt"), Charset.forName("UTF-8"))) {
			for (int i = 2; i < markedNumbers.length; i++) {
				if (markedNumbers[i] == false) {
					output.write(i + " ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
