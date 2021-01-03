package com.prasertcbs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        demoFileWriter();
        demoFileReader();
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
