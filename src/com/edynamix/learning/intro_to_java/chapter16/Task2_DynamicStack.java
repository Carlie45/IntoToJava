package com.edynamix.learning.intro_to_java.chapter16;

import java.util.Arrays;

public class Task2_DynamicStack {
	
	private Task2_Node top;
	private int count;
	
	public void push(Object elem) {
		if (top == null) {
			top = new Task2_Node(elem, null);
		} else {
			Task2_Node current = new Task2_Node(elem, top);
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
		Task2_Node current = top;
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
		Task2_Node current = top;
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
		Task2_DynamicStack stack = new Task2_DynamicStack();
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
