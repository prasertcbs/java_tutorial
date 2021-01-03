package com.prasertcbs;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by prasert on 10/15/2014.
 */

// parent class, superclass
public abstract class Person {

    private String firstName, lastName;
    private String gender; // [M]ale; [F]emale
    private LocalDate dob;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int ageYears() {
        Period p = Period.between(dob, LocalDate.now());
        return p.getYears();
    }
}
