package com.edynamix.learning.intro_to_java.chapter16.task7;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayDeque;

public class DFS {

    private static ArrayDeque<String> stack = new ArrayDeque<>();

    public static void findAllSubdirectories() {
        while(!stack.isEmpty()) {
            String path = stack.pop();
            System.out.println(path);
            File file = new File(path);
            File[] directories = file.listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return file.isDirectory();
                }
            });

            if (directories == null) {
                continue;
            }
            for (File directory : directories) {
                stack.push(directory.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        String rootPath = ".\\src\\com\\edynamix\\learning\\intro_to_java";
        stack.add(rootPath);
        findAllSubdirectories();
    }
}
