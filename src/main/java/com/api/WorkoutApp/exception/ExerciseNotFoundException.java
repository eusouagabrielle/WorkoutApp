package com.api.WorkoutApp.exception;

public class ExerciseNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 4;

    public ExerciseNotFoundException(String message){
        super(message);
    }
}
