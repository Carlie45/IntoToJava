package com.edynamix.learning.intro_to_java.chapter16;

public class Task1_Node {
	Object elem;
	Task1_Node next;
	Task1_Node prev;
	
	Task1_Node(Object elem, Task1_Node next, Task1_Node prev) {
		this.elem = elem;
		this.next = next;
		this.prev = prev;
	}
	
	Task1_Node(Object item) {
		this.elem = item;
		next = null;
		prev = null;
	}

	@Override
	public String toString() {
		return "Node [elem=" + elem + ", next=" + next + ", prev=" + prev + "]";
	}
}
