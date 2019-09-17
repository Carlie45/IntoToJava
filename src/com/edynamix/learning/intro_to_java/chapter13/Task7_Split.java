package com.edynamix.learning.intro_to_java.chapter13;

import java.util.Arrays;

public class Task7_Split {

	public static void main(String[] args) {
		String str = "one\two\three";
		String[] arr = str.split("\\\\");
		System.out.println(Arrays.toString(arr));
	}

}
