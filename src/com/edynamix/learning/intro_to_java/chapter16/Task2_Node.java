package com.edynamix.learning.intro_to_java.chapter16;

public class Task2_Node {
	
	Object elem;
	Task2_Node prev;
	
	public Task2_Node(Object elem, Task2_Node prev) {
		this.elem = elem;
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "Task2_Node [elem=" + elem + ", prev=" + prev + "]";
	}

}
