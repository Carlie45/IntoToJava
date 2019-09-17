package com.edynamix.learning.intro_to_java.chapter11;

public class Task3_Cat {

    // Field name
    private String name;
    // Field color
    private String color;
 
    // Default constructor
    public Task3_Cat() {
        this.name = "Unnamed";
        this.color = "gray";
    }
 
    // Constructor with parameters
    public Task3_Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    // Method sayMiau
    public void sayMiau() {
        System.out.printf("Cat %s said: Miauuuuuu!%n", name);
    }
	 
}
