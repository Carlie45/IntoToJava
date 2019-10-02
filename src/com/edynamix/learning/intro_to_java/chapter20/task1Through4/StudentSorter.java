package com.edynamix.learning.intro_to_java.chapter20.task1Through4;

import java.util.Arrays;

public class StudentSorter {

    private static Student[] students;

    public static void main(String[] args) {
         students = new Student[10];
         for (int i = 0; i < 10; i++) {
             students[i] = new Student("", "", Math.random() * 4 + 2);
         }

         Arrays.sort(students);
         for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
         }
    }

}
