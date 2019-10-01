package com.edynamix.learning.intro_to_java.chapter16.task4;

public class LoopedQueue {

    private Object[] arr;
    private int capacity = 2;
    private int size = 0;

    private int headIndex = 0;
    private int tailIndex = -1;

    public LoopedQueue() {
        this.arr = new Object[capacity];
    }

    /**
     * Expand the array for the queue when the head index reaches the tail index.
     */
    private void expandArray() {
        Object[] expandedArray = new Object[capacity * 2];
        int expandedArrElemIndex = 0;
        for(int i = headIndex; i < arr.length; i++) {
            expandedArray[expandedArrElemIndex] = arr[i];
            expandedArrElemIndex++;
        }
        for(int i = 0; i < headIndex; i++) {
            expandedArray[expandedArrElemIndex] = arr[i];
            expandedArrElemIndex++;
        }
        arr = expandedArray;
        capacity = 2 * capacity;
        headIndex = 0;
        tailIndex = size;
    }

    /**
     * Adds element to the end of the queue.
     */
    public void push(Object elem) {
        tailIndex = (tailIndex + 1) % capacity;
        if (tailIndex == headIndex && arr[headIndex] != null) { // The array needs to be resized.
            expandArray();
        }
        arr[tailIndex] = elem;
        size++;
    }

    public Object peek() {
        return arr[headIndex];
    }

    public Object pop() throws EmptyQueueException {
        if (size == 0) {
            throw new EmptyQueueException("The queue is empty.");
        }
        Object temp = arr[headIndex];
        arr[headIndex] = null;
        headIndex++;
        size--;

        return temp;
    }

    public void print() {
        System.out.print("Queue = [ ");
        for (Object node : arr) {
            System.out.print(node + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LoopedQueue queue = new LoopedQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.print();

        System.out.println(queue.peek());
        queue.print();
        try {
            System.out.println(queue.pop());
            queue.print();
        } catch (EmptyQueueException qee) {
            qee.printStackTrace();
        }
    }
}
