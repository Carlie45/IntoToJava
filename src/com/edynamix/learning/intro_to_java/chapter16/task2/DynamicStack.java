package com.edynamix.learning.intro_to_java.chapter16.task2;

import java.util.Arrays;

public class DynamicStack {
	
	private Node top;
	private int count;
	
	public void push(Object elem) {
		if (top == null) {
			top = new Node(elem, null);
		} else {
			Node current = new Node(elem, top);
			top = current;
		}
		count++;
	}
	
	public Object pop() {
		Object elem = null;
		if (top == null) {
			return null;
		} else {
			elem = top.elem;
			top = top.prev;
			count--;
		}
		
		return elem;
	}
	
	public Object peek() {
		if (top == null) {
			return null;
		}
		return top.elem;
	}
	
	public Object[] toArray() {
		Object[] arr = new Object[count];
		Node current = top;
		int index = 0;
		while (index < count) {
			arr[index] = current.elem;
			index++;
			current = current.prev;
		}
		return arr;
	}
	
	public int size() {
		return count;
	}
	
	public void clear() {
		while (count != 0) {
			pop();
		}
	}
	
	public boolean contains(Object elem) {
		Node current = top;
		while (current != null) {
			if (current.elem.equals(elem)) {
				return true;
			}
			current = current.prev;
		}
		
		return false;
	}
	
	public void print() {
		System.out.println(Arrays.toString(toArray()));
	}

	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.print();
		//System.out.println(stack.peek());
		//stack.clear();
		//stack.print();
		System.out.println(stack.contains(3));
	}

}
