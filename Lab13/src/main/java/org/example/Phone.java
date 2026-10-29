package org.example;

public class Phone {
    private String brand;
    private String model;
    private double price;
    private int memory;
    private int battery;

    public Phone(String brand, String model, double price, int memory, int battery)
            throws InvalidPhoneDataException {
        this.brand = brand;
        this.model = model;
        this.setPrice(price);
        this.setMemory(memory);
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public void setPrice(double price) throws InvalidPhoneDataException {
        if (price <= 0) {
            throw new InvalidPhoneDataException("Цена должна быть больше нуля. Введено: " + price);
        }
        this.price = price;
    }

    public void setMemory(int memory) throws InvalidPhoneDataException {
        if (memory <= 0) {
            throw new InvalidPhoneDataException("Память должна быть больше нуля. Введено: " + memory);
        }
        if (this.memory != 0 && memory < this.memory) {
            throw new InvalidPhoneDataException("Нельзя уменьшить память! Текущая: " + this.memory);
        }
        this.memory = memory;
    }

    public void updatePrice(double newPrice) throws PriceUpdateException {
        try {
            setPrice(newPrice);
        } catch (InvalidPhoneDataException e) {
            throw new PriceUpdateException("Ошибка обновления цены: " + e.getMessage());
        }
    }

    public void upgradeMemory(int newMemory) throws InvalidPhoneDataException {
        setMemory(newMemory);
    }

    @Override
    public String toString() {
        return brand + " " + model + " | Цена: " + price + " | Память: " + memory + "GB | Батарея: " + battery + "mAh";
    }
}