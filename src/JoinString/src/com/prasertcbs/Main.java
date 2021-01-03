package com.prasertcbs;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        //demo();
        //demo2();
        //demo3();
        demo4();
    }

    public static void demo() {
        // join
        String s = String.join(" -> ", "over", "the", "rainbow");
        System.out.println(s);

        String[] fruits = {"apple", "banana", "coconut", "kiwi"};
        System.out.println(String.join(",", fruits));

        List<String> drinks = new ArrayList<String>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("coke");
        System.out.println(String.join(":", drinks));
    }

    public static void demo2() {
        // StringJoiner
        StringJoiner sj = new StringJoiner(";");
        sj.add("coffee");
        sj.add("tea");
        sj.add("coke")
                .add("fanta")
                .add("water");
        System.out.println("sj = " + sj);
    }

    public static void demo3() {
        StringJoiner sj = new StringJoiner(";", "[", "]");
        sj.add("coffee");
        sj.add("tea");
        sj.add("coke")
                .add("fanta")
                .add("water");
        System.out.println("sj = " + sj);
    }

    public static void demo4() {
        List<String> drinks = new ArrayList<String>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("coke");

        StringJoiner sj = new StringJoiner(";", "[", "]");
        //for (String drink : drinks) {
        //    sj.add(drink);
        //}

        //drinks.forEach(s->sj.add(encloseString(s, "\"")));
        drinks.forEach(s -> sj.add(encloseString(s, "<", ">")));
        System.out.println("sj = " + sj);
    }

    public static String encloseString(String s, String tag) {
        return encloseString(s, tag, tag);
    }

    public static String encloseString(String s, String tagLeft, String tagRight) {
        return tagLeft + s + tagRight;
    }
}
