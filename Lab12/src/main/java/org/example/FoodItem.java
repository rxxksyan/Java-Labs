package org.example;

public class FoodItem {
    private String name;
    private int id;
    private double calories;

    public FoodItem(String name, int id, double calories) {
        this.name = name;
        this.id = id;
        this.calories = calories;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getCalories() { return calories; }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Калории: " + calories;
    }
}