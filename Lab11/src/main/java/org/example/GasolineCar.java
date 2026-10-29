package org.example;

public class GasolineCar extends Vehicle {

    public GasolineCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String getFuelType() {
        return "Бензин";
    }

    public void drive(String fuelType, int liters) {
        System.out.println("Еду на " + fuelType + ", залито " + liters + " литров");
    }
}