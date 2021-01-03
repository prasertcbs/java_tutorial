package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
        demo3();
    }

    public static void demo() {
        Person p1 = new Person();
        p1.setFirstName("Peter");
        p1.setLastName("Parker");
        p1.setGender("M");
        p1.setNickName("Pete");
    }

    public static void demo2() {
        Person p2 = new Person("peTEr", "Parker", "Pete", "M");
        System.out.println(p2.getFirstName());
    }

    public static void demo3() {
        Person p3 = new Person("peTEr", "pete");
        System.out.println(p3.getFirstName());
        p3.setFirstName("abCDEf");
        System.out.println(p3.getFirstName());
    }
}
