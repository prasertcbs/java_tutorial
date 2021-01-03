package com.prasertcbs;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static Map<City, Temperature> m = new LinkedHashMap<>();

    public static void main(String[] args) {
        createData();
        displayData();
        findData(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 10)));
    }

    public static void createData() {
        m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 1)), new Temperature(33f, 30f));
        m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 2)), new Temperature(32f, 29.5f));
        m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 3)), new Temperature(31f, 28f));
        m.put(new City("bkk", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(33f, 27f));

        m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 1)), new Temperature(29f, 25f));
        m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 2)), new Temperature(28f, 24.5f));
        m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 3)), new Temperature(27f, 23f));
        m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(26f, 20f));
        m.put(new City("tak", LocalDate.of(2014, Month.NOVEMBER, 4)), new Temperature(26f, 20f));
    }

    public static void displayData() {
        for (Map.Entry<City, Temperature> item : m.entrySet()) {
            City key = item.getKey();
            Temperature value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }

    public static void findData(City city) {
        if (m.containsKey(city)) {
            System.out.printf("found: %s %s", city, m.get(city));
        } else {
            System.out.printf("unable to find %s", city);
        }
    }
}
