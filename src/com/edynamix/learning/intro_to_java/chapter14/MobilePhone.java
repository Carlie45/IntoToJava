package com.edynamix.learning.intro_to_java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

	private String model;
	private String manufacturer;
	private double price;
	private String owner;
	private Battery battery;
	private Display display;
	
	private List<Call> callHistory;
	
	private static MobilePhone nokiaN95 = new MobilePhone("nokiaN95");
	
	public MobilePhone() {
		super();
		callHistory = new ArrayList<>();
	}
	
	public MobilePhone(String model) {
		this();
		this.model = model;
	}

	public MobilePhone(String model, String manufacturer, double price, String owner) {
		this(model);
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
	}

	public MobilePhone(String model, String manufacturer, double price, String owner, Battery battery,
			Display display) {
		this(model, manufacturer, price, owner);
		this.battery = battery;
		this.display = display;
	}
	
	public String toString() {
		return "MobilePhone [model=" + model + ", manufacturer=" + manufacturer + ", price=" + price + ", owner="
				+ owner + ", battery=" + battery + ", display=" + display + "]";
	}

	public static void printStaticPhone() {
		System.out.println(nokiaN95.toString());
	}

	public static void main(String[] args) {
		printStaticPhone();

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public static MobilePhone getNokiaN95() {
		return nokiaN95;
	}

	public static void setNokiaN95(MobilePhone nokiaN95) {
		MobilePhone.nokiaN95 = nokiaN95;
	}

	public List<Call> getCallHistory() {
		return callHistory;
	}

	public boolean addCallInHistory(Call call) {
		return callHistory.add(call);
	}
	
	public boolean deleteCallFromHistory(Call call) {
		return callHistory.remove(call);
	}
	
	public void deleteFullCallHistory() {
		callHistory.clear();
	}
	
	public double getPriceForCallHistory(double pricePerCall) {
		return callHistory.size() * pricePerCall;
	}
	
	public Call getLongestCall() {
		Call longest = new Call();
		
		for (Call c : this.getCallHistory()) {
			if (c.getCallDuration() > longest.getCallDuration()) {
				longest = c;
			}
		}
		
		return longest;
	}
}
