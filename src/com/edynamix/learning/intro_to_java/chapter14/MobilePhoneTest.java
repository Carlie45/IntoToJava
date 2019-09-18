package com.edynamix.learning.intro_to_java.chapter14;

public class MobilePhoneTest {

	public static void main(String[] args) {
		MobilePhone[] mobilePhones = new MobilePhone[2];
		mobilePhones[0] = new MobilePhone("iphone");
		mobilePhones[1] = new MobilePhone("samsung", "samsung", 100, "bibi");
		
		for (MobilePhone phone : mobilePhones) {
			System.out.println(phone);
		}
		
		MobilePhone.printStaticPhone();

	}

}
