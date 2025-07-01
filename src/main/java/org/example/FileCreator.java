package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    private static final String HELLO_WORLD_CODE =
            """
                    public class joke {
                        public static void main(String[] args) {
                            System.out.println("Hello, World!");
                        }
                    }""";

    public static void createNewFile(String folderPath) throws IOException {
        deployFilesRecursively(new File(folderPath));
    }

    public static boolean validatePath(String folderPath) {
        File file = new File(folderPath);
        return file.exists() && file.isDirectory();
    }

    private static void deployFilesRecursively(File directory) throws IOException {
        File[] subDirectories = directory.listFiles(File::isDirectory);
        if (subDirectories != null && subDirectories.length > 0) {
            for (File file : subDirectories) {
                deployFilesRecursively(file);
                System.out.println(file);
            }
        } else {
            File jokeFile = new File(directory, "joke.java");
            if (jokeFile.createNewFile()) {
                try (FileWriter writer = new FileWriter(jokeFile)) {
                    writer.write(HELLO_WORLD_CODE);
                }
            }
        }
    }
}
