package com.edynamix.learning.intro_to_java.chapter16.task1;

public class Node {
	public Object elem;
	public Node next;
	public Node prev;
	
	Node(Object elem, Node next, Node prev) {
		this.elem = elem;
		this.next = next;
		this.prev = prev;
	}
	
	Node(Object item) {
		this.elem = item;
		next = null;
		prev = null;
	}

	@Override
	public String toString() {
		return "Node [elem=" + elem + ", next=" + next + ", prev=" + prev + "]";
	}
}
