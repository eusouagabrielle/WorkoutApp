package com.api.WorkoutApp.exception;

public class AthleteNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1;

    public AthleteNotFoundException(String message){
        super(message);
    }
}
