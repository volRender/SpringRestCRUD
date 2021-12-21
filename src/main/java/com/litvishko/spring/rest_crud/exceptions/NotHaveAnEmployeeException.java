package com.litvishko.spring.rest_crud.exceptions;

public class NotHaveAnEmployeeException extends RuntimeException {
    public NotHaveAnEmployeeException(String message) {
        super(message);
    }
}
