package org.example;

public class ElectricCar extends Vehicle {

    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String getFuelType(int a) {
        return "Электричество";
    }

    public void drive(double batteryLevel) {
        System.out.println("Еду на заряде " + batteryLevel + "%");
    }
}