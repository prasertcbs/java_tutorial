package com.prasertcbs;

import java.text.DecimalFormat;

// see more: http://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
public class Main {

    public static void main(String[] args) {
        demo();
        //demoPercent();
    }

    public static void demo() {
        double number = 1239700.3467;
        DecimalFormat df = new DecimalFormat("#,##0.00' Baht';(#,##0.00)' B'");
        System.out.println(df.format(number));
        System.out.println(df.format(-number));
    }

    public static void demoPercent() {
        double number = .04673;
        DecimalFormat df = new DecimalFormat(".00##%");
        System.out.println(df.format(number));
    }
}
