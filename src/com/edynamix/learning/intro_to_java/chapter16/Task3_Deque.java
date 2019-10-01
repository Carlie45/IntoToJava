package com.edynamix.learning.intro_to_java.chapter16;

public class Task3_Deque {

    private Task3_Node head;
    private Task3_Node tail;

    public void addElemAtHead(Object elem) {
        if (head == null) { // The deque is empty.
            head = new Task3_Node(elem, true);
            tail = head;
        } else {
            Task3_Node current = new Task3_Node(elem, true);
            current.next = head;
            head.prev = current;
            head = current;
        }
    }

    public void addElemAtTail(Object elem) {
        if (head == null) { // The deque is empty.
            head = new Task3_Node(elem, false);
            tail = head;
        } else {
            Task3_Node current = new Task3_Node(elem, false);
            current.prev = tail;
            tail.next = current;
            tail = current;
        }
    }

    public Object removeElemFromHead() throws Task3_IllegalOperationException {
        Task3_Node removedElem = null;
        if (head == null) { // The deque is empty, so nothing to return.
            return null;
        }
        removedElem = head;
        if (!removedElem.isAddedFromHead) {
            throw new Task3_IllegalOperationException("The element cannot be removed from the head, because it was not added from this side.");
        }
        if (!head.hasNext()) { // The deque had only one element.
            head = tail = null;
        } else {
            head.next.prev = null;
            head = head.next;
        }

        return removedElem.elem;
    }

    public Object removeElemFromTail() throws Task3_IllegalOperationException {
        Task3_Node removedElem = null;
        if (head == null) { // The deque is empty, so nothing to return.
            return null;
        }
        removedElem = tail;
        if (removedElem.isAddedFromHead) {
            throw new Task3_IllegalOperationException("The element cannot be removed from the tail, because it was not added from this side.");
        }
        if (!tail.hasPrev()) { // The deque had only one element.
            head = tail = null;
        } else {
            tail.prev.next = null;
            tail = tail.prev;
        }

        return removedElem;
    }

    public void clear() {
        Task3_Node current = head;

        try {
            while(current != null && current.isAddedFromHead) {
                removeElemFromHead();
                current = current.next;
            }
            current = tail;
            while(current != null && !current.isAddedFromHead) {
                removeElemFromTail();
                current = current.prev;
            }
        } catch (Task3_IllegalOperationException ioe) {
            ioe.printStackTrace();
        }
    }

    public void print() {
        System.out.print("Deque = [ ");
        Task3_Node current = head;
        while(current != null) {
            System.out.print(current.elem + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Task3_Deque deque = new Task3_Deque();
        deque.addElemAtHead(3);
        deque.addElemAtHead(2);
        deque.addElemAtHead(1);
        deque.print();

        deque.addElemAtTail(4);
        deque.addElemAtTail(5);
        deque.print();

//        try {
//            deque.removeElemFromHead();
//            deque.print();
//            deque.removeElemFromHead();
//            deque.print();
//        } catch (Task3_IllegalOperationException ioe) {
//            ioe.printStackTrace();
//        }

//        try {
//            deque.removeElemFromTail();
//            deque.print();
//            deque.removeElemFromTail();
//            deque.print();
//            deque.removeElemFromTail();
//            deque.print();
//        } catch (Task3_IllegalOperationException ioe) {
//            ioe.printStackTrace();
//        }

        deque.clear();
        deque.print();
    }
}
