package com.prasertcbs;

import java.util.PriorityQueue;

public class Main {

    static PriorityQueue<Passenger> passengers = new PriorityQueue<Passenger>();

    public static void main(String[] args) {
        createData();
        pollData();
    }

    private static void createData() {
        passengers.offer(new Passenger("Peter", "ECONOMY"));
        passengers.offer(new Passenger("Linda", "BUSINESS"));
        passengers.offer(new Passenger("Cindy", "ECONOMY"));
        passengers.offer(new Passenger("Jenny", "FIRST"));
        passengers.offer(new Passenger("Clark", "ECONOMY"));
        passengers.offer(new Passenger("Bruce", "BUSINESS"));
        passengers.offer(new Passenger("Johny", "ECONOMY"));
        passengers.offer(new Passenger("Alex", "FIRST"));
        passengers.offer(new Passenger("Nick", "BUSINESS"));
        passengers.offer(new Passenger("Jack", "ECONOMY"));
    }

    private static void pollData() {
        int q = 0;
        while (!passengers.isEmpty()) {
            System.out.printf("queue #%d -> %s%n", ++q, passengers.poll());
        }
    }
}
