package com.prasertcbs;

/**
 * Created by prasert on 10/19/2014.
 */
public class Truck implements Vehicle {
    @Override
    public int cashRate() {
        return 80;
    }

    @Override
    public int ePassRate() {
        return 70;
    }
}
