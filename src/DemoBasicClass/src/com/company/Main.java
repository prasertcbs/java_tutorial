package com.company;

public class Main {

    public static void main(String[] args) {
        BoxV1 aBox = new BoxV1();
        BoxV2 aBox2 = new BoxV2(400, 10, 6);
//        aBox2.setD(10.0);
//        aBox2.setW(5.0);
//        aBox2.setH(7.0);
        System.out.println(aBox2.volume());
        System.out.println(aBox2.surfaceArea());

        if (aBox2.getW() > 100.0) {
            System.out.println("กล่องขนาดใหญ่เป็นพิเศษ");
        }

        System.out.println(aBox2);
        System.out.println(aBox2.toString());
        // write your code here
        BoxV2 aBox2a = new BoxV2();
    }
}
