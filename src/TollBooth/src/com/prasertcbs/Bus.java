package com.prasertcbs;

/**
 * Created by prasert on 10/19/2014.
 */
public class Bus implements Vehicle {
    @Override
    public int cashRate() {
        return 100;
    }

    @Override
    public int ePassRate() {
        return 90;
    }
}
