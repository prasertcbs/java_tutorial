package com.prasertcbs;

/**
 * Created by prasert on 10/16/2014.
 */
public class DiscountCalc {
    public static float discount(float amount) {
        return amount * .05f;
    }

    public static float discount(float amount, float pctDiscount) {
        return amount * pctDiscount;
    }

    public static float discount(float amount, String customerType) {
        float pctDiscount = 0.0f;
        switch (customerType.toUpperCase()) {
            case "VIP":
                pctDiscount = .2f;
                break;
            case "GOLD":
                pctDiscount = .1f;
                break;
            default:
                pctDiscount = .05f;
        }
//        return amount * pctDiscount;
        return discount(amount,pctDiscount);
    }
}
