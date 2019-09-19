package com.edynamix.learning.intro_to_java.chapter14;

import java.util.Date;

public class MobilePhoneCallHistoryTest {
	


	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone("samsung");
		Call call1 = new Call(new Date(), System.currentTimeMillis(), System.currentTimeMillis() + 20000);
		Call call2 = new Call(new Date(), System.currentTimeMillis(), System.currentTimeMillis() + 50000);
		
		phone.addCallInHistory(call1);
		phone.addCallInHistory(call2);
		
		System.out.println("Calls in history: ");
		for (Call c : phone.getCallHistory()) {
			System.out.println(c);
		}
		
		System.out.println("Calls price: " + phone.getPriceForCallHistory(0.37));
		
		Call longest = phone.getLongestCall();
		System.out.println("Longest call: " + longest);
		
		phone.deleteCallFromHistory(longest);
		System.out.println("Calls price: " + phone.getPriceForCallHistory(0.37));
		
		System.out.println("Deleting history...");
		phone.deleteFullCallHistory();
		System.out.println("Call history deleted.");
	}

}
