package com.prasertcbs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        demoFileWriter();
//        demoFileReader();
//        System.out.println(unicodeTable(97, 122));
//        System.out.println(unicodeTable('a', 'z'));
//        demoWriteUnicodeTable();
//        demoReadAll();
        demoReadLines();
    }


    public static void demoFileWriter() {
        try {
            FileWriter w = new FileWriter("c:/temp/output1.txt");
            w.write("hello");
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoWriteUnicodeTable() {
        System.out.println(System.getProperty("user.home"));
        File f = new File(System.getProperty("user.home"), "unicodeTable7.txt");
        System.out.println(f.getAbsoluteFile());
        if (f.exists()) {
            System.out.println("File is already existed.");
        }
        try {
            FileWriter w = new FileWriter(f);
            w.write(unicodeTable('A', 'Z'));
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public static void demoFileReader() {
        try {
            FileReader r = new FileReader("c:/temp/output1.txt");
            int data;
            while ((data = r.read()) != -1) {
                System.out.printf("%c", data);
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoReadAll() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("country.txt"));
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoReadLines() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("country.txt"));
            for (String line : lines) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
