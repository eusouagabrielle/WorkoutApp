package com.api.WorkoutApp.exception;

public class TrainerNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2;
    public TrainerNotFoundException(String message){
        super(message);
    }
}
