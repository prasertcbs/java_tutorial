package com.prasertcbs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Drink> menus = new ArrayList<>();

    public static void main(String[] args) {
        createData();
        displayData();
    }

    public static void createData() {
        menus.add(new Drink("orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("Coke", "Soda", 25));
        menus.add(new Drink("Sprite", "Soda", 25));
        menus.add(new Drink("Fanta", "Soda", 25));
        menus.add(new Drink("Latte", "Coffee", 70));
        menus.add(new Drink("Mocha", "Coffee", 80));
        menus.add(new Drink("Cappuccino", "Coffee", 90));
        menus.add(new Drink("Espresso", "Coffee", 120));
    }

    public static void displayData() {
        String s = "";
        int cnt = 0;
        for (Drink menu : menus) {
            //System.out.printf("%s %s %d%n", menu.getMenu(), menu.getCategory(), menu.getPrice());
            s += String.format("%03d: %-15s %-7s %3d%n", ++cnt,
                          menu.getMenu(), menu.getCategory(), menu.getPrice());
            //System.out.printf("%03d: %-15s %-7s %3d%n", ++cnt,
            //                  menu.getMenu(), menu.getCategory(), menu.getPrice());
        }
        System.out.println(s);
    }
}
