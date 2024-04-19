package org.example;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File[] files = {new File(args[0]), new File(args[1])};
        // D:/JetBrains/IdeaProjects/IOStream2.0/test_writer2.log
        // D:/JetBrains/IdeaProjects/IOStream2.0/test_writer.log
        // fileResult.log
        String fileResult = args[2];
        try (Writer fw = new FileWriter(fileResult, true)) {
            for (int i = 0; i < 2; i++) {
                Scanner scanner = new Scanner(files[i]);
                while (scanner.hasNext()) {
                    String string = scanner.next() + "\n";
                    fw.write(string);
                }
                fw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
