package com.spring.rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException(String message) {
        super(message);
    }
    //переопределяем стандартный конструктор, который будет принимать String
}
