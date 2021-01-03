package com.prasertcbs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       demo3();
    }

    public static void demo1() {
        Set<String> setA = new HashSet<String>();
        setA.add("mango");
        setA.add("banana");
        setA.add("orange");
        setA.add("banana");

        System.out.printf("%s%n", setA);
    }

    public static void demo2() {
        Set<String> setA = new HashSet<String>(Arrays.asList("mango", "banana",
                                                             "orange", "banana"));
        System.out.printf("%s%n", setA);
    }

    public static void demo3() {
        List<String> fruits = new ArrayList<String>(Arrays.asList("mango", "banana",
                                                                  "orange", "banana"));
        Set<String> setA = new HashSet<String>(fruits);
        Set<String> setB = new LinkedHashSet<String>(fruits);
        Set<String> setC = new TreeSet<String>(fruits);

        System.out.printf("HashSet      : %s%n", setA);
        System.out.printf("LinkedHashSet: %s%n", setB);
        System.out.printf("TreeSet      : %s%n", setC);

    }
}
