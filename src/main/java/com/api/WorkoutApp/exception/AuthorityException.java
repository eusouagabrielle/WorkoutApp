package com.api.WorkoutApp.exception;

public class AuthorityException extends RuntimeException{
    private static final long serialVersionUID = 6;

    public AuthorityException(String message){
        super(message);
    }
}
