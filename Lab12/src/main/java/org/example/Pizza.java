package org.example;

public class Pizza extends FoodItem {
    private String toppings;

    public Pizza(String name, int id, double calories, String toppings) {
        super(name, id, calories);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return super.toString() + ", Начинка: " + toppings;
    }
}