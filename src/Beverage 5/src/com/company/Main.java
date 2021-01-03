package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        demoArrayList1();
//        demoArray();
//        demoSortString();
//        demoNaturalOrderSort();
//        demoJava8Sort();
//        demoSimpleArrayList();
        advArrayList();
    }

    public static void demoSimpleArrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana"); // 0
        fruits.add("orange"); // 1
        fruits.add("kiwi"); // 2

        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.contains("kiwi"));
        fruits.add(1, "coconut");
        System.out.println(fruits.toString());
        System.out.println(fruits.get(2));
        fruits.add(0, "apple");
        System.out.println(fruits.toString());
fruits.set(1, "mango");
        System.out.println(fruits.toString());
    }

    public static void advArrayList() {
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

        Drink m = new Drink("Lemon", "Juice", 99);

        System.out.println(menus.contains(m));


    }

    public static void demoArray() {
        Drink[] menus = new Drink[10];
        menus[0] = new Drink("orange", "Juice", 40);
        menus[1] = new Drink("Apple", "Juice", 45);
//        menus[10] = new Drink("Green tea", "Tea", 40);
        for (int i = 0; i <= 10; i++) {
            System.out.println(menus[i]);
        }
    }

    public static void demoArrayList1() {
        ArrayList<Drink> menus = createDrinkData();

//        Comparator<Drink> cmpPrice = new Comparator<Drink>() {
//            @Override
//            public int compare(Drink o1, Drink o2) {
//                return o1.getPrice() - o2.getPrice();
//            }
//        };
//        Collections.sort(menus, cmpPrice);

        Collections.sort(menus, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return -(o1.getPrice() - o2.getPrice());
            }
        });
//        System.out.println(menus.get(3));
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }

    private static ArrayList<Drink> createDrinkData() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("Coke", "Soda", 25));
        menus.add(new Drink("Sprite", "Soda", 25));
        menus.add(new Drink("Fanta", "Soda", 25));
        menus.add(new Drink("Latte", "Coffee", 70));
        menus.add(new Drink("Mocha", "Coffee", 80));
        menus.add(new Drink("Cappuccino", "Coffee", 90));
        menus.add(new Drink("Espresso", "Coffee", 65));
        menus.add(new Drink("Green tea", "Tea", 40));
        return menus;
    }

    public static void demoSortString() {
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

        Collections.sort(menus, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                if (o1.getCategory().equalsIgnoreCase(o2.getCategory())) {
                    return o1.getMenu().compareToIgnoreCase(o2.getMenu());
                } else {
                    return o1.getCategory().compareToIgnoreCase(o2.getCategory());
                }
//                return o1.getMenu().compareToIgnoreCase(o2.getMenu());
            }
        });
        System.out.println("----------------- sorted by menu -----");
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }

    public static void demoNaturalOrderSort() {
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

        Collections.sort(menus);
        System.out.println("----------------- sorted by menu -----");
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }

    public static void demoJava8Sort() {
        ArrayList<Drink> menus = createDrinkData();
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }

//        Collections.sort(menus, new Comparator<Drink>() {
//            @Override
//            public int compare(Drink o1, Drink o2) {
//                return o1.getPrice() - o2.getPrice();
//            }
//        });

//        menus.sort(Comparator.comparing(Drink::getPrice).reversed()); // Java 8
        // (method reference)

        menus.sort(Comparator.comparing(Drink::getPrice).thenComparing
                (Drink::getMenu));
        System.out.println("----------------- sorted -----");
        for (Drink menu : menus) {
            System.out.println(menu.toString());
        }
    }
}
