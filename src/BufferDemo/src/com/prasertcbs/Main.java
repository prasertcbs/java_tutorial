package com.prasertcbs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        System.out.println(unicodeTable('A', 'z'));
        demoFileWriter();
        demoBufferFileWriter();
    }

    public static void demoFileWriter() {
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try {
            FileWriter w = new FileWriter("output.txt");
            for (int i = 0; i < 2000; i++) {
                w.write(s);
            }
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("เวลาที่ใช้ไปทั้งสิ้น = %d\n", endTime - startTime);
    }

    public static void demoBufferFileWriter() {
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < 2000; i++) {
                w.write(s);
            }
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("เวลาที่ใช้ไปทั้งสิ้น (buffer) = %d", endTime - startTime);
    }

    public static String unicodeTable(int fromCode, int toCode) {
        StringBuilder sb = new StringBuilder();
        String ls = System.getProperty("line.separator");
        for (int i = fromCode; i <= toCode; i++) {
            sb.append(String.format("X%04X: %-4d: %c", i, i, i));
            sb.append(ls);
        }
        return sb.toString();
    }
}
