package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String s = "sunflower";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,7));
//
//        System.out.println(SimpleAdd.add(1.2, 3));
//        System.out.println(SimpleAdd.add(1.2f, 3.3f));
//        System.out.println(SimpleAdd.add(1.2f, 3.3));
//        System.out.println(SimpleAdd.add(1.2f, 3.3, 5));

        System.out.println(DiscountCalc.discount(100f));
        System.out.println(DiscountCalc.discount(100f, .1f));
        System.out.println(DiscountCalc.discount(100f, "VIP"));
    }
}
