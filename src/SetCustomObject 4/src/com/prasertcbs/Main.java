package com.prasertcbs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        demoTreeSet2();
    }

    public static void demoTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("mango");
        set.add("coconut");
        set.add("apple");
        set.add("kiwi");
        System.out.println(set);
    }

    public static void demoTreeSet2() {
        //Set<Drink> set = new TreeSet<>();

        //Set<Drink> set = new TreeSet<>(new Comparator<Drink>() {
        //    @Override
        //    public int compare(Drink o1, Drink o2) {
        //        return o1.getMenu().compareToIgnoreCase(o2.getMenu());
        //    }
        //});

        Comparator<Drink> cmp = new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return o1.getMenu().compareToIgnoreCase(o2.getMenu());
            }
        };

        //Set<Drink> set = new TreeSet<>(cmp);
        Set<Drink> set = new TreeSet<>(Drink.byNameDescending());

        set.add(new Drink("mango", 40f));
        set.add(new Drink("Coconut", 50f));
        set.add(new Drink("apple", 60f));
        set.add(new Drink("kiwi", 70f));
        for (Drink drink : set) {
            System.out.printf("%s%n", drink);
        }
    }

    public static void demo1() {
        Set<String> set = new LinkedHashSet<>(); // maintain order
        set.add("mango");
        set.add("orange");
        set.add("apple");
        set.add("mango");
        System.out.println("before -> " + set);

        String s = "apple";
        if (set.contains(s)) {
            System.out.printf("%s is in the set.\n", s);
            set.remove(s);
        } else {
            System.out.printf("%s is not in the set.\n", s);
        }
        System.out.println("after  -> " + set);
    }

    public static void demoCustomObject() {
        Set<Drink> set = new LinkedHashSet<>();
        set.add(new Drink("mango", 40f));
        set.add(new Drink("orange", 45f));
        set.add(new Drink("apple", 50f));
        set.add(new Drink("Mango", 49f));

        for (Drink drink : set) {
            System.out.printf("%s -> %s%n", drink.getMenu(), drink.getMenu().hashCode());
        }

        Drink d = new Drink("apple", 50f);
        if (set.contains(d)) {
            System.out.printf("%s is in the set.%n", d);
        } else {
            System.out.printf("%s is NOT in the set.%n", d);
        }

        set.remove(d);
        for (Drink drink : set) {
            System.out.printf("%s%n", drink);
        }
    }
}
