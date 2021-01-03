package com.prasertcbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
//        demoFileReader();
        demoBufferReader();
    }

    public static void demoFileReader() {
        try {
            FileReader r = new FileReader("country.txt");
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

    public static void demoBufferReader() {
        try {
            BufferedReader r = new BufferedReader(new FileReader("country.txt"));
//            int data;
//            while ((data = r.read()) != -1) {
//                System.out.printf("%c", data);
//            }
            String s;
            while ((s = r.readLine()) != null) {
                System.out.println(s);
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoBufferReader2() {
        try (BufferedReader r = new BufferedReader(new FileReader("country.txt"))) {
//            int data;
//            while ((data = r.read()) != -1) {
//                System.out.printf("%c", data);
//            }
            String s;
            while ((s = r.readLine()) != null) {
                System.out.println(s);
            }
//            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoBufferReader3() {
        try (BufferedReader r = Files.newBufferedReader(Paths.get("country.txt"))) {
//            int data;
//            while ((data = r.read()) != -1) {
//                System.out.printf("%c", data);
//            }
            String s;
            while ((s = r.readLine()) != null) {
                System.out.println(s);
            }
//            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
