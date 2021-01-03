package com.company;

public class Main {

    public static void demo1() {
        Contact p1 = new Contact();
        p1.setFirstName("petEr"); // Peter
        p1.setLastName("PARKER"); // Parker
        p1.setPhoneNumber("(08)-1456-7890"); // 0814567890
        // 08 1456 7890
        // 081 456 7890

        System.out.println(p1);
        System.out.println(p1.prettyFormatPhoneNumber());

        Contact p2 = new Contact("bruce", "wAyNe", "022181234");
        System.out.println("p2 = " + p2);
        System.out.println(p2.getPhoneNumber());


    }

    public static void main(String[] args) {
        demo1();
    }
}
