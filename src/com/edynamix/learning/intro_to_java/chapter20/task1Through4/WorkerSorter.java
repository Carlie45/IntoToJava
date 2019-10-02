package com.edynamix.learning.intro_to_java.chapter20.task1Through4;

import java.util.Arrays;
import java.util.Comparator;

public class WorkerSorter {

    private static Worker[] workers;

    public static void main(String[] args) {
        workers = new Worker[10];
        for (int i = 0; i < 10; i++) {
            workers[i] = new Worker("", "", Math.random() * 1000, 1);
        }

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object worker1, Object worker2) {
                Worker firstWorker = (Worker) worker1;
                Worker secondWorker = (Worker) worker2;
                if (firstWorker.getSalary() - secondWorker.getSalary() > 0) {
                    return 1;
                } else if (firstWorker.getSalary() - secondWorker.getSalary() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(workers, comparator);
        for (int i = 0; i < 10; i++) {
            System.out.println(workers[i]);
        }
    }
}
