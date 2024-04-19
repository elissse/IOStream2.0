package org.example;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        try (Reader is = new BufferedReader(new InputStreamReader(new FileInputStream("D:/JetBrains/IdeaProjects/IOStream2.0/test_writer2.log")))) {
            Map<Character, Integer> symbols = new HashMap<>();
            int s;
            while ((s = is.read()) != -1) {
                if (!symbols.containsKey((char) s)) {
                    symbols.put((char) s, 1);
                } else {
                    symbols.put((char) s, symbols.get((char) s) + 1);
                }
            }
            symbols.entrySet().stream().map(map -> map.getKey() + " " + map.getValue()).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
