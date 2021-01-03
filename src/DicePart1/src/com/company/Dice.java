package com.company;

import java.util.Random;

/**
 * Created by prasert on 5/13/2014.
 */
public class Dice {

    private int[] freqs = new int[6]; // 0-5

    public int[] getFreqs() {
        return freqs;
    }

    public int roll() {
        // random between 1-6
        Random r = new Random();
        int face =  r.nextInt(6) + 1; // 0 - 5
//        freqs[face - 1] = freqs[face -1] + 1;
        freqs[face - 1] += 1;
        return face;
    }
}
