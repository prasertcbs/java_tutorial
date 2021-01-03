package com.prasertcbs;

public class Main {

    public static void main(String[] args) {

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
    }

}
