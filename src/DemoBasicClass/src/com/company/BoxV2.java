package com.company;

/**
 * Created by prasert on 5/10/2014.
 */
public class BoxV2 {
    private double w, h, d;  // access modifier
    // data + method

    // getter, setter

    // Constructor
    public BoxV2(double w, double h, double d) {
//        this.w = w;
        setW(w);
        this.h = h;
        this.d = d;
    }

    // default constructor
    public BoxV2() {

    }

    // getter
    public double getW() {
        return w;
    }

    public void setW(double w) {
        if (w > 0.0) {
            this.w = w;
        } else {
            throw new IllegalArgumentException("ค่าความกว้างจะต้องมากกว่าศูนย์");
        }
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double volume() {
        return w * h * d;
    }

    public double surfaceArea() {
        return (2.0 * w * h) + (2.0 * w * d) + (2.0 * d * h);
    }

    // annotation
    @Override
    public String toString() {
//        return String.format("width = %.2f, height = %.2f, depth = %.2f", w, h, d);
        return String.format("Size %.2f x %.2f x %.2f, volume = %.2f",
                             w, h, d, volume());
    }
}
