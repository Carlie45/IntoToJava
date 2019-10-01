package com.edynamix.learning.intro_to_java.chapter16.task6;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private static Queue<String> queue = new LinkedList<>();

    public static void findAllSubdirectories() {
        while(!queue.isEmpty()) {
            String path = queue.poll();
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
                queue.add(directory.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        String rootPath = ".\\src\\com\\edynamix\\learning\\intro_to_java";
        queue.add(rootPath);
        findAllSubdirectories();
    }

}
