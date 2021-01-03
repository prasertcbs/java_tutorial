package com.prasertcbs;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(RandomUtils.nextInt(1, 7));
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(passwordGen(5));

        }
    }

    public static String passwordGen(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
