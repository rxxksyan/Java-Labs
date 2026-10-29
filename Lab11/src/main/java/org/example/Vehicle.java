package org.example;

public class Vehicle {
    private String model;
    private int year;
    private double price;

    public Vehicle(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void drive() {
        System.out.println("Еду");
    }

    public void drive(int speed) {
        System.out.println("Еду со скоростью " + speed);
    }

    public void drive(String destination) {
        System.out.println("Еду в " + destination);
    }


    public String getFuelType() {
        return "Неизвестно";
    }
}