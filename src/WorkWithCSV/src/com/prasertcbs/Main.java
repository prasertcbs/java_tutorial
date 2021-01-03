package com.prasertcbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Data source:
 * List of countries by research and development spending
 * http://en.wikipedia.org/wiki/List_of_countries_by_research_and_development_spending
 */
public class Main {

    public static void main(String[] args) {
        demoBufferReader();
//        testSplit();
    }

    public static void testSplit() {
        String s = "United States,405.3,0.027";
        String[] data = s.split(",");
        System.out.println(Arrays.toString(data));
        System.out.println(data[0]);
        System.out.println(data[1]); // "405.3" string
        float amount = Float.parseFloat(data[1]);
        System.out.printf("%.2f", amount);

    }
    public static void demoBufferReader() {
        float total = 0.0f;
        try {
            BufferedReader r = new BufferedReader(new FileReader("research.txt"));
            String s = "";
            while ((s = r.readLine()) != null) {
                String[] data = s.split("\\|"); // regex: regular expression
                total = total + Float.parseFloat(data[1]);
//                System.out.println(s);
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("total research and development (Billion US$) = %.2f", total);
    }
}
