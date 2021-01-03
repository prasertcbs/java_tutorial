package com.prasertcbs;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        createData();
        displayData();
        sortByAge();
        sortIgnoreYear();
        sortIgnoreYearFromToday();
    }

    public static void createData() {
        persons.add(new Person("Peter", LocalDate.of(1995, Month.JULY, 14)));
        persons.add(new Person("Bruce", LocalDate.of(1990, Month.JULY, 20)));
        persons.add(new Person("Linda", LocalDate.of(2000, Month.JANUARY, 15)));
        persons.add(new Person("Johny", LocalDate.of(2000, Month.FEBRUARY, 14)));
        persons.add(new Person("Cider", LocalDate.of(1980, Month.DECEMBER, 28)));
        persons.add(new Person("Cindy", LocalDate.of(1984, Month.OCTOBER, 20)));
        persons.add(new Person("Jenny", LocalDate.of(1999, Month.DECEMBER, 10)));
        persons.add(new Person("Clark", LocalDate.of(1985, Month.NOVEMBER, 18)));
    }

    public static void displayData() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void sortByAge() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDob().compareTo(o2.getDob());
            }
        });
        System.out.println("----------- sorted by age ----------");
        displayData();
    }

    public static void sortIgnoreYear() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDobIgnoreYear().compareTo(o2.getDobIgnoreYear());
            }
        });
        System.out.println("---------- sorted by age (IGNORE year) ----------");
        displayData();
    }

    public static void sortIgnoreYearFromToday() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDobIgnoreYearFromToday().compareTo(o2.getDobIgnoreYearFromToday());
            }
        });
        System.out.println("---------- sorted by age (IGNORE year from Today) ----------");
        displayData();
    }
}
