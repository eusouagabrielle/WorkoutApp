package com.api.WorkoutApp.exception;

public class UserNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 5;

    public UserNotFoundException(String message){
        super(message);
    }
}
