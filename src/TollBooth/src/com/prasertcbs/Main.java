package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Sedan s = new Sedan();
        System.out.println(s.cashRate());

        Vehicle v = new Sedan(); // using an Interface as a Type
        System.out.println(v.ePassRate());
    }
}
