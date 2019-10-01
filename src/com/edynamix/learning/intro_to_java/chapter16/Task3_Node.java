package com.edynamix.learning.intro_to_java.chapter16;

public class Task3_Node {

    Object elem;
    Task3_Node prev;
    Task3_Node next;
    boolean isAddedFromHead;

    public Task3_Node(Object elem, boolean isAddedFromHead) {
        this.elem = elem;
        this.isAddedFromHead = isAddedFromHead;
    }

    public Task3_Node(Object elem, Task3_Node prev, Task3_Node next, boolean isAddedFromHead) {
        this.elem = elem;
        this.prev = prev;
        this.next = next;
        this.isAddedFromHead = isAddedFromHead;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrev() {
        return prev != null;
    }

    @Override
    public String toString() {
        return "Task3_Node{" +
                "elem=" + elem +
                ", prev=" + prev +
                ", next=" + next +
                ", isAddedFromHead=" + isAddedFromHead +
                '}';
    }
}
