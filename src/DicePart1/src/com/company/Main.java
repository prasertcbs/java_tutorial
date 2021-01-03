package com.company;

public class Main {

    public static void main(String[] args) {
        Dice aDice = new Dice();
        for (int i = 0; i < 6; i++) {
            System.out.println(aDice.roll());
        }
//        aDice.getFreqs() = 20;
        for (int i = 0; i < aDice.getFreqs().length; i++) {
            System.out.printf("face %d occurs %d times\n", i+1, aDice.getFreqs()[i]);
        }
    }
}
