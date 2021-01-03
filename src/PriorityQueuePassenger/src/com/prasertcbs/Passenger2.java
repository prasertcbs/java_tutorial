package com.prasertcbs;

/**
 * Created by prasert on 12/5/2014.
 */
public class Passenger2 implements Comparable<Passenger2> {
    private String name;
    private TicketType ticketType; // enum

    public Passenger2(String name, TicketType ticketType) {
        this.name = name;
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Passenger2{" +
                "name='" + name + '\'' +
                ", ticketType=" + ticketType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public int compareTo(Passenger2 o) {
        return this.getTicketType().compareTo(o.getTicketType());
    }
}
