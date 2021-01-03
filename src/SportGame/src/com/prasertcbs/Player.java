package com.prasertcbs;

import java.time.LocalDate;

/**
 * Created by prasert on 11/5/2014.
 */
public class Player {
    private String firstName, lastName, position;
    private LocalDate dob;

    public Player(String firstName, String lastName, String position, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dob = dob;
    }

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", dob=" + dob +
                '}';
    }
}
