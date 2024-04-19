package org.example;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("message.log")))) {
            int length = 12;
            os.writeInt(length);
            String message = "hello byebye";
            for (int i = 0; i < length; i++) {
                os.writeByte(message.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
