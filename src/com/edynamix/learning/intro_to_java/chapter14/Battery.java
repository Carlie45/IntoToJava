package com.edynamix.learning.intro_to_java.chapter14;

public class Battery {
	
	private String model;
	private int idleTime;
	private int hoursTalk;
	
	public Battery() {
		super();
	}

	public Battery(String model) {
		this();
		this.model = model;
	}
	
	public Battery(String model, int idleTime) {
		this(model);
		this.idleTime = idleTime;
	}

	public Battery(String model, int idleTime, int hoursTalk) {
		this(model, idleTime);
		this.hoursTalk = hoursTalk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(int idleTime) {
		this.idleTime = idleTime;
	}

	public int getHoursTalk() {
		return hoursTalk;
	}

	public void setHoursTalk(int hoursTalk) {
		this.hoursTalk = hoursTalk;
	}

	@Override
	public String toString() {
		return "Battery [model=" + model + ", idleTime=" + idleTime + ", hoursTalk=" + hoursTalk + "]";
	}

}
