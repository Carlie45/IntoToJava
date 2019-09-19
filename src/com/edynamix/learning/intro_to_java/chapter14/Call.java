package com.edynamix.learning.intro_to_java.chapter14;

import java.util.Date;

public class Call {
	
	private Date date;
	private long startOfCall;
	private long endOfCall;
	
	public Call() {
		
	}
	
	public Call(Date date, long startOfCall, long endOfCall) {
		this.date = date;
		this.startOfCall = startOfCall;
		this.endOfCall = endOfCall;
	}
	
	public long getCallDuration() {
		return endOfCall - startOfCall;
	}

	@Override
	public String toString() {
		return "Call [date=" + date + ", startOfCall=" + startOfCall + ", endOfCall=" + endOfCall + "]";
	}

}
