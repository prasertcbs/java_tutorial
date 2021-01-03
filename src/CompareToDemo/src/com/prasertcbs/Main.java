package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
        compareString("apple", "banana");
        compareString("apple", "apple");
        compareString("coconut", "apple");

//        compareIntegerObject(5, 7);
//        compareIntegerObject(5, 5);
//        compareIntegerObject(7, 5);

//        compareIntegerPrimitive(5, 7);
//        compareIntegerPrimitive(5, 5);
//        compareIntegerPrimitive(7, 5);

        compareFloatPrimitive(7.5f, 5.12f);
        compareFloatPrimitive(7.5f, 7.5f);
        compareFloatPrimitive(5.12f, 7.5f);

    }

    public static void compareString(String a, String b) {
        System.out.printf("a = %s, b = %s, a.compareTo(b) = %d%n", a, b, a.compareTo(b));
    }

    public static void compareIntegerObject(Integer a, Integer b) {
        System.out.printf("a = %d, b = %d, a.compareTo(b) = %d%n", a, b, a.compareTo(b));
    }

    public static void compareIntegerPrimitive(int a, int b) {
        System.out.printf("a = %d, b = %d, a.compareTo(b) = %d%n", a, b,
                          Integer.valueOf(a).compareTo(Integer.valueOf(b)));

        System.out.printf("a = %d, b = %d, a - b = %d%n", a, b,
                          a - b);
    }

    public static void compareFloatPrimitive(float a, float b) {
        System.out.printf("a = %.2f, b = %.2f, a.compareTo(b) = %d%n", a, b,
                          Float.valueOf(a).compareTo(Float.valueOf(b)));
    }
}
