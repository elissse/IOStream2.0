package org.example;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        try (Reader is = new BufferedReader(new InputStreamReader(new FileInputStream("D:/JetBrains/IdeaProjects/IOStream2.0/message.log")))) {
            String message = "";
            int s;
            byte[] byteArray = new byte[4];
            for (int i = 0; i < 4; i++) {
                s = is.read();
                byteArray[i] = (byte) s;
            }
            int length = ((byteArray[0] & 0xFF) << 24) | ((byteArray[1] & 0xFF) << 16) | ((byteArray[2] & 0xFF) << 8) | (byteArray[3] & 0xFF);
            while ((s = is.read()) != -1) {
                message = message + (char) s;
            }
            System.out.println(length + " " + message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
