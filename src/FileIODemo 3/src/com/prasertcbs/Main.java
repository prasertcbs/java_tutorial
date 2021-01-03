package com.prasertcbs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        demoFileWriter();
//        demoFileReader();
//        System.out.println(unicodeTable(97, 122));
//        System.out.println(unicodeTable('a', 'z'));
        demoWriteUnicodeTable();
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
        try {
            FileWriter w = new FileWriter("unicodeTable3.txt");
            w.write(unicodeTable('ก', 'ฮ'));
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
}
