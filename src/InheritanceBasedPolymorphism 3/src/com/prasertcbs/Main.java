package com.prasertcbs;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        demo3();
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

        MemberCard c3 = new PlatinumCard();
        System.out.println(c3.discount(100f));
    }

    public static void demo3() {
        MemberCardV2 c1 = new MemberCardV2();
        c1.setLevel("S");
        System.out.println(c1.discount(100f));

        MemberCardV2 c2 = new MemberCardV2();
        c2.setLevel("G");
        System.out.println(c2.discount(100f));

        MemberCardV2 c3 = new MemberCardV2();
        c3.setLevel("P");
        System.out.println(c3.discount(100f));
    }
}
