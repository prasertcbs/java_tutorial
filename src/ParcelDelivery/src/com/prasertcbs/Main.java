package com.prasertcbs;

import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    static Stack<Parcel> st = new Stack<>();

    public static void main(String[] args) {
        createData();
    }

    public static void createData() {
        Set<Parcel> p = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            p.add(new Parcel("parcel #" + i, randomBetween(1, 30)));
        }

        for (Parcel parcel : p) {
            System.out.println(parcel);
        }

        System.out.println(" ------------- ");
        for (Parcel parcel : p) {
            st.push(parcel);
        }

        while (!st.empty()) {
            System.out.println("delivering ... " + st.peek());
            st.pop();
        }
    }

    public static int randomBetween(int fromNumber, int toNumber) {
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
    }
}
