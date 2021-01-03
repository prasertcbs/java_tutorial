package com.prasertcbs;

/**
 * Created by prasert on 11/10/2014.
 */
public class Person {

    private String firstName, lastName;

    static {
        System.out.println("Static initializer was called.");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        System.out.println("Person constructor was called.");
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
}
