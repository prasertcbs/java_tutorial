package com.prasertcbs;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by prasert on 12/5/2014.
 */
public class Main2 {
    //static PriorityQueue<Passenger2> passengers = new PriorityQueue<Passenger2>();
    static PriorityQueue<Passenger2> passengers = new PriorityQueue<Passenger2>(
            Comparator.comparing(Passenger2::getName)
    );

    public static void main(String[] args) {
        createData();
        pollData();
    }

    private static void createData() {
        passengers.offer(new Passenger2("Peter", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Linda", TicketType.BUSINESS));
        passengers.offer(new Passenger2("Cindy", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Jenny", TicketType.FIRST));
        passengers.offer(new Passenger2("Clark", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Bruce", TicketType.BUSINESS));
        passengers.offer(new Passenger2("Johny", TicketType.ECONOMY));
        passengers.offer(new Passenger2("Alex", TicketType.FIRST));
        passengers.offer(new Passenger2("Nick", TicketType.BUSINESS));
        passengers.offer(new Passenger2("Jack", TicketType.ECONOMY));
    }

    private static void pollData() {
        int q = 0;
        while (!passengers.isEmpty()) {
            System.out.printf("queue #%d -> %s%n", ++q, passengers.poll());
        }
    }
}
