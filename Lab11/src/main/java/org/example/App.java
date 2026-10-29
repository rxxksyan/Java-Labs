package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("Перегрузки");

        Vehicle vehicle = new Vehicle("Базовая модель", 2020, 10000.0);

        vehicle.drive();
        vehicle.drive(90);
        vehicle.drive("Москва");

        System.out.println("\nПереопределения");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("Обычный авто", 2010, 5000.0);
        vehicles[1] = new ElectricCar("Tesla", 2023, 45000.0);
        vehicles[2] = new GasolineCar("BMW", 2022, 35000.0);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Модель: " + vehicles[i].getModel() + " | Топливо: " + vehicles[i].getFuelType());
        }

        System.out.println("\nПерегруженные методы наследников");

        ElectricCar tesla = new ElectricCar("Tesla Model S", 2023, 50000.0);
        tesla.drive(85.5);

        GasolineCar bmw = new GasolineCar("BMW M5", 2022, 40000.0);
        bmw.drive("АИ-100", 60);
    }
}