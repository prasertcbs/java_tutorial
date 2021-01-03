package com.prasertcbs;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        SilverCard c1 = new SilverCard();
        System.out.println(c1.discount(100f));

        GoldCard c2 = new GoldCard();
        System.out.println(c2.discount(100f));
    }

    public static void demo2() {
        MemberCard c1 = new SilverCard();
        System.out.println(c1.discount(100f));

        MemberCard c2 = new GoldCard();
        System.out.println(c2.discount(100f));
    }
}
