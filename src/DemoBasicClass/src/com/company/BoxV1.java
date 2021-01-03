package com.company;

/**
 * Created by prasert on 5/10/2014.
 */
public class BoxV1 {
    public double w, h, d;  // access modifier
    // data + method

    public double volume() {
        return w * h * d;
    }

    public double surfaceArea() {
        return (2.0 * w * h) + (2.0 * w * d) + (2.0 * d * h);
    }
}
