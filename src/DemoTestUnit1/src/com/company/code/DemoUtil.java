package com.company.code;

/**
 * Created by prasert on 7/7/2016.
 */
public class DemoUtil {
    public static double circle(double r) {
        return Math.PI * r * r;
    }

    public static double promotion(int item, double pricePerItem) {
        double discountPercent = 0;
        if (item == 1) {
            discountPercent = .25;
        } else if (item == 2) {
            discountPercent = .30;
        } else if (item > 2 && item <=5) {
            discountPercent = .40;
        } else {
            discountPercent = .50;
        }
        return item * pricePerItem * (1 - discountPercent);
    }

    public static double comeXpayY(int come, int pay, double perHead, int pax) {
        return (pax / come) * (pay * perHead) + (pax % come) * perHead;
    }
    public static void main(String[] args) {
        System.out.println(promotion(1, 100));
        System.out.println(promotion(2, 100));
        System.out.println(promotion(3, 100));
        System.out.println(promotion(4, 100));
    }
}
