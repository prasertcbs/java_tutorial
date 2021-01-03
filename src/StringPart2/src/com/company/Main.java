package com.company;

public class Main {

    public static void demo1() {
        String s1 = "Rain";
        String s2 = "bow";
        String s3 = "Over the " + s1 + s2;
        System.out.println(s3);
        System.out.println(s3.length());

        System.out.println(s3.substring(1, 4)); // (inclusive, exclusive)
        System.out.println(s3.toUpperCase());

        System.out.println();
        System.out.println(stringWithPosition(s3));
        System.out.println(s3.indexOf("t"));
    }

    public static String stringWithPosition(String s) {
        String pos = "";
        for (int i = 0; i < s.length(); i++) {
            pos += (i % 10);
        }
        return String.format("%s\n%s", pos, s);
    }

    public static void demoCompare() {
        String s1 = "apple";
        if (s1 == "apple") {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompare2() {
        String s1 = "apple";
        String s2 = "app";
        System.out.println(s2 + "le");
        if (s1 == (s2 + "le")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompare3() {
        String s1 = "apple";
        String s2 = "App";
        System.out.println(s2 + "le");
        if (s1.equalsIgnoreCase(s2 + "le")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompareTo() {
        String s1 = "apple";
        String s2 = "banana";
        System.out.println(s1.compareTo(s2));

        String s3 = "apple";
        System.out.println(s1.compareTo(s3));

        String s4 = "coconut";
        System.out.println(s4.compareTo(s1));
    }

    public static void main(String[] args) {
        demoCompareTo();
    }
}
