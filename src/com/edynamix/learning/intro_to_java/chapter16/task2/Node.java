package com.edynamix.learning.intro_to_java.chapter16.task2;

public class Node {
	
	Object elem;
	Node prev;
	
	public Node(Object elem, Node prev) {
		this.elem = elem;
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "Task2_Node [elem=" + elem + ", prev=" + prev + "]";
	}

}
