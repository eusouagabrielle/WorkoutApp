package com.api.WorkoutApp.exception;

public class RoutineNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 3;

    public RoutineNotFoundException(String message){
        super(message);
    }
}
