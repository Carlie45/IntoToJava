package com.edynamix.learning.intro_to_java.chapter6;

import java.util.Random;

public class Task16_MyRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = 60;		
		
		int randNumber = rand.nextInt(n) + 1; //+1 in order to start from 1 and to include n.
		System.out.println(randNumber);
	}

}
