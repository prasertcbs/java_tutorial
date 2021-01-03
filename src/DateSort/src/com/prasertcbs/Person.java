package com.prasertcbs;

import java.time.LocalDate;

/**
 * Created by prasert on 11/26/2014.
 */
public class Person {
    private String    name;
    private LocalDate dob;

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDobIgnoreYear() {
        return LocalDate.of(LocalDate.now().getYear(), getDob().getMonth(), getDob().getDayOfMonth());
    }

    public LocalDate getDobIgnoreYearFromToday() {
        if (getDobIgnoreYear().isBefore(LocalDate.now())) {
            return LocalDate.of(LocalDate.now().getYear() + 1,
                                getDob().getMonth(),
                                getDob().getDayOfMonth());
        } else {
            return LocalDate.of(LocalDate.now().getYear(),
                                getDob().getMonth(),
                                getDob().getDayOfMonth());
        }
    }
}
