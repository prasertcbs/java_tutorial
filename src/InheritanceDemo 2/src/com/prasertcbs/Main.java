package com.prasertcbs;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	    Student s1 = new Student();
        s1.setFirstName("Peter");
        s1.setLastName("Parker");
        s1.setGender("M");
        s1.setFaculty("Computer science");
        s1.setMajor("Security");
        s1.setDob(LocalDate.of(1995, Month.APRIL, 13));
        System.out.println("Age = " + s1.ageYears());

        Staff staff1 = new Staff();
        staff1.setFirstName("Mike");
        staff1.setLastName("Taylor");
        staff1.setOfficeLocation("223/1");
        staff1.setPosition("Accountant");
        staff1.setDob(LocalDate.of(1990, Month.DECEMBER, 20));
        System.out.println("Age = " + staff1.ageYears());
    }
}
