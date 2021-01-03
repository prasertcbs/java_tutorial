package com.company;

public class Main {


    public static void demo1() {
        for (int i=1;i<=5;i++) { // i=i+1
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("bye");
    }


    public static void demo2() {
        for (int i=1;i<=10;i+=2) {
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("bye");
    }

    public static void demo3() {
        for (int i=10;i>=1;i--) {
            System.out.println(i);
            System.out.println("----");
        }
        System.out.println("bye");
    }

    public static void sum1() {
        int result = 0;
        for (int i=1;i<=3;i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    public static int sum(int fromNum, int toNum) {
        int result = 0;
        for (int i=fromNum;i<=toNum;i++) {
            result = result + i;
        }
        return result;
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    public static void printChar() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%c", c);
        }
    }

    public static void printCharBetter(char fromCh, char toCh) {
        for (char c = fromCh; c <= toCh; c++) {
            System.out.printf("%d %04X %c\n", (int)c, (int)c, c);
        }
    }

    public static void printChar2() {
        for (int c = 65; c <= 90; c++) {
            System.out.printf("%d -> %c\n", c, (char)c);
        }
    }

    public static void main(String[] args) {
//        printCharBetter('A', 'Z');
        printCharBetter('ก', 'ฮ');
//        printChar2();
//        multiplicationTable(5);
//        System.out.println(sum(8,10));
        // write your code here
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
    }
}
