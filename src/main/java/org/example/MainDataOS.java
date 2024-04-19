package org.example;

import java.io.*;

public class MainDataOS {//+ buffered os and printer is more flexible because it has the same methods but also println print and printf
    public static void main(String[] args) {
        int[] data = {11, 0, 34, 56, 11, 23, 90, 2, 88};
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test_fos.bin")))) {
            // os.write(data,0, data.length);
            for (int n : data) {
                os.writeInt(n);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
