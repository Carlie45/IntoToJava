package com.edynamix.learning.intro_to_java.chapter8;

import com.edynamix.learning.intro_to_java.chapter6.Task12_DecToBinary;

public class Task13_RawFloatAndDouble {

	public static void main(String[] args) {
		int f = Float.floatToRawIntBits(-21.15625f);
		System.out.println(f);
		
		int sign = f >> 31 & 1;
		System.out.println("Sign: " + sign);
		
		int exponent = f & 0x7f800000;
		System.out.println("Exponent: " + Task12_DecToBinary.decToBinary(exponent).substring(0, 8)); // 8 bits for exponent
		
		int mantissa = f & 0x007fffff;
		System.out.println("Mantissa: " + Task12_DecToBinary.decToBinary(mantissa));
		
		long d = Double.doubleToRawLongBits(-21.15625); // analogical with the different masks.
	}

}
