package com.stackroute.exceptions;

public class UserAlreadyExistsException extends Exception {

    private String messge;

    public UserAlreadyExistsException() {
    }
    public UserAlreadyExistsException(String message) {
        super(message);
        this.messge = message;

    }

}
