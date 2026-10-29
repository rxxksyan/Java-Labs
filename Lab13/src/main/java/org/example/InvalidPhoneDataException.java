package org.example;

public class InvalidPhoneDataException extends Exception {
    public InvalidPhoneDataException(String message) {
        super(message);
    }
}