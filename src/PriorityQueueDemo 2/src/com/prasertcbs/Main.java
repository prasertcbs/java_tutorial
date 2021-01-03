package com.prasertcbs;

import java.util.PriorityQueue;

public class Main {

    static PriorityQueue<String> applicants = new PriorityQueue<>();

    public static void main(String[] args) {
        createData();
        pollQueue();
    }

    private static void pollQueue() {
        int q = 0;
        while (!applicants.isEmpty()) {
            System.out.printf("queue #%d -> %s%n", ++q, applicants.poll());
        }
    }

    private static void createData() {
        applicants.offer("Jack");
        applicants.offer("April");
        applicants.offer("Jill");
        applicants.offer("Bruce");
        applicants.offer("Zena");
        applicants.offer("Clark");
        applicants.offer("Linda");
    }
}
