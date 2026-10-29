package org.example;

public class Dessert extends FoodItem {
    private double sugar;

    public Dessert(String name, int id, double calories, double sugar) {
        super(name, id, calories);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Сахар: " + sugar + " г";
    }
}