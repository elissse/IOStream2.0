package org.example;

import java.io.*;
import java.util.Scanner;

public class MainFileWriter {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("test_writer2.log", true)) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String string = scanner.next() + "\n";
                fw.write(string);
            }
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
