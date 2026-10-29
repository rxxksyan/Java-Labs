package org.example;

public class PhoneNotFoundException extends Exception {
    private String model;

    public PhoneNotFoundException(String message, String model) {
        super(message);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}