package com.prasertcbs;

/**
 * Created by prasert on 11/19/2014.
 */
public class Drink implements Comparable<Drink> {
    private String menu;
    private float price;

    public Drink(String menu, float price) {
        this.menu = menu;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Drink drink = (Drink) o;

        if (Float.compare(drink.price, price) != 0) {
            return false;
        }
        if (!menu.toUpperCase().equals(drink.menu.toUpperCase())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = menu.toUpperCase().hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
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

    @Override
    public int compareTo(Drink o) {
        return -Float.compare(this.getPrice(), o.getPrice());
        //return this.getMenu().compareToIgnoreCase(o.getMenu());
    }
}
