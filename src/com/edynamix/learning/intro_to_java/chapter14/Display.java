package com.edynamix.learning.intro_to_java.chapter14;

public class Display {

	private double width;
	private int colours;
	
	public Display() {
		super();
	}

	public Display(double width) {
		this();
		this.width = width;
	}
	
	public Display(double width, int colours) {
		this(width);
		this.colours = colours;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getColours() {
		return colours;
	}

	public void setColours(int colours) {
		this.colours = colours;
	}

	@Override
	public String toString() {
		return "Display [width=" + width + ", colours=" + colours + "]";
	}
	
}
