package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo() {
        Person p1 = new Person();
        Person p2 = new Person();
    }

    public static void demo2() {
        System.out.println(Word.search("water"));
        System.out.println(Word.search("Hello"));
        System.out.println(Word.search("1"));
    }
}
