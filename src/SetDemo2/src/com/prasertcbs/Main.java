package com.prasertcbs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        unionDemo2();
//        intersectionDemo();
        differenceDemo();
    }

    public static void unionDemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        setA.addAll(setB);

        System.out.printf("setA = %s%n", setA);

    }

    public static void unionDemo2() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);

        System.out.printf("setC = %s%n", setC);

    }

    public static void intersectionDemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>(setA);
        setC.retainAll(setB);

        System.out.printf("setC = %s%n", setC);

    }

    public static void differenceDemo() {
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> setB = new HashSet<>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.printf("setA = %s%n", setA);
        System.out.printf("setB = %s%n", setB);

        Set<String> setC = new HashSet<>(setA);
        setC.removeAll(setB);

        System.out.printf("setC = %s%n", setC);

    }
}
