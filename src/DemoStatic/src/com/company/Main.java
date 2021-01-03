package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // static method
        // pow -> static method
//        Math m = new Math();
//        m.pow(2.0, 10.0);
        System.out.println(Math.pow(2.0, 10.0));
        System.out.println(Utils.capitalizedFirstChar("bangKOK"));
//        Utils u = new Utils();
//        System.out.println(u.capitalizedFirstChar("thailAND"));

        System.out.println(Utils.removeAllNonNumeric("AB129-123.75"));

        System.out.println(Utils.vatRate);
    }
}
