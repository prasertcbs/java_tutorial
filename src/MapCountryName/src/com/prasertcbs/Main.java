package com.prasertcbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        demo2();
        Map<String, Country> m = readCountry();
        Scanner in = new Scanner(System.in);
        System.out.print("please enter country code ");
        String s = "";
        while ((s = in.nextLine()).length() > 0) {
            System.out.println(m.get(s));
        }
    }

    public static void demo1() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("th", "Thailand");
    }

    public static void demo2() {
//        Map<String, Country> m = new HashMap<String, Country>();
//        m.put("th", new Country("ไทย", "Thailand"));
//        m.put("jp", new Country("ญี่ปุ่น", "Japan"));
//        m.put("cn", new Country("จีน", "China"));
//        System.out.println(m.get("jp"));
    }

    public static Map<String, Country> readCountry() {
        Map<String, Country> m = new HashMap<String, Country>();
        try {
            BufferedReader r = new BufferedReader(new FileReader("country.csv"));
            String s = "";
            while ((s = r.readLine()) != null) {
                String[] data = s.split("\\|"); // regex: regular expression
                m.put(data[0], new Country(data[1], data[2], data[3]));
//                System.out.printf("%s %s %s %s%n", data[0], data[1], data[2], data[3]);
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }
}
