package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class MainFileOS {
    public static void main(String[] args) {
        byte[] data = {11,0,34,56,11,23,90,2,88};
        try (OutputStream os = new FileOutputStream("test_fos.bin")) {
            os.write(data,0, data.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
