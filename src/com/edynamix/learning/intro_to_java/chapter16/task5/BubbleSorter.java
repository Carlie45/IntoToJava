package com.edynamix.learning.intro_to_java.chapter16.task5;

import com.edynamix.learning.intro_to_java.chapter16.task1.DynamicList;
import com.edynamix.learning.intro_to_java.chapter16.task1.Node;

public class BubbleSorter {

    public void sort(DynamicList list) {
        Node head = list.elemAt(0);

        while(head != null) {
            Node current = list.elemAt(0);
            while(current != null) {
                if (current.next == null) {
                    break;
                }

                if ((int) current.elem > (int) current.next.elem) {
                     int temp = (int) current.elem;
                     current.elem = (int) current.next.elem;
                     current.next.elem = temp;
                }
                current = current.next;
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        BubbleSorter sorter = new BubbleSorter();
        DynamicList list = new DynamicList();
        list.add(1);
        list.add(5);
        list.add(-1);
        list.add(4);
        list.add(3);
        list.printList();

        sorter.sort(list);
        list.printList();
    }
}
