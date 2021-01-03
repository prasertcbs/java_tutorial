package com.company;

import java.util.Scanner;

public class Main {

    public static void demo() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void demoFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        int i = 1;
//        while (i<=10) {
//            System.out.println(i);
//            i++;
//        }
    }

    public static void demo2() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // 100 5% -> 200
    // 100 * 1.05 = 105
    // 105 * 1.05 => 200
    //

    public static void saving() {
        float deposit = 100.0f;
        float rate = .05f;
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= 200.0f) {
            System.out.printf("end of year: %d balance = %.2f\n", years, balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.printf("end of year: %d balance = %.2f\n", years, balance);
    }

    public static int saving2(float deposit, float rate, float targetAmount) {
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= targetAmount) {
            System.out.printf("end of year: %d balance = %.2f\n", years, balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.printf("end of year: %d balance = %.2f\n", years, balance);
        return years;
    }

    public static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = 0;
        int result = 0;
        // 2 3 4 -1
        while (n != -1) {
            result += n;
            n = in.nextInt();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        sum();
//        int n = saving2(100.0f, .05f, 150.0f);
//        System.out.printf("years needed = %d", n);
//        saving();
        // write your code here
//
//     demo2();
    }
}
