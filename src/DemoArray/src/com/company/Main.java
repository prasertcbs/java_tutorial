package com.company;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Main {
    public static void demo1() {
        int score1, score2, score3, score4, score5;
        score1 = 10;
        score2 = 15;
        score3 = 20;
        score4 = 25;
        score5 = 30;
        int sum = score1 + score2 + score3 + score4 + score5;
        System.out.println(sum);

        int[] scores = new int[6]; // 0 - 4
        scores[0] = 10;
        scores[1] = 15;
        scores[2] = 20;
        scores[3] = 25;
        scores[4] = 30;
        scores[5] = 100;
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void demo2() {
        int[] scores = {10, 15, 20, 25, 30, 100};
        int sum2 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum2 = sum2 + scores[i];
        }
        System.out.println(sum2);
    }

    public static void demo3() {
        String[] coffee = {"Mocha", "Espresso"};
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i]);
        }
    }

    public static void demo4() {
        String[] provinces = {"กรุงเทพ", "เชียงใหม่", "ภูเก็ต", "ขอนแก่น"};
        String[] abbr = {"กทม", "ชม", "ภก", "ขก"};

        String[][] provinces2 = new String[4][2];
        provinces2[0][0] = "กรุงเทพ";
        provinces2[0][1] = "กทม";
        provinces2[1][0] = "เชียงใหม่";
        provinces2[1][1] = "ชม";
        provinces2[2][0] = "ภูเก็ต";
        provinces2[2][1] = "ภก";
        provinces2[3][0] = "ขอนแก่น";
        provinces2[3][1] = "ขก";

        String[][] provinces3 = {
                {"กรุงเทพ", "กทม"}, // 0
                {"เชียงใหม่", "ชม"}, // 1
                {"ภูเก็ต", "ภก", "Phuket"}, // 2
                {"ขอนแก่น", "ขก"} // 3
        };
        for (int i = 0; i < provinces3.length; i++) { // 4 rows
            for (int j = 0; j < provinces3[i].length; j++) { //2 columns
                System.out.printf("provinces3[%d][%d] = %s\n", i, j, provinces3[i][j]);
            }
        }
    }

    public static void demoSortNumber() {
        int[] n = {28, 32, 55, 9, 40};
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
    }

    public static void demoSortString() {
        String[] coffees = {"Mocha", "Latte", "Espresso", "cappuccino"};
        System.out.println("before----");
        System.out.println(Arrays.toString(coffees));

        System.out.println("after----");
//        Arrays.sort(coffees);
        Arrays.sort(coffees, 0, coffees.length, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(coffees));
    }

    public static void demoSortThai() {
        String[] provinces = {"ชลบุรี", "เชียงใหม่", "ชัยนาท", "กรุงเทพ", "เลย", "ลพบุรี", "ลำปาง"};
        System.out.println("---unsorted---");
        System.out.println(Arrays.toString(provinces));
        System.out.println("---sorted---");
        Arrays.sort(provinces);
        System.out.println(Arrays.toString(provinces));
    }

    public static void demoSortThaiDictionary() {
        String[] provinces = {"ชลบุรี", "เชียงใหม่", "ชัยนาท", "กรุงเทพ", "เลย", "ลพบุรี", "ลำปาง"};
        System.out.println("---unsorted---");
        System.out.println(Arrays.toString(provinces));

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Collator coll = Collator.getInstance(new Locale("th", "TH"));
                return coll.compare(o1, o2);
            }
        };

        System.out.println("---sorted---");
        Arrays.sort(provinces);
        System.out.println(Arrays.toString(provinces));

        System.out.println("-- sorted order as in dictionary");
        Arrays.sort(provinces, cmp);
        System.out.println(Arrays.toString(provinces));
    }

    public static void demoT1(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * 10;
        }
    }

    public static void t1() {
        int[] n = {2, 4, 6, 8};
        System.out.println(Arrays.toString(n));
        demoT1(n);
        System.out.println(Arrays.toString(n));
    }

    public static void demoT2(int x) {
        x = x * 10;
    }

    public static void t2() {
        int n = 10;
        demoT2(n);
        System.out.println(n);
    }

    public static void demoT3(String s) {
        s = "Spiderman";
    }

    public static void t3() {
        String name = "Peter Parker";
        demoT3(name);
        System.out.println(name);
    }

    public static void demoT4(String s[]) {
        s[0] = "Spiderman";
    }

    public static void t4() {
        String name[] = {"Peter Parker"};
        demoT4(name);
        System.out.println(name[0]);
    }

    public static void demoT5(String s[]) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toUpperCase();
        }
    }

    public static void t5() {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        demoT5(planets);
        System.out.println(Arrays.toString(planets));
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void testAddMatrix() {
        double[][] a = {
                {2, 3},
                {4, 5},
                {6, 7}
        };
        double[][] b = {
                {20, 30},
                {40, 50},
                {60, 70}
        };
        double c[][] = addMatrix(a, b);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.printf("c[%d][%d] = %.2f\n", i,j, c[i][j]);
//            }
//        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
    }
    public static void main(String[] args) {
//        demoSortString();
//        demoSortThaiDictionary();
//        t1();
//        t2();
//        t3();
//        t4();
//        t5();
        testAddMatrix();
    }
}
