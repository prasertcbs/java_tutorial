package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
        //mTable(20);
        //sqrtTable(1,50);
        demo();
    }

    public static void mTable(int n) {
        for (int i = 1; i <= 12; i++) {
            //System.out.printf("%d x %d = %d%n", n, i, n*i);
            System.out.printf("%2d x %2d = %3d%n", n, i, n*i);
        }
    }

    public static void sqrtTable(int fromN, int toN) {
        for (int i = fromN; i <= toN; i++) {
            System.out.printf("%3d %.4f%n", i, Math.sqrt(i));
        }
    }

    public static void demo() {
        double d = 1234600.7865;
        System.out.printf("%.2f%n%15.2f%n%,15.2f%n", d, d,d);
    }
}
