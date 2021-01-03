package com.prasertcbs;

/**
 * Created by prasert on 11/9/2014.
 */
public class PlatinumCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * 0.10f;
    }
}
