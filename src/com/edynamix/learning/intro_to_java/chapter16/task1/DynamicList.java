package com.edynamix.learning.intro_to_java.chapter16.task1;

import java.util.Arrays;

public class DynamicList {
	
	private Node head;
	private Node tail;
	private int count;
	
	public void add(Object item) {
		if (head == null) {
			// The list is empty;
			head = new Node(item);
			tail = head;
		} else {
			Node node = new Node(item, null, tail);
			tail.next = node;
			tail = node;
		}
		count++;
	}
	
	public Object remove(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		
		int currentIndex = 0;
		Node current = head;
		while(currentIndex < index) {
			current = current.next;
			currentIndex++;
		}
		// The current elem is the one that has to be removed.
		Object value = current.elem;
		
		count--;
		
		if (count == 0) {
			head = tail = null;
		} else if (current.prev == null) {
			head = current.next;
			current.next.prev = null;
		} else if (current.next == null) {
			tail = current.prev;
			tail.next = null;
		} else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		
		
		return value;
	}
	
	public int indexOf(Object elem) {
		int index = 0;
		Node current = head;
		while(current != null) {
			if ((current.elem == null && elem == null) 
					|| (current.elem != null && current.elem.equals(elem))) {
				return index;
			}
			current = current.next;
			index++;
		}
		
		return -1;
	}

	public Object elemAt(int index) {
		if (index == 0) {
			return head;
		} else if (index == count - 1) {
			return tail;
		} else {
			int currentIndex = 0;
			Node current = head;
			while (currentIndex < index) {
				current = current.next;
				currentIndex++;
			}
			return current.elem;
		}
	}
	
	public void insertAtIndex(int index, Object elem) {
		count++;
		if (index == 0) {
			Node node = new Node(elem, head, null);
			head.prev = node;
			head = node;
		} else if (index == count - 1){
			add(elem);
			count--; // it was added in the add method too.
		} else {
			Node node = new Node(elem);
			Node current = head;
			int currentIndex = 0;
			while(currentIndex < index) {
				current = current.next;
				currentIndex++;
			}
			current.prev.next = node;
			node.next = current;
		}
	}
	
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.elem + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public Object[] toArray() {
		Object[] arr = new Object[count];
		Node current = head;
		int index = 0;
		while (current != null) {
			arr[index] = current.elem;
			index++;
			current = current.next;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		DynamicList list = new DynamicList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//list.printList();
		
		list.remove(2);
		//list.printList();
		
		//System.out.println(list.indexOf(4));
		list.insertAtIndex(0, 0);
		//list.printList();
		list.insertAtIndex(4, 5);
		//list.printList();
		list.insertAtIndex(3, 3);
		list.printList();
		
		System.out.println(list.elemAt(3));
		System.out.println(Arrays.toString(list.toArray()));
	}

}
