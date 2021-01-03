package com.prasertcbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NatoPhonetic.displayNatoPhoneticTable();
//        System.out.println(NatoPhonetic.toPhonetic("java:101"));
//        demo();
    }

    public static void demo() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter data (blank line to exit): ");
        String s = "";
        while ((s = in.nextLine()).length() > 0) {
            System.out.println(NatoPhonetic.toPhonetic(s));
            System.out.print("enter data (blank line to exit): ");
        }
    }
}
