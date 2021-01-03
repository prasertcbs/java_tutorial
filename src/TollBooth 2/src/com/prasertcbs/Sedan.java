package com.prasertcbs;

/**
 * Created by prasert on 10/19/2014.
 */
public class Sedan implements Vehicle {
    @Override
    public int cashRate() {
        return 40;
    }

    @Override
    public int ePassRate() {
        return 35;
    }
}
