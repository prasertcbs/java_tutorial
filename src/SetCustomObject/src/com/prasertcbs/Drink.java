package com.prasertcbs;

/**
 * Created by prasert on 11/19/2014.
 */
public class Drink {
    private String menu;
    private float price;

    public Drink(String menu, float price) {
        this.menu = menu;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "menu='" + menu + '\'' +
                ", price=" + price +
                '}';
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
